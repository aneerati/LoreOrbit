import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

const storyData = {
  0: "In 2020, humanity first made contact with the LoreOrbit Entity.",
  1: "A rebellion formed under the lunar shadows.",
  2: "The Canon Council declared universal narrative sovereignty.",
  3: "Anomalous archives were leaked to the public.",
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

function Timeline({selectedYear, setSelectedYear}) {
    return (
    <div className="timelineBody">
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
    </div>
  );
}

function StoryText({selectedYear}) {
  return (
    <div className="storyBox">
      {storyData[selectedYear]}
    </div>
  );
}

function Votes() {
  return (
    <div className='votingSection'>
        <button className="voteButton">up</button>
        <span className="voteCount">0</span>
        <button className="voteButton">down</button>
    </div>
  );
}

function Body() {
  const [selectedYear, setSelectedYear] = useState(0);
  return (
    <div className='body'>
      <Timeline selectedYear={selectedYear} setSelectedYear={setSelectedYear}/>
      <StoryText selectedYear={selectedYear}/>
      <Votes />
    </div>
  );
}

function Footer() {
  return (
    <footer className="footer">
      <p>&copy; {new Date().getFullYear()} LoreOrbit. All rights reserved.
      </p>
        
      <p>
      Built by the LoreOrbit Collective · <a href="https://github.com/aneerati/LoreOrbit">GitHub</a>
      </p>
      
    </footer>
  );
}

export default function App() {
  return (
    <div className='appContainer'> 
      <Header />
      <Body />
      <Footer />
    </div>
  )
}
