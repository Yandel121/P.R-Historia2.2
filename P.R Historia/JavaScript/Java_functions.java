document.getElementById('contactButton').addEventListener('click', function() {
    var contactMethods = document.getElementById('contactMethods');
    if (contactMethods.classList.contains('hidden')) {
        contactMethods.classList.remove('hidden');
    } else {
        contactMethods.classList.add('hidden');
    }
});

function toggleDetails(element) {
    var details = element.querySelector('p');
    if (details.classList.contains('hidden')) {
        details.classList.remove('hidden');
        details.classList.add('visible');
        element.classList.add('expanded');
    } else {
        details.classList.remove('visible');
        details.classList.add('hidden');
        element.classList.remove('expanded');
    }
}
myButton.addEventListener(
    "click",
    function () {
        myPopup.classList.add("show");
    }
);
closePopup.addEventListener(
    "click",
    function () {
        myPopup.classList.remove(
            "show"
        );
    }
);
window.addEventListener(
    "click",
    function (event) {
        if (event.target == myPopup) {
            myPopup.classList.remove(
                "show"
            );
        }
    }
);