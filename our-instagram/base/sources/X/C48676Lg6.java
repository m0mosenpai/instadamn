package X;

/* renamed from: X.Lg6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48676Lg6 implements InterfaceC31037Dkb {
    public final /* synthetic */ C48519LdH A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ InterfaceC16660sJ A02;

    public C48676Lg6(C48519LdH c48519LdH, Integer num, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = c48519LdH;
        this.A01 = num;
        this.A02 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31037Dkb
    public final void DVx() {
        this.A02.invoke(KPW.A00);
    }

    @Override // X.InterfaceC31037Dkb
    public final void onFailure() {
        this.A02.invoke(new KPV("Creating Blockstore failed"));
    }

    @Override // X.InterfaceC31037Dkb
    public final void onSuccess() {
        this.A00.A05(this.A01);
        this.A02.invoke(KPX.A00);
    }
}
