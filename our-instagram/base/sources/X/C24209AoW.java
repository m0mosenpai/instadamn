package X;

/* renamed from: X.AoW, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24209AoW implements InterfaceC58133Ppw {
    public final /* synthetic */ AKB A00;
    public final /* synthetic */ String A01;

    public C24209AoW(AKB akb, String str) {
        this.A00 = akb;
        this.A01 = str;
    }

    @Override // X.InterfaceC58133Ppw
    public final void D7c(boolean z, String str) {
        AKB akb = this.A00;
        C22895A7p c22895A7p = new C22895A7p(false, str);
        akb.A01 = c22895A7p;
        akb.A0C.put(this.A01, c22895A7p);
        AKB.A00(akb);
    }

    @Override // X.InterfaceC58133Ppw
    public final void D7d(String str) {
        AKB akb = this.A00;
        C22895A7p c22895A7p = new C22895A7p(true, str);
        akb.A01 = c22895A7p;
        akb.A0C.put(this.A01, c22895A7p);
        AKB.A00(akb);
    }

    @Override // X.InterfaceC58133Ppw
    public final void onFinish() {
        AKB akb = this.A00;
        akb.A00 = null;
        akb.A05.removeCallbacks(akb.A0B);
        if (akb.A04) {
            AKB.A01(akb);
        }
    }
}
