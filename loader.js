
function show(){

    var row="";
    var newdiv="<div>";
    var p1="<div class='loader'>";
    var p2="</div>";
    var newdiv1="</div>";
    p1.className="loader";
      row=newdiv+newdiv1+p1+p2;

      let element=document.getElementById("load");
      element.innerHTML=row;


    setTimeout(() => { var row="";
    var newdiv="<div>";
    var name=jason.name;
        name+="</br>"
         name+=jason.company;
    var newdiv1="</div>";
      row=newdiv+name+newdiv1;

      let element1=document.getElementById("load");
      element1.innerHTML=row; }, 2000);
    

  console.log("loader button click");
}

    function show2(){
      var row="";
      var newdiv="<div>";
      var p1="<div class='loader'>";
      var p2="</div>";
      var newdiv1="</div>";
      p1.className="loader";
        row=newdiv+newdiv1+p1+p2;
  
        let element=document.getElementById("load");
        element.innerHTML=row;
  
        var row="";
      setTimeout(() => { 
        var jar=jason2.length;
      for(var i=0; i<jar;i++)
      {
        let jason3=jason2[i];
      var newdiv="<div>";
      var name=jason3.name;
          name+="</br>"
           name+=jason3.company;
      var newdiv1="</div>";
        row=row+newdiv+name+newdiv1;
      }
        let element1=document.getElementById("load");
        element1.innerHTML=row; }, 2000);
      
      
  
    console.log("loader button click");

    }
console.log("Loader Example");
var jason ={name : "hello jugal sdgfyugyeidgfyegucfgyewufgycuyefgeu",
            company: "Dmi Noida"};
 var jason2 =[{name : "hello Adarsh sdgfyugyeidgfyegucfgyewufgycuyefgeu",
              company: "Dmi Gurgaon"},
              {name : "hello dgasdghakjhsd sdgfyugyeidgfyegucfgyewufgycuyefgeu",
              company: "Dmi Gujklfsklgrgaon"},
             { name : "hello hhhhhhhh sdgfyugyeidgfyegucfgyewufgycuyefgeu",
              company: "Dmi Gurllllllgaon"}];

