package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.CgM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28416CgM {
    public static final C5UP A00 = new C5UQ(DBJ.A00);

    public static final void A01(C5Tl c5Tl, C114205Dh c114205Dh, C25997Bel c25997Bel, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, int i, int i2) {
        int i3;
        C25997Bel c25997Bel2 = c25997Bel;
        C14360o3.A0B(c114205Dh, 0);
        AbstractC167027dH.A13(interfaceC16620sF, interfaceC16620sF2, interfaceC16660sJ);
        c5Tl.Enr(825298767);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, c114205Dh) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16620sF);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16620sF2);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0V(c5Tl, c25997Bel);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                c25997Bel2 = new C25997Bel();
            }
            if (C0fH.A02()) {
                C0fH.A01(-1107811929, "com.instagram.creation.capture.assetpicker.cutout.crop.CropRectangle (CropRectangle.kt:56)");
            }
            AbstractC25230BEn.A17(c5Tl, A00.A02(c25997Bel2), new DT0(4, interfaceC16660sJ, interfaceC16620sF, interfaceC16620sF2, c114205Dh), -1889598449);
            if (C0fH.A02()) {
                C0fH.A00(1522352090);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV5(interfaceC16660sJ, interfaceC16620sF2, interfaceC16620sF, c25997Bel2, c114205Dh, i, i2, 5);
        }
    }

    public static final void A00(C5Tl c5Tl, C114205Dh c114205Dh, EnumC27346C5b enumC27346C5b, InterfaceC16620sF interfaceC16620sF, int i) {
        int i2;
        c5Tl.Enr(302626865);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c114205Dh) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, enumC27346C5b);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16620sF);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1983158598, "com.instagram.creation.capture.assetpicker.cutout.crop.CropCorner (CropRectangle.kt:216)");
            }
            C5UP c5up = A00;
            float f = ((C25997Bel) c5Tl.AJX(c5up)).A01;
            C5UP c5up2 = C5V2.A01;
            float EqT = AbstractC25226BEj.A0j(c5Tl, c5up2).EqT(f);
            float EqT2 = AbstractC25226BEj.A0j(c5Tl, c5up2).EqT(((C25997Bel) c5Tl.AJX(c5up)).A02);
            long j = ((C25997Bel) c5Tl.AJX(c5up)).A05;
            c5Tl.AJX(c5up);
            C1130158n c1130158n = Modifier.A00;
            c5Tl.Eno(-826371397);
            int i3 = i2 & 112;
            boolean z = true;
            boolean A1P = AbstractC167007dF.A1P(i3, 32) | AbstractC25233BEq.A1H(i2) | c5Tl.AH1(EqT);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = new DHY(enumC27346C5b, c114205Dh, EqT, 6);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A0C = AbstractC118185Wd.A0C(AbstractC28010CWi.A01(c1130158n, (InterfaceC16660sJ) EEc), f);
            C0eB c0eB = C0eB.A00;
            boolean A1Z = AbstractC25234BEr.A1Z(c5Tl, -826367485, i2) | AbstractC167007dF.A1P(i3, 32);
            Object EEc2 = c5Tl.EEc();
            if (A1Z || EEc2 == C5UI.A00) {
                EEc2 = new MC8(enumC27346C5b, interfaceC16620sF, (InterfaceC23621Ds) null, 46);
                c5Tl.FBy(EEc2);
            }
            Modifier A0U = AbstractC25229BEm.A0U(A0K, A0C, EEc2, c0eB, false);
            boolean A1W = AbstractC25227BEk.A1W(c5Tl, -826361213, false);
            if (i3 != 32) {
                z = false;
            }
            boolean A1V = AbstractC25235BEs.A1V(c5Tl, EqT, EqT2, AbstractC25226BEj.A1W(c5Tl, j, A1W | z));
            Object EEc3 = c5Tl.EEc();
            if (A1V || EEc3 == C5UI.A00) {
                EEc3 = new C29920DHi(enumC27346C5b, EqT2, EqT, 0, j);
                c5Tl.FBy(EEc3);
            }
            if (AbstractC25227BEk.A1X(c5Tl, AbstractC25230BEn.A0W(A0K, A0U, EEc3, false))) {
                C0fH.A00(1276025339);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30509Dbs.A01(interfaceC16620sF, enumC27346C5b, c114205Dh, i, 21);
        }
    }

    public static final void A02(C5Tl c5Tl, InterfaceC16660sJ interfaceC16660sJ, int i, long j, long j2) {
        int i2;
        c5Tl.Enr(-1943476931);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(c5Tl.AH3(j) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0E(c5Tl, j2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-2018649558, "com.instagram.creation.capture.assetpicker.cutout.crop.CropEdge (CropRectangle.kt:285)");
            }
            long A06 = C119365at.A06(j2, j);
            c5Tl.AJX(A00);
            C1130158n c1130158n = Modifier.A00;
            c5Tl.Eno(-293439328);
            boolean A1P = AbstractC167007dF.A1P(i2 & 14, 4);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = new JXD(j, 6);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A01 = AbstractC28010CWi.A01(c1130158n, (InterfaceC16660sJ) EEc);
            C5UP c5up = AndroidCompositionLocals_androidKt.A01;
            Modifier A08 = AbstractC118185Wd.A08(AbstractC118185Wd.A0D(A01, AbstractC13880nE.A01((Context) c5Tl.AJX(c5up), C119365at.A01(A06))), AbstractC13880nE.A01((Context) c5Tl.AJX(c5up), C119365at.A02(A06)));
            C0eB c0eB = C0eB.A00;
            c5Tl.Eno(-293432961);
            boolean A1M = AbstractC25231BEo.A1M(i2);
            Object EEc2 = c5Tl.EEc();
            if (A1M || EEc2 == C5UI.A00) {
                EEc2 = new C25023B5e((InterfaceC23621Ds) null, interfaceC16660sJ, 3);
                c5Tl.FBy(EEc2);
            }
            Modifier A0U = AbstractC25229BEm.A0U(A0K, A08, EEc2, c0eB, false);
            boolean A1W = AbstractC25227BEk.A1W(c5Tl, -293427176, false);
            Object EEc3 = c5Tl.EEc();
            if (A1W || EEc3 == C5UI.A00) {
                EEc3 = new C25310BIf(false, 6);
                c5Tl.FBy(EEc3);
            }
            if (AbstractC25227BEk.A1X(c5Tl, AbstractC25230BEn.A0W(A0K, A0U, EEc3, false))) {
                C0fH.A00(-633856412);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DSJ(interfaceC16660sJ, i, j, j2);
        }
    }
}
