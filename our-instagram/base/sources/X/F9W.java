package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class F9W {
    public static C1ON A00(Context context, UserSession userSession, boolean z) {
        C16030qx c16030qx = C16030qx.A02;
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("nux/new_account_nux_seen/");
        AbstractC31173DnH.A1O(A0M, C16030qx.A00(context));
        AbstractC31175DnJ.A0k(context, A0M, c16030qx);
        AbstractC31175DnJ.A1F(C19T.A26, A0M, AbstractC31172DnG.A0P(userSession));
        A0M.A0I("is_fb4a_installed", z);
        AbstractC31176DnK.A1Q(A0M);
        return AbstractC31178DnM.A0I(A0M, C40781ul.class, C55702hA.class);
    }
}
