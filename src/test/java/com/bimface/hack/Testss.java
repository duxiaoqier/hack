package com.bimface.hack;

import com.bimface.hack.bean.Room;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dup, 2017-11-24
 */
public class Testss {

    private Room room = new Room();

    @Test
    public void test() {
        List<Room> list = new ArrayList<>();
        room.setRoomId(1);
        room.setRoomName("港珠澳大桥BIM模型");
        room.setStatus(1);
        room.setThumbnail("");
        list.add(room);
        room.setRoomId(2);
        room.setRoomName("广联达上海研发中心");
        room.setStatus(0);
        room.setThumbnail("");
        list.add(room);
        room.setRoomId(5);
        System.out.println(list);
    }


}
