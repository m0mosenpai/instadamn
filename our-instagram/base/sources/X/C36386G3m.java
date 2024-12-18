package X;

/* renamed from: X.G3m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36386G3m implements YP2 {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ C163947Vi A01;
    public final /* synthetic */ C34927FaD A02;
    public final /* synthetic */ C2EC A03;

    public C36386G3m(InterfaceC11380iw interfaceC11380iw, C163947Vi c163947Vi, C34927FaD c34927FaD, C2EC c2ec) {
        this.A02 = c34927FaD;
        this.A03 = c2ec;
        this.A01 = c163947Vi;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.YP2
    public final void DAt() {
        C34927FaD.A00(this.A02, this.A03, "ok_button_clicked");
    }

    @Override // X.YP2
    public final void DOg() {
        C34927FaD c34927FaD = this.A02;
        C2EC c2ec = this.A03;
        C34927FaD.A00(c34927FaD, c2ec, "learn_more_clicked");
        this.A01.A00(this.A00, EnumC33322EoH.SENDER, c2ec.BKb());
    }
}
