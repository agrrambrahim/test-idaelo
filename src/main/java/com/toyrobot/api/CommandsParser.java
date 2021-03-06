package com.toyrobot.api;

import com.toyrobot.api.tabletop.Command;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;


public class CommandsParser {

    public static LinkedList<Command> parseToStringList(String inputString) {
        return new LinkedList<Command>(
                Arrays.stream(inputString.split("\n"))
                        .map(CommandFactory::from)
                        .collect(Collectors.toList()));
    }

}
