package edu.eci.arsw.cinema.filter.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.YamlProcessor.ResolutionMethod;
import org.springframework.stereotype.Component;

import edu.eci.arsw.cinema.filter.CinemaFilter;
import edu.eci.arsw.cinema.model.Cinema;
import edu.eci.arsw.cinema.model.CinemaFunction;
import edu.eci.arsw.cinema.persistence.CinemaPersistenceException;

//@Component("filter")
public class filterFuctionsBySeats implements CinemaFilter {
	
	int seats;
	
	@Override
	public List<CinemaFunction> filteredFunctions(Cinema cinema, String date, String seats) throws CinemaPersistenceException {
		try {
			this.seats = Integer.parseInt(seats);
		} catch (NumberFormatException e) {
			System.out.println("Enter a numeric value");
			return null;
		}
		List<CinemaFunction> cine =  cinema.getFunctions();
		List<CinemaFunction> fun = new ArrayList<>();
		for (CinemaFunction function : cine) {
			if (function.getNumSeats() >= this.seats && function.getDate().equals(date)) {
				fun.add(function);

			}
		}
		return fun;
	}
	

}
