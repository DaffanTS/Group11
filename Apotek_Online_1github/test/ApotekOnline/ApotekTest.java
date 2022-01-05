/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApotekOnline;

import Account.Login;
import Account.Regis;
import Koneksi.Koneksi;
import MenuObat.Obat;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class ApotekTest {
    
    public ApotekTest() {
    }
    /**
     * Test of main method, of class Obat.
     */
    @Test
    public void testTambahObat() {
        Obat O = new Obat();
        assertTrue(O.btnTambah());
    }
    @Test
    public void testCari() {
        Obat O = new Obat();
        assertTrue(O.testCari());
    }
    @Test
    public void testEditObat(){
        Obat O = new Obat();
        assertTrue(O.btnEdit());
    }
    @Test
    public void testHapusObat(){
        Obat O = new Obat();
        assertTrue(O.btnHapus());
    }
    @Test
    public void testObat(){
        Obat O = new Obat();
        assertNotNull(O);
    }
    @Test
    public void testLogin(){
        Login L = new Login();
        assertTrue(L.btnLogin());
    }
    @Test
    public void testRegis(){
        Regis R = new Regis();
        assertNotNull(R);
    }
    @Test
    public void testKoneksi(){
        Koneksi k = new Koneksi();
        assertNotNull(k);
    }
}
