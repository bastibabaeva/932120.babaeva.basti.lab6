
function LeftColumn()
{
    const leftImage=document.querySelector('.left-image');
    const rightImage=document.querySelector('.right-image');
    const leftContainer = document.querySelector('.left-image-container');
    const rightContainer = document.querySelector('.right-image-container');

    leftImage.style.display="block";
    rightImage.style.display="none";
    leftContainer.style.width="100%";
    rightContainer.style.width="0%";

}

function MiddleColumn()
{
    const leftImage=document.querySelector('.left-image');
    const rightImage=document.querySelector('.right-image');
    const leftContainer = document.querySelector('.left-image-container');
    const rightContainer = document.querySelector('.right-image-container');

    leftImage.style.display="block";
    rightImage.style.display="block";
    leftContainer.style.width="100%";
    rightContainer.style.width="100%";
}

function RightColumn(){
    const leftImage = document.querySelector('.left-image');
    const rightImage = document.querySelector('.right-image');
    const leftContainer = document.querySelector('.left-image-container');
    const rightContainer = document.querySelector('.right-image-container');

    rightImage.style.display="block";
    leftImage.style.document="none";
    leftContainer.style.width="0%";
    rightContainer.style.width="100%";
}