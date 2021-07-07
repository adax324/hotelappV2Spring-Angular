package com.hotelservice.hotelapp.service;

import com.hotelservice.hotelapp.bin.Guest;
import com.hotelservice.hotelapp.repo.GuestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {
    private GuestRepo guestRepo;
    @Autowired
    public GuestService(GuestRepo guestRepo) {
        this.guestRepo = guestRepo;
    }
    public void addGuestToRepo(Guest guest){
        guestRepo.save(guest);
    }
    public void addGuestsToRepo(List<Guest> guests){
        for (Guest guest : guests) {
            guestRepo.save(guest);
        }
    }
    public void deleteGuestFromRepoById(Integer id){
        guestRepo.deleteById(id);
    }
    public void deleteGuestsFromRepo(List<Guest> guests){
        for (Guest guest : guests) {
            guestRepo.delete(guest);
        }
    }
}
