package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.F8b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34229F8b {
    public static void A00(Activity activity, Bundle bundle, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1) {
        if (bundle != null && AbstractC31172DnG.A13(bundle, MSV.A00(94)).equalsIgnoreCase("force_logout_login_help")) {
            String string = bundle.getString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
            String string2 = bundle.getString("token");
            C25621Ms A0M = AbstractC31173DnH.A0M(c07270a1);
            A0M.A0B("accounts/post_force_logout_login/");
            A0M.A9s("uid", string);
            AbstractC31179DnN.A0j(activity, A0M, CacheBehaviorLogger.SOURCE, "post_force_logout_login_push");
            A0M.A9s("token", string2);
            C1ON A0H = AbstractC31180DnO.A0H(A0M, EfU.class, C35072Fcj.class);
            A0H.A00 = new C32976Efh(activity, interfaceC11380iw, c07270a1);
            C1GJ.A00(activity, abstractC018607g, A0H);
        }
    }
}
