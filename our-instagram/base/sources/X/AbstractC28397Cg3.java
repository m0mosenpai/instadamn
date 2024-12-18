package X;

import android.graphics.DashPathEffect;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.Cg3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28397Cg3 {
    public static final void A03(C5Tl c5Tl, Modifier modifier, C25818BbZ c25818BbZ, int i) {
        int i2;
        AbstractC167007dF.A1K(c25818BbZ, modifier);
        c5Tl.Enr(470481661);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c25818BbZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, modifier);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1771003537, "com.instagram.opal.impl.ui.OpalSwitchIndicator (OpalSwitchIndicator.kt:40)");
            }
            A00(c5Tl, modifier, ((C26031BfK) AbstractC25235BEs.A0l(c5Tl, c25818BbZ.A01, 0)).A00, 0.0f, (i2 << 3) & 896, 24, AbstractC25226BEj.A09(c5Tl), false);
            if (C0fH.A02()) {
                C0fH.A00(2103038538);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30510Dbt.A01(ASZ, c25818BbZ, modifier, i, 40);
        }
    }

    public static final void A00(C5Tl c5Tl, Modifier modifier, float f, float f2, int i, int i2, long j, boolean z) {
        int i3;
        float f3 = f2;
        boolean z2 = z;
        C14360o3.A0B(modifier, 2);
        c5Tl.Enr(-50342887);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25230BEn.A04(c5Tl.AH1(f) ? 1 : 0) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0E(c5Tl, j);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0e(c5Tl, z2);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25229BEm.A04(c5Tl.AH1(f3) ? 1 : 0);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            z2 = AbstractC25226BEj.A1V(i4, z2);
            if (i5 != 0) {
                f3 = 1.0f;
            }
            if (C0fH.A02()) {
                C0fH.A01(-682470771, "com.instagram.opal.impl.ui.OpalSwitchIndicator (OpalSwitchIndicator.kt:57)");
            }
            Object AJX = c5Tl.AJX(AndroidCompositionLocals_androidKt.A03);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -488230442);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = AbstractC25232BEp.A0w(c5Tl, Boolean.valueOf(!z2));
            }
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) A0q;
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.Eno(-488228773);
            if (f >= 1.0f && !AbstractC25230BEn.A1X(interfaceC74953Yl)) {
                C0eB c0eB = C0eB.A00;
                boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, AJX, -488226607);
                Object EEc = c5Tl.EEc();
                if (A1Z || EEc == obj) {
                    EEc = new PZU(AJX, interfaceC74953Yl, (InterfaceC23621Ds) null, 24);
                    c5Tl.FBy(EEc);
                }
                AbstractC25228BEl.A1K(c5Tl, c117505Tk, EEc, c0eB, false);
            }
            C117505Tk.A0L(c117505Tk, false);
            float f4 = 80.0f * f3;
            Modifier A0X = AbstractC25226BEj.A0X(AbstractC118185Wd.A08(modifier, f4), j);
            InterfaceC1127857k A0a = AbstractC25226BEj.A0a(false);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0X);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0a, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            A01(c5Tl, AbstractC118185Wd.A08(AbstractC25230BEn.A0Y(Modifier.A00, C30110DOs.A00), f4), f, i3 & 14);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-570692691);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DU5(modifier, f, f3, i, i2, j, z2);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0pO, java.lang.Object] */
    public static final void A01(C5Tl c5Tl, Modifier modifier, float f, int i) {
        int i2;
        float f2;
        float f3;
        int A00;
        C117505Tk c117505Tk;
        InterfaceC16620sF A0q;
        int A002;
        C59P A04;
        c5Tl.Enr(-1801575475);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(c5Tl.AH1(f) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, modifier);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(285383431, "com.instagram.opal.impl.ui.IndicatorContent (OpalSwitchIndicator.kt:87)");
            }
            if (f > 0.0f) {
                float A02 = C17s.A02(f / 0.75f, 0.0f, 1.0f);
                float f4 = f / 1.0f;
                ?? obj = new Object();
                if (f4 >= 0.9f) {
                    f3 = 1.0f - f4;
                } else if (f4 >= 0.8f) {
                    f3 = f4 - 0.8f;
                } else {
                    f2 = 0.0f;
                    obj.A00 = f2;
                    obj.A00 = C17s.A02(f2, 0.0f, 1.0f);
                    InterfaceC1127857k A003 = C5XX.A00(C118195Wf.A0E, false);
                    A00 = C5X2.A00(c5Tl);
                    c117505Tk = (C117505Tk) c5Tl;
                    C59P A042 = C117505Tk.A04(c117505Tk);
                    Modifier A01 = C5X3.A01(c5Tl, modifier);
                    InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
                    AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
                    InterfaceC16620sF interfaceC16620sF = C5X8.A03;
                    A0q = AbstractC25229BEm.A0q(c5Tl, A003, A042, interfaceC16620sF);
                    InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
                    if (!c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
                    }
                    InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
                    C119645bN c119645bN = C119645bN.A00;
                    C1130158n c1130158n = Modifier.A00;
                    Modifier AB5 = c119645bN.AB5(C118195Wf.A0C, CBB.A00(AbstractC25230BEn.A0Y(c1130158n, new C57748Pjb(obj, 2)), A02, A02));
                    Alignment alignment = C118195Wf.A09;
                    InterfaceC1127857k A004 = C5XX.A00(alignment, false);
                    A002 = C5X2.A00(c5Tl);
                    A04 = C117505Tk.A04(c117505Tk);
                    Modifier A012 = C5X3.A01(c5Tl, AB5);
                    AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
                    C5XJ.A00(c5Tl, A004, interfaceC16620sF);
                    if (!AbstractC25225BEi.A1W(c5Tl, c117505Tk, A04, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
                    }
                    C5XJ.A00(c5Tl, A012, A1K);
                    A02(c5Tl, AbstractC118185Wd.A0C(c1130158n, 39.0f), 6);
                    BGY.A01(c5Tl, AbstractC118185Wd.A0C(c1130158n, 40.0f), f4, 2.0f, 0.0f, 196656, 88, AbstractC25226BEj.A0G(c5Tl), 0L, false);
                    C5YS.A06(c5Tl, AbstractC25230BEn.A0Y(c119645bN.AB5(alignment, AbstractC118185Wd.A03(c1130158n)), new C57748Pjb(obj, 3)), C5Y7.A00(c5Tl, R.drawable.instagram_key_pano_filled_24, 0), AbstractC25226BEj.A0G(c5Tl));
                    c5Tl.ASW();
                    c5Tl.ASW();
                }
                f2 = f3 / 0.1f;
                obj.A00 = f2;
                obj.A00 = C17s.A02(f2, 0.0f, 1.0f);
                InterfaceC1127857k A0032 = C5XX.A00(C118195Wf.A0E, false);
                A00 = C5X2.A00(c5Tl);
                c117505Tk = (C117505Tk) c5Tl;
                C59P A0422 = C117505Tk.A04(c117505Tk);
                Modifier A013 = C5X3.A01(c5Tl, modifier);
                InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
                AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
                InterfaceC16620sF interfaceC16620sF3 = C5X8.A03;
                A0q = AbstractC25229BEm.A0q(c5Tl, A0032, A0422, interfaceC16620sF3);
                InterfaceC16620sF interfaceC16620sF22 = C5X8.A02;
                if (!c117505Tk.A0K) {
                }
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF22, A00);
                InterfaceC16620sF A1K2 = AbstractC25226BEj.A1K(c5Tl, A013);
                C119645bN c119645bN2 = C119645bN.A00;
                C1130158n c1130158n2 = Modifier.A00;
                Modifier AB52 = c119645bN2.AB5(C118195Wf.A0C, CBB.A00(AbstractC25230BEn.A0Y(c1130158n2, new C57748Pjb(obj, 2)), A02, A02));
                Alignment alignment2 = C118195Wf.A09;
                InterfaceC1127857k A0042 = C5XX.A00(alignment2, false);
                A002 = C5X2.A00(c5Tl);
                A04 = C117505Tk.A04(c117505Tk);
                Modifier A0122 = C5X3.A01(c5Tl, AB52);
                AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
                C5XJ.A00(c5Tl, A0042, interfaceC16620sF3);
                if (!AbstractC25225BEi.A1W(c5Tl, c117505Tk, A04, A0q)) {
                }
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF22, A002);
                C5XJ.A00(c5Tl, A0122, A1K2);
                A02(c5Tl, AbstractC118185Wd.A0C(c1130158n2, 39.0f), 6);
                BGY.A01(c5Tl, AbstractC118185Wd.A0C(c1130158n2, 40.0f), f4, 2.0f, 0.0f, 196656, 88, AbstractC25226BEj.A0G(c5Tl), 0L, false);
                C5YS.A06(c5Tl, AbstractC25230BEn.A0Y(c119645bN2.AB5(alignment2, AbstractC118185Wd.A03(c1130158n2)), new C57748Pjb(obj, 3)), C5Y7.A00(c5Tl, R.drawable.instagram_key_pano_filled_24, 0), AbstractC25226BEj.A0G(c5Tl));
                c5Tl.ASW();
                c5Tl.ASW();
            }
            if (C0fH.A02()) {
                C0fH.A00(1805745513);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DSS(modifier, f, i, 0);
        }
    }

    public static final void A02(C5Tl c5Tl, Modifier modifier, int i) {
        int i2;
        c5Tl.Enr(256254737);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-429343838, "com.instagram.opal.impl.ui.EmptyCircularProgressIndicator (OpalSwitchIndicator.kt:137)");
            }
            long A0M = AbstractC25226BEj.A0M(c5Tl);
            float EqT = AbstractC25228BEl.A0h(c5Tl).EqT(1.0f);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -750567635);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = new C62V(new C28803CnZ(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f)), EqT, 4.0f, 0, 0);
                c5Tl.FBy(A0q);
            }
            C117505Tk A0J = AbstractC25225BEi.A0J(c5Tl);
            c5Tl.Eno(-750563064);
            boolean A1X = AbstractC25226BEj.A1X(c5Tl, A0q, c5Tl.AH3(A0M));
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == obj) {
                EEc = new DHN(A0M, A0q, 8);
                c5Tl.FBy(EEc);
            }
            C117505Tk.A0I(A0J);
            AbstractC119665bP.A00(c5Tl, modifier, (InterfaceC16660sJ) EEc, i2 & 14);
            if (C0fH.A02()) {
                C0fH.A00(205014437);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, modifier, i, 32);
        }
    }
}
