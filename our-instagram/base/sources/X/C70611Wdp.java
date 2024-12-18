package X;

/* renamed from: X.Wdp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70611Wdp implements XCI {
    public final int A00;
    public final Object A01;

    public C70611Wdp(XDK xdk, int i) {
        this.A00 = i;
        this.A01 = xdk;
    }

    @Override // X.XCI
    public final void onError(Throwable th) {
        if (this.A00 != 0) {
            if (th == null) {
                throw AbstractC166997dE.A0g();
            }
        } else if (th == null) {
            throw AbstractC166997dE.A0g();
        }
        W6j.A02((XDK) this.A01, th);
    }

    @Override // X.XCI
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        XDK xdk = (XDK) this.A01;
        W6j.A01(xdk, obj);
        W6j.A00(xdk);
    }
}
