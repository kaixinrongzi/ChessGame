package com.playchessgame.chessgame.Database;

import com.playchessgame.chessgame.Entities.User;
import com.playchessgame.chessgame.Entities.PlayerUser;
import com.playchessgame.chessgame.Exceptions.UserAlreadyExistsException;

public interface Database {

    public void createNewDatabase();

    public void addUserInfo(User user) throws UserAlreadyExistsException;

    public void deleteUserInfo(PlayerUser user);

    public boolean checkUserExistence(User user);

    public void updateUserPassword(PlayerUser user, String newPassword);

    public void updateUserElo(PlayerUser user, Integer newElo);

    public boolean checkUserPassword(String username, String password);

}
