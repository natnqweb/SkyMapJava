

/**
 * @brief Structure to represent a star
 */
public class Star implements CelestialObject {
    public double right_ascension;
    public double declination;

    public Star(double RA, double Dec) {
        right_ascension = (RA);
        declination = (Dec);
    }

    public Star() {
    }

    @Override
    public double GetRA() {
        return right_ascension;
    }

    @Override
    public double GetDec() {
        return declination;
    }

    @Override
    public void SetRA(double RA) {
        right_ascension = RA;
    }

    @Override
    public void SetDec(double Dec) {
        declination = Dec;
    }

}
