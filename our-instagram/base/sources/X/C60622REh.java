package X;

/* renamed from: X.REh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60622REh extends C58444PvN {
    public volatile C62678SLr A00;

    public static C60622REh A00(C62731SNv c62731SNv, InterfaceC40711ue interfaceC40711ue, C1Dk c1Dk, C2n2 c2n2) {
        return A02(c62731SNv, interfaceC40711ue, c1Dk, c2n2, EnumC61233Riv.A01);
    }

    public static C60622REh A01(C62731SNv c62731SNv, InterfaceC40711ue interfaceC40711ue, C1Dk c1Dk, C2n2 c2n2, int i) {
        return A02(c62731SNv, interfaceC40711ue, c1Dk, new C58605PyY(i), c2n2);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.REh, java.lang.Object, X.PvN] */
    public static C60622REh A02(C62731SNv c62731SNv, InterfaceC40711ue interfaceC40711ue, C1Dk c1Dk, C2n2 c2n2, C2n2 c2n22) {
        ?? c58444PvN = new C58444PvN();
        C70435WVn c70435WVn = new C70435WVn(0, c58444PvN, c2n22);
        interfaceC40711ue.ATV(c70435WVn, new WW5(0, c70435WVn, c58444PvN, c2n2), c1Dk);
        if (c62731SNv != null) {
            c62731SNv.A01(new C63588Spv(c58444PvN));
        }
        return c58444PvN;
    }

    @Override // X.C58444PvN, X.InterfaceC65512Tlh
    public final void A9a(InterfaceC65392TjP interfaceC65392TjP) {
        super.A9a(interfaceC65392TjP);
        if (this.A00 != null) {
            interfaceC65392TjP.Dx0(this.A00);
        }
    }
}
