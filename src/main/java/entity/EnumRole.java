package entity;

public enum EnumRole {

    DEVELOPER ("developer"),
    DESIGNER ("designer"),
    MANAGER ("manager");

    private String role;

    EnumRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return role;
    }
}
