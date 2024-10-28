

let currentTheme = getTheme();

document.addEventListener('DOMContentLoaded',() => {
    changeTheme();
})



console.log(currentTheme);

function changeTheme(){

    changePageTheme(currentTheme, currentTheme);

   document.querySelector('html').classList.add(currentTheme);

   const changeThemeButton = document.querySelector("#theme_change_button");
    //change the text of button
  
    const oldTheme = currentTheme;
   
          changeThemeButton.addEventListener("click", () =>{
 
      const oldTheme = currentTheme;

      if(currentTheme == "dark"){
        currentTheme = "light";
      }
      else{
        currentTheme="dark";
      }``

      changePageTheme(currentTheme, oldTheme);

   });
}

//set theme to local storage
function setTheme(theme){
    localStorage.setItem("theme", theme);
}

//get theme from localstorage
function getTheme(){
    let theme= localStorage.getItem("theme"); 
}

function changePageTheme(theme, oldTheme){
    setTheme(currentTheme);
    
    document.querySelector('html').classList.remove(oldTheme);

    document.querySelector('html').classList.add(theme);

    document.querySelector("#theme_change_button").querySelector("span").textContent = theme == "light" ? "Dark" : "Light";
    
}