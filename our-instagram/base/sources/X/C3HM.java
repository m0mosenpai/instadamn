package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.3HM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3HM {
    public static final C3HM A00 = new Object();

    public final boolean A04(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (!A05(userSession) && !A03(userSession)) {
            return false;
        }
        return true;
    }

    public final boolean A06(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        if (A02(str) && A05(userSession) && C18U.A06(C06090Tz.A05, userSession, 36327658023435017L)) {
            return true;
        }
        return false;
    }

    public final boolean A07(UserSession userSession, String str) {
        C06090Tz c06090Tz;
        long j;
        C14360o3.A0B(str, 1);
        if (A02(str)) {
            return A04(userSession);
        }
        if (AbstractC16830sb.A07("feed_contextual_self_profile", "feed_contextual_profile", "feed_contextual_group_profile").contains(str)) {
            c06090Tz = C06090Tz.A05;
            j = 36327658023697165L;
        } else if (AbstractC002300n.A0h(str, "feed_contextual", false) && !AbstractC16830sb.A07("feed_contextual_self_profile", "feed_contextual_profile", "feed_contextual_group_profile").contains(str)) {
            c06090Tz = C06090Tz.A05;
            j = 36327658023631628L;
        } else {
            return false;
        }
        return C18U.A06(c06090Tz, userSession, j);
    }

    public static final List A00() {
        return AbstractC16960so.A1Q("ig_android_friendly_feed_fbid.ff_likes_enabled", "ig_android_friendly_feed_fbid.ff_comments_enabled", "ig_android_friendly_feed_fbid.is_profile_enabled", "ig_android_friendly_feed_fbid.is_explore_enabled", "ig_android_friendly_feed_fbid.disable_high_value_check", "ig_android_friendly_feed_fbid.hide_likers_row_when_bubbles_shown", "ig_android_friendly_feed_fbid.dedupe_likers_when_bubbles_shown", "ig_android_friendly_feed_fbid.hide_facepile_top_likers", "ig_android_friendly_feed_fbid.top_likers_data_migration", "ig_ios_friendly_feed_fbidv2_v2.show_nux_on_tap", "ig_ios_friendly_feed_fbidv2_v2.expand_touch_area", "ig_android_friendly_feed.is_debug_menu_enabled", "ig_android_friendly_feed.enable_comment_pop_in", "ig_android_friendly_feed.enable_social_bubbles_below_media_with_notes");
    }

    public static final boolean A01(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36325128287630067L) && !C18U.A06(c06090Tz, userSession, 36327658023828239L)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(String str) {
        if (!str.equals("feed_timeline") && !str.equals("feed_timeline_favorites") && !str.equals("feed_timeline_following") && !str.equals("feed_timeline_fan_club")) {
            return false;
        }
        return true;
    }

    public final boolean A03(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36325128288613121L) && !C18U.A06(c06090Tz, userSession, 36325128289202953L) && !C18U.A06(c06090Tz, userSession, 36327658023893776L)) {
            return false;
        }
        return true;
    }

    public final boolean A05(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36325128288547584L) && !C18U.A06(c06090Tz, userSession, 36325128289202953L) && !C18U.A06(c06090Tz, userSession, 36327658023959313L)) {
            return false;
        }
        return true;
    }
}
