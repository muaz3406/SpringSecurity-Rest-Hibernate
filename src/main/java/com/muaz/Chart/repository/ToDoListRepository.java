package com.muaz.Chart.repository;




import com.muaz.Chart.domain.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToDoListRepository extends JpaRepository<ToDoList,Long> {
    List<ToDoList> findByName(String name);

}
