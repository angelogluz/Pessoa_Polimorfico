<jsp:include page="/header.jsp"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:useBean id="pessoa" scope="request" class="br.com.senacrs.bean.Pessoa"/>


<center>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Sobrenome</th>
                <th>Rua</th>
                <th>Bairro</th>
                <th>CEP</th>
                <th colspan="2">Ações</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${pessoas}" var="pessoa">

                <tr>
                    <td>${pessoa.id}</td>

                    <td>${pessoa.nome}</td>
                    <td>${pessoa.sobrenome}</td>
                    <td>${pessoa.endereco.rua}</td>
                    <td>${pessoa.endereco.bairro}</td>
                    <td>${pessoa.endereco.cep}</td>
                    <td> <a href="Controller?classe=ControllerLogicPessoaEditarPopular&id=${pessoa.id}">Editar</a> </td>
                    <td> <a href="Controller?classe=ControllerLogicPessoaExcluir&id=${pessoa.id}">Excluir</a> </td>
                </tr>
            </c:forEach>

        </tbody>
    </table>
</center>
<jsp:include page="/footer.jsp"/>
