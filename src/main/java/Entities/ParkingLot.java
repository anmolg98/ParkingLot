package Entities;
import ENUMS.LotType;
import ENUMS.Status;
import lombok.Data;

import java.util.Objects;


@Data
public class ParkingLot {
    private int id;
    private int floor;

    private Status currentStatus;

    private LotType type;

    public ParkingLot(int id, int floor, LotType type) {
        this.id = id;
        this.floor = floor;
        this.type = type;
        this.currentStatus = Status.FREE;
    }



    public void bookLot(){
        currentStatus=Status.BOOKED;
    }

    public void freeLot(){
        currentStatus=Status.FREE;
    }

    public Status checkLotStatus(){
        return currentStatus;
    }

    public int hashCode(){
        return Objects.hash(id,floor,type);
    }

}
