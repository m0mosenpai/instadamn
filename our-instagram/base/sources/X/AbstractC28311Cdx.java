package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.Cdx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28311Cdx {
    public static final void A01(C5Tl c5Tl, Modifier modifier, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, C5Hc c5Hc, int i, boolean z) {
        int i2;
        int A06 = AbstractC167007dF.A06(0, c5Hc, modifier);
        AbstractC167007dF.A1F(interfaceC16620sF, 3, interfaceC16620sF2);
        c5Tl.Enr(35080314);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c5Hc) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, modifier);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16620sF);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16620sF2);
        }
        if ((i2 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(25541621, "com.instagram.creation.genai.memu.settings.MemuPhotosLayout (MemuPhotosGridLayout.kt:40)");
            }
            AbstractC28419CgQ.A02(AbstractC118255Wn.A01(1.0f), AbstractC118255Wn.A01(1.0f), null, c5Tl, AbstractC25227BEk.A0H(AbstractC25225BEi.A0Q(modifier), 12.0f), C5UA.A01(c5Tl, new C30545DcS(1, c5Hc, interfaceC16620sF, interfaceC16620sF2, z), 1822711285), 3, 0, 1576368, 48);
            if (C0fH.A02()) {
                C0fH.A00(1860084867);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUK(i, A06, c5Hc, modifier, interfaceC16620sF2, interfaceC16620sF, z);
        }
    }

    public static final void A02(C5Tl c5Tl, BJF bjf, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, int i, int i2, boolean z) {
        int i3;
        AbstractC167007dF.A1E(bjf, 0, interfaceC16620sF);
        C14360o3.A0B(interfaceC16620sF2, 4);
        c5Tl.Enr(1716856967);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, bjf) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A09(c5Tl, i);
        }
        if ((i2 & 384) == 0) {
            i3 |= AbstractC25232BEp.A0d(c5Tl, z);
        }
        if ((i2 & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16620sF);
        }
        if ((i2 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16620sF2);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1639692385, "com.instagram.creation.genai.memu.settings.MemuPhotoItem (MemuPhotosGridLayout.kt:61)");
            }
            float A02 = (AbstractC25231BEo.A02(c5Tl) / 3.0f) - 2.0f;
            C1130158n c1130158n = Modifier.A00;
            Modifier A00 = AbstractC27468CAo.A00(AbstractC118185Wd.A08(AbstractC118185Wd.A0D(c1130158n, A02), A02), 1.0f, false);
            c5Tl.Eno(1997257604);
            int i4 = i3 & 896;
            int i5 = i3 & 112;
            int i6 = i3 & 14;
            boolean A1P = AbstractC167007dF.A1P(i4, 256) | AbstractC25231BEo.A1N(i3, 57344, Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) | AbstractC167007dF.A1P(i5, 32) | AbstractC167007dF.A1P(i6, 4);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = new C29707D8a(bjf, interfaceC16620sF2, i, 0, z);
                c5Tl.FBy(EEc);
            }
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) EEc;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            int i7 = i3 & 7168;
            boolean A1U = AbstractC25232BEp.A1U(c5Tl, 1997263432, i4, 256) | AbstractC167007dF.A1P(i7, C3OO.FLAG_MOVED) | AbstractC167007dF.A1P(i5, 32) | AbstractC167007dF.A1P(i6, 4);
            Object EEc2 = c5Tl.EEc();
            if (A1U || EEc2 == C5UI.A00) {
                EEc2 = new C29707D8a(bjf, interfaceC16620sF, i, 1, z);
                c5Tl.FBy(EEc2);
            }
            Modifier Eq3 = A00.Eq3(C5X3.A02(c1130158n, C5XU.A00, new BG9(null, interfaceC16820sZ, AbstractC25225BEi.A1A(A0K, EEc2, false))));
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, Eq3);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF3 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C119645bN c119645bN = C119645bN.A00;
            C6LQ.A08(c5Tl, c119645bN.Cng(c1130158n), AbstractC43541zP.A02(c5Tl, AbstractC25225BEi.A0t(bjf.A02), null, null, null, 196608, 94, 0L, true, false), C5YJ.A00);
            c5Tl.Eno(1803753868);
            if (z) {
                boolean z2 = bjf.A03;
                boolean A1U2 = AbstractC25232BEp.A1U(c5Tl, 1803756962, i7, C3OO.FLAG_MOVED) | AbstractC167007dF.A1P(i6, 4);
                Object EEc3 = c5Tl.EEc();
                if (A1U2 || EEc3 == C5UI.A00) {
                    EEc3 = C30183DRo.A00(c5Tl, bjf, interfaceC16620sF, 20);
                }
                A00(c5Tl, Eq3, AbstractC25225BEi.A1B(A0K, EEc3, false), i, i5, z2);
            }
            if (AbstractC25230BEn.A1U(c5Tl, A0K, false)) {
                C0fH.A00(1484939191);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUI(bjf, interfaceC16620sF, interfaceC16620sF2, i2, i, 5, z);
        }
    }

    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, boolean z) {
        int i3;
        AbstractC167017dG.A1R(modifier, interfaceC16660sJ);
        c5Tl.Enr(-870619976);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A0b(c5Tl, z) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A09(c5Tl, i);
        }
        if ((i2 & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier);
        }
        if ((i2 & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1170664635, "com.instagram.creation.genai.memu.settings.MemuPhotoItemOverlay (MemuPhotosGridLayout.kt:104)");
            }
            Modifier A0X = AbstractC25226BEj.A0X(modifier, C5XL.A00(c5Tl).A0y);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0X);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            Modifier AB5 = C119645bN.A00.AB5(C118195Wf.A07, AbstractC118175Wb.A03(Modifier.A00));
            C6M c6m = C6M.A04;
            c5Tl.Eno(644107780);
            boolean z2 = true;
            boolean A1P = AbstractC167007dF.A1P(i3 & 7168, C3OO.FLAG_MOVED);
            if ((i3 & 112) != 32) {
                z2 = false;
            }
            boolean z3 = A1P | z2;
            Object EEc = c5Tl.EEc();
            if (z3 || EEc == C5UI.A00) {
                EEc = new DHO(i, 13, interfaceC16660sJ);
                c5Tl.FBy(EEc);
            }
            CGE.A00(c5Tl, AB5, c6m, AbstractC25225BEi.A1B(c117505Tk, EEc, false), ((i3 << 3) & 112) | DalvikInternals.IOPRIO_BACKGROUND, 8, z, false);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1391127947);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTV(i2, i, 7, modifier, interfaceC16660sJ, z);
        }
    }
}
