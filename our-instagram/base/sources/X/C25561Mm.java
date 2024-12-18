package X;

/* renamed from: X.1Mm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25561Mm {
    public static final C25561Mm A02;
    public static final C25561Mm A03;
    public final Throwable A00;
    public final boolean A01;

    static {
        if (!AbstractC25011Ke.A02) {
            A02 = new C25561Mm(false, null);
            A03 = new C25561Mm(true, null);
        }
    }

    public C25561Mm(boolean wasInterrupted, Throwable cause) {
        this.A01 = wasInterrupted;
        this.A00 = cause;
    }
}
