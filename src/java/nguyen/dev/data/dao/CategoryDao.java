package nguyen.dev.data.dao;

import java.util.List;

import nguyen.dev.data.model.Category;

public interface CategoryDao {
	public boolean insert(Category categories);

	public boolean update(Category categories);

	public boolean delete(int id);

	public boolean select(Category categories);

	public Category find(int id);

	public List<Category> findAll();
}
