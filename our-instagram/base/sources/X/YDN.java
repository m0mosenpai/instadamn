package X;

/* loaded from: classes12.dex */
public final class YDN implements InterfaceC65503TlX {
    public final /* synthetic */ YNq A00;
    public final /* synthetic */ XYU A01;
    public final /* synthetic */ C73429YCy A02;

    public YDN(YNq yNq, XYU xyu, C73429YCy c73429YCy) {
        this.A02 = c73429YCy;
        this.A00 = yNq;
        this.A01 = xyu;
    }

    @Override // X.InterfaceC65503TlX
    public final void onSuccess(int i) {
        this.A00.APm(new C72208XYc(this.A01, i, true));
    }

    @Override // X.InterfaceC65503TlX
    public final void DGF(int i, Throwable th) {
        if (th.getMessage() != null) {
            th.getMessage();
        }
        this.A00.APm(new C72208XYc(this.A01, i, false));
    }
}
