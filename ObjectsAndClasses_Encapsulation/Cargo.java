public class Cargo {
    private final Dimensions dimensions; //габариты
    private final double mass;  // масса
    private final String deliveryAddress;  // адрес доставки
    private final boolean propertyFlip;  // свойство - переворачивать да\нет
    private final String registrationNumber;  // регистрац. нормер
    private final boolean fragile;  // хрупкость - да\нет

    public Cargo(Dimensions dimensions, double mass, String deliveryAddress, boolean propertyFlip, String registrationNumber, boolean fragile) {
        this.dimensions = dimensions;
        this.mass = mass;
        this.deliveryAddress = deliveryAddress;
        this.propertyFlip = propertyFlip;
        this.registrationNumber = registrationNumber;
        this.fragile = fragile;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getMass() {
        return mass;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public boolean isPropertyFlip() {
        return propertyFlip;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isFragile() {
        return fragile;
    }

    public Cargo changeDeliveryAdress(String newAdress) {
        return new Cargo(dimensions, mass, newAdress, propertyFlip, registrationNumber, fragile);
    }

    public Cargo changeDimensions(Dimensions newDimensions){
        return new Cargo(newDimensions, mass, deliveryAddress, propertyFlip, registrationNumber, fragile);
    }

    public Cargo changeMass(double newMass) {
        return new Cargo(dimensions, newMass, deliveryAddress, propertyFlip, registrationNumber, fragile);
    }

//    public String toString() {
//        return "Габариты груза: " + getDimensions() + "\n"
//                + "Адрес доставки: " + getDeliveryAddress() + "\n"
//                + "Масса груза: " + getMass() + "\n"
//                + "Свойство переворота груза: " + isPropertyFlip() + "\n"
//                + "Регистрационный номер: " + getRegistrationNumber() + "\n"
//                + "Хрупкость груза: " + isFragile();
//    }
}
