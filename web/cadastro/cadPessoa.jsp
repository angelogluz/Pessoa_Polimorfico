<jsp:include page="/header.jsp"/>
        <form name="formulario" action="/Pessoa_Polimorfico/Controller?classe=ControllerLogicPessoaCadastrar" method="POST">
            <table border="0">
                <thead>
                    <tr>
                        <th> Cadastro de Pessoa </th>                        
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Nome: </td>
                        <td> <input type="text" name="nome" value="" size="30" /> </td>
                    </tr>
                    <tr>
                        <td> Sobrenome: </td>
                        <td> <input type="text" name="sobrenome" value="" size="30" /> </td>
                    </tr>
                    <tr>
                        <td>Rua: </td>
                        <td> <input type="text" name="rua" value="" size="30" /> </td>
                    </tr>
                    <tr>
                        <td> Bairro: </td>
                        <td> <input type="text" name="bairro" value="" size="30" /> </td>
                    </tr>
                    <tr>
                        <td>CEP: </td>
                        <td> <input type="text" name="cep" value="" size="30" /> </td>
                    </tr>
                    <tr>
                        <td> <input type="submit" value="Enviar" name="enviar" /> </td>
                        <td> <input type="reset" value="Limpar" name="limpar" /> </td>
                    </tr>
                </tbody>
            </table>
           
        </form>
<jsp:include page="/footer.jsp" />