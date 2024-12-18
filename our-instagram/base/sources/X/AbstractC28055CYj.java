package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import java.util.Iterator;

/* renamed from: X.CYj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28055CYj {
    public static final void A00(C5Tl c5Tl, InterfaceC74953Yl interfaceC74953Yl, InterfaceC16820sZ interfaceC16820sZ, C5Hc c5Hc, int i, boolean z) {
        int i2;
        c5Tl.Enr(-1353344266);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c5Hc) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, interfaceC74953Yl);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0d(c5Tl, z);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(693188461, "com.instagram.direct.ui.professional.Layout (DirectMoveThreadActionBottomSheet.kt:119)");
            }
            C1130158n c1130158n = Modifier.A00;
            boolean z2 = false;
            InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            Iterator A0x = AbstractC25227BEk.A0x(c5Tl, c5Hc, 507065447);
            while (A0x.hasNext()) {
                C50092Rx c50092Rx = (C50092Rx) A0x.next();
                String A002 = JUR.A00(AbstractC25228BEl.A0K(c5Tl), AbstractC25228BEl.A0u(c5Tl), c50092Rx.A00());
                boolean A1U = AbstractC25229BEm.A1U(interfaceC74953Yl, c50092Rx);
                boolean A1X = AbstractC25226BEj.A1X(c5Tl, c50092Rx, AbstractC25233BEq.A1P(c5Tl, 624929902, i2));
                Object EEc = c5Tl.EEc();
                if (A1X || EEc == C5UI.A00) {
                    EEc = new C50171MDy(14, c50092Rx, interfaceC74953Yl);
                    c5Tl.FBy(EEc);
                }
                A01(c5Tl, A002, AbstractC25225BEi.A1A(c117505Tk, EEc, false), 0, A1U);
            }
            C117505Tk.A0L(c117505Tk, false);
            String A003 = C5YD.A00(c5Tl, 2131964416);
            c5Tl.Eno(507076780);
            if ((i2 & 7168) == 2048) {
                z2 = true;
            }
            Object EEc2 = c5Tl.EEc();
            if (z2 || EEc2 == C5UI.A00) {
                EEc2 = new C37054GUk(interfaceC16820sZ, 21);
                c5Tl.FBy(EEc2);
            }
            AbstractC28506Chz.A06(c5Tl, null, A003, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), (i2 << 3) & 7168, 0, 32756, z);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(2130495350);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTY(c5Hc, interfaceC16820sZ, interfaceC74953Yl, i, 7, z);
        }
    }

    public static final void A01(C5Tl c5Tl, String str, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        int i2;
        c5Tl.Enr(-2036107348);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1189295954, "com.instagram.direct.ui.professional.Folder (DirectMoveThreadActionBottomSheet.kt:139)");
            }
            AbstractC25705BXp.A0O(c5Tl, AbstractC25227BEk.A0P(c5Tl, R.drawable.instagram_folder_pano_outline_24), new C29197Cu2(z, interfaceC16820sZ), str, i2 & 14, 130782);
            if (C0fH.A02()) {
                C0fH.A00(1979347794);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT3(interfaceC16820sZ, str, i, 1, z);
        }
    }
}
