/*
 * Program              : JavaGRaphics - Geometrics Wolf Head
 * Tanggal Selesai      : 31-12-2018
 * Dibuat oleh          : Alif Ramdani
 * NIM                  : 171511036
 * Almamater            : JTK Polban 2017
 */

package javagraphicsalif1;

/**
 *
 * @author Alif Ramdani - 171511036
 */

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

public class MyShape extends JPanel {
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g); 
        
        this.setBackground(new Color(0,169,157));
        
        //kerangka luar
        int xValues[] = { 244, 203, 203, 183, 183, 176, 192, 191, 248, 269, 300,    //x-koordinat sketsa wajah bagian kiri
                          331, 353, 420, 410, 426, 418, 418, 401, 401, 357 };       //x-koordinat sketsa wajah bagian kanan
        int yValues[] = { 163, 132, 197, 230, 259, 312, 327, 345, 400, 441, 487,
                          441, 400, 345, 327, 312, 259, 230, 197, 132, 163,};
        Polygon rangkaLuar = new Polygon(xValues,yValues,21);
        g.drawPolygon(rangkaLuar);
        
        //ear
        //-ear1left
        int xEar1left[] = { 244, 203, 218 };
        int yEar1left[] = { 163, 132, 184 };
        Polygon ear1left = new Polygon(xEar1left,yEar1left,3);
        g.setColor(new Color(3,150,140));
        g.fillPolygon(ear1left);
        g.setColor(Color.BLACK);
        g.drawPolygon(ear1left);        
        
        //-ear1right
        int xEar1right[] = { 357, 401, 384 };
        int yEar1right[] = { 163, 132, 184 };
        Polygon ear1right = new Polygon(xEar1right,yEar1right,3);
        g.setColor(new Color(3,150,140));
        g.fillPolygon(ear1right);
        g.setColor(Color.BLACK);
        g.drawPolygon(ear1right);        
        
        //-ear2left
        int xEar2left[] = { 203, 203, 218 };
        int yEar2left[] = { 132, 197, 184 };
        Polygon ear2left = new Polygon(xEar2left,yEar2left,3);
        g.setColor(new Color(1,77,72));
        g.fillPolygon(ear2left);
        g.setColor(Color.BLACK);
        g.drawPolygon(ear2left); 
        
        //-ear2right
        int xEar2right[] = { 401, 401, 384 };
        int yEar2right[] = { 132, 197, 184 };
        Polygon ear2right = new Polygon(xEar2right,yEar2right,3);
        g.setColor(new Color(1,77,72));
        g.fillPolygon(ear2right);
        g.setColor(Color.BLACK);
        g.drawPolygon(ear2right);      
        
        //centralForehead
        int xcentralForehead[] = { 244, 290, 292, 311, 311, 357 };
        int ycentralForehead[] = { 163, 250, 265, 265, 250, 163 };
        Polygon centralForehead = new Polygon(xcentralForehead,ycentralForehead,6);
        g.setColor(new Color(3,109,103));
        g.fillPolygon(centralForehead);
        g.setColor(Color.BLACK);
        g.drawPolygon(centralForehead);  
        
        //foreheadLeft
        int xforeheadl[] = { 244, 203, 258, 290 };
        int yforeheadl[] = { 163, 197, 238, 250 };
        Polygon foreheadl = new Polygon(xforeheadl,yforeheadl,4);
        g.setColor(new Color(3,109,103));
        g.fillPolygon(foreheadl);
        g.setColor(Color.BLACK);
        g.drawPolygon(foreheadl);  
        
        //foreheadRight
        int xforeheadr[] = { 357, 401, 343, 311 };
        int yforeheadr[] = { 163, 197, 238, 250 };
        Polygon foreheadr = new Polygon(xforeheadr,yforeheadr,4);
        g.setColor(new Color(3,150,140));
        g.fillPolygon(foreheadr);
        g.setColor(Color.BLACK);
        g.drawPolygon(foreheadr);  
        
        //sideForeheadLeft
        int xsideForeheadl[] = { 195, 234, 258, 203 };
        int ysideForeheadl[] = { 287, 263, 237, 197 };
        Polygon sideForeheadl = new Polygon(xsideForeheadl,ysideForeheadl,4);
        g.setColor(new Color(3,109,103));
        g.fillPolygon(sideForeheadl);
        g.setColor(Color.BLACK);
        g.drawPolygon(sideForeheadl);  
        
        //sideForeheadRight
        int xsideForeheadr[] = { 407, 370, 343, 401};
        int ysideForeheadr[] = { 287, 263, 237, 197 };
        Polygon sideForeheadr = new Polygon(xsideForeheadr,ysideForeheadr,4);
        g.setColor(new Color(85,171,165));
        g.fillPolygon(sideForeheadr);
        g.setColor(Color.BLACK);
        g.drawPolygon(sideForeheadr);  
        
        //topUnderEarLeft
        int xtopUnderEarl[] = { 195, 203, 183, 183 };
        int ytopUnderEarl[] = { 287, 197, 230, 259 };
        Polygon topUnderEarl = new Polygon(xtopUnderEarl,ytopUnderEarl,4);
        g.setColor(new Color(3,109,103));
        g.fillPolygon(topUnderEarl);
        g.setColor(Color.BLACK);
        g.drawPolygon(topUnderEarl);  
        
        //topUnderEarRight
        int xtopUnderEarr[] = { 407, 401, 418, 418 };
        int ytopUnderEarr[] = { 287, 197, 230, 259 };
        Polygon topUnderEarr = new Polygon(xtopUnderEarr,ytopUnderEarr,4);
        g.setColor(new Color(85,171,165));
        g.fillPolygon(topUnderEarr);
        g.setColor(Color.BLACK);
        g.drawPolygon(topUnderEarr);  
        
        //downUnderEarLeft
        int xdownUnderEarl[] = { 195, 183, 176 };
        int ydownUnderEarl[] = { 287, 259, 312 };
        Polygon downUnderEarl = new Polygon(xdownUnderEarl,ydownUnderEarl,3);
        g.setColor(new Color(3,109,103));
        g.fillPolygon(downUnderEarl);
        g.setColor(Color.BLACK);
        g.drawPolygon(downUnderEarl); 
        
        //downUnderEarRight
        int xdownUnderEarr[] = { 407, 418, 426 };
        int ydownUnderEarr[] = { 287, 259, 312 };
        Polygon downUnderEarr = new Polygon(xdownUnderEarr,ydownUnderEarr,3);
        g.setColor(new Color(85,171,165));
        g.fillPolygon(downUnderEarr);
        g.setColor(Color.BLACK);
        g.drawPolygon(downUnderEarr); 
        
        //upperFurChinLeft
        int xupperFurChinl[] = { 176, 192, 234, 195 };
        int yupperFurChinl[] = { 312, 327, 263, 287 };
        Polygon upperFurChinl = new Polygon(xupperFurChinl,yupperFurChinl,4);
        g.setColor(new Color(1,77,72));
        g.fillPolygon(upperFurChinl);
        g.setColor(Color.BLACK);
        g.drawPolygon(upperFurChinl); 
        
        //upperFurChinRight
        int xupperFurChinr[] = { 426, 410, 370, 407 };
        int yupperFurChinr[] = { 312, 327, 263, 287 };
        Polygon upperFurChinr = new Polygon(xupperFurChinr,yupperFurChinr,4);
        g.setColor(new Color(1,77,72));
        g.fillPolygon(upperFurChinr);
        g.setColor(Color.BLACK);
        g.drawPolygon(upperFurChinr); 
        
        //furChinLeft
        int xfurChinl[] = { 234, 192, 191, 228 };
        int yfurChinl[] = { 263, 327, 345, 314 };
        Polygon furChinl = new Polygon(xfurChinl,yfurChinl,4);
        g.setColor(new Color(3,109,103));
        g.fillPolygon(furChinl);
        g.setColor(Color.BLACK);
        g.drawPolygon(furChinl); 
        
        //furChinRight
        int xfurChinr[] = { 370, 410, 420, 375 };
        int yfurChinr[] = { 263, 327, 345, 314 };
        Polygon furChinr = new Polygon(xfurChinr,yfurChinr,4);
        g.setColor(new Color(85,171,165));
        g.fillPolygon(furChinr);
        g.setColor(Color.BLACK);
        g.drawPolygon(furChinr); 
        
        //innerFurChinLeft
        int xinnerFurl[] = { 234, 228, 252, 248 };
        int yinnerFurl[] = { 263, 314, 329, 303 };
        Polygon innerFurl = new Polygon(xinnerFurl,yinnerFurl,4);
        g.setColor(new Color(1,77,72));
        g.fillPolygon(innerFurl);
        g.setColor(Color.BLACK);
        g.drawPolygon(innerFurl); 
        
        //innerFurChinRight
        int xinnerFurr[] = { 370, 375, 349, 354 };
        int yinnerFurr[] = { 263, 314, 329, 303 };
        Polygon innerFurr = new Polygon(xinnerFurr,yinnerFurr,4);
        g.setColor(new Color(1,77,72));
        g.fillPolygon(innerFurr);
        g.setColor(Color.BLACK);
        g.drawPolygon(innerFurr); 
        
        //chinLeft
        int xchinl[] = { 228, 191, 248 };
        int ychinl[] = { 314, 345, 400 };
        Polygon chinl = new Polygon(xchinl,ychinl,3);
        g.setColor(new Color(3,109,103));
        g.fillPolygon(chinl);
        g.setColor(Color.BLACK);
        g.drawPolygon(chinl); 
        
        //chinRight
        int xchinr[] = { 375, 420, 353 };
        int ychinr[] = { 314, 345, 400 };
        Polygon chinr = new Polygon(xchinr,ychinr,3);
        g.setColor(new Color(85,171,165));
        g.fillPolygon(chinr);
        g.setColor(Color.BLACK);
        g.drawPolygon(chinr); 
        
        //innerChinLeft
        int xinnerChinl[] = { 252, 228, 248, 271 };
        int yinnerChinl[] = { 329, 314, 400, 375 };
        Polygon innerChinl = new Polygon(xinnerChinl,yinnerChinl,4);
        g.setColor(new Color(1,77,72));
        g.fillPolygon(innerChinl);
        g.setColor(Color.BLACK);
        g.drawPolygon(innerChinl); 
        
        //innerChinRight
        int xinnerChinr[] = { 349, 375, 353, 332 };
        int yinnerChinr[] = { 329, 314, 400, 375 };
        Polygon innerChinr = new Polygon(xinnerChinr,yinnerChinr,4);
        g.setColor(new Color(1,77,72));
        g.fillPolygon(innerChinr);
        g.setColor(Color.BLACK);
        g.drawPolygon(innerChinr);         
        
        //sideBeardLeft
        int xsideBeardl[] = { 271, 269, 248 };
        int ysideBeardl[] = { 375, 441, 400 };
        Polygon sideBeardl = new Polygon(xsideBeardl,ysideBeardl,3);
        g.setColor(new Color(3,109,103));
        g.fillPolygon(sideBeardl);
        g.setColor(Color.BLACK);
        g.drawPolygon(sideBeardl); 
        
         //sideBeardRight
        int xsideBeardr[] = { 332, 331, 353 };
        int ysideBeardr[] = { 375, 441, 400 };
        Polygon sideBeardr = new Polygon(xsideBeardr,ysideBeardr,3);
        g.setColor(new Color(85,171,165));
        g.fillPolygon(sideBeardr);
        g.setColor(Color.BLACK);
        g.drawPolygon(sideBeardr); 
        
        //upperBeardLeft
        int xupperBeardl[] = { 269, 271, 301 };
        int yupperBeardl[] = { 441, 375, 391 };
        Polygon upperBeardl = new Polygon(xupperBeardl,yupperBeardl,3);
        g.setColor(new Color(3,109,103));
        g.fillPolygon(upperBeardl);
        g.setColor(Color.BLACK);
        g.drawPolygon(upperBeardl); 
        
        //upperBeardRight
        int xupperBeardr[] = { 331, 332, 301 };
        int yupperBeardr[] = { 441, 375, 391 };
        Polygon upperBeardr = new Polygon(xupperBeardr,yupperBeardr,3);
        g.setColor(new Color(85,171,165));
        g.fillPolygon(upperBeardr);
        g.setColor(Color.BLACK);
        g.drawPolygon(upperBeardr); 
        
        //lowerBeard
        int xlowerBeard[] = { 301, 269, 300, 331 };
        int ylowerBeard[] = { 391, 441, 487, 441 };
        Polygon lowerBeard = new Polygon(xlowerBeard,ylowerBeard,4);
        g.setColor(new Color(3,150,140));
        g.fillPolygon(lowerBeard);
        g.setColor(Color.BLACK);
        g.drawPolygon(lowerBeard); 
        
        
        
        //FACES
        //eyebrowLeft
        int xeyebrowl[] = { 290, 290, 258, 234, 268 };
        int yeyebrowl[] = { 265, 250, 238, 263, 257 };
        Polygon eyebrowl = new Polygon(xeyebrowl,yeyebrowl,5);
        g.setColor(new Color(3,109,103));
        g.fillPolygon(eyebrowl);
        g.setColor(Color.BLACK);
        g.drawPolygon(eyebrowl); 
        
        //eyebrowRight
        int xeyebrowr[] = { 311, 311, 343, 370, 334 };
        int yeyebrowr[] = { 265, 250, 238, 263, 257 };
        Polygon eyebrowr = new Polygon(xeyebrowr,yeyebrowr,5);
        g.setColor(new Color(3,150,140));
        g.fillPolygon(eyebrowr);
        g.setColor(Color.BLACK);
        g.drawPolygon(eyebrowr); 
        
        //eyesLeft
        int xeyesl[] = { 268, 281, 258, 252 };
        int yeyesl[] = { 257, 278, 272, 260 };
        Polygon eyesl = new Polygon(xeyesl,yeyesl,4);
        g.setColor(Color.WHITE);
        g.fillPolygon(eyesl);
        g.setColor(Color.BLACK);
        g.drawPolygon(eyesl); 
        
        //eyesRight
        int xeyesr[] = { 334, 321, 343, 350 };
        int yeyesr[] = { 257, 278, 272, 260 };
        Polygon eyesr = new Polygon(xeyesr,yeyesr,4);
        g.setColor(Color.WHITE);
        g.fillPolygon(eyesr);
        g.setColor(Color.BLACK);
        g.drawPolygon(eyesr); 
        
        //upperEyeSkinLeft
        int xupperEyeSkinl[] = { 281, 268, 290 };
        int yupperEyeSkinl[] = { 278, 257, 265 };
        Polygon upperEyeSkinl = new Polygon(xupperEyeSkinl,yupperEyeSkinl,3);
        g.setColor(new Color(3,109,103));
        g.fillPolygon(upperEyeSkinl);
        g.setColor(Color.BLACK);
        g.drawPolygon(upperEyeSkinl); 
        
        //upperEyeSkinRight
        int xupperEyeSkinr[] = { 321, 334, 311 };
        int yupperEyeSkinr[] = { 278, 257, 265 };
        Polygon upperEyeSkinr = new Polygon(xupperEyeSkinr,yupperEyeSkinr,3);
        g.setColor(new Color(3,150,140));
        g.fillPolygon(upperEyeSkinr);
        g.setColor(Color.BLACK);
        g.drawPolygon(upperEyeSkinr); 
        
        //eyeBagLeft
        int xeyeBagl[] = { 281, 264, 252, 247, 252, 258 };
        int yeyeBagl[] = { 278, 278, 273, 261, 260, 272 };
        Polygon eyeBagl = new Polygon(xeyeBagl,yeyeBagl,6);
        g.setColor(new Color(1,77,72));
        g.fillPolygon(eyeBagl);
        g.setColor(Color.BLACK);
        g.drawPolygon(eyeBagl); 
        
        //eyeBagRight
        int xeyeBagr[] = { 321, 336, 351, 356, 350, 343 };
        int yeyeBagr[] = { 278, 278, 273, 261, 260, 272 };
        Polygon eyeBagr = new Polygon(xeyeBagr,yeyeBagr,6);
        g.setColor(new Color(1,77,72));
        g.fillPolygon(eyeBagr);
        g.setColor(Color.BLACK);
        g.drawPolygon(eyeBagr); 
        
        //biggerEyeBagLeft
        int xbiggerEyeBagl[] = { 281, 248, 234, 247, 252, 264 };
        int ybiggerEyeBagl[] = { 278, 303, 263, 261, 273, 278 };
        Polygon biggerEyeBagl = new Polygon(xbiggerEyeBagl,ybiggerEyeBagl,6);
        g.setColor(new Color(3,109,103));
        g.fillPolygon(biggerEyeBagl);
        g.setColor(Color.BLACK);
        g.drawPolygon(biggerEyeBagl); 
        
        //biggerEyeBagRight
        int xbiggerEyeBagr[] = { 321, 354, 370, 356, 351, 336 };
        int ybiggerEyeBagr[] = { 278, 303, 263, 261, 273, 278 };
        Polygon biggerEyeBagr = new Polygon(xbiggerEyeBagr,ybiggerEyeBagr,6);
        g.setColor(new Color(85,171,165));
        g.fillPolygon(biggerEyeBagr);
        g.setColor(Color.BLACK);
        g.drawPolygon(biggerEyeBagr); 
        
        //sideMouthLeft
        int xsideMouthl[] = { 281, 286, 281, 291, 300, 281, 271, 252, 248 };
        int ysideMouthl[] = { 278, 353, 363, 378, 382, 381, 375, 329, 303 };
        Polygon sideMouthl = new Polygon(xsideMouthl,ysideMouthl,9);
        g.setColor(new Color(3,109,103));
        g.fillPolygon(sideMouthl);
        g.setColor(Color.BLACK);
        g.drawPolygon(sideMouthl);
        
        //sideMouthRight
        int xsideMouthr[] = { 321, 315, 321, 311, 300, 319, 332, 349, 354 };
        int ysideMouthr[] = { 278, 353, 363, 378, 382, 381, 375, 329, 303 };
        Polygon sideMouthr = new Polygon(xsideMouthr,ysideMouthr,9);
        g.setColor(new Color(85,171,165));
        g.fillPolygon(sideMouthr);
        g.setColor(Color.BLACK);
        g.drawPolygon(sideMouthr);
        
        //upperNose
        int xupperNose[] = { 286, 281, 292, 311, 321, 315 };
        int yupperNose[] = { 353, 278, 265, 265, 278, 353 };
        Polygon upperNose = new Polygon(xupperNose,yupperNose,6);
        g.setColor(new Color(3,150,140));
        g.fillPolygon(upperNose);
        g.setColor(Color.BLACK);
        g.drawPolygon(upperNose);
        
        //nose
        int xnose[] = { 300, 291, 281, 286, 315, 321, 311 };
        int ynose[] = { 382, 378, 363, 353, 353, 363, 378 };
        Polygon nose = new Polygon(xnose,ynose,7);
        g.setColor(new Color(3,109,103));
        g.fillPolygon(nose);
        g.setColor(Color.BLACK);
        g.drawPolygon(nose);
        
        //lips
        int xlips[] = { 301, 281, 319 };
        int ylips[] = { 391, 381, 381 };
        Polygon lips = new Polygon(xlips,ylips,3);
        g.setColor(new Color(3,109,103));
        g.fillPolygon(lips);
        g.setColor(Color.BLACK);
        g.drawPolygon(lips);
        
        
        //Watermark
        g.setFont(new Font("Serif", Font.BOLD, 25));
        g.drawString("ALIF RAMDANI", 210, 545);
        
        g.setFont(new Font("SansSerif", Font.PLAIN, 20));
        g.drawString("171511036", 254, 575);
        
    }
}
