package ru.geekbrains.stargame;

import com.badlogic.gdx.Game;

import ru.geekbrains.stargame.screen.GameScreen;
import ru.geekbrains.stargame.screen.MenuScreen;
import ru.geekbrains.stargame.screen.MenuScreen3DZ;

public class StarGame extends Game{

    @Override
    public void create() {
        setScreen(new MenuScreen(this));

    }
}
