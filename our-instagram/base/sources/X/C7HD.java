package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7HD, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7HD {
    public static final boolean A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36315846863425138L);
    }

    public static final boolean A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36328070340230294L);
    }

    public static final boolean A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36328070340820126L);
    }

    public static final boolean A03(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36328070340689052L);
    }

    public static final boolean A04(UserSession userSession, boolean z) {
        C06090Tz c06090Tz;
        if (z) {
            c06090Tz = C06090Tz.A06;
        } else {
            c06090Tz = C06090Tz.A05;
        }
        boolean A06 = C18U.A06(c06090Tz, userSession, 36323079588162489L);
        C14360o3.A0A(Boolean.valueOf(A06));
        return A06;
    }

    public static final boolean A05(String str) {
        if (!C14360o3.A0K(str, "user_detail_ad_cta") && !C14360o3.A0K(str, "feed_ad_media_tooltip") && !C14360o3.A0K(str, "story_ad_media_tooltip") && !C14360o3.A0K(str, "story_ad_cta") && !C14360o3.A0K(str, "reels_ad_cta") && !C14360o3.A0K(str, "direct_feed_channel_join_ad_cta") && !C14360o3.A0K(str, "reel_viewer_chat_sticker") && !C14360o3.A0K(str, "reel_viewer_message_share_sticker_tooltip") && !C14360o3.A0K(str, "reel_viewer_message_share_sticker_attribution") && !C14360o3.A0K(str, "clips_viewer_chat_sticker") && !C14360o3.A0K(str, "direct_feed_channel_cta")) {
            return false;
        }
        return true;
    }
}
