import './Contat.css';

export function Contat() {
    return(
        <>
        <div id="container-contato">
            <div id="chamada-contato">
                <h1>Contate-nos para qualquer dúvida</h1>
                <h3>Nossa agência está <strong>24h disponível</strong> para seu atendimento</h3>
            </div>
            <div id="chamada-contato-b">
                <p>Preencha o formulário, inserindo seus dados e suas dúvidas e estaremos entrando em contato.</p>
            </div>
        </div><main>
                <form action="" id="formulario">
                    <fieldset id="top-form">
                        <div>
                            <label for="nome">Nome</label>
                            <input type="text" name="nome" id="nome" required />
                        </div>
                        <div>
                            <label for="sobrenome">Sobrenome</label>
                            <input type="text" name="sobrenome" id="sobrenome" />
                        </div>
                    </fieldset>
                    <div class="campo">
                        <label for="telefone">Telefone</label>
                        <input type="tel" name="telefone" id="telefone" />
                    </div>
                    <div class="campo">
                        <label for="cidade">Cidade</label>
                        <input type="text" name="cidade" id="cidade" />
                    </div>
                    <div class="campo">
                        <label for="região">Região</label>
                        <select name="região" id="região">
                            <option value="Sul">Sul</option>
                            <option selected value="Sudeste">Sudeste</option>
                            <option value="Norte">Norte</option>
                            <option value="Nordeste">Nordeste</option>
                            <option value="Centro Oeste">Centro Oeste</option>
                        </select>
                    </div>
                    <div class="campo">
                        <label for="email">E-mail</label>
                        <input type="email" name="email" id="email" required />
                    </div>
                    <div class="campo">
                        <label for="txt-a">Qual motivo do contato?</label>
                        <textarea name="txt-a" id="txt-a" rows="10" cols="10" style="width: 200px"></textarea>
                    </div>
                    <input id="btn" type="submit" value="Enviar" />
                </form>
            </main>
            </>
    );
}