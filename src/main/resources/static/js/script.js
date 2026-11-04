document.getElementById("year").textContent =
    new Date().getFullYear();

document.querySelectorAll(".navbar a").forEach(link => {

    link.addEventListener("click", function() {

        console.log("Navigation:", this.textContent);

    });

});

console.log("Welcome to Aryan's Portfolio!");