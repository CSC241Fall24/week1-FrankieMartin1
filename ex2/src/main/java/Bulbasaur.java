public class Bulbasaur {
    private int id;
    private int level;

    // Constructor
    public Bulbasaur() {
        this.id = 1; // Default to Bulbasaur
        this.level = 1; // Default level
    }

    // Method to set the level and handle evolution
    public void setLevel(int lv) {
        if (lv < 1) {
            throw new IllegalArgumentException("Level must be greater than 0.");
        }
        this.level = lv;

        // Evolve based on level
        if (lv >= 32) {
            this.id = 3; // Venusaur
        } else if (lv >= 16) {
            this.id = 2; // Ivysaur
        } else {
            this.id = 1; // Bulbasaur
        }
    }

    // Method to get the current level
    public int getLevel() {
        return this.level;
    }

    // Method to get the name based on the id
    public String getName() {
        switch (this.id) {
            case 3:
                return "Venusaur";
            case 2:
                return "Ivysaur";
            case 1:
            default:
                return "Bulbasaur";
        }
    }

    // Method to get the id
    public int getID() {
        return this.id;
    }

    // Method to provide a string representation of the object
    @Override
    public String toString() {
        // Output format "Level: X, ID: Y"
        return "Level: " + level + ", ID: " + id;
    }

    // Method to compare this object with another object
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Bulbasaur other = (Bulbasaur) obj;
        return this.id == other.id && this.level == other.level;
    }

    // Method to create a copy of this object
    public Bulbasaur copy() {
        Bulbasaur newBulbasaur = new Bulbasaur();
        newBulbasaur.id = this.id;
        newBulbasaur.level = this.level;
        return newBulbasaur;
    }
}

