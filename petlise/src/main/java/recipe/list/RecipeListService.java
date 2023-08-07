package recipe.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pagination.Pagination;
import pagination.PagingResponse;
import pagination.SearchDTO;
import recipe.RecipeService;

@Service
public class RecipeListService {
	@Autowired
	RecipeListDAO dao;

	@Autowired
	RecipeService recipeService;

	public List<RecipeListDTO> getAllRecipe() {
		return dao.getAllRecipe();
	}

	public String getRecipeName(String recipe_id) {
		return dao.getRecipeName(recipe_id);
	}

	// Pagination
	// RecipeListService
	public PagingResponse<RecipeListDTO> getAllRecipePaging(SearchDTO dto, boolean includeRecipeOfTheMonth) {
		int count = dao.getCount(dto);
		if (count < 1) {
			return new PagingResponse<>(Collections.emptyList(), null);
		}

		Pagination pagination = new Pagination(count, dto);
		dto.setPagination(pagination);

		List<RecipeListDTO> list = dao.getAllRecipePaging(dto);
		return new PagingResponse<>(list, pagination);
	}

	
	//이달의레시피 페이지
//	public List<RecipeListDTO> getRecipeOfTheMonth(SearchDTO dto, boolean includeRecipeOfTheMonth) {
//		List<RecipeListDTO> list = new ArrayList<>();
//		
//		// 이달의 레시피 가져오기
//		if (includeRecipeOfTheMonth) {
//			List<RecipeListDTO> recipeOfTheMonthList = dao.getRecipeOfTheMonth();
//			list.addAll(recipeOfTheMonthList);
//		}
//		// 전체 레시피 가져오기 (페이지네이션 적용)
//		int count = dao.getCount(dto);
//		if (count < 1) {
//			Pagination pagination = new Pagination(count, dto);
//			 
//			dto.setPagination(pagination);
//			list.addAll(dao.getAllRecipePaging(dto));
//		}
//
//		return list;
//	}

	//이달의레시피 페이지
	public PagingResponse<RecipeListDTO> getRecipeOfTheMonth(SearchDTO dto) {
		int count = dao.getRecipeOfTheMonthCount(dto);
		if (count < 1) {
			return new PagingResponse<>(Collections.emptyList(), null);
		}

		Pagination pagination = new Pagination(count, dto);
		dto.setPagination(pagination);

		List<RecipeListDTO> list = dao.getRecipeOfTheMonth(dto);
		return new PagingResponse<>(list, pagination);
	}

}
