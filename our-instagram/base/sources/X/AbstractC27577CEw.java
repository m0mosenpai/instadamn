package X;

import android.view.View;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.CEw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27577CEw {
    public static final void A00(C5Tl c5Tl, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        C14360o3.A0B(interfaceC16820sZ, 0);
        AbstractC167017dG.A1P(interfaceC16660sJ, interfaceC16820sZ2);
        C14360o3.A0B(str, 3);
        c5Tl.Enr(-1086338192);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0U(c5Tl, str);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(271974349, "com.instagram.barcelonaig.ui.BarcelonaIgLikeAsIGDialog (BarcelonaIgLikeAsIGDialog.kt:19)");
            }
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, -2035703355, i2);
            Object EEc = c5Tl.EEc();
            if (A1O || EEc == C5UI.A00) {
                EEc = new C50150MDd(interfaceC16820sZ, 15);
                c5Tl.FBy(EEc);
            }
            InterfaceC16820sZ interfaceC16820sZ3 = (InterfaceC16820sZ) EEc;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Object A19 = AbstractC25226BEj.A19(c5Tl);
            String A17 = AbstractC25228BEl.A17(c5Tl, str, 2131953682);
            String A00 = C5YD.A00(c5Tl, 2131953679);
            boolean AH6 = c5Tl.AH6(A19) | AbstractC25233BEq.A1P(c5Tl, -2035690036, i2);
            Object EEc2 = c5Tl.EEc();
            if (AH6 || EEc2 == C5UI.A00) {
                EEc2 = AbstractC25230BEn.A11(c5Tl, interfaceC16660sJ, A19, 35);
            }
            AbstractC28433Cgh.A01((View) interfaceC16820sZ2.invoke(), c5Tl, CGH.A00(c5Tl, null, AbstractC25225BEi.A1A(A0K, EEc2, false), 2131953680, 14), CGH.A00(c5Tl, null, interfaceC16820sZ3, 2131953681, 14), null, A17, A00, interfaceC16820sZ3, 0, CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS, false);
            if (C0fH.A02()) {
                C0fH.A00(-823549319);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30224DTd(interfaceC16660sJ, interfaceC16820sZ2, interfaceC16820sZ, str, i, 3);
        }
    }
}
