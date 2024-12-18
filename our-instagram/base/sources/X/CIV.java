package X;

import androidx.compose.foundation.lazy.LazyListState;

/* loaded from: classes5.dex */
public abstract class CIV {
    public static final void A00(C5Tl c5Tl, C25864BcJ c25864BcJ, int i) {
        int i2;
        C14360o3.A0B(c25864BcJ, 0);
        c5Tl.Enr(-135573019);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c25864BcJ) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-2100831291, "com.instagram.direct.fragment.thread.keymanagement.mvvm.ui.EncryptedDeviceList (EncryptedDeviceList.kt:40)");
            }
            InterfaceC74963Ym A02 = C6IB.A02(c5Tl, c25864BcJ.A03, 0);
            LazyListState A0E = AbstractC25227BEk.A0E(c5Tl);
            Object A19 = AbstractC25226BEj.A19(c5Tl);
            boolean A1X = AbstractC25226BEj.A1X(c5Tl, A19, AbstractC25232BEp.A1Y(c5Tl, A02, c25864BcJ, -519602024));
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == C5UI.A00) {
                EEc = new C50364MLq(10, A02, A19, c25864BcJ);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C6IS.A05(A0E, c5Tl, (InterfaceC16660sJ) EEc);
            if (C0fH.A02()) {
                C0fH.A00(460836053);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, c25864BcJ, i, 11);
        }
    }
}
