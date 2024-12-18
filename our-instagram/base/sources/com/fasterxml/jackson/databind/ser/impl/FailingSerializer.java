package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/* loaded from: classes2.dex */
public class FailingSerializer extends StdSerializer {
    public final String A00;

    public FailingSerializer() {
        super(Object.class);
        this.A00 = "Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)";
    }
}
