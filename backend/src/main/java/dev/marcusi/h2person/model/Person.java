package dev.marcusi.h2person.model;

import org.springframework.data.annotation.Id;

public record Person(@Id Integer id, String name, String surname, double height, double weight, int age) {
}
