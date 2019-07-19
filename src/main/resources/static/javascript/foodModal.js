export function createFoodModal(info) {
    let modal = document.createElement("div");
    modal.classList.add("food-modal");

    modal.appendChild(createImg("/img/" + info.imgName));
    modal.appendChild(createNote(info.note));

    return modal;
}

function createImg(src) {
    let img = document.createElement("img");
    img.classList.add("food-img");
    img.src=src;

    return img;
}

function createNote(text) {
    let note = document.createElement("div");
    note.classList.add("food-note");
    note.innerHTML=text;

    return note;
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