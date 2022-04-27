<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
    <script src="js/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function () {
            //alert("jq working")
            $.ajax({
                url: 'http://localhost:8080/SpringMybatisSpringMVC_war_exploded/listalljson',  //url地址
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
                $("#list").html('');
                var json = eval(tt); //数组
                $.each(json, function (index, item) {
                    //循环获取数据
                    var name = json[index].name;
                    var price = json[index].price;
                    var id = json[index].id;
                    $("#list").html($("#list").html() + "<br><a href='./goodsinfo?id="+id+"' target='_blank'>" + name + "</a> - " + price + " - " + id + "<br/>");
                });

            };
        });
    </script>
</head>
<body> goods  list working!
<ul id="list">
</ul>
</body>
</html>