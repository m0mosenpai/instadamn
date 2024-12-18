package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DcP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30542DcP extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC74953Yl A01;
    public final /* synthetic */ InterfaceC74953Yl A02;
    public final /* synthetic */ C26045BfY A03;
    public final /* synthetic */ InterfaceC16620sF A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30542DcP(InterfaceC74953Yl interfaceC74953Yl, InterfaceC74953Yl interfaceC74953Yl2, C26045BfY c26045BfY, InterfaceC16620sF interfaceC16620sF, int i) {
        super(3);
        this.A03 = c26045BfY;
        this.A00 = i;
        this.A04 = interfaceC16620sF;
        this.A02 = interfaceC74953Yl;
        this.A01 = interfaceC74953Yl2;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        C5Tl c5Tl = (C5Tl) obj2;
        int A0H = AbstractC166987dD.A0H(obj3);
        C14360o3.A0B(obj, 0);
        if ((A0H & 17) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(578805691, "com.instagram.creator.agent.settings.facts.fragment.AddFact.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddFactFragment.kt:195)");
            }
            InterfaceC74953Yl interfaceC74953Yl = this.A02;
            String A1D = AbstractC25226BEj.A1D(interfaceC74953Yl);
            C26045BfY c26045BfY = this.A03;
            Integer num = c26045BfY.A04;
            if (num == null || (str = AbstractC136736Hc.A00(c5Tl, num.intValue())) == null) {
                str = "";
            }
            int i = c26045BfY.A01;
            Modifier A0H2 = AbstractC25227BEk.A0H(AbstractC25226BEj.A0T(Modifier.A00), 24.0f);
            c5Tl.Eno(-1726545006);
            int i2 = this.A00;
            boolean AH2 = c5Tl.AH2(i2);
            InterfaceC16620sF interfaceC16620sF = this.A04;
            boolean A1X = AbstractC25225BEi.A1X(c5Tl, interfaceC16620sF, AH2);
            InterfaceC74953Yl interfaceC74953Yl2 = this.A01;
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == C5UI.A00) {
                EEc = new C30176DRg(interfaceC74953Yl, interfaceC74953Yl2, interfaceC16620sF, i2, 7);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            AbstractC28505Chy.A05(c5Tl, A0H2, null, true, A1D, str, (InterfaceC16660sJ) EEc, i, 3072, 48, 63408);
            if (C0fH.A02()) {
                C0fH.A00(-414628406);
            }
        }
        return C0eB.A00;
    }
}
