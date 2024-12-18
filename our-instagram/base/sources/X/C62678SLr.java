package X;

/* renamed from: X.SLr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62678SLr {
    public final Integer A00;
    public final Object A01;
    public final Throwable A02;

    public final C63406Sjd A00() {
        C63406Sjd A05;
        Throwable th = this.A02;
        Object obj = this.A01;
        if (th == null) {
            A05 = C63406Sjd.A04(obj);
        } else {
            A05 = C63406Sjd.A05(obj, th);
        }
        C14360o3.A0A(A05);
        return A05;
    }

    public C62678SLr(Integer num, Object obj, Throwable th) {
        this.A01 = obj;
        this.A00 = num;
        this.A02 = th;
    }
}
