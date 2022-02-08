import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import {Home} from './Pages/Home/Home';
import {Destinos} from './Pages/Destinos/Destinos';
import {Promo} from './Pages/Promo/Promo';
import {Contato} from './Pages/Contato/Contato';
import { BrowserRouter as Router, Route, Routes} from 'react-router-dom';

ReactDOM.render(
  <React.StrictMode>
    <Router>
      <Routes>
        <Route path="/" element={<Home></Home>}></Route>
        <Route path="/Destinos" element={<Destinos></Destinos>}></Route>
        <Route path="/Promo" element={<Promo></Promo>}></Route>
        <Route path="/Contato" element={<Contato></Contato>}></Route>
      </Routes>
    </Router>
  </React.StrictMode>,
  document.getElementById('root')
);