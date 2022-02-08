import './Promocao.css';

export function Promocao(props) {
    return(
        <main class="container-promo">
        <section id="chamada-promo">
            <h2>Pacotes únicos para aproveitar o fim de ano!</h2>
            <p>Os melhores preços para viagens estão aqui!</p>
        </section>
        <div id="viagem-promo">
            <div id="img-promo">
                <img src={props.pro} alt=""/>
                <div id="txt-promo">
                     <p>Cidade</p>
                     <p>3 dias em cidade</p>
                     <p>de <del>$1.000</del></p>
                     <p>por $700</p>
                     <p class="compra-promo"><a href="compra.html">COMPRAR</a></p>
                </div>
             </div>
             <div id="img-promo">
                <img src={props.pro} alt=""/>
                <div id="txt-promo">
                     <p>Cidade</p>
                     <p>3 dias em cidade</p>
                     <p>de <del>$1.000</del></p>
                     <p>por $700</p>
                     <p class="compra-promo"><a href="compra.html">COMPRAR</a></p>
                </div>
             </div>
             <div id="img-promo">
                <img src={props.pro} alt=""/>
                <div id="txt-promo">
                     <p>Cidade</p>
                     <p>3 dias em cidade</p>
                     <p>de <del>$1.000</del></p>
                     <p>por $700</p>
                     <p class="compra-promo"><a href="compra.html">COMPRAR</a></p>
                </div>
             </div>
             <div id="img-promo">
                <img src={props.pro} alt=""/>
                <div id="txt-promo">
                     <p>Cidade</p>
                     <p>3 dias em cidade</p>
                     <p>de <del>$1.000</del></p>
                     <p>por $700</p>
                     <p class="compra-promo"><a href="compra.html">COMPRAR</a></p>
                </div>
             </div>
             <div id="img-promo">
                <img src={props.pro} alt=""/>
                <div id="txt-promo">
                     <p>Cidade</p>
                     <p>3 dias em cidade</p>
                     <p>de <del>$1.000</del></p>
                     <p>por $700</p>
                     <p class="compra-promo"><a href="compra.html">COMPRAR</a></p>
                </div>
             </div>
             <div id="img-promo">
                <img src={props.pro} alt=""/>
                <div id="txt-promo">
                     <p>Cidade</p>
                     <p>3 dias em cidade</p>
                     <p>de <del>$1.000</del></p>
                     <p>por $700</p>
                     <p class="compra-promo"><a href="compra.html">COMPRAR</a></p>
                </div>
             </div>

        </div>
    </main>
    );
}