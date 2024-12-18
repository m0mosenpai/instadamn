package X;

import java.util.List;

/* renamed from: X.OqP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55814OqP implements C2JL {
    public final /* synthetic */ W99 A00;
    public final /* synthetic */ L4N A01;
    public final /* synthetic */ C55168OdW A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ C14510oO A05;
    public final /* synthetic */ C14510oO A06;
    public final /* synthetic */ C14510oO A07;
    public final /* synthetic */ C14510oO A08;
    public final /* synthetic */ C15370ps A09;

    public C55814OqP(W99 w99, L4N l4n, C55168OdW c55168OdW, List list, List list2, C14510oO c14510oO, C14510oO c14510oO2, C14510oO c14510oO3, C14510oO c14510oO4, C15370ps c15370ps) {
        this.A01 = l4n;
        this.A02 = c55168OdW;
        this.A08 = c14510oO;
        this.A00 = w99;
        this.A06 = c14510oO2;
        this.A07 = c14510oO3;
        this.A09 = c15370ps;
        this.A05 = c14510oO4;
        this.A03 = list;
        this.A04 = list2;
    }

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        W99 w99 = this.A00;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(w99.A01, "ig_search_meta_ai_hcm_hidden_response_fail");
        if (A0f.isSampled()) {
            AbstractC37301Gc2.A15(A0f, w99.A00);
            String A14 = AbstractC25225BEi.A14();
            if (A14 == null) {
                A14 = "";
            }
            AbstractC25225BEi.A1N(A0f, A14);
            JQ0.A18(A0f, w99);
        }
        C55168OdW c55168OdW = this.A02;
        L4N l4n = this.A01;
        String str = l4n.A05;
        String str2 = l4n.A04;
        C55168OdW.A03(c55168OdW, str, str2, new JEZ(C55168OdW.A02(c55168OdW, str, str2).getValue(), 18));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d9  */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v47 */
    @Override // X.C2JL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r51) {
        /*
            Method dump skipped, instructions count: 963
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55814OqP.onSuccess(java.lang.Object):void");
    }
}
