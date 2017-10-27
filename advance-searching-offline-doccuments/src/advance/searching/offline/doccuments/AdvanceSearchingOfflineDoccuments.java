/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package advance.searching.offline.doccuments;

/**
 *
 * @author MUNTASIR SHAHRIAR
 */
public class AdvanceSearchingOfflineDoccuments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world");
        AdvanceSearchingOfflineDoccuments obj = new AdvanceSearchingOfflineDoccuments();
        obj.solve();
    }
    public void solve()
    {
        System.out.println("Hi solve");
        ParseDoc docParser = new ParseDoc();
//        docParser.Parse("C:\\Users\\MUNTASIR SHAHRIAR\\Documents\\advance-searching-in-offline-document\\advance-searching-offline-doccuments\\src\\advance\\searching\\offline\\doccuments\\Zinia_CV.pdf");
//        docParser.parseDoc("abcd");
        docParser.parseDocx("alj");
//        docParser.parseText("abcd");
    }
    
}
