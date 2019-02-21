package edu.eci.arsw.cinema.filter.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import edu.eci.arsw.cinema.filter.CinemaFilter;
import edu.eci.arsw.cinema.model.Cinema;
import edu.eci.arsw.cinema.model.CinemaFunction;
import edu.eci.arsw.cinema.persistence.CinemaPersistenceException;

@Component("filter")
public class filterFuctionsByGen implements CinemaFilter {

	@Override
	public List<CinemaFunction> filteredFunctions(Cinema cinema, String date, String gen) throws CinemaPersistenceException {
		List<CinemaFunction> cine =  cinema.getFunctions();
		List<CinemaFunction> fun = new ArrayList<>();
		for (CinemaFunction function : cine) {
			if (function.getGen().equals(gen) && function.getDate().equals(date)) {
				fun.add(function);

			}
		}
		return fun;
	}
	

}
