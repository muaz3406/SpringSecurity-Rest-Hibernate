package com.muaz.Chart.resource;


import com.muaz.Chart.domain.ToDoList;
import com.muaz.Chart.domain.User;
import com.muaz.Chart.repository.ToDoListRepository;
import com.muaz.Chart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/todolist")
public class UserResource {

    @Autowired
    private ToDoListRepository toDoListRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/add/{id}/{name}/{questions}/{date}")
    public User addUserTask(@PathVariable("id") final Long id,
                            @PathVariable("name")final String name,
                            @PathVariable("questions")final int questions,
                            @PathVariable("date") final String date
    ){

        User user=userRepository.getOne(id);
        ToDoList toDoList=new ToDoList();
        toDoList.setName(name);
        toDoList.setQuestions(questions);
        toDoList.setDate(date);

        user.getToDoLists().add(toDoList);
        return userRepository.save(user);
    }

   @GetMapping("delete/{id}")
    public void deleteUserTask(@PathVariable("id")final Long id){

       toDoListRepository.delete(toDoListRepository.getOne(id));

    }

}
