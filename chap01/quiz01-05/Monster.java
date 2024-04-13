public record Monster(String name, int hp, boolean isBoss) {
    // compact constructor
    public Monster {
        if (hp < 0) {
            throw new IllegalArgumentException("hp is invalid");
        }
    }
}