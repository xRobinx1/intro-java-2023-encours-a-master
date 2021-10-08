package fr.pgah;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Intro extends ApplicationAdapter {
  SpriteBatch batch; //définition d'une variable (batch nom de la variable) spritebatch= type de la varialble 
  Texture img;//cela sert pour créé le voc pour l'utiliser dans le codage après mais cela tombera sur une caisse vide
  int x;
  int y;
  int hauteurFenetre;
  int hauteurImage;
  int directionEny;


  @Override //méthode
  public void create() { //nom 60x par seconde
    batch = new SpriteBatch(); //instruction et corp de la métho6de (instantiaciation + affectation)
    img = new Texture("sio.jpg");
  x = 100; //affectation
  y = 100; 
  hauteurFenetre = Gdx.graphics.getHeight();
  hauteurImage = img.getHeight();
  directionEny = 0;//0 pour monter, 1 pour descendre
}
//if (condition) <--booleen (v/f) c'est un code si la condition est vrai 
  @Override
  public void render() {
    //ScreenUtils.clear(1, 0, 0, 1);
    batch.begin(); //un appel de méthode sur lobjet batch
    x = x + 1; //incrémentation 
     if (directionEny == 0 ) {
       y = y + 1; //monte
       } else {
         y = y - 1; //descend 
        }
//Int a= x-1= décrémentation

//test de borne, bordure supérieur 
    if((y +hauteurImage) == hauteurFenetre){ 
      directionEny= 1;

      //changer la façon de modifier y
    }
    batch.draw(img, x, y); //appel du dessin (coordonées)
    batch.end();
  }
}