import {Header} from '../../Componentes/Header/Header';
import {Lugares} from '../../Componentes/Lugares/Lugares';
import {Footer} from '../../Componentes/Footer/Footer';
import Local from '../../Componentes/Imagens/flores coloridas-p.jpg';
import './Destinos.css';

export function Destinos() {
    return(
        <>
        <Header></Header>
        <Lugares imagem={Local}></Lugares>
        <Footer></Footer>
        </>
    );
}