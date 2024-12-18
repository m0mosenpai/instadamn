package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DWE extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C5XO A01;
    public final /* synthetic */ InterfaceC74963Ym A02;
    public final /* synthetic */ InterfaceC74963Ym A03;
    public final /* synthetic */ InterfaceC74963Ym A04;
    public final /* synthetic */ Modifier A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DWE(C5XO c5xo, InterfaceC74963Ym interfaceC74963Ym, InterfaceC74963Ym interfaceC74963Ym2, InterfaceC74963Ym interfaceC74963Ym3, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, long j, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A05 = modifier;
        this.A01 = c5xo;
        this.A07 = z;
        this.A06 = interfaceC16820sZ;
        this.A09 = z2;
        this.A02 = interfaceC74963Ym;
        this.A04 = interfaceC74963Ym2;
        this.A00 = j;
        this.A03 = interfaceC74963Ym3;
        this.A08 = z3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1014042291, "com.instagram.compose.igds.components.radiobutton.IgdsRadioButton.<anonymous> (IgdsRadioButton.kt:76)");
            }
            Modifier A0W = AbstractC25229BEm.A0W(this.A05, "IgdsRadioButton");
            Modifier A0B = AbstractC118185Wd.A0B(AbstractC118175Wb.A08(AbstractC118185Wd.A02(C118195Wf.A09, C5XR.A00(null, this.A01, A0W, AbstractC25225BEi.A0W(3), null, this.A06, this.A07)), 2.0f), 24.0f);
            c5Tl.Eno(774577468);
            boolean z = this.A09;
            boolean AH5 = c5Tl.AH5(z);
            InterfaceC74963Ym interfaceC74963Ym = this.A02;
            boolean A1X = AbstractC25225BEi.A1X(c5Tl, interfaceC74963Ym, AH5);
            InterfaceC74963Ym interfaceC74963Ym2 = this.A04;
            boolean A1X2 = AbstractC25225BEi.A1X(c5Tl, interfaceC74963Ym2, A1X);
            long j = this.A00;
            boolean A1W = AbstractC25226BEj.A1W(c5Tl, j, A1X2);
            InterfaceC74963Ym interfaceC74963Ym3 = this.A03;
            boolean A1X3 = AbstractC25225BEi.A1X(c5Tl, interfaceC74963Ym3, A1W);
            boolean z2 = this.A08;
            Object EEc = c5Tl.EEc();
            if (A1X3 || EEc == C5UI.A00) {
                EEc = new C29929DHr(interfaceC74963Ym2, interfaceC74963Ym3, interfaceC74963Ym, j, z2, z);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            AbstractC119665bP.A00(c5Tl, A0B, (InterfaceC16660sJ) EEc, 0);
            if (C0fH.A02()) {
                C0fH.A00(527099356);
            }
        }
        return C0eB.A00;
    }
}
