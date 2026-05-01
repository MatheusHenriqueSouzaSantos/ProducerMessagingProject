package user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<UserModel>> findAll(){
            return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable UUID id){
        return ResponseEntity.ok(service.findById(id));
    }
    @PostMapping
    public ResponseEntity<UserModel> create(@RequestBody UserInputDto dto){
        return ResponseEntity.ok(service.create(dto));
    }
    @PutMapping("/{id}")
    public ResponseEntity<UserModel> update(@PathVariable UUID id,
                                            @RequestBody UserInputDto dto){
        return ResponseEntity.ok(service.update(id,dto));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deActivate(@PathVariable UUID id){
        service.deActivate(id);
        return ResponseEntity.noContent().build();
    }

}
