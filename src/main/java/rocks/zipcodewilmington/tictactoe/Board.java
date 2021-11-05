package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[] line1;
    private Character[] line2;
    private Character[] line3;

    private Character[][] matrix;
    public Board(Character[][] matrix) {
    this.matrix = matrix;
    this.line1 = matrix[0];
    this.line2 = matrix[1];
    this.line3 = matrix[2];

    }
    public Boolean isInFavorOfX() {
        Boolean result = false;
        int horizontalwin = 0;
        int verticalwin = 0;

        for (int i = 0; i < line1.length; i++) {
            if (line1[i] == 'X') {
                horizontalwin++;
                if(horizontalwin == line1.length) {
                    result = true;
                }
            }
        }
        System.out.println(horizontalwin + " " + verticalwin);
        horizontalwin = 0;
        for (int i = 0; i < line2.length; i++) {
            if (line2[i] == 'X') {
                horizontalwin++;
                if(horizontalwin == line2.length) {
                    result = true;
                }
            }
        }
        System.out.println(horizontalwin);
        horizontalwin = 0;
        for (int i = 0; i < line3.length; i++) {
            if(line3[i] == 'X'){
                horizontalwin++;
                if(horizontalwin == line3.length) {
                    result = true;
                }
            }
            System.out.println(horizontalwin + " " + verticalwin);
            verticalwin = 0;
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[j][i] == 'X'){
                    verticalwin++;
                    if (verticalwin == matrix.length) {
                        result = true;

                    }
                }
            }
        }

        if (matrix[1][1] == 'X'){
            if ((matrix[0][0] == 'X') && (matrix[2][2] == 'X')){
                result = true;
            }else if (matrix[0][2] == 'X' && matrix[2][0] == 'X'){
                result = true;
            }
        }

        if(horizontalwin == line3.length || verticalwin == matrix.length){
            result =  true;
        }
        System.out.println(horizontalwin + " " + verticalwin);
        return result;
    }

    public Boolean isInFavorOfO() {
        Boolean result = false;
        int horizontalwin = 0;
        int verticalwin = 0;

        for (int i = 0; i < line1.length; i++) {
            if (line1[i] == 'O') {
                horizontalwin++;
                if (horizontalwin == line1.length) {
                    result = true;
                }
            }
        }
        horizontalwin = 0;
        for (int i = 0; i < line2.length; i++) {
            if (line2[i] == 'O') {
                horizontalwin++;
                if (horizontalwin == line2.length) {
                    result = true;
                }
            }
        }
        horizontalwin = 0;
        for (int i = 0; i < line3.length; i++) {
            if (line3[i] == 'O') {
                horizontalwin++;
                if (horizontalwin == line3.length) {
                    result = true;
                }
            }
            verticalwin = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 'O') {
                    verticalwin++;
                    if (verticalwin == matrix.length) {
                        result = true;
                    }
                }
            }
        }

        if (matrix[1][1] == 'O'){
            if ((matrix[0][0] == 'O') && (matrix[2][2] == 'O')){
                result = true;
            }else if (matrix[0][2] == 'O' && matrix[2][0] == 'O'){
                result = true;
            }
        }
        if (horizontalwin == line3.length || verticalwin == matrix.length) {
            result = true;
        }
        System.out.println(horizontalwin + " " + verticalwin);
        return result;
    }

    public Boolean isTie() {
        Boolean result = false;
        if(isInFavorOfO() == false && isInFavorOfX() == false){
            result = true;
        }
        return result;
    }

    public String getWinner() {
        String result = "";
        if (isInFavorOfX() == true) {
            result = "X";
        }else if (isInFavorOfO() == true) {
            result = "O";
        }
        return result;
    }

}
