package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;

/* loaded from: classes9.dex */
public abstract class OPK {
    public static final void A01(UserSession userSession, Context context, String str) {
        String str2;
        boolean A1b = AbstractC25233BEq.A1b(userSession, context, str);
        C09530e4 A1L = AbstractC166987dD.A1L(AbstractC50529MSi.A01(), str);
        if (A1b) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        AbstractC191798eb.A03(context, new C191778eZ(userSession), "com.bloks.www.bloks.browser_history.main_screen", str, AbstractC06930Yk.A02(AbstractC25229BEm.A1b("is_prefetch", str2, A1L)), SandboxRepository.CACHE_TTL);
    }

    public static final void A00(UserSession userSession, Context context, String str) {
        String str2;
        boolean A1b = AbstractC25233BEq.A1b(userSession, context, str);
        C09530e4 A1L = AbstractC166987dD.A1L(AbstractC50529MSi.A01(), str);
        if (A1b) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        AbstractC191798eb.A01(context, new C191778eZ(userSession), "com.bloks.www.bloks.browser_history.main_screen", str, AbstractC06930Yk.A02(AbstractC25229BEm.A1b("is_prefetch", str2, A1L)));
    }
}
