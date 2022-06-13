<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-BR">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- TITULO DA PAGINA -->
<title>DaModa - Alterar Produto</title>

<!-- ICONE -->
<link rel="icon" href="./DMLogo.png">

<!-- CSS -->
<link rel="stylesheet" href="./style-cadastroproduto.css">

<!-- FONTAWESOME CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" />

</head>


<body>

	<!-- TITULO DA PAGINA -->
	<header>
		<h2 class="title-page">Alterar Produto</h2>
		<span class="return-link"><a href="./Dashboard.html"><i
				class="fa-solid fa-house"></i></a></span>
	</header>


	<!-- FORMULÁRIO - CONTEUDO PRINCIPAL -->
	<main>
		<form method="post" action="alterar" id="formregister-products">

			<!-- ENVIAR IMAGEM -->
			<div class="send-image">


				<div class="image">
					<span class="image-icon"> <i class="fa-regular fa-image"></i>
					</span>
				</div>
				<input type="file" name="file-image" id="file-image" />

			</div>


			<!-- CONTAINER FORM 2 -->
			<div class="row-container-form">


				<div class="first-container">
					<!-- INFORMAÇÃO GERAL -->
					<div class="title-session">
						<h3 class="sectionForm-title">Informação Geral</h3>
					</div>

					
						Codigo do Produto: <input type="text" name="codigo" value="${produto.codigo }" readonly>
					
					
					<input type="text" name="nome" value="${produto.nome }"
						placeholder="Nome" autocomplete="off" required />


					<!-- FORNECEDOR / SETOR -->
					<div class="fornecedor-setor">
						<select name="fornecedor" id="fornecedor" required>
							<option value="${produto.fornecedor }">${produto.fornecedor }</option>
							<option value="null">Nenhum fornecedor selecionado...</option>
							<option value="Adidas">Adidas</option>
							<option value="CEA">CEA</option>
							<option value="Dafiti">Dafiti</option>
							<option value="Fila">Fila</option>
							<option value="Hollister">Hollister</option>
							<option value="Hurley">Hurley</option>
							<option value="Lacoste">Lacoste</option>
							<option value="NewEra">New Era</option>
							<option value="Nike">Nike</option>
							<option value="Oakley">Oakley</option>
							<option value="Pitbull">Pitbull</option>
							<option value="Polo">Polo</option>
							<option value="Puma">Puma</option>
							<option value="QuickSilver">Quick Silver</option>
							<option value="Renner">Lojas Renner</option>
							<option value="TommyHilfiger">Tommy Hilfiger</option>
							<option value="Xiaomi">Xiaomi</option>
							<option value="Zattini">Zattini</option>
						</select> 
						<select name="setor" id="setor" required>
							<option value="${produto.setor }">${produto.setor }</option>
							<option value="null">Nenhum setor selecionado...</option>
							<option value="masculino">Setor Masculino</option>
							<option value="feminino">Setor Feminino</option>
							<option value="infantil">Setor Infantil</option>
							<option value="acessorios">Acessórios</option>
						</select>
					</div>

					<div class="color-size-quantity">
						<input type="text" name="cor" value="${produto.cor }"
							autocomplete="off" required /> <input type="text" name="tamanho"
							value="${produto.tamanho }" autocomplete="off" required /> <input
							type="number" name="quantidade" value="${produto.quantidade }"
							required />
					</div>

					<textarea placeholder="Descrição Adicional" name="descricao"
						id="descricao" cols="50" rows="10" autocomplete="off" required>${produto.descricao }</textarea>
				</div>


				<div class="second-container">
					<div class="title-session">
						<h3 class="sectionForm-title">Informações de Preço</h3>
					</div>

					<input type="number" name="valor" value="${produto.valor }"
						autocomplete="off" required />


				</div>


			</div>


			<input type="submit" value="SALVAR" id="salvar" />
		</form>
	</main>


</body>


</html>