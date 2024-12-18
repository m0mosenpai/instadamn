package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.R;

/* loaded from: classes5.dex */
public final class DSY extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DSY(Object obj, String str, int i, boolean z) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = z;
        this.A02 = str;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        boolean z;
        int i2 = this.A00;
        C5Tl c5Tl = (C5Tl) obj;
        int A0B = AbstractC25228BEl.A0B(obj2);
        switch (i2) {
            case 0:
                if (A0B != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1650237970, "com.instagram.compose.igds.components.mediabutton.IgdsMediaButton.<anonymous> (IgdsMediaButton.kt:55)");
                    }
                    if (this.A03) {
                        C1130158n A0N = AbstractC25225BEi.A0N(c5Tl, -27663485);
                        float f = ((EnumC27399C7c) this.A01).A00;
                        z = false;
                        BIR.A02(c5Tl, AbstractC118175Wb.A0A(A0N, f - 4.0f, f - 5.0f), BIX.A01(c5Tl), 64, 0, AbstractC25226BEj.A0I(c5Tl));
                    } else {
                        C1130158n A0N2 = AbstractC25225BEi.A0N(c5Tl, -27357918);
                        EnumC27399C7c enumC27399C7c = (EnumC27399C7c) this.A01;
                        z = false;
                        C5WR.A0W(c5Tl, AbstractC118175Wb.A0A(A0N2, enumC27399C7c.A00, enumC27399C7c.A01), AbstractC25226BEj.A0f(c5Tl), this.A02, AbstractC25226BEj.A0I(c5Tl));
                    }
                    if (AbstractC25230BEn.A1Z(c5Tl, z)) {
                        i = -1488278800;
                        C0fH.A00(i);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            case 1:
                if (A0B != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1496823822, "com.instagram.creation.igbarcelona.upsell.ShareToBarcelonaAutoPostUpsellFragment.onCreateView.<anonymous>.<anonymous> (ShareToBarcelonaAutoPostUpsellFragment.kt:62)");
                    }
                    C0eB c0eB = C0eB.A00;
                    c5Tl.Eno(-649303854);
                    Object obj3 = this.A01;
                    boolean AH6 = c5Tl.AH6(obj3);
                    Object EEc = c5Tl.EEc();
                    if (AH6 || EEc == C5UI.A00) {
                        EEc = new PYX(obj3, null, 42);
                        c5Tl.FBy(EEc);
                    }
                    C117505Tk c117505Tk = (C117505Tk) c5Tl;
                    boolean A1T = AbstractC25229BEm.A1T(c5Tl, c117505Tk, c0eB, (InterfaceC16620sF) EEc);
                    C1130158n c1130158n = Modifier.A00;
                    Modifier A0E = AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, 8.0f);
                    InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
                    boolean z2 = this.A03;
                    String str = this.A02;
                    InterfaceC1127857k A0Q = AbstractC25227BEk.A0Q(AbstractC118255Wn.A07, c5Tl, interfaceC118245Wl);
                    int A00 = C5X2.A00(c5Tl);
                    C59P A04 = C117505Tk.A04(c117505Tk);
                    Modifier A01 = C5X3.A01(c5Tl, A0E);
                    AbstractC25233BEq.A11(c5Tl, c117505Tk);
                    AbstractC25231BEo.A12(c5Tl, A0Q, A04);
                    InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                    if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
                    }
                    AbstractC25225BEi.A1K(c5Tl, A01);
                    int i3 = 2131973733;
                    if (z2) {
                        i3 = 2131973731;
                    }
                    String A002 = C5YD.A00(c5Tl, i3);
                    C5WR.A04(c5Tl, AbstractC118175Wb.A0A(c1130158n, 32.0f, 20.0f), AbstractC25226BEj.A0e(c5Tl), A002);
                    AbstractC28439Cgn.A00(c5Tl, str, A1T ? 1 : 0, z2);
                    AbstractC28389Cfs.A01(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 16.0f, 0.0f, 8.0f));
                    String A003 = C5YD.A00(c5Tl, 2131973757);
                    C25267BGf A0u = AbstractC25225BEi.A0u(c5Tl);
                    Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
                    Modifier A0A = AbstractC118175Wb.A0A(A0T, 16.0f, 8.0f);
                    boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, obj3, 811393015);
                    Object EEc2 = c5Tl.EEc();
                    if (A1Z || EEc2 == C5UI.A00) {
                        EEc2 = new C57242PbQ(obj3, 24);
                        c5Tl.FBy(EEc2);
                    }
                    C6GE.A06(c5Tl, A0A, A0u, A003, AbstractC25225BEi.A1A(c117505Tk, EEc2, A1T), 384);
                    String A004 = C5YD.A00(c5Tl, 2131973732);
                    C6GB A005 = C6GA.A00(c5Tl);
                    Modifier A0A2 = AbstractC118175Wb.A0A(A0T, 24.0f, 8.0f);
                    boolean A1Z2 = AbstractC25227BEk.A1Z(c5Tl, obj3, 811410804);
                    Object EEc3 = c5Tl.EEc();
                    if (A1Z2 || EEc3 == C5UI.A00) {
                        EEc3 = new C57242PbQ(obj3, 25);
                        c5Tl.FBy(EEc3);
                    }
                    C6GE.A06(c5Tl, A0A2, A005, A004, AbstractC25225BEi.A1A(c117505Tk, EEc3, A1T), A1T ? 1 : 0);
                    if (AbstractC25227BEk.A1R(c5Tl)) {
                        i = -1880254641;
                        C0fH.A00(i);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            case 2:
                if (A0B != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1832795738, "com.instagram.creation.igbarcelona.upsell.ShareToBarcelonaAutoPostUpsellFragment.onCreateView.<anonymous> (ShareToBarcelonaAutoPostUpsellFragment.kt:61)");
                    }
                    if (AbstractC25235BEs.A1Y(c5Tl, AbstractC25226BEj.A0T(Modifier.A00), new DSY(this.A01, this.A02, 1, this.A03), 95936860)) {
                        i = 180064614;
                        C0fH.A00(i);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            case 3:
                if (A0B != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(275828531, "com.instagram.direct.inbox.ui.conversationstartersmenu.FloatingActionButton.FloatingActionButton.<anonymous> (FloatingActionButton.kt:47)");
                    }
                    C1130158n c1130158n2 = Modifier.A00;
                    c5Tl.Eno(-1943624564);
                    String str2 = this.A02;
                    Object EEc4 = c5Tl.EEc();
                    Object obj4 = C5UI.A00;
                    if (EEc4 == obj4) {
                        EEc4 = new C50361MLn(str2, 28);
                        c5Tl.FBy(EEc4);
                    }
                    C117505Tk c117505Tk2 = (C117505Tk) c5Tl;
                    C117505Tk.A0L(c117505Tk2, false);
                    Modifier A006 = AnonymousClass598.A00(c1130158n2, (InterfaceC16660sJ) EEc4, false);
                    c5Tl.Eno(-1943619896);
                    Object obj5 = this.A01;
                    boolean AH4 = c5Tl.AH4(obj5);
                    Object EEc5 = c5Tl.EEc();
                    if (AH4 || EEc5 == obj4) {
                        EEc5 = new MHM(obj5, 41);
                        c5Tl.FBy(EEc5);
                    }
                    Modifier A012 = CY3.A01(c5Tl, A006, AbstractC25225BEi.A1A(c117505Tk2, EEc5, false));
                    C25764Ba3 c25764Ba3 = new C25764Ba3(AbstractC25232BEp.A1G(AbstractC25225BEi.A0S(C1132359l.A04), C1132359l.A07), Float.POSITIVE_INFINITY);
                    C5WI c5wi = C5WF.A00;
                    Modifier A013 = C6L2.A01(AbstractC118185Wd.A0C(C6L7.A02(A012, c25764Ba3, c5wi, 8.0f), 80.0f), c5wi);
                    Alignment alignment = C118195Wf.A09;
                    boolean z3 = this.A03;
                    InterfaceC1127857k A007 = C5XX.A00(alignment, false);
                    int A008 = C5X2.A00(c5Tl);
                    C59P A042 = C117505Tk.A04(c117505Tk2);
                    Modifier A014 = C5X3.A01(c5Tl, A013);
                    InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
                    AbstractC25233BEq.A12(c5Tl, c117505Tk2, interfaceC16820sZ);
                    InterfaceC16620sF interfaceC16620sF2 = C5X8.A03;
                    InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A007, A042, interfaceC16620sF2);
                    InterfaceC16620sF interfaceC16620sF3 = C5X8.A02;
                    if (c117505Tk2.A0K || !AbstractC25231BEo.A1O(c5Tl, A008)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A008);
                    }
                    InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A014);
                    Modifier A0C = AbstractC118185Wd.A0C(C6L3.A01(c1130158n2, c5wi, AbstractC25226BEj.A0F(c5Tl)), 64.0f);
                    InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
                    int A009 = C5X2.A00(c5Tl);
                    C59P A043 = C117505Tk.A04(c117505Tk2);
                    Modifier A015 = C5X3.A01(c5Tl, A0C);
                    AbstractC25233BEq.A12(c5Tl, c117505Tk2, interfaceC16820sZ);
                    C5XJ.A00(c5Tl, A0b, interfaceC16620sF2);
                    if (AbstractC25225BEi.A1W(c5Tl, c117505Tk2, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A009)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A009);
                    }
                    C5XJ.A00(c5Tl, A015, A1K);
                    C119645bN c119645bN = C119645bN.A00;
                    int i4 = R.drawable.instagram_add_pano_outline_24;
                    if (z3) {
                        i4 = R.drawable.instagram_camera_pano_outline_24;
                    }
                    C5YS.A06(c5Tl, c119645bN.AB5(alignment, AbstractC118185Wd.A04(c1130158n2)), C5Y7.A00(c5Tl, i4, 0), AbstractC25226BEj.A09(c5Tl));
                    if (AbstractC25230BEn.A1T(c5Tl)) {
                        i = -2037141137;
                        C0fH.A00(i);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            default:
                if (A0B != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-937040525, "instagram.features.clips.spins.participation.ui.ClipsSpinsAddSpinTextBottomSheetFragment.onCreateView.<anonymous> (ClipsSpinsAddSpinTextBottomSheetFragment.kt:84)");
                    }
                    C26861BtN c26861BtN = (C26861BtN) this.A01;
                    C51740MtP c51740MtP = (C51740MtP) AbstractC25235BEs.A0l(c5Tl, ((C26905Bu8) c26861BtN.A02.getValue()).A06, 0);
                    boolean A1Z3 = AbstractC25227BEk.A1Z(c5Tl, c26861BtN, 1980732737);
                    String str3 = this.A02;
                    boolean A1X = AbstractC25225BEi.A1X(c5Tl, str3, A1Z3);
                    Object EEc6 = c5Tl.EEc();
                    if (A1X || EEc6 == C5UI.A00) {
                        EEc6 = new C57259Pbh(str3, c26861BtN, 32);
                        c5Tl.FBy(EEc6);
                    }
                    InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) EEc6;
                    C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
                    boolean A1Z4 = AbstractC25227BEk.A1Z(c5Tl, c26861BtN, 1980738967);
                    Object EEc7 = c5Tl.EEc();
                    if (A1Z4 || EEc7 == C5UI.A00) {
                        EEc7 = DRR.A00(c26861BtN, 8);
                        c5Tl.FBy(EEc7);
                    }
                    InterfaceC16660sJ A1B = AbstractC25225BEi.A1B(A0K, EEc7, false);
                    boolean A1Z5 = AbstractC25227BEk.A1Z(c5Tl, c26861BtN, 1980741975);
                    Object EEc8 = c5Tl.EEc();
                    if (A1Z5 || EEc8 == C5UI.A00) {
                        EEc8 = C29888DGc.A00(c26861BtN, 44);
                        c5Tl.FBy(EEc8);
                    }
                    InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(A0K, EEc8, false);
                    boolean z4 = this.A03;
                    InterfaceC58202Pr8 A0010 = AbstractC54314NzY.A00(AbstractC166987dD.A0r(c26861BtN.A04));
                    C14360o3.A07(A0010);
                    AbstractC28340CeS.A00(c5Tl, c51740MtP, A0010, interfaceC16820sZ2, A1A, A1B, 0, z4);
                    if (C0fH.A02()) {
                        i = 1348799158;
                        C0fH.A00(i);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
        }
        return C0eB.A00;
    }
}
