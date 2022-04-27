<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <script type="text/javascript" src="/js/jquery.js"></script>
    <script type="text/javascript" src="/js/jquery.cookie.jss"></script>
    <script type="text/javascript">
        //创建 cookie：
        document.cookie = "username=Bill Gates";
       //您还可以添加有效日期（UTC 时间）默认情况下，在浏览器关闭时会删除 cookie：/**/
        document.cookie = "username=John Doe; expires=Sun, 31 Dec 2017 12:00:00 UTC";
        //通过 path 参数，您可以告诉浏览器 cookie 属于什么路径。默认情况下，cookie 属于当前页。
        document.cookie = "username=Bill Gates; expires=Sun, 31 Dec 2017 12:00:00 UTC; path=/";


        //document.cookie 会在一条字符串中返回所有 cookie，比如：cookie1=value; cookie2=value; cookie3=value;
        var x = "dd";
        x=document.cookie;
        //改变cookie：
        //document.cookie = "username=Steve Jobs; expires=Sun, 31 Dec 2017 12:00:00 UTC; path=/";

        //删除 cookie 时不必指定 cookie 值：
        //直接把 expires 参数设置为过去的日期即可：
        //document.cookie = "username=; expires=Thu, 01 Jan 1970 00:00:00 UTC; path=/;";
        //您应该定义 cookie 路径以确保删除正确的 cookie。

        //$(document).ready(function(){
        //     alert("good "+ x  );
        //});
    </script>
<%--    <script type="text/javascript">
        $(function(){
            $.cookie('the_cookie', 'the_value');
            alert("good");
        })
    </script>--%>
</head>
<body>

<h2>SpringMVC + JSON</h2>
<a href="<%=request.getContextPath() %>/goodinfo">goodinfo</a><br>
<a href="<%=request.getContextPath() %>/goodslist">Goods List</a><br>

<a href="<%=request.getContextPath() %>/listalljson">listalljson</a><br>

<h2>sesseion</h2>
<a href="<%=request.getContextPath() %>/SessionTest">SessionTest</a>


<h2>old</h2>
<a href="<%=request.getContextPath() %>/listall?id=1">Get A Good</a>
<a href="<%=request.getContextPath() %>/addgoods">add Good</a>
<br><br><br><br>
<a href="<%=request.getContextPath() %>/testSelectEmployeeByDeptId">testSelectEmployeeByDeptId</a><br><br>
<a href="<%=request.getContextPath() %>/testSelectEmployeeByMultiple">testSelectEmployeeByMultiple</a><br><br>
<a href="<%=request.getContextPath() %>/testFindEmployee_1">testFindEmployee_1</a><br><br>
<a href="<%=request.getContextPath() %>/testFindEmployee_2">testFindEmployee_2</a><br><br>
<a href="<%=request.getContextPath() %>/testUpdateEmployee">testUpdateEmployee</a><br><br>
<a href="<%=request.getContextPath() %>/testFindEmployee_3">testFindEmployee_3</a><br><br>
<a href="<%=request.getContextPath() %>/testFindEmployee_4">testFindEmployee_4</a><br><br>
<a href="<%=request.getContextPath() %>/testFindEmployee_5">testFindEmployee_5</a><br><br>
</body>

</html>
