package X;

/* renamed from: X.Sw1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63926Sw1 implements InterfaceC65635Tpw {
    public final /* synthetic */ C7CW A00;
    public final /* synthetic */ C7CY A01;
    public final /* synthetic */ InterfaceC159157Cb A02;
    public final /* synthetic */ SMM A03;

    @Override // X.InterfaceC65338TiJ
    public final void onError(Throwable th) {
        C14360o3.A0B(th, 0);
        if (th instanceof C64876TYc) {
            String str = ((C64876TYc) th).A00;
            new C62943SYl(this.A00, this.A01, str).A00(new C63927Sw2(1, this.A02, this.A03));
        }
    }

    @Override // X.InterfaceC65635Tpw
    public final void onSuccess() {
    }

    public C63926Sw1(C7CW c7cw, C7CY c7cy, InterfaceC159157Cb interfaceC159157Cb, SMM smm) {
        this.A01 = c7cy;
        this.A00 = c7cw;
        this.A03 = smm;
        this.A02 = interfaceC159157Cb;
    }
}
