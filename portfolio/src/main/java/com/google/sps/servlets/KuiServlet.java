package com.google.sps.servlets;

import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/quotes")
public class KuiServlet extends HttpServlet {
    String[] quotes = {"\"It\'s not about how much we lost. It\'s about how much we have left.\" - Tony Stark, Avengers: Endgame",
    "\"But a thing isn\'t beautiful because it lasts. It\'s a privelege to be among them.\" - Vision, Avengers: Age of Ultron",
    "\"I am Iron Man.\" - Tony Stark, Avengers: Endgame",
    "\"I can do this all day.\" - Steve Rogers, Captain America: The First Avenger",
    "\"I told you, I don\'t want to join your super-secret boy band.\" - Tony Stark, Iron Man 2",
    "\"Does he need CPR? Because I totally know CPR.\" - Darcy Lewis, Thor",
    "\"There\'s only one God ma\'am, and I\'m pretty sure he doesn\'t dress like that.\" - Steve Rogers, Avengers",
    "\"Hey, fellas, either one of you know where the Smithsonian is? I\'m here to pick up a fossil.\" - Natasha Rominoff, Captain America: The Winter Soldier",
    "\"Nothing goes over my head. My reflexes are too fast. I would catch it.\" - Drax, Guardians of the Galaxy",
    "\"Asleep for the danger, awake for the money, as per frickin\' usual.\" - Rocket, Guardians of the Galaxy",
    "\"Language.\" - Steve Rogers, Avengers: Age of Ultron",
    "\"Baskin Robbins always finds out.\" - Dale, Ant-Man",
    "\"I don\'t know if you\'ve been in a fight before but there\'s usually not this much talking.\" - Sam Wilson, Captain America: Civil War",
    "\"I’m made of rocks, as you can see, but don’t let that intimidate you. You don’t need to be afraid, unless you’re made of scissors! Just a little rock-paper-scissors joke for you!\" - Korg, Thor: Ragnarok",
    "\"There was one time when we were children. He transformed himself into a snake, and he knows that I love snakes. So I went to pick up the snake to admire it, and he transformed back into himself and he was like, ‘Blech, it’s me!’ And he stabbed me. We were 8 at the time.\" - Thor, Thor: Ragnarok",
    "\"Guns. So primitive.\" - Okoye, Black Panther",
    "\"Excuse me, sir! I can help! Let me help! I\'m really strong and I\'m… sticky!\" - Peter Parker, Spider-Man: Far From Home",
    "I’m gonna need a rain check on that dance.\" - Steve Rogers, Captain America: The First Avenger",
    "\"I\'m with you \'til the end of the line.\" - Steve Rogers, Captain America: The Winter Soldier",
    "\"I love you 3000.\" - Tony Stark, Avengers: Endgame"};
    
  @Override
  public void doGet(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
    String json = convertToJsonUsingGson(quotes);
    response.setContentType("application/json;");
    response.getWriter().println(json);
  }
  private String convertToJsonUsingGson(String[] quotes) {
    Gson gson = new Gson();
    String json = gson.toJson(quotes);
    return json;
  }
}

