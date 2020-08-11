package twolak.springframework.jokes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import twolak.springframework.jokes.services.JokeService;

/**
 * @author twolak
 *
 */
@Controller
public class JokeController {
    
    private final JokeService jokeService;
    
    @Autowired
    public JokeController(JokeService jokeService) {
	this.jokeService = jokeService;
    }

    @GetMapping({"/", ""})
    public String getJoke(Model model) {
	
	model.addAttribute("joke", jokeService.getJoke());
	
	return "chucknorris";
    }
}
