export function sendAjax(endpoint, method, params, onSuccess, onFail) {
    const req = new XMLHttpRequest();
    req.addEventListener("load", function (event) {
        if (req.status == 200) { onSuccess(); }
        else { onFail(); }
    });
    req.addEventListener("error", function (err) {
        console.log("Request failed for " + endpoint + " error: " + err);
    });
    req.open(method, endpoint);
    if (method === "POST" || method === "PUT") {
        req.setRequestHeader("Content-type", "application/json");
    }
    req.send(params);
}

export function switchClassOnOff(element, className) {
    if (element.classList.contains(className)) {
        element.classList.remove(className);
    }
    else {
        element.classList.add(className)
    }
}