package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.AchievementIntf;

/* renamed from: X.CHv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27650CHv {
    public static final void A00(C5Tl c5Tl, Modifier modifier, AchievementIntf achievementIntf, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        Modifier modifier2 = modifier;
        boolean A1R = AbstractC167007dF.A1R(0, achievementIntf, interfaceC16820sZ);
        c5Tl.Enr(-657231137);
        if ((i2 & 4) != 0) {
            modifier2 = Modifier.A00;
        }
        if (C0fH.A02()) {
            C0fH.A01(236502933, "com.instagram.creator.achievements.modules.views.EarnedOnMediaRow (EarnedOnMediaRow.kt:37)");
        }
        String B0E = achievementIntf.B0E();
        if (B0E != null) {
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            Modifier A0C = AbstractC118175Wb.A0C(modifier2, 0.0f, 0.0f, 16.0f);
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(AbstractC118255Wn.A01, c5Tl, interfaceC118225Wj, 48);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0C);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C2DB A0d = AbstractC25235BEs.A0d(c5Tl, B0E);
            C1130158n c1130158n = Modifier.A00;
            boolean z = true;
            Modifier A0X = AbstractC25228BEl.A0X(C6L7.A01(C6G9.A00(1.0f, AbstractC25226BEj.A0E(c5Tl)), AbstractC118185Wd.A0C(c1130158n, 56.0f), C5WF.A01(4.0f)), 4.0f);
            c5Tl.Eno(1296950920);
            if ((((i & 112) ^ 48) <= 32 || !c5Tl.AH4(interfaceC16820sZ)) && (i & 48) != 32) {
                z = false;
            }
            Object EEc = c5Tl.EEc();
            if (z || EEc == C5UI.A00) {
                EEc = C29911DGz.A01(interfaceC16820sZ, 8);
                c5Tl.FBy(EEc);
            }
            C6LQ.A04(c5Tl, C5XR.A05(A0X, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc, false), A1R), A0d);
            String B0D = achievementIntf.B0D();
            c5Tl.Eno(1296954526);
            if (B0D != null) {
                C5WR.A05(c5Tl, AbstractC118175Wb.A0E(c1130158n, 16.0f, 0.0f, 0.0f, 0.0f), AbstractC25226BEj.A0c(c5Tl), B0D);
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.ASW();
        }
        if (C0fH.A02()) {
            C0fH.A00(1877921242);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 25, achievementIntf, interfaceC16820sZ, modifier2);
        }
    }
}
