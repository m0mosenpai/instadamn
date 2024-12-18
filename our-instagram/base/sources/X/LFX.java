package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LFX {
    public static final LFX A00 = new Object();
    public static final java.util.Set A01 = AbstractC16830sb.A07("direct_v2_text", "direct_v2_clips_share", "direct_v2_user_reaction", "direct_v2_media", "direct_v2_media_share", "direct_v2_raven", "direct_v2_reel_share", "direct_v2_reel_mention", "direct_v2_reel_reaction", "direct_v2_story_share");

    public final boolean A00(UserSession userSession, String str) {
        if ((!A01.contains(str) || !C18U.A06(C06090Tz.A05, userSession, 36320326514712948L)) && !AbstractC117345St.A01.contains(str) && !"direct_v2_highlights_share".equals(str) && !C18U.A06(C06090Tz.A05, userSession, 36320326514254190L)) {
            return false;
        }
        return true;
    }
}
