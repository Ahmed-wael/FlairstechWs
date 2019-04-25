package com.flairstect.springboot.workshop;


import javax.persistence.*;




@Entity
@Table(name = "country")
public class Country {
@Id
@GeneratedValue
//@SequenceGenerator(
//        name = "country_generator",
//        sequenceName = "country_sequence",
//        initialValue = 1000
//)
private Long id;

@Column(columnDefinition = "text")
private String code;

@Column(columnDefinition = "text")
private String name;

@Column(columnDefinition = "text")
private String continent;

@Column(columnDefinition = "numeric")
private String population;

@Column(columnDefinition = "text")
private String life_expectancy;

@Column(columnDefinition = "text")
private String country_language;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getContinent() {
	return continent;
}

public void setContinent(String continent) {
	this.continent = continent;
}

public String getPopulation() {
	return population;
}

public void setPopulation(String population) {
	this.population = population;
}

public String getLife_expectancy() {
	return life_expectancy;
}

public void setLife_expectancy(String life_expectancy) {
	this.life_expectancy = life_expectancy;
}

public String getCountry_language() {
	return country_language;
}

public void setCountry_language(String country_language) {
	this.country_language = country_language;
}



// Getters and Setters (Omitted for brevity)
}