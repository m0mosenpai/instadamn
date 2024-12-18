package X;

/* renamed from: X.OxL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56212OxL implements InterfaceC58030PoG {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C54393O1z A01;
    public final /* synthetic */ C56206OxF A02;

    public C56212OxL(C54393O1z c54393O1z, C56206OxF c56206OxF, int i) {
        this.A02 = c56206OxF;
        this.A00 = i;
        this.A01 = c54393O1z;
    }

    @Override // X.InterfaceC58030PoG
    public final void AGm() {
        C56206OxF.A00(this.A01, this.A02, this.A00 + 1);
    }

    @Override // X.InterfaceC58030PoG
    public final void AGo() {
        C52254NAu c52254NAu = this.A01.A00;
        c52254NAu.A0U.A0O();
        c52254NAu.A0R.setVisibility(0);
    }
}
