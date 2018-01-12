package de.michlb.sample.service;

import de.michlb.sample.domain.BookCategory;


import java.util.List;

/**
 * Created by mbart on 28.02.2016.
 */
public interface BookCategoryService {
 List<BookCategory> loadAll();
  BookCategory  saveBookCategory(BookCategory bookCategory);
  void deleteBookCategoryList(List<Integer> ids);
}
