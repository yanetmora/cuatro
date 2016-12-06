<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE-edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<title>Boot Sample | Home</title>
<link rel="stylesheet" href="static/css/bootstrap.min.css">
<link rel="stylesheet" href="static/css/style.css">
</head>
<body>
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">Bootsample</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="new-file">New File</a></li>
					<li><a href="all-files">All file</a></li>
				</ul>
			</div>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode=='MODE_HOME_FILE'}">
			<div class="container">
				<div class="jumbotron text-center" id="homeDiv">
					<h1>Welcome to File Manager</h1>
				</div>
			</div>
		</c:when>


	<c:when test="${mode=='MODE_FILES'}">
			<div class="container text-center" id="filesDiv">
				<h3>My Files</h3>
				<hr />
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>FolderID</th>
								<th>OwnerId</th>
								<th>OwnerLocalPath</th>
								<th>FileName</th>
								<th>Description</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="file" items="${files}">
								<tr>
								   	<td>${file.id}</td>
									<td>${file.folderID}</td>
									<td>${file.ownerID}</td>
									<td>${file.ownerLocalPath}</td>
									<td>${file.fileName}</td>
									<td>${file.description}</td>
									
								
									<td><a href="update-file?id=${file.id}"><span
											class="glyphicon glyphicon-pencil"></span>
									</a></td>
									<td><a href="delete-file?id=${file.id}"> <span
											class="glyphicon glyphicon-trash"></span>
									</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		<c:when test="${mode=='MODE_NEW' || mode=='MODE_UPDATE'}">
			<div class="container text-center">
				<h3>Manage File</h3>
				<hr />
				<form class="form-horizontal" method="POST" action="save-file">
					<input type="hidden" name="id" value="${file.id}" />
					<div class="form-group">
						<label class="control-label col-sm-3">folderID:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="folderID"
								value="${file.folderID}" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-sm-3">ownerID:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="ownerID"
								value="${file.ownerID}" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3">ownerLocalPath:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="ownerLocalPath"
								value="${file.ownerLocalPath}" />
						</div>
					</div>
					
					
					<div class="form-group">
						<label class="control-label col-sm-3">fileName:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="fileName"
								value="${file.fileName}" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-3">description:</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="description"
								value="${file.description}" />
						</div>
					</div>
					
					
					
					
					<div class="form-group">
						<input type="submit" class="btn btn-primary" value="Save" />
					</div>

				</form>
			</div>
		</c:when>

</c:choose>

<script type="text/javascript" src="/static/js/jquery-3.1.1.min.js"></script>
	<script type="text/javascript" src="static/js/bootstrap.min.js"></script>

</body>
</html>>