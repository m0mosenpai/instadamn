package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.8DP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8DP implements CallerContextable {
    public static final String __redex_internal_original_name = "StoryShareToFBCloseFriendsController";
    public final UserSession A00;

    public final void A00() {
        if (AbstractC46542Bs.A00(this.A00).A04.getBoolean("PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_STORY_CLOSE_FRIENDS_EDUCATION_HAS_SHOWN", false)) {
            CallerContext callerContext = C180377zR.A00;
        }
    }

    public C8DP(UserSession userSession) {
        this.A00 = userSession;
    }
}
