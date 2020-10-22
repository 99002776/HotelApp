package com.hotelapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.hotelapp.model.Hotel;
import com.hotelapp.service.HotelService;

public class HotelDAOImpl implements HotelDAO {

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return showHotelList();
	}

	@Override
	public List<Hotel> getByCity(String city) {
		// TODO Auto-generated method stub
		List<Hotel> newHotelList=new ArrayList<>();
		for(Hotel hotel : showHotelList()) {
			if(hotel.getCity().equals(city))
				newHotelList.add(hotel);
		}
		return newHotelList;
	}

	@Override
	public List<Hotel> getByCuisine(String cuisine) {
		// TODO Auto-generated method stub
		List<Hotel> newHotelList=new ArrayList<>();
		for(Hotel hotel : showHotelList()) {
			if(hotel.getCuisine().equals(cuisine))
				return showHotelList();
		}
		return newHotelList;
	}

	@Override
	public List<Hotel> getById(int id) {
		// TODO Auto-generated method stub
		for(Hotel hotel : showHotelList()) {
			if(hotel.getHotelId()==id)
				return showHotelList();
		}
		return null;
	}
	
	private List<Hotel> showHotelList(){
		return Arrays.asList(
				new Hotel("Kalyani",11,"Indian","Mysore"),
				
				new Hotel("High",11,"Indian","Banglore"),
				new Hotel("Elegance",11,"Italian","Andhra"),
				new Hotel("Rose",11,"Chinese","Telangana"));
	}


}
