import java.util.Scanner;

public class main {

public static void main(String [] args){
    char[][] board={{'_','|','_','|','_'},{'_','|','_','|','_'},{' ','|',' ','|',' '}};

print(board);
    update(board);
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

public static void update(char [][] game){

    System.out.println("dose arithmo apo 1-9");
    Scanner map= new Scanner(System.in);
    int inp=map.nextInt();

    neo(inp,game,1);
}

}
