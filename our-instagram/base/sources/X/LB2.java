package X;

import android.app.Activity;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public abstract class LB2 {
    public static final void A01(Activity activity, AvatarCoinFlipConfig avatarCoinFlipConfig, UserSession userSession, InterfaceC1119153d interfaceC1119153d, String str, float f, float f2, boolean z) {
        C14360o3.A0B(userSession, 0);
        AbstractC43594JPz.A1P(avatarCoinFlipConfig, interfaceC1119153d);
        C189478aR A00 = F86.A00(AbstractC31172DnG.A0r(activity));
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36322285019277419L);
        EIQ A002 = AbstractC33777Ew3.A00(avatarCoinFlipConfig, str, A06);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        if (A06 && z) {
            f -= 0.05f;
        }
        A0y.A03 = f;
        AbstractC25225BEi.A1Q(A0y, true);
        if (A06 && z) {
            f2 -= 0.05f;
        }
        A0y.A04 = f2;
        A0y.A0U = interfaceC1119153d;
        AbstractC13880nE.A0K(activity);
        if (A00 != null) {
            A00.A0F(A002, A0y);
        } else {
            AbstractC31173DnH.A0w(activity, A002, A0y);
        }
    }

    public static final void A00(Activity activity, AvatarCoinFlipConfig avatarCoinFlipConfig, UserSession userSession, InterfaceC1119153d interfaceC1119153d, String str) {
        A01(activity, avatarCoinFlipConfig, userSession, interfaceC1119153d, str, 0.65f, 0.65f, true);
    }
}
