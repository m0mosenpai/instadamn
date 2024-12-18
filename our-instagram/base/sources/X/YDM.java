package X;

/* loaded from: classes12.dex */
public final class YDM implements InterfaceC65503TlX {
    public final /* synthetic */ YNq A00;
    public final /* synthetic */ XYT A01;
    public final /* synthetic */ C73429YCy A02;

    public YDM(YNq yNq, XYT xyt, C73429YCy c73429YCy) {
        this.A02 = c73429YCy;
        this.A00 = yNq;
        this.A01 = xyt;
    }

    @Override // X.InterfaceC65503TlX
    public final void onSuccess(int i) {
        this.A00.APm(new C72206XYa(this.A01, i));
    }

    @Override // X.InterfaceC65503TlX
    public final void DGF(int i, Throwable th) {
        if (th.getMessage() != null) {
            th.getMessage();
        }
        this.A00.APm(new C72206XYa(this.A01, i));
    }
}
