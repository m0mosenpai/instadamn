package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.Modifier;
import com.instagram.opal.impl.data.OpalProfileData;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.Dd2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30581Dd2 extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30581Dd2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i, boolean z) {
        super(3);
        this.A00 = i;
        this.A07 = obj;
        this.A06 = obj2;
        this.A01 = obj3;
        this.A03 = obj4;
        this.A02 = obj5;
        this.A04 = obj6;
        this.A05 = obj7;
        this.A09 = z;
        this.A08 = obj8;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        if (this.A00 != 0) {
            C5Tl c5Tl = (C5Tl) obj2;
            boolean A1X = AbstractC25231BEo.A1X(obj3, obj);
            if (C0fH.A02()) {
                C0fH.A01(1106677280, "com.instagram.opal.impl.ui.OpalTabContentGrid.<anonymous>.<anonymous> (OpalTabContent.kt:154)");
            }
            LazyGridState A00 = CZP.A00(c5Tl);
            C28748Cmg c28748Cmg = new C28748Cmg(3);
            Modifier A0T = AbstractC25226BEj.A0T(Modifier.A00);
            C1333560c c1333560c = new C1333560c(0.0f, 4.0f, 0.0f, 4.0f);
            C6ID A01 = AbstractC118255Wn.A01(4.0f);
            C6ID A012 = AbstractC118255Wn.A01(4.0f);
            c5Tl.Eno(1597031821);
            Object obj4 = this.A07;
            boolean AH6 = c5Tl.AH6(obj4);
            Object obj5 = this.A06;
            boolean A1X2 = AbstractC25225BEi.A1X(c5Tl, obj5, AH6);
            Object obj6 = this.A01;
            boolean A1X3 = AbstractC25226BEj.A1X(c5Tl, obj6, A1X2);
            Object obj7 = this.A03;
            boolean A1X4 = AbstractC25225BEi.A1X(c5Tl, obj7, A1X3);
            Object obj8 = this.A02;
            boolean A1X5 = AbstractC25225BEi.A1X(c5Tl, obj8, A1X4);
            Object obj9 = this.A04;
            boolean A1X6 = AbstractC25225BEi.A1X(c5Tl, obj9, A1X5);
            boolean z = this.A09;
            Object obj10 = this.A08;
            Object EEc = c5Tl.EEc();
            if (A1X6 || EEc == C5UI.A00) {
                EEc = new DIK(obj4, obj5, obj6, obj7, obj8, obj9, obj10, 2, z);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, A1X);
            AbstractC27471CAr.A00(null, A012, A01, c1333560c, c28748Cmg, A00, c5Tl, A0T, (InterfaceC16660sJ) EEc, 1772592, ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, A1X, A1X);
            c5Tl.Eno(1597218075);
            Object obj11 = this.A05;
            boolean A1W = AbstractC25230BEn.A1W(c5Tl, obj11, obj5);
            Object EEc2 = c5Tl.EEc();
            if (A1W || EEc2 == C5UI.A00) {
                EEc2 = AbstractC25235BEs.A18(c5Tl, obj11, obj5, 20);
            }
            BGP.A03(A00, c5Tl, AbstractC25225BEi.A1A(A0K, EEc2, A1X), A1X ? 1 : 0, A1X ? 1 : 0, 1);
            if (C0fH.A02()) {
                i = -2056428796;
                C0fH.A00(i);
            }
        } else {
            Modifier modifier = (Modifier) obj;
            C5Tl c5Tl2 = (C5Tl) obj2;
            int A0H = AbstractC166987dD.A0H(obj3);
            C14360o3.A0B(modifier, 0);
            if ((A0H & 6) == 0) {
                A0H |= AbstractC25232BEp.A0R(c5Tl2, modifier);
            }
            if ((A0H & 19) == 18 && c5Tl2.Bxj()) {
                c5Tl2.Em9();
            } else {
                if (C0fH.A02()) {
                    C0fH.A01(-585298269, "com.instagram.opal.impl.ui.OpalProfile.<anonymous> (OpalContent.kt:405)");
                }
                Modifier A05 = AbstractC118175Wb.A05(modifier);
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A04;
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A02;
                InterfaceC16620sF interfaceC16620sF2 = (InterfaceC16620sF) this.A07;
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A06;
                C26073Bg2 c26073Bg2 = (C26073Bg2) this.A08;
                boolean z2 = this.A09;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A01;
                InterfaceC16820sZ interfaceC16820sZ3 = (InterfaceC16820sZ) this.A05;
                Object obj12 = this.A03;
                InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl2, 0);
                int A002 = C5X2.A00(c5Tl2);
                C117505Tk c117505Tk = (C117505Tk) c5Tl2;
                C59P A04 = C117505Tk.A04(c117505Tk);
                Modifier A013 = C5X3.A01(c5Tl2, A05);
                AbstractC25233BEq.A11(c5Tl2, c117505Tk);
                AbstractC25231BEo.A12(c5Tl2, A0Y, A04);
                InterfaceC16620sF interfaceC16620sF3 = C5X8.A02;
                if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl2, A002)) {
                    AbstractC25231BEo.A15(c5Tl2, interfaceC16620sF3, A002);
                }
                AbstractC25225BEi.A1K(c5Tl2, A013);
                OpalProfileData opalProfileData = c26073Bg2.A05;
                C51745MtU c51745MtU = c26073Bg2.A01;
                Modifier A0W = AbstractC25228BEl.A0W();
                AbstractC28507Ci0.A03(c5Tl2, AbstractC118175Wb.A0E(A0W, 0.0f, 12.0f, 0.0f, 0.0f), c51745MtU, interfaceC11380iw, opalProfileData, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16620sF, interfaceC16620sF2, 100663296, z2);
                if (z2) {
                    c5Tl2.Eno(-472462924);
                    int i2 = opalProfileData.A00;
                    AbstractC28507Ci0.A08(c5Tl2, AbstractC118175Wb.A0A(A0W, 0.0f, 16.0f), opalProfileData.A08, interfaceC16820sZ3, i2, 3072);
                } else {
                    c5Tl2.Eno(-472088692);
                    boolean A1Y = AbstractC25232BEp.A1Y(c5Tl2, obj12, c26073Bg2, 1647341259);
                    Object EEc3 = c5Tl2.EEc();
                    if (A1Y || EEc3 == C5UI.A00) {
                        EEc3 = AbstractC25235BEs.A18(c5Tl2, obj12, c26073Bg2, 15);
                    }
                    AbstractC28507Ci0.A09(c5Tl2, AbstractC118175Wb.A0A(A0W, 0.0f, 16.0f), AbstractC25225BEi.A1A(c117505Tk, EEc3, false), 48);
                }
                C117505Tk.A0L(c117505Tk, false);
                AbstractC28507Ci0.A01(c5Tl2, A0W, 6);
                if (AbstractC25227BEk.A1R(c5Tl2)) {
                    i = 1618352939;
                    C0fH.A00(i);
                }
            }
        }
        return C0eB.A00;
    }
}
