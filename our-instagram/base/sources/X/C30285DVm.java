package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.DVm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30285DVm extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30285DVm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, int i3, boolean z) {
        super(2);
        this.A00 = i3;
        this.A07 = obj;
        this.A06 = obj2;
        this.A04 = obj3;
        this.A05 = obj4;
        this.A08 = z;
        this.A03 = obj5;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                C28252Ccw c28252Ccw = (C28252Ccw) this.A07;
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A06;
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A04;
                AbstractC28008CWf.A01(c28252Ccw, A0S, (Modifier) this.A05, interfaceC16820sZ, interfaceC16660sJ, (InterfaceC16620sF) this.A03, AbstractC25225BEi.A04(this.A01), this.A02, this.A08);
                break;
            case 1:
                AbstractC27537CDh.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (ImageUrl) this.A03, (InterfaceC16660sJ) this.A07, (InterfaceC16660sJ) this.A05, (InterfaceC16660sJ) this.A06, AbstractC25225BEi.A04(this.A01), this.A02, this.A08);
                break;
            case 2:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                boolean z = this.A08;
                AbstractC136646Gs.A00(A0S2, (Modifier) this.A04, (Float) this.A07, (InterfaceC16820sZ) this.A05, (InterfaceC16820sZ) this.A06, (InterfaceC16610sE) this.A03, AbstractC25225BEi.A04(this.A01), this.A02, z);
                break;
            case 3:
                AbstractC28475ChT.A01((C5XO) this.A03, AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (InterfaceC30990Djp) this.A07, (InterfaceC16660sJ) this.A05, (InterfaceC16660sJ) this.A06, AbstractC25225BEi.A04(this.A01), this.A02, this.A08);
                break;
            case 4:
                C5Tl A0S3 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) this.A06;
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A05;
                C26040BfT c26040BfT = (C26040BfT) this.A07;
                AbstractC28466ChI.A02(A0S3, (Modifier) this.A04, (EnumC33510Erj) this.A03, c26040BfT, interfaceC16660sJ2, interfaceC16620sF, AbstractC25225BEi.A04(this.A01), this.A02, this.A08);
                break;
            default:
                C5Tl c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
                    c5Tl.Em9();
                    break;
                } else {
                    if (C0fH.A02()) {
                        C0fH.A01(-1643216148, "com.instagram.schools.management.graduation.ChangeGraduationComposeView.<anonymous> (ChangeGraduationComposeView.kt:40)");
                    }
                    C1130158n c1130158n = Modifier.A00;
                    Modifier Eq3 = c1130158n.Eq3(AbstractC118185Wd.A00);
                    Object obj3 = this.A03;
                    Object obj4 = this.A04;
                    boolean z2 = this.A08;
                    CPM cpm = (CPM) this.A06;
                    Object obj5 = this.A07;
                    int i = this.A01;
                    int i2 = this.A02;
                    InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, 0);
                    int A00 = C5X2.A00(c5Tl);
                    C117505Tk c117505Tk = (C117505Tk) c5Tl;
                    C59P A04 = C117505Tk.A04(c117505Tk);
                    Modifier A01 = C5X3.A01(c5Tl, Eq3);
                    AbstractC25233BEq.A11(c5Tl, c117505Tk);
                    AbstractC25231BEo.A12(c5Tl, A02, A04);
                    InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
                    if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
                    }
                    AbstractC25225BEi.A1K(c5Tl, A01);
                    boolean A1S = AbstractC25231BEo.A1S(c5Tl, cpm, obj5, AbstractC25226BEj.A1Y(c5Tl, z2, AbstractC25232BEp.A1X(c5Tl, obj3, obj4, -1329578321)));
                    Object EEc = c5Tl.EEc();
                    if (A1S || EEc == C5UI.A00) {
                        EEc = new BUO(4, obj5, obj3, cpm, obj4, z2);
                        c5Tl.FBy(EEc);
                    }
                    AbstractC28328CeG.A01(c5Tl, AbstractC25229BEm.A0T(c117505Tk, c1130158n, EEc), i, i2, 0, 0);
                    C5WR.A0R(c5Tl, AbstractC118175Wb.A0C(AbstractC25226BEj.A0T(c1130158n), 16.0f, 16.0f, 16.0f), AbstractC25225BEi.A0Y(c5Tl), AbstractC136736Hc.A00(c5Tl, 2131955007), AbstractC25226BEj.A0M(c5Tl));
                    c5Tl.ASW();
                    InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A05;
                    boolean A1X = AbstractC25232BEp.A1X(c5Tl, obj3, obj4, 890286996);
                    Object EEc2 = c5Tl.EEc();
                    if (A1X || EEc2 == C5UI.A00) {
                        EEc2 = AbstractC25235BEs.A19(c5Tl, obj3, obj4, 38);
                    }
                    InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(c117505Tk, EEc2, false);
                    boolean A1X2 = AbstractC25232BEp.A1X(c5Tl, obj3, obj4, 890290042);
                    Object EEc3 = c5Tl.EEc();
                    if (A1X2 || EEc3 == C5UI.A00) {
                        EEc3 = AbstractC25235BEs.A19(c5Tl, obj3, obj4, 39);
                    }
                    CK9.A00(c5Tl, cpm, interfaceC16820sZ2, A1A, AbstractC25225BEi.A1A(c117505Tk, EEc3, false), 0);
                    if (C0fH.A02()) {
                        C0fH.A00(1049587447);
                        break;
                    }
                }
                break;
        }
        return C0eB.A00;
    }
}
