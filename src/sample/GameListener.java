package sample;

import javafx.scene.input.KeyCode;

/**
 * GamePanel与地图之间的回调监听
 * @author HUPENG
 */
public interface GameListener {
    public void onMyCharacterSpriteCreated(CharacterSprite characterSprite);
    public void onOpponentCharacterSpriteCreated(CharacterSprite characterSprite);
    public void onMyCharacterSpriteMoved(KeyCode keyCode);
    public void onFoodSpriteCreated(FoodSprite foodSprite);
    public void onFoodAdd(Coord coord);
    public void onTextSpriteCreated(TextSprite textSprite);
}
