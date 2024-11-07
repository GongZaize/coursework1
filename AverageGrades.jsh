int[] average_grades(int[][] grades, int[] weights) {
    int numStudents = grades.length;
    int[] averages = new int[numStudents];

    for (int i = 0; i < numStudents; i++) {
        int total = 0;
        for (int j = 0; j < weights.length; j++) {
            total += grades[i][j] * weights[j];
        }
        averages[i] = total / 100;
    }
    
    return averages;
}

int[][] grades = {{51, 83, 28}, {0, 38, 95}};
int[] weights = {30, 40, 30};
int[] result = average_grades(grades, weights);

for (int avg : result) {
    System.out.println(avg);
}
