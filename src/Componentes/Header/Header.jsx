import { Link } from 'react-router-dom';
import './Header.css';

export function Header() {
    return(
        <header class="cabecalho">
            <div id="logo">
                <h1>AV</h1>
                <p>Agência de Viagem</p>
            </div>
            <nav class="menu">
                <Link to="/">
                    <a>Home</a>
                </Link>
                <Link to="/Destinos">
                    <a>Destinos</a>
                </Link>
                <Link to="/Promo">
                    <a>Promoções</a>
                </Link>
                <Link exact to="/Contato">
                    <a>Contato</a>
                </Link>
            </nav>
        </header>
    );
}