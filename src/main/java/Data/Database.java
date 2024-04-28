package Data;

import ENUMS.LotType;
import ENUMS.Status;
import Entities.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private List<ParkingLot> lotList;

    public Database(){
        lotList = new ArrayList<>();
    }

    public void addLot(ParkingLot lot){
        lotList.add(lot);
    }

    public ParkingLot getEmptyLot(LotType type){
        for(ParkingLot lot:lotList){
            if(lot.checkLotStatus().equals(Status.FREE)&&lot.getType().equals(type)){
                return lot;

            }
        }
        return null;
    }

    public boolean isLotEmpty(LotType type){
        for(ParkingLot lot:lotList){
            if(lot.checkLotStatus().equals(Status.FREE)&&lot.getType().equals(type)){
                return true;

            }
        }
        return false;
    }

    public int getFreeLotCount(LotType type){
          int count =0;
        for(ParkingLot lot:lotList){
            if(lot.checkLotStatus().equals(Status.FREE)&&lot.getType().equals(type)){
                count++;

            }
        }
        return count;
    }

}
