<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="head.jsp" %>
<script type="text/javascript">
	$(document).ready(function() { 
		$('#tt').tree({
			data: [{
				text: 'Item1',
				state: 'closed',
				children: [{
					text: 'Item11'
				},{
					text: 'Item12'
				}]
			},{
				text: 'Item2'
			}]
		});
	});
</script>

</head>
<body class="easyui-layout">
    <div data-options="region:'north',border:false" style="height:60px;background:#ACD6FF;padding:10px">欢迎：${user }</div>
    <div data-options="region:'west',split:true,title:'导航栏'" style="width:240px;padding:10px;">
    	<ul id="tt"></ul>
    </div>
    <div data-options="region:'east',split:true,collapsed:true,title:'东'" style="width:100px;padding:10px;">
    	中部区域
    </div>
    <div data-options="region:'south',border:false" style="height:30px;background:#A9FACD;padding:5px;">
    	南部区域
    </div>
    <div data-options="region:'center',title:'中'">
    </div>
</body>

</html>