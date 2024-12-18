package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.DcB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30528DcB extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final Object A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30528DcB(String str, Object obj, int i) {
        super(3);
        this.A00 = i;
        this.A02 = str;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5Tl c5Tl;
        int i;
        int i2;
        C118125Vw A0d;
        switch (this.A00) {
            case 0:
                ((InterfaceC16600sD) this.A01).invoke(this.A02, obj, obj3, Integer.valueOf(AbstractC25232BEp.A0p(obj2, obj)));
                return C0eB.A00;
            case 1:
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) obj;
                c5Tl = (C5Tl) obj2;
                int A0H = AbstractC166987dD.A0H(obj3);
                C14360o3.A0B(interfaceC16620sF, 0);
                if ((A0H & 6) == 0) {
                    A0H |= AbstractC25232BEp.A0H(c5Tl, interfaceC16620sF);
                }
                if ((A0H & 19) != 18 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1698732596, "com.instagram.opal.impl.ui.OpalProfilePropertyRow.<anonymous> (OpalContent.kt:981)");
                    }
                    boolean A1O = AbstractC167007dF.A1O(this.A02.length());
                    long A0M = AbstractC25226BEj.A0M(c5Tl);
                    int ordinal = ((C68) this.A01).ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            c5Tl.Eno(483277489);
                            A0d = AbstractC25226BEj.A0c(c5Tl);
                        } else {
                            throw AbstractC25233BEq.A0r(c5Tl, 483271991);
                        }
                    } else {
                        c5Tl.Eno(483274875);
                        A0d = AbstractC25226BEj.A0d(c5Tl);
                    }
                    AbstractC25225BEi.A1V(c5Tl, false);
                    int i3 = 2131969078;
                    if (ordinal != 0) {
                        i3 = 2131969077;
                    }
                    AbstractC28443Cgr.A00(c5Tl, null, AbstractC25226BEj.A0T(Modifier.A00), A0d, AbstractC136736Hc.A00(c5Tl, i3), interfaceC16620sF, ((A0H << 18) & 3670016) | DalvikInternals.IOPRIO_BACKGROUND, 32, A0M, A1O);
                    if (C0fH.A02()) {
                        i2 = -682342888;
                        C0fH.A00(i2);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 2:
                InterfaceC16620sF interfaceC16620sF2 = (InterfaceC16620sF) obj;
                c5Tl = (C5Tl) obj2;
                int A0H2 = AbstractC166987dD.A0H(obj3);
                C14360o3.A0B(interfaceC16620sF2, 0);
                if ((A0H2 & 6) == 0) {
                    A0H2 |= AbstractC25232BEp.A0H(c5Tl, interfaceC16620sF2);
                }
                if ((A0H2 & 19) != 18 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1597889957, "com.instagram.opal.impl.ui.ProfilePropertyRow.<anonymous>.<anonymous>.<anonymous> (OpalEditContent.kt:300)");
                    }
                    boolean A1O2 = AbstractC167007dF.A1O(this.A02.length());
                    long A0M2 = AbstractC25226BEj.A0M(c5Tl);
                    C118125Vw A0g = AbstractC25226BEj.A0g(c5Tl);
                    int ordinal2 = ((C68) this.A01).ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            i = 2131969077;
                        } else {
                            throw B4Z.A00();
                        }
                    } else {
                        i = 2131969078;
                    }
                    AbstractC28443Cgr.A00(c5Tl, null, AbstractC25226BEj.A0T(Modifier.A00), A0g, AbstractC136736Hc.A00(c5Tl, i), interfaceC16620sF2, ((A0H2 << 18) & 3670016) | DalvikInternals.IOPRIO_BACKGROUND, 32, A0M2, A1O2);
                    if (C0fH.A02()) {
                        i2 = -193241368;
                        C0fH.A00(i2);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            default:
                C5Tl c5Tl2 = (C5Tl) obj2;
                boolean A1X = AbstractC25231BEo.A1X(obj3, obj);
                if (C0fH.A02()) {
                    C0fH.A01(635807999, "com.instagram.opal.impl.ui.OpalFloatingSwitchButton.<anonymous>.<anonymous> (OpalFloatingSwitchButton.kt:149)");
                }
                C1130158n c1130158n = Modifier.A00;
                c5Tl2.Eno(354279852);
                String str = this.A02;
                boolean AH4 = c5Tl2.AH4(str);
                Object EEc = c5Tl2.EEc();
                if (AH4 || EEc == C5UI.A00) {
                    EEc = AbstractC25230BEn.A13(c5Tl2, str, 42);
                }
                C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl2, A1X);
                Modifier A00 = AnonymousClass598.A00(c1130158n, (InterfaceC16660sJ) EEc, A1X);
                c5Tl2.Eno(354284520);
                Object obj4 = this.A01;
                boolean AH42 = c5Tl2.AH4(obj4);
                Object EEc2 = c5Tl2.EEc();
                if (AH42 || EEc2 == C5UI.A00) {
                    EEc2 = DH3.A02(c5Tl2, obj4, 18);
                }
                Modifier A01 = CY3.A01(c5Tl2, A00, AbstractC25225BEi.A1A(A0K, EEc2, A1X));
                C25764Ba3 c25764Ba3 = new C25764Ba3(AbstractC25232BEp.A1G(AbstractC25225BEi.A0S(C1132359l.A04), C1132359l.A07), Float.POSITIVE_INFINITY);
                C5WI c5wi = C5WF.A00;
                Modifier A012 = C6L2.A01(AbstractC118185Wd.A0C(C6L7.A02(A01, c25764Ba3, c5wi, 8.0f), 80.0f), c5wi);
                Alignment alignment = C118195Wf.A09;
                InterfaceC1127857k A002 = C5XX.A00(alignment, A1X);
                int A003 = C5X2.A00(c5Tl2);
                C59P A04 = C117505Tk.A04(A0K);
                Modifier A013 = C5X3.A01(c5Tl2, A012);
                InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
                AbstractC25233BEq.A12(c5Tl2, A0K, interfaceC16820sZ);
                InterfaceC16620sF interfaceC16620sF3 = C5X8.A03;
                InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl2, A002, A04, interfaceC16620sF3);
                InterfaceC16620sF interfaceC16620sF4 = C5X8.A02;
                if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl2, A003)) {
                    AbstractC25231BEo.A15(c5Tl2, interfaceC16620sF4, A003);
                }
                InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl2, A013);
                Modifier A0C = AbstractC118185Wd.A0C(C6L3.A01(c1130158n, c5wi, AbstractC25226BEj.A0F(c5Tl2)), 64.0f);
                InterfaceC1127857k A0b = AbstractC25226BEj.A0b(A1X);
                int A004 = C5X2.A00(c5Tl2);
                C59P A042 = C117505Tk.A04(A0K);
                Modifier A014 = C5X3.A01(c5Tl2, A0C);
                AbstractC25233BEq.A12(c5Tl2, A0K, interfaceC16820sZ);
                C5XJ.A00(c5Tl2, A0b, interfaceC16620sF3);
                if (AbstractC25225BEi.A1W(c5Tl2, A0K, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl2, A004)) {
                    AbstractC25231BEo.A15(c5Tl2, interfaceC16620sF4, A004);
                }
                C5XJ.A00(c5Tl2, A014, A1K);
                C119645bN c119645bN = C119645bN.A00;
                C5YS.A06(c5Tl2, c119645bN.AB5(alignment, AbstractC118185Wd.A04(c1130158n)), C5Y7.A00(c5Tl2, R.drawable.instagram_key_pano_outline_24, A1X ? 1 : 0), AbstractC25226BEj.A09(c5Tl2));
                if (AbstractC25230BEn.A1T(c5Tl2)) {
                    i2 = -326175152;
                    C0fH.A00(i2);
                }
                return C0eB.A00;
        }
    }
}
