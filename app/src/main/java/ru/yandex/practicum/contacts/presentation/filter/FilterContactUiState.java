package ru.yandex.practicum.contacts.presentation.filter;

import java.util.Collections;
import java.util.Set;

import ru.yandex.practicum.contacts.model.ContactType;

public class FilterContactUiState {
    private boolean isApplyEnable = false;
    private Set<ContactType> newSelectedContactTypes = Collections.emptySet();

    public boolean isApplyEnable() {
        return isApplyEnable;
    }

    public void setApplyEnable(boolean applyEnable) {
        isApplyEnable = applyEnable;
    }

    public Set<ContactType> getNewSelectedContactTypes() {
        return newSelectedContactTypes;
    }

    public void setNewSelectedContactTypes(Set<ContactType> newSelectedContactTypes) {
        this.newSelectedContactTypes = newSelectedContactTypes;
    }
}
