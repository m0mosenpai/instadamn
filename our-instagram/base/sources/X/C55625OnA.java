package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.model.sharelater.ShareLaterMedia;

/* renamed from: X.OnA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55625OnA implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C55625OnA.class);
    public static final String __redex_internal_original_name = "ReelFBShareUtil";

    public static C1ON A00(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, InterfaceC146876jP interfaceC146876jP, Boolean bool, Integer num, String str, boolean z) {
        String A38;
        int i;
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM == null) {
            A38 = "";
        } else {
            A38 = c38321qM.A38();
        }
        if (c41181vS.A0C() == null) {
            i = -1;
        } else {
            i = c41181vS.A0C().A00;
        }
        C55185Odq.A02(userSession, interfaceC11380iw, str, A38, "one_tap_share", i);
        AbstractC54107Nw5.A00(userSession, "request", "self_story", AbstractC166997dE.A0t(userSession), str, null);
        int i2 = 2131973839;
        if (z) {
            i2 = 2131973880;
        }
        c38321qM.getClass();
        C1ON A002 = AbstractC54205Nxj.A00(userSession, new ShareLaterMedia(c38321qM), num, str, "story_viewer");
        A002.A00 = new C52224N9n(context, interfaceC11380iw, userSession, c41181vS, interfaceC146876jP, str, i2, bool.booleanValue());
        return A002;
    }
}
