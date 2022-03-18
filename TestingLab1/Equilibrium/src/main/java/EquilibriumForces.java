public class EquilibriumForces {
    String equilibrium(int n, int forces[][]) {
        if (n <= 0 || n >= 101)
            return "Force number out of bounds";
        for (int k=0;k<n;k++){
            for (int z=0;z<3;z++){
                if (forces[k][z]>100 || forces[k][z]<-100)
                    return "Coordinate value out of bounds";
            }
        }
        int sum=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                sum = sum + forces[j][i];
            }
        }
        if (sum == 0 )
            return "YES";
        else
            return "NO";
    }
}
