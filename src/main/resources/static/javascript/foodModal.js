import {switchClassOnOff} from "/javascript/utility.js";

export function createFoodModal(info) {
    let modal = document.createElement("div");
    modal.classList.add("food-modal");
    modal.classList.add("slide");

    let noteElement = createNote(info.note);
    let imgElement = createImg("/img/" + info.imgName, noteElement);
    let dateElement = createDate(info.cookingDateRepr);
    modal.appendChild(noteElement);
    modal.appendChild(imgElement);
    modal.appendChild(dateElement);

    return modal;
}

function createImg(src, noteElement) {
    let img = document.createElement("img");
    img.classList.add("food-img");
    img.src=src;
    img.addEventListener("click", displayNote);

    return img;

    function displayNote() {
        switchClassOnOff(noteElement, "show")
    }
}

function createNote(text) {
    let note = document.createElement("div");
    note.classList.add("food-note");
    note.innerHTML=text;

    note.addEventListener("click", () => {
       note.classList.remove("show")
    });

    return note;
}

function createDate(value) {
    let date = document.createElement("div");
    date.classList.add("food-date");
    date.innerHTML=value;

    return date;
}

/**
 * Example:
 *
 * <div class="food-modal">
 *      <img src="/img/IMG_20190715_190012.jpg" class="food-img">
 *      <div class="food-note">
 *          Lorem ipsum dolor sit amet.
 *      </div>
 * </div>
 *
 */