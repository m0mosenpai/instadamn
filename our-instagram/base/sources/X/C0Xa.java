package X;

/* renamed from: X.0Xa, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Xa {
    public static final C0Xa A01;
    public static final C0Xa A02 = new C0Xa(0);
    public final int A00;

    static {
        new C0Xa(2);
        A01 = new C0Xa(64);
    }

    public C0Xa(int i) {
        if (((i - 1) & i) == 0) {
            this.A00 = i;
            return;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0c("Only one flag must be set for a listener, ", " passed", i));
    }
}
