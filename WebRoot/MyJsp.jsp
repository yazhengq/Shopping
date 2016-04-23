<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ page import="com.bjsxt.shopping.category.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<script type="text/javascript">
function check() {
	var selectedCategory = document.test.categoryId.options[document.test.categoryId.selectedIndex];
	var selectedValue = selectedCategory.value;
	if(selectedValue.split("|")[1] == "1") {
		alert("请选择第二级分类！");
		document.complex.categoryId.focus();
		return false;
	} else {
		selectedCategory.value = selectedValue.split("|")[0];
	}
	return true;
}
</script>

  </head>
  
  <body>
	<form name="test" onsubmit="return check()">
		<table border="1">
			<tr>
				<th>ID</th>
				<th>PID</th>
				<th>NAME</th>
			</tr>

			<%
				List<Category> categories = CategoryService.getInstance()
						.getCategories();
				for (int i = 0; i < categories.size(); i++) {
					Category c = categories.get(i);
					//out.println(c.getId() + "----" + c.getPid() + "----" + c.getName() + "<br>");
			%>
			<tr>
				<td><%=c.getId()%></td>
				<td><%=c.getPid()%></td>
				<td><%=c.getName()%></td>
			</tr>
			<%
				}
			%>
			<tr>
				<td><select name="categoryId"
					style="font-size: 9pt; color: rgb(85, 85, 85);">
						<option selected="selected" value="-1">--所有商品--</option>
						<%
							for (int i = 0; i < categories.size(); i++) {
								Category c = categories.get(i);
								String preStr = "";
								for (int j = 1; j < c.getGrade(); j++) {
									preStr += "--";
								}
						%>
						<option value="<%=c.getId()%>|<%=c.getGrade()%>">
							<%=preStr + c.getName()%>
						</option>
						<%
							}
						%>
				</select></td>
				<td><input value="提 &nbsp; 交" type="submit"></td>
			</tr>
			</table>
			</form>
</body>
</html>
