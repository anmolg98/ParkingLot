package Entities;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Ticket {
    private static int id_count=0;
    private int id;
    private int lot_id;

    private int lot_floor;
    private Timestamp entryTimeStamp;

    public static Ticket generateTicket(int lot_id){
        Ticket t = new Ticket(id_count,lot_id);
        id_count++;
        return t;

    }

    public Ticket(int id,int lot_id,int lot_floor){
        this.id=id;
        this.lot_id=lot_id;
        this.lot_floor=lot_floor;
        entryTimeStamp = new Timestamp(System.currentTimeMillis());

    }

    public void printTicket(){
        System.out.println("Welcome to the Parking");
        SimpleDateFormat sdf = new SimpleDateFormat("HH mm ss");
        System.out.println("Parking Lot Number: "+ lot_id );
        System.out.println("Parking Lot Floor: "+ lot_floor );
        System.out.println("Entry Time " + sdf.format(entryTimeStamp));
    }
}
