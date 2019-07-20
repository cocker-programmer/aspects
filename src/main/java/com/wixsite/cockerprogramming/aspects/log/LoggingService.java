package com.wixsite.cockerprogramming.aspects.log;

import org.springframework.stereotype.Service;

@Service
class LoggingService {

    @LogInputOutput(input = false)
    String getMessage(long id) {
        return "This is example number " + id;
    }

    @LogInputOutput
    String getMessage(String[] fullname) {
        return String.format("This is example fullname %s %s", fullname[0], fullname[1]);
    }

    @LogInputOutput(output = false)
    String getMessage(String name) {
        return String.format("This is example name %s", name);
    }
}
