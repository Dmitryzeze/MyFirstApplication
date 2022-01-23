package com.dmitryzeze.myfirstapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Collections;
import java.util.List;

public class MainFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Dog dog = new Dog();
        Cat cat = new Cat();
        List<Animals> animalsList = Collections.emptyList();
        animalsList.add(dog);
        animalsList.add(cat);

        List<Integer> integerList = Collections.emptyList();
        genericExample(animalsList);
        genericExample(integerList);

        notGenericExample(dog);
        notGenericExample(cat);
    }

    private void notGenericExample(Animals animal) {
        animal.call();
    }

    private <T> void genericExample(List<T> animals) {
        animals.clear();
    }

    public interface Animals {

        void call();
    }

    public class Dog implements Animals {

        @Override
        public void call() {
            System.out.println("ufdufd");
        }
    }

    public class Cat implements Animals {

        @Override
        public void call() {
            System.out.println("rbcrbc");
        }
    }
}