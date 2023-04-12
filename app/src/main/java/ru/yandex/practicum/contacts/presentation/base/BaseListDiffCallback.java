package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback<A extends ListDiffInterface<A>> extends DiffUtil.ItemCallback<A> {

    @Override
    public boolean areItemsTheSame(@NonNull A oldItem, @NonNull A newItem) {
        return oldItem.theSameAs(newItem);

    }

    @Override
    public boolean areContentsTheSame(@NonNull A oldItem, @NonNull A newItem) {
        return oldItem.equals(newItem);

    }

    @Nullable
    @Override
    public Object getChangePayload(@NonNull A oldItem, @NonNull A newItem) {
        return newItem;

    }
}