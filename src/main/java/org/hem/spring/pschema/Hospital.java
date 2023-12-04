package org.hem.spring.pschema;

public class Hospital {
    private String name;
    private int patientNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(int patientNo) {
        this.patientNo = patientNo;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", patientNo=" + patientNo +
                '}';
    }
}
