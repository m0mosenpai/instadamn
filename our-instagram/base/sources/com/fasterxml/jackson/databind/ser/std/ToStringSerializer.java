package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes2.dex */
public class ToStringSerializer extends ToStringSerializerBase {
    public static final ToStringSerializer A00 = new ToStringSerializer();

    public ToStringSerializer() {
        super(Object.class, false);
    }
}
