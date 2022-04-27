<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
    <script src="js/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function () {
            //alert("jq working")
            $.ajax({
                url: 'http://localhost:8080/SpringMybatisSpringMVC_war_exploded/getgoodsinfojson?id=${goodid}',  //url地址
                type: 'GET',
                dataType: 'json',
                timeout: 1000,
                cache: false,
                beforeSend: LoadFunction, //加载执行方法
                error: erryFunction,  //错误执行方法
                success: succFunction //成功执行方法
            })
            function LoadFunction() {
                $("#list").html('loading...');
            }
            function erryFunction() {
                alert("error");
            }
            function succFunction(tt) {
                // alert(tt.goodmingcheng);
                $("#list").html('');

                $("#list").html($("#list").html() + "goodmingcheng=" + tt.goodmingcheng +  "<br/>");


            };
        });
    </script>
</head>
<body> goods  info working!
<ul id="list">
</ul>
</body>
</html>