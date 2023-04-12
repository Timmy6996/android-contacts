package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<A> {

    boolean theSameAs(A item);

    boolean equals(Object obj);

}