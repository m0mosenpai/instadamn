package X;

/* renamed from: X.Bnc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26517Bnc extends AbstractC51572Yf {
    public final C28362CfM A00;
    public final C7N A01;
    public final InterfaceC16660sJ A02;
    public final boolean A03;
    public final C51722Yv A04;
    public final AbstractC27456C9y A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public C26517Bnc(C51722Yv c51722Yv, C28362CfM c28362CfM, AbstractC27456C9y abstractC27456C9y, C7N c7n, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        AbstractC167007dF.A1F(abstractC27456C9y, 1, c7n);
        C14360o3.A0B(c28362CfM, 11);
        this.A05 = abstractC27456C9y;
        this.A03 = z;
        this.A08 = z2;
        this.A01 = c7n;
        this.A0A = z3;
        this.A09 = z4;
        this.A02 = interfaceC16660sJ;
        this.A04 = c51722Yv;
        this.A06 = z5;
        this.A07 = z6;
        this.A00 = c28362CfM;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        Integer num;
        C14360o3.A0B(c76223bS, 0);
        C27947CTg A01 = CXC.A01(c76223bS, AbstractC43591JPw.A00(2), null);
        AbstractC27456C9y abstractC27456C9y = this.A05;
        AbstractC89903zW.A01(c76223bS, DQV.A00, new Object[]{abstractC27456C9y});
        AbstractC89903zW.A01(c76223bS, DQW.A00, new Object[]{abstractC27456C9y});
        AbstractC89903zW.A01(c76223bS, DQX.A00, new Object[]{abstractC27456C9y});
        C51722Yv c51722Yv = this.A04;
        Integer num2 = C05F.A00;
        C9CT A0m = AbstractC25225BEi.A0m(num2, 100.0f, 0);
        if (c51722Yv == C51722Yv.A02) {
            c51722Yv = null;
        }
        C51722Yv A0h = AbstractC25225BEi.A0h(c51722Yv, A0m);
        Integer num3 = C05F.A01;
        C51722Yv A0d = AbstractC25230BEn.A0d(A0h, num3, 100.0f, 0);
        if (abstractC27456C9y instanceof C27318C3z) {
            C7N c7n = this.A01;
            boolean z = this.A0A;
            return new C26453Bma(AbstractC25225BEi.A0h(null, new C77863eE(num2, C30182DRn.A01(this, 12), null)).A00(AbstractC25231BEo.A0W(c76223bS.A05, A0d, EnumC76913cd.GLOBAL, "suggestions_visibility")), (C27318C3z) abstractC27456C9y, c7n, this.A02, z, this.A06);
        }
        if (abstractC27456C9y instanceof C43) {
            return new C26537Bnw(AbstractC25231BEo.A0W(c76223bS.A05, A0d, EnumC76913cd.GLOBAL, "suggestions_search_visibility"));
        }
        if (abstractC27456C9y instanceof C44) {
            C27988CVl c27988CVl = ((C44) abstractC27456C9y).A00;
            boolean z2 = this.A03;
            boolean z3 = this.A08;
            return new C26491BnC(A0d, this.A01, c27988CVl, this.A02, C30487DbW.A00(A01, this, c76223bS, 37), z2, z3, this.A09);
        }
        if (abstractC27456C9y instanceof C40) {
            C40 c40 = (C40) abstractC27456C9y;
            if (c40.A04) {
                num = C05F.A0C;
            } else {
                num = num2;
                if (this.A09) {
                    num = num3;
                }
            }
            return new C26571BoU(AbstractC25225BEi.A0h(null, new C77863eE(num2, C30182DRn.A01(this, 13), null)).A00(AbstractC25231BEo.A0W(c76223bS.A05, A0d, EnumC76913cd.GLOBAL, "results_visibility")), c40, this.A01, num, this.A02, C30487DbW.A00(A01, this, c76223bS, 38), new C30752Dfp(12, this, A01, c76223bS), this.A03, this.A08, this.A07);
        }
        if (abstractC27456C9y instanceof C41) {
            return new C26538Bnx(A0d);
        }
        return new C75723ad();
    }
}
