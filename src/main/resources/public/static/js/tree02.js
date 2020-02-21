$(function () {
   loadTreeData();
});

function loadTreeData(){
    $.ajax({
        url:ctx+"/module/queryAllModules",
        type:"post",
        dataType:"json",
        success:function(data){
            var zTreeObj;
            var setting = {
                data:{
                    simpleData:{
                        enable:true
                    }
                }
            };
            zTreeObj = $.fn.zTree.init($("#treeDemo"),setting,data);
        }
    });
}