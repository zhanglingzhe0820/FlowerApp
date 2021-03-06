package suwu.flowerapp.exception;

import suwu.flowerapp.response.WrongResponse;

public class EventDoesNotExistException extends Exception {
    private WrongResponse response = new WrongResponse(10008, "Event id does not exists.");

    public WrongResponse getResponse() {
        return response;
    }
}
