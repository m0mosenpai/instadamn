package X;

/* renamed from: X.DfN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30725DfN extends C0YY implements InterfaceC16600sD {
    public final /* synthetic */ BP5 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ C0s9 A03;
    public final /* synthetic */ C5Hc A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30725DfN(BP5 bp5, String str, String str2, C0s9 c0s9, C5Hc c5Hc) {
        super(4);
        this.A04 = c5Hc;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = c0s9;
        this.A00 = bp5;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int A0H = AbstractC166987dD.A0H(obj2);
        C5Tl c5Tl = (C5Tl) obj3;
        if (AbstractC25229BEm.A1X(obj4)) {
            C0fH.A01(1103124883, "com.instagram.creator.agent.settings.facts.fragment.InformationScreen.<anonymous> (InformationFragment.kt:126)");
        }
        InterfaceC30942Diw interfaceC30942Diw = (InterfaceC30942Diw) AbstractC001800i.A0O(this.A04, A0H);
        if (interfaceC30942Diw == null) {
            if (C0fH.A02()) {
                i = 1809468440;
                C0fH.A00(i);
            }
            return C0eB.A00;
        }
        if (interfaceC30942Diw instanceof C26205BiV) {
            c5Tl.Eno(642958477);
            AbstractC28441Cgp.A03(c5Tl, ((C26205BiV) interfaceC30942Diw).A00, this.A01, this.A02, this.A03, 0);
        } else if (interfaceC30942Diw instanceof C26204BiU) {
            CYR.A01(c5Tl, AbstractC25227BEk.A0L(AbstractC25225BEi.A0N(c5Tl, 643123397), 12.0f), this.A00, this.A01, 384, 0);
        } else {
            throw AbstractC25233BEq.A0s(c5Tl, 1129117976);
        }
        if (AbstractC25230BEn.A1Y(c5Tl)) {
            i = 580089175;
            C0fH.A00(i);
        }
        return C0eB.A00;
    }
}
