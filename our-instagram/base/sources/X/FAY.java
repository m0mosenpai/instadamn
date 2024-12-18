package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FAY {
    public static C1ON A00(UserSession userSession, FLC flc) {
        String str;
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        String str2 = flc.A01;
        if (Boolean.TRUE.equals(flc.A00)) {
            str = "follow_story_countdown/";
        } else {
            str = "unfollow_story_countdown/";
        }
        A0M.A0B(StringFormatUtil.formatStrLocaleSafe("media/%s/%s", str2, str));
        A0M.A9s("media_id", flc.A02);
        return AbstractC31178DnM.A0I(A0M, C32168EBp.class, C34831FWm.class);
    }
}
