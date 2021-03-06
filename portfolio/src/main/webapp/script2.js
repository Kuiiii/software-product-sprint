async function getAbout() {
  const responseFromServer = await fetch('/about');
  const textFromResponse = await responseFromServer.text();

  const aboutContainer = document.getElementById('about-container');
  aboutContainer.innerText = textFromResponse;
}