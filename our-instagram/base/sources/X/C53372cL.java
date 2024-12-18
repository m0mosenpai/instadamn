package X;

/* renamed from: X.2cL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C53372cL {
    public static final C53372cL A02;
    public static final C53372cL A03;
    public final Throwable A00;
    public final boolean A01;

    static {
        if (!AbstractC49192Nt.A01) {
            A02 = new C53372cL(false, null);
            A03 = new C53372cL(true, null);
        }
    }

    public C53372cL(boolean wasInterrupted, Throwable cause) {
        this.A01 = wasInterrupted;
        this.A00 = cause;
    }
}
