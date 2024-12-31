package com.example.training;

import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserSchemaRepository repository;

    public UserShcema create(UserShcema user){
        return repository.save(user);
    }

    public List<UserShcema> getAll(){
        return repository.findAll();
    }

    public Optional<UserShcema> findById(UUID id){
        return repository.findById(id);
    }

    public void deleteById(UUID id){
        repository.deleteById(id);
    }


    public UserShcema update(@RequestBody UserShcema user, @PathVariable UUID id){
        Optional<UserShcema> findUser = repository.findById(id);
        if (findUser.isPresent()){
            UserShcema users = findUser.get();
            user.setNama(users.getNama());
            user.setUsia(users.getUsia());
            return repository.save(users);
        }
        else  {
            return  null;
        }
    }
}
