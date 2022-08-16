package org.example.Prototype;

import org.example.Builder.Person;

public interface Prototype {
    org.example.Prototype.Person clone(org.example.Prototype.Person person);
}
