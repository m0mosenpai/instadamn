package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.MTz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50568MTz {
    public static final void A00(MU0 mu0, MU1 mu1, C82G c82g, C51411MnJ c51411MnJ, UserSession userSession) {
        String str;
        C14360o3.A0B(userSession, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "crosspost_controls");
        Integer num = null;
        if (C200108tF.A01.A0D(null, userSession, false)) {
            num = C05F.A01;
        } else if (C173057nJ.A00.A00(userSession, false)) {
            num = C05F.A00;
        }
        boolean A1X = MSZ.A1X(C196068lw.A00(userSession), "CrosspostControlsLogger");
        C0Zx c0Zx = new C0Zx();
        c0Zx.A03("is_account_linked", Boolean.valueOf(A1X));
        if (num != null && mu1 == MU1.REELS) {
            if (1 - num.intValue() != 0) {
                str = "RECOMMEND";
            } else {
                str = "CROSSPOST";
            }
            c0Zx.A06("cross_app_share_type", str);
        }
        C46552Bt A00 = AbstractC46542Bs.A00(userSession);
        int ordinal = mu1.ordinal();
        boolean z = false;
        if (ordinal != 2) {
            z = ordinal != 0 ? C196218mC.A00(userSession) : C196008lp.A00(userSession);
        } else if (num != null) {
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue == 0) {
                    z = A00.A0C();
                }
            } else {
                z = C200108tF.A06(userSession);
            }
        }
        c0Zx.A03("is_auto_xpost_enabled", Boolean.valueOf(z));
        if (A0f.isSampled()) {
            A0f.A8R(c82g, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0f.A8R(mu0, "event_type");
            A0f.A8R(mu1, "product_type");
            A0f.AAQ(c0Zx, "user_info");
            A0f.AAQ(c51411MnJ, "creation_info");
            A0f.Cht();
        }
    }
}
