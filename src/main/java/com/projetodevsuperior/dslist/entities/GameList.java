package com.projetodevsuperior.dslist.entities;

import java.util.Objects;

public class GameList {
    private Long id;
    private String namel;

    public GameList(){

    }

    public GameList(Long id, String namel) {
        this.id = id;
        this.namel = namel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamel() {
        return namel;
    }

    public void setNamel(String namel) {
        this.namel = namel;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GameList gameList = (GameList) o;
        return Objects.equals(id, gameList.id) && Objects.equals(namel, gameList.namel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, namel);
    }
}
