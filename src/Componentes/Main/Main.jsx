import './Main.css';


export function Main(props) {
    return(
        <main class="container">
            <section id="sec-principal">
                <h1>Conecte-se aos melhores lugares do mundo com a gente.</h1>
                <p>As maiores viagens pelo <strong>menor</strong> preço.</p>
                <div id="saibaMais-main">
                    <p><a href="destinos.html">Saiba mais</a></p>
                </div>
            </section>
            <div id="imagem-cidade">
                <img src={props.foto} alt="cidade cubana" />
            </div>
        </main>
    );
}