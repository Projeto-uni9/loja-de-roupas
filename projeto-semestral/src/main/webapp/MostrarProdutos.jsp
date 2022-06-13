<%@page import="br.com.projeto.produto.Produto" %>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
	
	
<!DOCTYPE html>
<html lang="pt-BR">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- TITULO DA PAGINA -->
<title>DaModa - Dashboard Produtos</title>

<!-- ÍCONE DA PAGINA -->
<link rel="icon" href="./DMLogo.png">

<!-- FONTAWESOME CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" />

<!-- CSS -->
<link rel="stylesheet" href="./style-dashboard.css">
<link rel="stylesheet" href="./style-produtos.css">

</head>


<body>

	<header>
		<!-- NAVEGAÇÃO TOPO -->
		<nav class="nav-topo">
			<div class="logo">
				<span class="logo">DaModa</span>
			</div>

			<div class="profile">
				<a href="#" class="name-profile">Projeto Semestral</a> <a href="#"
					class="image-profile"> <img class="icon-profile"
					src="./ProfileUnknow.jpg" alt="profileUNK">
				</a>
			</div>

		</nav>
	</header>

	<!-- NAVEGAÇÃO LATERAL -->
	<nav class="sidebar">

		<header>
			<li class="search-box">
				<i class="fa-solid fa-magnifying-glass icon"></i> <input type="search" placeholder="Search..." />
			</li>
		</header>

		<div class="menu-bar">
			<div class="menu">

				<ul class="menu-links">

					<li class="nav-link"><a
						href="./Dashboard.html"> <i
							class="fa-solid fa-house icon"></i> <span class="nav-text">Dashboard</span>
					</a></li>

					<li class="nav-link"><a
						href="./Atendimento.html"> <i
							class="fa-solid fa-circle-question icon"></i> <span
							class="nav-text">Atendimento</span>
					</a></li>

					<li class="nav-link"><a
						href="./Comentarios.html"> <i
							class="fa-solid fa-comments icon"></i> <span class="nav-text">Comentários</span>
					</a></li>

					<li class="nav-link selected"><a href="./produtos"> <i
							class="fa-solid fa-cubes icon"></i> <span class="nav-text">Produtos</span>
					</a></li>

					<li class="nav-link"><a href="#"> <i
							class="fa-solid fa-tags icon"></i> <span class="nav-text">Cupons</span>
					</a></li>

				</ul>
			</div>


			<div class="bottom-content">

				<li class="logout">
					<button class="btn-logout" onclick="window.close()">
						<i class="fa-solid fa-right-from-bracket icon"></i> Encerrar
						Sessão
					</button>
				</li>

			</div>
		</div>

	</nav>


	<!-- CONTEUDO PRINCIPAL -->
	<section class="products-content">

		<div class="title">
			<span class="atual-page">Produtos</span>
		</div>

		<div class="main-content">
			<div class="topo">
				<a href="CadastrarProduto.html"><button class="btn-cadastrardash">Cadastrar Novo Produto</button></a>

				<li class="search-boxdash"><input type="search"
					name="search-box" id="search-boxdash" class="searchbox"
					placeholder="Pesquisar..."> <i
					class="fa-solid fa-magnifying-glass"></i></li>

			</div>


			<div class="products-show">
				<div class="title">
					<h3 class="section-title">Produtos Cadastrados</h3>
				</div>

				<div class="container-products-registered">

					<c:if test="${not empty produtos }">

						<c:forEach var="produto" items="${produtos}">
							<div class="container-product">
								<div class="container-imagem">
									<span class="icon"> <i class="fa-solid fa-image"></i>
									</span>
								</div>

								<div class="info-products">
									<h4 class="name-product">${produto.nome }</h4>
									<p class="provider-title">Fornecido por 
										${produto.fornecedor }</p>
									<p class="info-title">
										Código: <span class="text">${produto.codigo }</span>
									</p>
									<p class="info-title">
										Setor: <span class="text">${produto.setor }</span>
									</p>
									<p class="info-title">
										Cores: <span class="text">${produto.cor }</span>
									</p>
									<p class="info-title">
										Tamanho: <span class="text">${produto.tamanho }</span>
									</p>
									<p class="info-title">
										Quantidade: <span class="text">${produto.quantidade }</span>
									</p>
									<p class="info-title">
										Descrição: <span class="text description">${produto.descricao }</span>
									</p>
									<p class="info-title">
										Valor: <span class="text">R$ ${produto.valor }</span>
									</p>
								</div>

								<div class="btns-modify">
									<span class="delete-product">
										<a href="excluir?codigo=${produto.codigo }"><i class="fa-solid fa-trash-can"></i> Excluir</a>
									</span> 
									<span class="modify-product">
										<a href="alterar?codigo=${produto.codigo }"><i class="fa-solid fa-pen-to-square"></i> Alterar</a></span>
								</div>


							</div>
						</c:forEach>
					</c:if>
					
					<c:if test="${empty produtos}">
						<h3>Nenhum Produto Cadastrado!</h3>
					</c:if>

				</div>

			</div>

		</div>

	</section>




</body>
</html>