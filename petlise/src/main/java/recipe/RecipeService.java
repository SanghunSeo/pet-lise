package recipe;

import java.sql.Timestamp;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {
    private final RecipeDAO recipeDAO;

    @Autowired
    public RecipeService(RecipeDAO recipeDAO) {
        this.recipeDAO = recipeDAO;
    }
    
    public void createRecipe(RecipeDTO recipeDTO) {
        recipeDTO.setRecipe_id(UUID.randomUUID().toString());  // 게시글 ID 설정 (UUID 사용)
        recipeDTO.setRecipe_created_at(new Timestamp(System.currentTimeMillis()));  // 게시글 생성 시간 설정
        recipeDTO.setRecipe_updated_at(new Timestamp(System.currentTimeMillis()));  // 게시글 수정 시간 설정
        recipeDTO.setRecipe_category("나만의레시피");
        
        recipeDAO.insertRecipe(recipeDTO);  // 게시글 등록
    }
}