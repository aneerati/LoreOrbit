import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

const storyData = {
  2020: "In 2020, humanity first made contact with the LoreOrbit Entity.",
  2021: "A rebellion formed under the lunar shadows.",
  2022: "The Canon Council declared universal narrative sovereignty.",
  2023: "Anomalous archives were leaked to the public.",
};

// Header
function Header() {
  return (
    <div className='header'>
      <div className='headerTitle'>
        LoreOrbit
      </div>
      <br></br>
      <div className='storylineTitle'>
        Canon Storyline
      </div>
      <hr></hr>
    </div>
  );
}

// Body

function Timeline() {
  const [selectedYear, setSelectedYear] = useState(2020);

    return (
    <div className="body">
      <div className="timeline">
        {Object.keys(storyData).map((year) => (
          <button 
            key={year} 
            onClick={() => setSelectedYear(year)}
            className={`timelineButton ${selectedYear == year ? 'active' : ''}`}
          >
            {year}
          </button>
        ))}
      </div>

      <div className="storyBox">
        {storyData[selectedYear]}
      </div>
    </div>
  );
}

function Body() {
  return (
    <div>
      <Timeline />

      Voting Here
    </div>
  );
}

function Footer() {
  return (
    <div>
      Footer
    </div>
  );
}

export default function App() {
  const [count, setCount] = useState(0)

  return (
    <> 
      <Header />
      <Body />
      <Footer />
    </>
   
    // <>
    //   <div>
    //     <a href="https://vite.dev" target="_blank">
    //       <img src={viteLogo} className="logo" alt="Vite logo" />
    //     </a>
    //     <a href="https://react.dev" target="_blank">
    //       <img src={reactLogo} className="logo react" alt="React logo" />
    //     </a>
    //   </div>
    //   <h1>Vite + React</h1>
    //   <div className="card">
    //     <button onClick={() => setCount((count) => count + 1)}>
    //       count is {count}
    //     </button>
    //     <p>
    //       Edit <code>src/App.jsx</code> and save to test HMR
    //     </p>
    //   </div>
    //   <p className="read-the-docs">
    //     Click on the Vite and React logos to learn more
    //   </p>
    // </>
  )
}
