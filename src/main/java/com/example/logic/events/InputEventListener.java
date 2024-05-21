package com.example.logic.events;

import com.example.logic.ViewData;
import com.example.logic.DownData;
public interface InputEventListener {
    DownData onDownEvent(MoveEvent event);

    ViewData onLeftEvent(MoveEvent event);

    ViewData onRightEvent(MoveEvent event);

    ViewData onRotateEvent(MoveEvent event);

    void createNewGame();
}
