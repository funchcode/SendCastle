package com.example.swagger.api;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping(path = "/v1/users")
@RestController
public class UserController {

    @ApiOperation(value = "유저 정보 조회", notes = "서버에 등록된 모든 유저를 조회합니다.")
    @GetMapping("")
    public void getUsers() {

    }

    @PostMapping("")
    public void addUser() {

    }

    @PutMapping("/{userId}")
    public void updateUser(
            @PathVariable("userId") String userId
    ) {

    }

    @DeleteMapping("/{userId}")
    public void deleteUser(
            @ApiParam(
                    value = "유저 고유 키 값(ID)",
                    required = true,
                    type = "String",
                    example = "asdfjaxcvbq345")
            @PathVariable("userId") String userId
    ) {
    }

}
