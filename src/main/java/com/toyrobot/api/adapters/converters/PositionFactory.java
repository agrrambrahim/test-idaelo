package com.toyrobot.api.adapters.converters;

import com.toyrobot.api.core.tabletop.Position;

import static java.lang.Integer.parseInt;

public class PositionFactory {
    public static Position fromPlacingCommandString(String input) {
        String[] placingCommandArguments = input.split(",");
        String[] placingCommandArray = placingCommandArguments[0].split(" ");
        return new Position(parseInt(placingCommandArray[1]), parseInt(placingCommandArguments[1]));
    }
}
