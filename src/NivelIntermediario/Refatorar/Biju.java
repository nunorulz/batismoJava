package NivelIntermediario.Refatorar;

public enum Biju {

    ICHIBI("Shukaku", "Gaara", 1),
    NIBI("Matabi", "Yugito Nii", 2),
    SANBI("Isobu", "Yagura", 3),
    YONBI("Son Goku", "Roshi", 4),
    GOBI("Kukuo", "Han",5),
    ROKUBI("Saiken", "Utakata", 6),
    NANABI("Chomei", "Fuu", 7),
    HACHIBI("Gyuki", "Killer Bee", 8),
    KYUUBI("Kurama", "Naruto Uzumaki", 9),
    JUUBI("Juubi", "Madara Uchiha",10);


    String nomeBiju;
    String jinchuriki;
    int numeroDeCaldas;

    //NoArg Constructor
    Biju(){

    }
    //AllArgs Constructor
    Biju(String nomeBiju, String jinchuriki, int numeroDeCaldas) {
        this.nomeBiju = nomeBiju;
        this.jinchuriki = jinchuriki;
        this.numeroDeCaldas = numeroDeCaldas;
    }



}
