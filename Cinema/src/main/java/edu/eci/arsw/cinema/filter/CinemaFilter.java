package edu.eci.arsw.cinema.filter;

import java.util.List;

import edu.eci.arsw.cinema.model.Cinema;
import edu.eci.arsw.cinema.model.CinemaFunction;
import edu.eci.arsw.cinema.persistence.CinemaPersistenceException;

public interface CinemaFilter {

	public List<CinemaFunction> filteredFunctions(Cinema cinema, String date, String info)
			throws CinemaPersistenceException;
	
}
