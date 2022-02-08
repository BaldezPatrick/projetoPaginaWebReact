import {Header} from '../../Componentes/Header/Header';
import {Lugares} from '../../Componentes/Lugares/Lugares';
import {Footer} from '../../Componentes/Footer/Footer';
import {Promocao} from '../../Componentes/Promocao/Promocao';
import Local from '../../Componentes/Imagens/flores coloridas-p.jpg';

export function Promo() {
    return( 
        <>
        <Header></Header>
        <Promocao pro={Local}></Promocao>
        <Footer></Footer>
        </>
    );
}