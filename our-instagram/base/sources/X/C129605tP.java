package X;

/* renamed from: X.5tP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129605tP {
    public final C124725kd A00;
    public final Exception A01;
    public final boolean A02;

    public C129605tP(C124725kd c124725kd, Exception exc, boolean z) {
        this.A00 = c124725kd;
        this.A02 = z;
        this.A01 = exc;
        if (!z && c124725kd == null) {
            throw new IllegalStateException("Must provide a query result if action failed");
        }
    }
}
