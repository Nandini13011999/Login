package com.capgemini.bookstore.entites;

public class Book {
	
	private int isbn;
	private String name;
	private float cost;
	
	public Book(int isbn, String name, float cost) {
		this.isbn=isbn;
		this.name=name;
		this.cost=cost;
	}
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", salary=" + cost + "]";
	}
	
	public void setIsbn(int isbn) {
		this.isbn=isbn;
	}
	public int getIsbn() {
		return isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float salary) {
		this.cost = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + isbn;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(cost);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbn != other.isbn)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(cost) != Float.floatToIntBits(other.cost))
			return false;
		return true;
	}

	
	
	

}
