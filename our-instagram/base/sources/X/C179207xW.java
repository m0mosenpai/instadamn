package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7xW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179207xW {
    public final InterfaceC179227xY[] A01 = new InterfaceC179227xY[EnumC179217xX.values().length];
    public final boolean[] A02 = new boolean[EnumC179217xX.values().length];
    public final AtomicBoolean A00 = new AtomicBoolean();

    public static void A00(C179207xW c179207xW) {
        for (EnumC179217xX enumC179217xX : EnumC179217xX.values()) {
            int ordinal = enumC179217xX.ordinal();
            InterfaceC179227xY[] interfaceC179227xYArr = c179207xW.A01;
            if (interfaceC179227xYArr[ordinal] != null && c179207xW.A00.get() && c179207xW.A02[ordinal]) {
                interfaceC179227xYArr[ordinal].ARQ();
            }
        }
    }
}
