package com.HotelManagementSystem.HotelManagementSystem.Controller;


import com.HotelManagementSystem.HotelManagementSystem.Entity.Hotel;
import com.HotelManagementSystem.HotelManagementSystem.Service.HotelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/hotels/edit/{hotelCode}")
    public String editHotelForm(@PathVariable Long hotelCode, Model model){
        model.addAttribute("hotel",hotelService.getHotelById(hotelCode));
        return "edit_hotel";

    }
    @PostMapping("hotels/{hotelCode}")
    public String updateHotel(@PathVariable Long hotelCode,
                                @ModelAttribute("hotel") Hotel hotel,
                                Model model){
        Hotel existingHotel = hotelService.getHotelById(hotelCode);
        existingHotel.setHotelCode(hotelCode);
        existingHotel.setHotelName(hotel.getHotelName());
        existingHotel.setAddress(hotel.getAddress());
        existingHotel.setPostCode(hotel.getPostCode());
        existingHotel.setCity(hotel.getCity());
        existingHotel.setCountry(hotel.getCountry());

        //save updated hotel object

        hotelService.updateHotel(existingHotel);
        return "redirect:/hotels";

    }

    //delete method
    @DeleteMapping("/hotels{hotelCode}")
    public String deleteHotel(@PathVariable Long hotelCode){
        hotelService.deleteHotelById(hotelCode);
        return "redirect:/hotels";

    }
}
