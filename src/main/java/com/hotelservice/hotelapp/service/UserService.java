package com.hotelservice.hotelapp.service;

import com.hotelservice.hotelapp.bin.Guest;
import com.hotelservice.hotelapp.bin.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private RoomService roomService;
    @Autowired
    public UserService(RoomService roomService) {
        this.roomService = roomService;
    }

    public List<Room> getAllRooms(){
        return roomService.getAllRooms();
    }
    public List<Room> getAvailableRooms(){
        return roomService.getAllAvailableRooms();
    }
    public void registerNewUserToRoom(Integer id, List<Guest> guests){
        roomService.registerNewRoom(id,guests);
    }
    public void unregisterUserFromRoom(Integer id){
        roomService.unregisterRoom(id);
    }
}
