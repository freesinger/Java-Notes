/******************************************************************************
 *  Compilation:  javac PlotFilter.java
 *  Execution:    java PlotFilter < input.txt
 *  Dependencies: StdDraw.java StdIn.java
 * 
 *  % javac -cp .:stdlib.jar PlotFilter.java   
 *  % java -cp .:stdlib.jar PlotFilter < USA.txt
 *
 *  Datafiles:    http://introcs.cs.princeton.edu/java/15inout/USA.txt
 *
 ******************************************************************************/
//public class PlotFilter {
//    public static void main(String[] args) {
//        double x0 = StdIn.readDouble();
//        double y0 = StdIn.readDouble();
//        double x1 = StdIn.readDouble();
//        double y1 = StdIn.readDouble();
//        StdDraw.setXscale(x0, x1);
//        StdDraw.setYscale(y0, y1);
//
//        StdDraw.setPenRadius(0.005);
//        StdDraw.enableDoubleBuffering();
//
//        while (!StdIn.isEmpty()) {
//            double x = StdIn.readDouble();
//            double y = StdIn.readDouble();
//            StdDraw.point(x, y);
//        }
//
//        StdDraw.show();
//    }
//}
//