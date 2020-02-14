public class Map {

    public static void main(String[] args){
        int mapLengthX = 5;
        int mapLengthY = 3;
        String[][] theMap = createMap(mapLengthX,mapLengthY);
        System.out.println(theMap);
        checkingMap(theMap);

    }

    public static String[][] createMap(int mapLengthX, int mapLengthY){
        String[][] theMap = new String[mapLengthX][mapLengthY];

        for (int i= 0; i<=mapLengthX; i++ ){
            for (int j=0; j<=mapLengthX; j++){
                theMap[i][j] = String.valueOf(i)+String.valueOf(j);
            }
        }
        return theMap;
    }

    public static void checkingMap (String[][] themap){
        for (int i= 0; i<themap.length; i++ ){
            for (int j=0; j<themap[0].length; j++){
                System.out.println("The value of x: " + i + " y: " + j + " is " + themap[i][j]);
            }
        }
    }

}


//class Map
//
//    attr_accessor :theMap
//
//        def initialize(mapSize)
//@theMap = Array.new(mapSize[0]){Array.new(mapSize[1],".")}
//        end
//
//        #Adding a singleship
//        def addShip(coordinates)
//@theMap[coordinates[0]][coordinates[1]] = "="
//        end
//
//        #adding multiple ships
//        #where coordinates is an array of multiple array coordinates coordinates
//        def addMultipleShips(multiCoordinates)
//        for ships in 0..multiCoordinates.length-1
//        self.addShip(multiCoordinates[ships])
//        end
//        end
//
//        end