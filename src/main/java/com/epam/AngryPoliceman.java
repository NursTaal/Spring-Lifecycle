package com.epam;

/**
 * @author Evgeny Borisov
 */
public class AngryPoliceman implements Policeman {
    @Override
    public void makePeopleLeaveRoom() {
        System.out.println("Всех убью! Вон пошли");
    }
}
