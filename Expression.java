package com.devupdate.monitor;

import java.util.Map;

public interface Expression {
    public boolean expression(Map<String,Long> stats);
}
