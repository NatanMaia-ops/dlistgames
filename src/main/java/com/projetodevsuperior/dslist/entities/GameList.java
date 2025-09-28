package com.projetodevsuperior.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game_list")
public class GameList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
co
    private String name;

    public GameList(){

    }

    public GameList(Long id, String namel) {
        this.id = id;
        this.name = namel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamel() {
        return name;
    }

    public void setNamel(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GameList gameList = (GameList) o;
        return Objects.equals(id, gameList.id) && Objects.equals(name, gameList.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
