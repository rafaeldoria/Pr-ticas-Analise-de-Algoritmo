/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgItem;

/**
 *
 * @author Rafael
 */
public interface Item {
  public int compara (Item it);
  public void alteraChave (Object chave);
  public Object recuperaChave ();  
}
