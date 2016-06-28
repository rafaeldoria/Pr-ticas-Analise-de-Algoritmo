/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arvore;
import pkgItem.Item;

/**
 *
 * @author Rafael
 */
public interface Arvore {
  public void insere (Item reg);
  public Item pesquisa (Item reg);
  public void retira (Item reg);
  public void imprime ();
  public void testa ();
}
