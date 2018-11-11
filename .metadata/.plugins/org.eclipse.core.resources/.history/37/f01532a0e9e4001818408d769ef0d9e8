<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="description" content=""/>
<meta name="keyword" content=""/>
<link rel="stylesheet" href="./css/style.css">
<title>buyItemConfirm画面</title>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>BuyItemConfirm</p>
		</div>
		<div>
			<s:form action="BuyItemConfirmAction">
			<table>
				<tr>
					<td>商品名</td>
					<td>
						<s:property value="session.buyItem_name"/>
					</td>
				</tr>
				<tr>
					<td>値段</td>
					<td>
						<s:property value="session.buyItem_price"/>
						<span>円</span>
					</td>
				</tr>
				<tr>
					<td>購入個数</td>
					<td>
						<s:property value="session.stock"/>
						<span>個</span>
					</td>
				</tr>
				<tr>
					<td>支払い方法</td>
					<td>
						<s:property value="session.pay"/>
					</td>
				</tr>
				<tr>
					<td><s:submit value="完了" /></td>
				</tr>
			</table>
			</s:form>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>