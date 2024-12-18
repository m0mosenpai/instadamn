package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC913345m;
import X.C45U;
import X.C46K;
import X.InterfaceC65620ToB;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import java.math.BigDecimal;

/* loaded from: classes2.dex */
public abstract class NumberSerializers$Base extends StdScalarSerializer implements C46K {
    @Override // X.C46K
    public final JsonSerializer ALs(InterfaceC65620ToB interfaceC65620ToB, AbstractC913345m abstractC913345m) {
        Class cls = this.A00;
        C45U A00 = StdSerializer.A00(interfaceC65620ToB, abstractC913345m, cls);
        if (A00 != null && A00.A00.ordinal() == 8) {
            if (cls == BigDecimal.class) {
                return NumberSerializer.BigDecimalAsStringSerializer.A00;
            }
            return ToStringSerializer.A00;
        }
        return this;
    }
}
