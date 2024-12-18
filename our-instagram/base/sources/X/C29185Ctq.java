package X;

/* renamed from: X.Ctq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29185Ctq implements InterfaceC31034DkY {
    public static final C29185Ctq A00 = new Object();
    public static final InterfaceC1333460b A01;
    public static final boolean A02;

    @Override // X.InterfaceC31034DkY
    public final int C5w() {
        return 3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Ctq, java.lang.Object] */
    static {
        boolean A0C = C14640oc.A0C();
        A02 = A0C;
        int i = 12;
        if (A0C) {
            i = 16;
        }
        A01 = AbstractC25229BEm.A0P(i);
    }

    @Override // X.InterfaceC31034DkY
    public final C1333560c AJf(boolean z) {
        int i = 40;
        if (A02) {
            i = 32;
        }
        float f = i;
        return new C1333560c(f, 24.0f, f, 24.0f);
    }

    @Override // X.InterfaceC31034DkY
    public final InterfaceC1333460b BGR() {
        return A01;
    }
}
