<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="description" content="">
<meta name="keywords" content="">
<link rel="stylesheet" href="./css/style.css">
<title>Error画面</title>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>Error</p>
		</div>
		<div>
			<p>マイページの確認に失敗しました。
			<br>再度商品購入の手続を行ってください。</p>
		</div>
		<div>
				<a href='<s:url action="GoHomeAction"/>'>Home画面に戻る</a>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>