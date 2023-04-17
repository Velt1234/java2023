package de.baleipzig.generics;

public class Grade<T> {
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public boolean isNotGraded() {
		return value == null;
	}

	@Override
	public String toString() {
		return "Grade [value=" + value + "]";
	}
}
