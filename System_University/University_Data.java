package System_University;

public abstract class University_Data {
    
protected int [] building; //edificio
protected int [] lounge; //salón
protected int [] students;

public University_Data(int[] building, int[] lounge, int[] students) {
    this.building = building;
    this.lounge = lounge;
    this.students = students;
}

public int[] getBuilding() {
    return building;
}
public void setBuilding(int[] building) {
    this.building = building;
}
public int[] getLounge() {
    return lounge;
}
public void setLounge(int[] lounge) {
    this.lounge = lounge;
}
public int[] getStudents() {
    return students;
}
public void setStudents(int[] students) {
    this.students = students;
}
public abstract int [][] showLounge();//mostrar
public abstract String[] coursesUniversity(); //cantidad carreras

}
