package com.example.project1;

import java.util.List;

interface CocheCRUD {
    void save(Coche coche);
    List<Coche> findAll();
    void delete(Coche coche);
}
