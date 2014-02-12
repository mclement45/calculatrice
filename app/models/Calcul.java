package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class Calcul {
    @Required
    public int nb1;
    public int nb2;
    public char op;
    public Calcul() {}
    public Calcul(int x, int y, char op) {
		this.nb1 = x;
		this.nb2 = y;
		this.op = op;
    }

    public int addition(){
		int res;
		if(op=='+'){
			res=nb1+nb2;
		}
		return res;
    }
}
