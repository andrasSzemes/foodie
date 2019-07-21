import {sendAjax} from "/javascript/utility.js";
import {createFoodModal} from "/javascript/foodModal.js";

function loadPage() {
    loadFoods();
}

function loadFoods() {
    sendAjax("/foods", "GET", "",
        //On success
        () => {
            let response = JSON.parse(event.target.response);
            let container = document.querySelector("#food-modals");

            for (let foodInfo of response) {
                let modal = createFoodModal(foodInfo);
                container.appendChild(modal);
            }
        },
        //On fail
        () => {})
}

loadPage();