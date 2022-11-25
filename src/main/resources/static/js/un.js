
$("#idbtn").click(()=>{
    const xhttp = new XMLHttpRequest();

    xhttp.open("POST", "./setID");

    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

    xhttp.send("depNum="+$("#depnum option:selected").val());
    
    xhttp.addEventListener("readystatechange", function(){
        if(this.readyState==4 && this.status==200){
            console.log(xhttp.responseText.trim());
            $("#getID").attr("value", JSON.parse(xhttp.responseText.trim()).result);
        }
    })


})

dep();
function dep(){
    for(let i=1; i<99; i++){
        $("#depnum").append(
            '<option name="depNum" id="tdep+'+i+'" value="'+i+'">테스트부서'+i+'</option>'
        )
    }

}