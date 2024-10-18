
function LeftColumn()
{

    const leftContainer = document.querySelector('.left-image-container');
    const rightContainer = document.querySelector('.right-image-container');

    leftContainer.style.width="100%";
    rightContainer.style.width="0%";

}

function MiddleColumn()
{
    const leftContainer = document.querySelector('.left-image-container');
    const rightContainer = document.querySelector('.right-image-container');

    leftContainer.style.width="100%";
    rightContainer.style.width="100%";
}

function RightColumn(){
    const leftContainer = document.querySelector('.left-image-container');
    const rightContainer = document.querySelector('.right-image-container');

    leftContainer.style.width="0%";
    rightContainer.style.width="100%";
}