package X;

import java.util.HashMap;

/* renamed from: X.6kV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC147456kV {
    public static final C147466kW A00(C62862tP c62862tP) {
        C14360o3.A0B(c62862tP, 0);
        HashMap hashMap = C147466kW.A06;
        C147466kW c147466kW = (C147466kW) hashMap.get(c62862tP);
        if (c147466kW == null) {
            C147466kW c147466kW2 = new C147466kW(c62862tP);
            hashMap.put(c62862tP, c147466kW2);
            return c147466kW2;
        }
        return c147466kW;
    }
}
