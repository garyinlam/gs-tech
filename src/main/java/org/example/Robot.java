package org.example;

public class Robot {
    private int[] coordinates;

    public void setCoordinates(int[] coordinates) {
        this.coordinates = coordinates;
    }

    public int[] move(String commands){
        for (int i = 0; i < commands.length(); i++) {
            char current = commands.toUpperCase().charAt(i);
            switch (current){
                case 'U':
                    coordinates[1]++;
                    break;
                case 'D':
                    coordinates[1]--;
                    break;
                case 'L':
                    coordinates[0]--;
                    break;
                case 'R':
                    coordinates[0]++;
                    break;
            }
        }
        return coordinates;
    }
}
