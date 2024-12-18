package X;

/* loaded from: classes5.dex */
public abstract class BG4 {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.5Xb, X.5Xc, java.lang.Object] */
    public static final C5Y2 A00(float f, float f2) {
        InterfaceC118485Xk interfaceC118485Xk = AbstractC118445Xg.A02;
        Float valueOf = Float.valueOf(f);
        ?? obj = new Object();
        obj.A00 = f2;
        return new C5Y2(obj, interfaceC118485Xk, valueOf, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.5Xb, X.5Xc, java.lang.Object] */
    public static /* synthetic */ C5Y2 A01(C5Y2 c5y2, float f, float f2, int i) {
        long j = 0;
        boolean z = false;
        if ((i & 1) != 0) {
            f = AbstractC166987dD.A09(c5y2.getValue());
        }
        if ((i & 2) != 0) {
            f2 = ((C118395Xb) c5y2.A02).A00;
        }
        long j2 = (i & 4) != 0 ? c5y2.A01 : 0L;
        if ((i & 8) != 0) {
            j = c5y2.A00;
        }
        if ((i & 16) != 0) {
            z = c5y2.A03;
        }
        InterfaceC118485Xk interfaceC118485Xk = c5y2.A04;
        Float valueOf = Float.valueOf(f);
        ?? obj = new Object();
        obj.A00 = f2;
        return new C5Y2(obj, interfaceC118485Xk, valueOf, j2, j, z);
    }
}
