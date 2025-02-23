package Cage;

public enum Size {
    SMALL(2),
    MEDIUM(4),
    LARGE(8);

    private final int value;

    Size(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
