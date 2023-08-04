package recipe.detail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;
import recipe.RecipeDTO;
import user.UserDTO;

@Controller
public class RecipeDetailController {

	@Autowired
	RecipeDetailService service;
	
	@GetMapping("/recipedetail")
	public ModelAndView recipeDetail(HttpSession session, String comment_id) {
		session.setAttribute("recipe_id", "aaa");
		String recipe_id = session.getAttribute("recipe_id").toString();
		session.setAttribute("user_id", "petlise");
		String user_id = session.getAttribute("user_id").toString();
		
		ModelAndView mv = new ModelAndView();
		UserDTO userInfo = service.getUserInfoRecipe(user_id);
		RecipeDTO recipeDetail = service.getRecipeDetail(recipe_id);
		List<RecipeCommentDTO> recipeComment = service.getRecipeComment(recipe_id);
		List<RecipeCommentDTO> replyList = service.getReply(comment_id);
		mv.addObject("userInfo", userInfo);
		mv.addObject("recipeDetail", recipeDetail);
		mv.addObject("recipeComment", recipeComment);
		mv.addObject("replyList", replyList);
		mv.setViewName("/recipe/recipeDetail");
		return mv;
	}
	
	@PostMapping("/writerecipecomment")
	@ResponseBody
	public String writeRecipeComment(@RequestBody RecipeCommentDTO dto) {
		int result = service.writeRecipeComment(dto);
		return "{\"result\":\"" + result + "\"}";
	}
	
	@PostMapping("/likecount")
	@ResponseBody
	public String likeCount(RecipeLikeDTO dto) {
		int result = service.likeCount(dto);
		return "{\"result\":\"" + result + "\"}";		
	}
}