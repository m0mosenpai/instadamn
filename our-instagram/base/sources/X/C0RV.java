package X;

/* renamed from: X.0RV, reason: invalid class name */
/* loaded from: classes.dex */
public abstract /* synthetic */ class C0RV {
    public static final C14880p2 A01(InterfaceC16660sJ interfaceC16660sJ, InterfaceC19390xP interfaceC19390xP) {
        return new C14880p2(new C0XR(null, interfaceC16660sJ, interfaceC19390xP));
    }

    public static final InterfaceC19390xP A00(InterfaceC19390xP interfaceC19390xP, long j) {
        if (j >= 0) {
            if (j != 0) {
                return A01(new C05I(j), interfaceC19390xP);
            }
            return interfaceC19390xP;
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }
}
