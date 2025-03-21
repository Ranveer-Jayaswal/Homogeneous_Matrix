public class HomMatP1 {
    public double[][] HomMat(double[][] matA, double[] matB) {
        double[][] homA = new double[matA.length + 1][matA.length + 1];
        for (int i = 0; i < homA.length; i++) {
            for (int j = 0; j < homA[0].length; j++) {
                if (i< homA.length-1)
                    if(j<homA.length -1)
                        homA[i][j] = matA[i][j];
                    else
                        homA[i][j] = matB[i];
                    else    
                        if (j<homA[0].length - 1) {
                            homA[i][j] = 0;
                        }
                        else
                            homA[i][j] = 1;
            }
        }
        return homA;
    }
    public double[] HomMat(double[] matB) {
        double[] HomB = new double[5];
        for(int i=0; i<matB.length; i++) {
            HomB[i] = matB[i];
        }
        HomB[4] = 1;
        return HomB;
    }
}

