package com.facebook.msys.cql.dataclasses;

import X.AbstractC09800fd;
import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.AbstractC907342m;
import X.C61796Rtq;
import X.InterfaceC65641Tq6;
import X.LA0;

/* loaded from: classes10.dex */
public final class XmaContentRefDataclassAdapter extends LA0 {
    public static final C61796Rtq Companion = new Object();
    public static final XmaContentRefDataclassAdapter INSTANCE = new LA0();

    /* JADX WARN: Type inference failed for: r0v2, types: [X.42m, X.Tq6] */
    @Override // X.LA0
    public InterfaceC65641Tq6 toAdaptedObject(String str) {
        if (str != null) {
            return new AbstractC907342m(AbstractC58318PtA.A17(str));
        }
        throw AbstractC166987dD.A15("Trying to create XmaContentRefDataclass from null string");
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.42m, X.Tq6] */
    @Override // X.LA0
    public InterfaceC65641Tq6 toNullableAdaptedObject(String str) {
        if (str != null) {
            AbstractC09800fd.A01("XmaContentRefDataclassImpl.toNullableAdaptedObject.Deserialize", -1366890266);
            try {
                ?? abstractC907342m = new AbstractC907342m(AbstractC58318PtA.A17(str));
                AbstractC09800fd.A00(-1950496410);
                return abstractC907342m;
            } catch (Throwable th) {
                AbstractC09800fd.A00(1078972292);
                throw th;
            }
        }
        return null;
    }

    public String toNullableRawObject(InterfaceC65641Tq6 interfaceC65641Tq6) {
        if (interfaceC65641Tq6 != null) {
            return toRawObject(interfaceC65641Tq6);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toRawObject(InterfaceC65641Tq6 interfaceC65641Tq6) {
        String obj;
        if (interfaceC65641Tq6 != 0 && (obj = ((AbstractC907342m) interfaceC65641Tq6).A00.toString()) != null) {
            return obj;
        }
        throw AbstractC166987dD.A15("Trying to get string from null XmaContentRefDataclass");
    }
}
