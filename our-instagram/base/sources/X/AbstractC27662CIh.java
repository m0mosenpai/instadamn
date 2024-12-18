package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.CIh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27662CIh {
    public static final void A00(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        int i2;
        C14360o3.A0B(interfaceC16820sZ, 0);
        c5Tl.Enr(-898705696);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(972277987, "com.instagram.direct.screenshotblocking.ui.BottomSheetContent (ScreenshotBlockingNux.kt:92)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            Modifier A0E = AbstractC118175Wb.A0E(A0T, 0.0f, 0.0f, 0.0f, 24.0f);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6GM c6gm = C6GM.A00;
            C2DC A002 = C5Y7.A00(c5Tl, R.drawable.ig_illustrations_illo_screenshot_block_refresh, 0);
            Modifier A0F = AbstractC118185Wd.A0F(A0T, Float.NaN, 170.0f);
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
            C6LQ.A03(c5Tl, c6gm.AB6(interfaceC118245Wl, A0F), A002);
            String A003 = AbstractC136736Hc.A00(c5Tl, 2131963982);
            long A0G = AbstractC25226BEj.A0G(c5Tl);
            C5WR.A0R(c5Tl, c6gm.AB6(interfaceC118245Wl, AbstractC118175Wb.A0E(c1130158n, 32.0f, 16.0f, 32.0f, 16.0f)), AbstractC25226BEj.A0e(c5Tl), A003, A0G);
            AbstractC28474ChS.A01(c5Tl, C5Y7.A00(c5Tl, R.drawable.instagram_circle_block_off_pano_outline_24, 0), 2131963979);
            AbstractC28474ChS.A01(c5Tl, C5Y7.A00(c5Tl, R.drawable.instagram_report_pano_outline_24, 0), 2131963980);
            AbstractC28474ChS.A01(c5Tl, C5Y7.A00(c5Tl, R.drawable.instagram_app_imessage_pano_outline_24, 0), 2131963981);
            AbstractC28506Chz.A00(c5Tl, A0T, null, AbstractC136736Hc.A00(c5Tl, 2131968948), AbstractC136736Hc.A00(c5Tl, 2131965052), interfaceC16820sZ, interfaceC16820sZ2, ((i2 << 3) & 112) | 384 | ((i2 << 15) & 3670016), 24472);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-835988962);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30510Dbt(interfaceC16820sZ, interfaceC16820sZ2, i, 20);
        }
    }
}
