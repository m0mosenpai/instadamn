package X;

import androidx.compose.ui.Modifier;
import com.google.common.collect.ImmutableList;
import com.instagram.schools.management.data.SchoolInfo;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes5.dex */
public final class DWQ extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DWQ(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A01 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A09 = obj3;
        this.A08 = obj4;
        this.A06 = obj5;
        this.A07 = obj6;
        this.A05 = obj7;
        this.A04 = obj8;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                ((C5TR) this.A09).A07(AbstractC25226BEj.A0S(obj, obj2), this.A02, this.A03, this.A04, this.A05, this.A06, this.A07, this.A08, AbstractC128295qy.A00(this.A01) | 1);
                break;
            case 1:
                CE1.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A03, (C28357CfH) this.A09, (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A08, (InterfaceC16660sJ) this.A05, (InterfaceC16660sJ) this.A06, (InterfaceC16660sJ) this.A07, (InterfaceC16620sF) this.A02, AbstractC25225BEi.A04(this.A01));
                break;
            case 2:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                C26949Buq c26949Buq = (C26949Buq) this.A02;
                C166047bW c166047bW = (C166047bW) this.A03;
                InterfaceC16600sD interfaceC16600sD = (InterfaceC16600sD) this.A08;
                AbstractC27589CFi.A00(A0S, c26949Buq, c166047bW, (InterfaceC16660sJ) this.A09, (InterfaceC16610sE) this.A07, (InterfaceC16610sE) this.A06, interfaceC16600sD, (InterfaceC16600sD) this.A05, (InterfaceC16590sC) this.A04, AbstractC25225BEi.A04(this.A01));
                break;
            case 3:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC30996Djv interfaceC30996Djv = (InterfaceC30996Djv) this.A03;
                CWX cwx = (CWX) this.A02;
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A06;
                AbstractC28498Chr.A05(A0S2, cwx, interfaceC30996Djv, (C54781OIv) this.A09, (C64842wi) this.A08, interfaceC16820sZ, (InterfaceC16820sZ) this.A07, (InterfaceC16820sZ) this.A04, (InterfaceC16620sF) this.A05, AbstractC25225BEi.A04(this.A01));
                break;
            case 4:
                C5Tl c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
                    c5Tl.Em9();
                    break;
                } else {
                    if (C0fH.A02()) {
                        C0fH.A01(900767006, "com.instagram.nux.reelstuning.ui.ReelsTuningCardStack.<anonymous>.<anonymous>.<anonymous> (ReelsTuningCardStack.kt:316)");
                    }
                    C1130158n c1130158n = Modifier.A00;
                    int i = this.A01;
                    Modifier A0X = AbstractC25226BEj.A0X(AbstractC25228BEl.A0X(AbstractC27468CAo.A00(AbstractC118185Wd.A06(c1130158n, 1.0f - (i * 0.1f)), 0.5625f, true), 20 - (i * 2)), AbstractC25226BEj.A0B(c5Tl));
                    boolean A1V = AbstractC25227BEk.A1V(c5Tl, 1909554981, i);
                    Object EEc = c5Tl.EEc();
                    if (A1V || EEc == C5UI.A00) {
                        EEc = new C25512BQa(i, 15);
                        c5Tl.FBy(EEc);
                    }
                    C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
                    Modifier A0Y = AbstractC25230BEn.A0Y(A0X, (InterfaceC16660sJ) EEc);
                    CSX csx = (CSX) this.A02;
                    List list = (List) this.A03;
                    C136946Hx c136946Hx = (C136946Hx) this.A09;
                    C136936Hw c136936Hw = (C136936Hw) this.A08;
                    Object obj3 = this.A06;
                    Object obj4 = this.A07;
                    Object obj5 = this.A05;
                    InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) this.A04;
                    InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
                    int A00 = C5X2.A00(c5Tl);
                    C59P A04 = C117505Tk.A04(A0K);
                    Modifier A01 = C5X3.A01(c5Tl, A0Y);
                    AbstractC25233BEq.A11(c5Tl, A0K);
                    AbstractC25231BEo.A12(c5Tl, A0b, A04);
                    InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                    if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
                    }
                    AbstractC25225BEi.A1K(c5Tl, A01);
                    C119645bN c119645bN = C119645bN.A00;
                    CEZ.A00(c5Tl, AbstractC25226BEj.A0U(c1130158n), c136946Hx, c136936Hw, csx.A03, null, null, DDK.A00, 0.5625f, 0, 920349696, 196608, 23552, false, false, false, false, C14360o3.A0K(AbstractC001800i.A0K(list), csx), false, true);
                    AbstractC28480ChY.A00(c5Tl, 0);
                    boolean z = !c136946Hx.A06();
                    boolean A1Y = AbstractC25226BEj.A1Y(c5Tl, z, AbstractC25227BEk.A1Y(c5Tl, c136946Hx, -1788100275));
                    Object EEc2 = c5Tl.EEc();
                    if (A1Y || EEc2 == C5UI.A00) {
                        EEc2 = new D8O(20, obj5, c136946Hx, z);
                        c5Tl.FBy(EEc2);
                    }
                    AbstractC27541CDl.A00(c5Tl, AbstractC118175Wb.A0E(c119645bN.AB5(C118195Wf.A07, c1130158n), 0.0f, 0.0f, 12.0f, 12.0f), AbstractC25225BEi.A1A(A0K, EEc2, false), 0, 0, c136946Hx.A06());
                    User user = csx.A02;
                    String str = csx.A04;
                    Object A0q = AbstractC25227BEk.A0q(c5Tl, -1788083592);
                    Object obj6 = C5UI.A00;
                    if (A0q == obj6) {
                        A0q = new C57510Pfk(interfaceC74953Yl, 16);
                        c5Tl.FBy(A0q);
                    }
                    AbstractC28480ChY.A05(c5Tl, user, str, AbstractC25225BEi.A1A(A0K, A0q, false), 384, 0);
                    boolean A1X = AbstractC25230BEn.A1X(interfaceC74953Yl);
                    long A002 = AbstractC27485CBg.A00(10.0f, 48.0f);
                    Modifier AB5 = c119645bN.AB5(C118195Wf.A0D, c1130158n);
                    boolean A1X2 = AbstractC25225BEi.A1X(c5Tl, obj4, AbstractC25232BEp.A1Y(c5Tl, obj3, csx, -1788078073));
                    Object EEc3 = c5Tl.EEc();
                    if (A1X2 || EEc3 == obj6) {
                        EEc3 = new C30177DRh(15, obj4, csx, interfaceC74953Yl, obj3);
                        c5Tl.FBy(EEc3);
                    }
                    InterfaceC16660sJ A1B = AbstractC25225BEi.A1B(A0K, EEc3, false);
                    Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -1788064487);
                    if (A0q2 == obj6) {
                        A0q2 = new C57510Pfk(interfaceC74953Yl, 17);
                        c5Tl.FBy(A0q2);
                    }
                    CY0.A00(null, c5Tl, AB5, null, AbstractC25225BEi.A1A(A0K, A0q2, false), A1B, new C30496Dbf(csx, 41), 196992, 208, A002, A1X, false);
                    if (AbstractC25227BEk.A1R(c5Tl)) {
                        C0fH.A00(-865015447);
                        break;
                    }
                }
                break;
            case 5:
                AbstractC28330CeI.A00(AbstractC25226BEj.A0S(obj, obj2), (ImmutableList) this.A06, (SchoolInfo) this.A07, (Integer) this.A08, (Integer) this.A09, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A02, (InterfaceC16820sZ) this.A05, AbstractC25225BEi.A04(this.A01));
                break;
            case 6:
                C5Tl A0S3 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC30954DjB interfaceC30954DjB = (InterfaceC30954DjB) this.A09;
                InterfaceC16620sF interfaceC16620sF2 = (InterfaceC16620sF) this.A05;
                BY0.A02(A0S3, (InterfaceC30953DjA) this.A04, (InterfaceC30953DjA) this.A06, (InterfaceC30953DjA) this.A07, interfaceC30954DjB, (SettingsScreenViewModel) this.A03, (InterfaceC16660sJ) this.A02, interfaceC16620sF2, (InterfaceC16620sF) this.A08, AbstractC25225BEi.A04(this.A01));
                break;
            case 7:
                C5Tl A0S4 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC31151Dmv interfaceC31151Dmv = (InterfaceC31151Dmv) this.A09;
                InterfaceC16620sF interfaceC16620sF3 = (InterfaceC16620sF) this.A05;
                BY0.A03(A0S4, (InterfaceC30953DjA) this.A02, (InterfaceC30953DjA) this.A07, (InterfaceC30953DjA) this.A08, interfaceC31151Dmv, (SettingsScreenViewModel) this.A04, (InterfaceC16660sJ) this.A03, interfaceC16620sF3, (InterfaceC16620sF) this.A06, AbstractC25225BEi.A04(this.A01));
                break;
            default:
                AbstractC28490Chi.A06(AbstractC25226BEj.A0S(obj, obj2), (C26047Bfa) this.A09, (InterfaceC16820sZ) this.A02, (InterfaceC16820sZ) this.A03, (InterfaceC16660sJ) this.A07, (InterfaceC16660sJ) this.A08, (InterfaceC16660sJ) this.A04, (InterfaceC16660sJ) this.A06, (InterfaceC16620sF) this.A05, AbstractC25225BEi.A04(this.A01));
                break;
        }
        return C0eB.A00;
    }
}
