package com.HotelManagementSystem.HotelManagementSystem.Controller;


import com.HotelManagementSystem.HotelManagementSystem.Entity.Hotel;
import com.HotelManagementSystem.HotelManagementSystem.Service.HotelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class  HotelController {

    private HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }
    @GetMapping("/hotels")
    public String listHotels(Model model){
        model.addAttribute("hotels",hotelService.getAllHotels());
        return "hotels";

    }

    @GetMapping("/hotels/new")
    public String createHotelForm(Model model){
        Hotel hotel = new Hotel();
        model.addAttribute("hotel",hotel);
        return "Add_hotel";
    }
    @PostMapping("/hotels")
    public String saveHotel(@ModelAttribute("hotel") Hotel hotel){
        hotelService.saveHotel(hotel);
        return "redirect:/hotels";

    }
}
