import java.util.Random;
import java.util.Scanner;

public class main {

   static Scanner map= new Scanner(System.in);
   static int scorepl=0;
   static  int scorecom=0;
public static void main(String [] args){
    char[][] board={{'_','|','_','|','_'},{'_','|','_','|','_'},{' ','|',' ','|',' '}};
    boolean winner=false;
    boolean again=true;
print(board);
    while(again){
        while(!winner) {
            player(board);
            winner=chekwinner(board);
            if(winner){
                break;
            }

            computer(board);
            winner=chekwinner(board);
            if(winner){
                break;
            }
        }
        System.out.println("your wins are:"+scorepl);
        System.out.println("computer winns are :"+scorecom);
        System.out.println("Do you want to play again");
        String pl =map.nextLine();

        switch (pl) {
            case "Y":
            case"y":
                again=true;
                winner=false;
                System.out.println("lets play again");
                reset(board);
                break;
            case "N":
            case"n":
                again=false;
                break;
            default: break;
        }
        }


    }




public static void print(char[][] game){
    for(int i=0;i<3;i++){
            System.out.println(game[i]);

    }

}



public static void neo(int position, char [][] game,int player){
    char character;

    if(player==1){
      character='X';
    }else {character='O';

}
    switch(position) {
        case 1:
            game[0][0]=character;
            print(game);
            break;
        case 2:
            game[0][2]=character;
            print(game);
            break;
        case 3:
            game[0][4]=character;
            print(game);
            break;
        case 4:
            game[1][0]=character;
            print(game);
            break;
        case 5:
            game[1][2]=character;
            print(game);
            break;
        case 6:
            game[1][4]=character;
            print(game);
            break;
        case 7:
            game[2][0]=character;
            print(game);
            break;
        case 8:
            game[2][2]=character;
            print(game);
            break;
        case 9:
            game[2][4]=character;
            print(game);
            break;

        default:
            break;

    }
    }

public static void player(char [][] game){

    System.out.println("dose arithmo apo 1-9");

    int move=map.nextInt();
    boolean result =chekmove(game,move);
    while(!result){
        System.out.println("invalid move please give another:");
         move= map.nextInt();
        result =chekmove(game,move);
    }
    System.out.println("you moved to:"+move);
    neo(move,game,1);
}
public static boolean chekmove(char [][] game,int move){
    switch (move){
        case 1:
            if(game[0][0]=='_'){
                return true;
            }else return false;
        case 2:
            if(game[0][2]=='_'){
                return true;
            }else return false;
        case 3:
            if(game[0][4]=='_'){
                return true;
            }else return false;
        case 4:
            if(game[1][0]=='_'){
                return true;
            }else return false;
        case 5:
            if(game[1][2]=='_'){
                return true;
            }else return false;
        case 6:
            if(game[1][4]=='_'){
                return true;
            }else return false;
            case 7:
            if(game[2][0]==' '){
                return true;
            }else return false;
        case 8:
            if(game[2][2]==' '){
                return true;
            }else return false;
        case 9:
            if(game[2][4]==' '){
                return true;
            }else return false;
        default:
            return false;
    }
}

public static void computer(char [][] game ){
    Random my=new Random();
   int move=my.nextInt(9)+1;
    boolean result =chekmove(game,move);
    while(!result){
        move=my.nextInt(9)+1;
        result =chekmove(game,move);
    }
    System.out.println("the computer moved to position:"+move);
    neo(move,game,2);
}

public static boolean chekwinner(char [][] board){
    if (board[0][0]=='X'&&board[0][2]=='X'&&board[0][4]=='X'){
        System.out.println("You win");
        scorepl++;
        return true;
    }
    if (board[0][0]=='O'&&board[0][2]=='O'&&board[0][4]=='O'){
        System.out.println("the compyter win");
        scorecom++;
        return true;
    }

    if (board[1][0]=='X'&&board[1][2]=='X'&&board[1][4]=='X'){
        System.out.println("You win");
        scorepl++;
        return true;
    }
    if (board[1][0]=='O'&&board[1][2]=='O'&&board[1][4]=='O'){
        System.out.println("the compyter win");
        scorecom++;
        return true;
    }
    if (board[2][0]=='X'&&board[2][2]=='X'&&board[2][4]=='X'){
        scorepl++;
        return true;
    }
    if (board[2][0]=='O'&&board[2][2]=='O'&&board[2][4]=='O'){
        System.out.println("the compyter win");
        scorecom++;
        return true;
    }
    //////////////////////////////////////////////////////
    if (board[0][0]=='X'&&board[1][0]=='X'&&board[2][0]=='X'){
        System.out.println("You win");
        scorepl++;
        return true;
    }
    if (board[0][0]=='O'&&board[1][0]=='O'&&board[2][0]=='O'){
        System.out.println("the compyter win");
        scorecom++;
        return true;
    }

    if (board[0][1]=='X'&&board[1][1]=='X'&&board[2][1]=='X'){
        System.out.println("You win");
        scorepl++;
        return true;
    }
    if (board[0][1]=='O'&&board[1][1]=='O'&&board[2][1]=='O'){
        System.out.println("the compyter win");
        scorecom++;
        return true;
    }
    if (board[2][0]=='X'&&board[2][2]=='X'&&board[2][4]=='X'){
        System.out.println("You win");
        scorepl++;
        return true;
    }
    if (board[2][0]=='O'&&board[2][2]=='O'&&board[2][4]=='O'){
        System.out.println("the compyter win");
        scorecom++;
        return true;
    }
    ///////////////////////////////////////////////////////////
    if (board[0][0]=='X'&&board[1][1]=='X'&&board[2][4]=='X'){
        System.out.println("You win");
        scorepl++;
        return true;
    }
    if (board[0][0]=='O'&&board[1][1]=='O'&&board[2][4]=='O'){
        System.out.println("the compyter win");
        scorecom++;
        return true;
    }

    if (board[0][2]=='X'&&board[1][1]=='X'&&board[2][0]=='X'){
        System.out.println("You win");
        scorepl++;
        return true;
    }
    if (board[0][2]=='O'&&board[1][1]=='O'&&board[2][0]=='O'){
        System.out.println("th compuuter win");
        scorepl++;
        return true;
    }
    if (board[0][0]!='_'&&board[0][1]!='_'&&board[2][2]!='_'&&board[1][0]!='_'&&board[1][1]!='_'&&board[1][2]!='_'&&board[2][0]!=' '&&board[2][1]!=' '&&board[2][2]!=' '){
        System.out.println("th compuuter win");
        scorepl++;
        return true;
    }

    else return false;

}
public static void reset(char [][] board){
    board[0][0]='_';
    board[0][2]='_';
    board[0][4]='_';
    board[1][0]='_';
    board[1][2]='_';
    board[1][4]='_';
    board[2][0]=' ';

    board[2][2]=' ';
    print(board);
}

}
