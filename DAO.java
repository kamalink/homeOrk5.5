package module5.homeOrk5;

import module5.homeOrk1and2.Room;

public interface DAO {
    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
    Room[]getAll();
}
