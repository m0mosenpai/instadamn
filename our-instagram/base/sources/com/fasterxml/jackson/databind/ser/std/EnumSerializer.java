package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC58319PtB;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C2I7;
import X.C45U;
import X.C45V;
import X.C46K;
import X.EnumC912645f;
import X.InterfaceC65620ToB;
import X.TI8;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes10.dex */
public class EnumSerializer extends StdScalarSerializer implements C46K {
    public final TI8 A00;
    public final Boolean A01;

    public EnumSerializer(TI8 ti8, Boolean bool) {
        super(ti8.A00);
        this.A00 = ti8;
        this.A01 = bool;
    }

    public static Boolean A03(C45U c45u, Boolean bool, Class cls, boolean z) {
        String str;
        C45V c45v = c45u.A00;
        if (c45v != C45V.ANY && c45v != C45V.SCALAR) {
            if (c45v != C45V.STRING && c45v != C45V.NATURAL) {
                if (!c45v.A00() && c45v != C45V.ARRAY) {
                    String name = cls.getName();
                    if (z) {
                        str = "class";
                    } else {
                        str = "property";
                    }
                    throw AbstractC58319PtB.A0j("Unsupported serialization shape (%s) for Enum %s, not supported as %s annotation", new Object[]{c45v, name, str});
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        return bool;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        boolean A0C;
        Enum r5 = (Enum) obj;
        Boolean bool = this.A01;
        if (bool != null) {
            A0C = bool.booleanValue();
        } else {
            A0C = abstractC913345m.A05.A0C(EnumC912645f.WRITE_ENUMS_USING_INDEX);
        }
        if (A0C) {
            anonymousClass182.A0h(r5.ordinal());
            return;
        }
        if (abstractC913345m.A05.A0C(EnumC912645f.WRITE_ENUMS_USING_TO_STRING)) {
            anonymousClass182.A0u(r5.toString());
        } else {
            anonymousClass182.A0n(this.A00.A01[r5.ordinal()]);
        }
    }

    @Override // X.C46K
    public final JsonSerializer ALs(InterfaceC65620ToB interfaceC65620ToB, AbstractC913345m abstractC913345m) {
        Class cls = super.A00;
        C45U A00 = StdSerializer.A00(interfaceC65620ToB, abstractC913345m, cls);
        if (A00 != null) {
            Boolean bool = this.A01;
            Boolean A03 = A03(A00, bool, cls, false);
            if (!C2I7.A00(A03, bool)) {
                return new EnumSerializer(this.A00, A03);
            }
        }
        return this;
    }
}
