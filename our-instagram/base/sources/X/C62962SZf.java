package X;

/* renamed from: X.SZf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62962SZf {
    public final C63174SeZ A00;
    public final C58443PvM A01;
    public final C62566SGr A02;

    public static void A00(C2GT c2gt, C63174SeZ c63174SeZ) {
        c2gt.A09(new C63625SqX(c2gt, C63628Sqa.A00(c63174SeZ, 56), 18));
    }

    public final C58252li A01() {
        C63346Si2 c63346Si2 = this.A00.A01;
        REN ren = c63346Si2.A01;
        AbstractC63144Sdq.A02(ren);
        return TW3.A00(TW3.A00(ren.A03, c63346Si2, 20), this, 9);
    }

    public final Q8J A02(SXG sxg, String str) {
        C58443PvM c58443PvM = this.A01;
        C63582Spp c63582Spp = new C63582Spp(this, sxg, str, 8);
        C63174SeZ c63174SeZ = this.A00;
        AbstractC25233BEq.A0v(0, c58443PvM, c63174SeZ, sxg);
        C60624REj c60624REj = new C60624REj(c63582Spp, c63174SeZ, c58443PvM, sxg);
        AbstractC63144Sdq.A02(c60624REj);
        Q8J q8j = ((AbstractC63144Sdq) c60624REj).A03;
        q8j.A09(new C63625SqX(q8j, C63628Sqa.A00(c63174SeZ, 57), 20));
        return q8j;
    }

    public C62962SZf(C63174SeZ c63174SeZ, C58443PvM c58443PvM, C62566SGr c62566SGr) {
        this.A02 = c62566SGr;
        this.A01 = c58443PvM;
        this.A00 = c63174SeZ;
    }
}
