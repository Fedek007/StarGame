package ru.geekbrains.stargame.screen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import ru.geekbrains.stargame.base.Base2DScreen;


public class MenuScreen extends Base2DScreen {

    final static float SPEED = 1f;
    SpriteBatch batch;
    Texture img;
    Texture img1;
    Vector2 pos;
    Vector2 v;
    Vector2 touchPos;
    Vector2 b;


    public MenuScreen(Game game) {
        super(game);
    }


    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        super.touchDown(screenX, screenY, pointer, button);
        touchPos.set(screenX, Gdx.graphics.getHeight() - screenY);
        v.set(touchPos.cpy().sub(pos).setLength(SPEED));
        System.out.println("touchPos.x = " + touchPos.x + " touchPos.y = " + touchPos.y);
        return false;
    }

    @Override
    public void show() {
        super.show();
        batch = new SpriteBatch();
        img = new Texture("space.jpg");
        img1 = new Texture("mario.png");
        pos = new Vector2(0,0);
        v = new Vector2();
        touchPos = new Vector2();
        b = new Vector2();
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(img, 0, 0);
        batch.draw(img1,pos.x,pos.y);
        b.set(touchPos);
        if(b.sub(pos).len()>SPEED) {
            pos.add(v);
        }else pos.set(touchPos);
        batch.end();
    }

    @Override
    public void dispose() {
        super.dispose();
        batch.dispose();
        img.dispose();
    }



    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        super.touchUp(screenX, screenY, pointer, button);
        return false;
    }
}
