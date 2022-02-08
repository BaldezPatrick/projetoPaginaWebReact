import {Header} from '../../Componentes/Header/Header';
import {Main} from '../../Componentes/Main/Main';
import {Section} from '../../Componentes/Section/Section';
import {Footer} from '../../Componentes/Footer/Footer';
import Cidades from '../../Componentes/Imagens/cuba.jpg';


export function Home() {
    return(
        <>
        <Header></Header>
        <Main foto={Cidades}></Main>
        <Section></Section>
        <Footer></Footer>
        </>
    );

}