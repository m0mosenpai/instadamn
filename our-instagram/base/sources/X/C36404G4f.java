package X;

/* renamed from: X.G4f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36404G4f implements InterfaceC50433MOn {
    public final /* synthetic */ FOg A00;

    public C36404G4f(FOg fOg) {
        this.A00 = fOg;
    }

    @Override // X.InterfaceC50433MOn
    public final void EJV() {
        FOg fOg = this.A00;
        Dz7 dz7 = fOg.A0D;
        String str = fOg.A03;
        boolean z = fOg.A04;
        C35039FcC c35039FcC = dz7.A05;
        if (c35039FcC != null && z && str != null) {
            ((C26141Ov) c35039FcC.A01.invoke()).A0A(G5U.A00, str);
        }
    }
}
