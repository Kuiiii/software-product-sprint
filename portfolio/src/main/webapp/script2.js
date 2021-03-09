async function getQuotes() {
  const responseFromServer = await fetch('/quotes');
  const quotes = await responseFromServer.json();

  const quote = quotes[Math.floor(Math.random() * quotes.length)];
  const quotesContainer = document.getElementById('quotes-container');
  quotesContainer.innerHTML = quote;
}