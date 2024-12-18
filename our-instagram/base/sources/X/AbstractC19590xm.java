package X;

/* renamed from: X.0xm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC19590xm {
    public static final C07050Yx A00(InterfaceC19630xq interfaceC19630xq, String str, float f) {
        C14360o3.A0B(interfaceC19630xq, 0);
        return new C07050Yx(Float.valueOf(f), str, new C02990Bx(interfaceC19630xq, 2), new C02990Bx(interfaceC19630xq.ARD(), 3), false);
    }

    public static final C07050Yx A01(InterfaceC19630xq interfaceC19630xq, String str, int i) {
        C14360o3.A0B(interfaceC19630xq, 0);
        return new C07050Yx(Integer.valueOf(i), str, new C02990Bx(interfaceC19630xq, 4), new C02990Bx(interfaceC19630xq.ARD(), 5), false);
    }

    public static final C07050Yx A02(InterfaceC19630xq interfaceC19630xq, String str, long j, boolean z) {
        C14360o3.A0B(interfaceC19630xq, 0);
        return new C07050Yx(Long.valueOf(j), str, new C02990Bx(interfaceC19630xq, 6), new C02990Bx(interfaceC19630xq.ARD(), 7), z);
    }

    public static final C07050Yx A03(InterfaceC19630xq interfaceC19630xq, String str, String str2) {
        C14360o3.A0B(interfaceC19630xq, 0);
        return new C07050Yx(str2, str, new C02990Bx(interfaceC19630xq, 8), new C02990Bx(interfaceC19630xq.ARD(), 9), false);
    }

    public static final C07050Yx A04(InterfaceC19630xq interfaceC19630xq, String str, String str2) {
        return new C07050Yx(str2, str, new C0AS(interfaceC19630xq, 0), new C02990Bx(interfaceC19630xq.ARD(), 16), false);
    }

    public static final C07050Yx A05(InterfaceC19630xq interfaceC19630xq, String str, java.util.Set set) {
        C14360o3.A0B(set, 2);
        return new C07050Yx(set, str, new C0AS(interfaceC19630xq, 1), new C02990Bx(interfaceC19630xq.ARD(), 17), false);
    }

    public static final C07050Yx A06(InterfaceC19630xq interfaceC19630xq, String str, boolean z) {
        C14360o3.A0B(interfaceC19630xq, 0);
        return new C07050Yx(Boolean.valueOf(z), str, new C02990Bx(interfaceC19630xq, 0), new C02990Bx(interfaceC19630xq.ARD(), 1), false);
    }

    public static final C07040Yw A07(InterfaceC19630xq interfaceC19630xq, String str) {
        return new C07040Yw(null, str, new C02990Bx(interfaceC19630xq, 14), new C02990Bx(interfaceC19630xq.ARD(), 15));
    }

    public static final void A09(InterfaceC19630xq interfaceC19630xq, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC19630xq, 0);
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        interfaceC16660sJ.invoke(ARD);
        ARD.apply();
    }

    public static final C07040Yw A08(InterfaceC19630xq interfaceC19630xq, String str, boolean z) {
        return new C07040Yw(Boolean.valueOf(z), str, new C02990Bx(interfaceC19630xq, 10), new C02990Bx(interfaceC19630xq.ARD(), 11));
    }
}
