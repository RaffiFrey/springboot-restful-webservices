package com.rfrey.mapper;

import com.rfrey.dto.UserDto;
import com.rfrey.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoUserMapper {

    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

    UserDto mapToUserDto(User user);

    User mapToUser(UserDto userDto);
}
