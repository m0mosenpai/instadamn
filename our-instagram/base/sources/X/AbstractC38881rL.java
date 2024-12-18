package X;

import com.instagram.user.model.FriendshipStatusImpl;
import java.io.IOException;

/* renamed from: X.1rL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC38881rL {
    public static FriendshipStatusImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            Boolean bool13 = null;
            Boolean bool14 = null;
            Boolean bool15 = null;
            Boolean bool16 = null;
            Boolean bool17 = null;
            Boolean bool18 = null;
            Boolean bool19 = null;
            Boolean bool20 = null;
            Boolean bool21 = null;
            Boolean bool22 = null;
            Boolean bool23 = null;
            Integer num = null;
            Boolean bool24 = null;
            Boolean bool25 = null;
            Boolean bool26 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("blocking".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("followed_by".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("following".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("incoming_request".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("is_banner_profile_upsell".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                } else if ("is_bestie".equals(A0q)) {
                    bool6 = Boolean.valueOf(c16l.A0d());
                } else if ("is_blocking_reel".equals(A0q)) {
                    bool7 = Boolean.valueOf(c16l.A0d());
                } else if ("is_eligible_to_subscribe".equals(A0q)) {
                    bool8 = Boolean.valueOf(c16l.A0d());
                } else if ("is_fb_friends".equals(A0q)) {
                    bool9 = Boolean.valueOf(c16l.A0d());
                } else if ("is_feed_favorite".equals(A0q)) {
                    bool10 = Boolean.valueOf(c16l.A0d());
                } else if ("is_group_creation_reachable".equals(A0q)) {
                    bool11 = Boolean.valueOf(c16l.A0d());
                } else if ("is_messaging_only_blocking".equals(A0q)) {
                    bool12 = Boolean.valueOf(c16l.A0d());
                } else if ("is_messaging_pseudo_blocking".equals(A0q)) {
                    bool13 = Boolean.valueOf(c16l.A0d());
                } else if ("is_muting_friend_map".equals(A0q)) {
                    bool14 = Boolean.valueOf(c16l.A0d());
                } else if ("is_muting_media_notes".equals(A0q)) {
                    bool15 = Boolean.valueOf(c16l.A0d());
                } else if ("is_muting_notes".equals(A0q)) {
                    bool16 = Boolean.valueOf(c16l.A0d());
                } else if ("is_muting_reel".equals(A0q)) {
                    bool17 = Boolean.valueOf(c16l.A0d());
                } else if ("is_private".equals(A0q)) {
                    bool18 = Boolean.valueOf(c16l.A0d());
                } else if ("is_restricted".equals(A0q)) {
                    bool19 = Boolean.valueOf(c16l.A0d());
                } else if ("is_unavailable".equals(A0q)) {
                    bool20 = Boolean.valueOf(c16l.A0d());
                } else if ("is_viewer_unconnected".equals(A0q)) {
                    bool21 = Boolean.valueOf(c16l.A0d());
                } else if ("muting".equals(A0q)) {
                    bool22 = Boolean.valueOf(c16l.A0d());
                } else if ("outgoing_request".equals(A0q)) {
                    bool23 = Boolean.valueOf(c16l.A0d());
                } else if ("reachability_status".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("should_show_profile_upsell".equals(A0q)) {
                    bool24 = Boolean.valueOf(c16l.A0d());
                } else if ("subscribed".equals(A0q)) {
                    bool25 = Boolean.valueOf(c16l.A0d());
                } else if ("text_post_app_pre_following".equals(A0q)) {
                    bool26 = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            return new FriendshipStatusImpl(bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, bool20, bool21, bool22, bool23, bool24, bool25, bool26, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, FriendshipStatusImpl friendshipStatusImpl) {
        anonymousClass182.A0d();
        Boolean bool = friendshipStatusImpl.A00;
        if (bool != null) {
            anonymousClass182.A0T("blocking", bool.booleanValue());
        }
        Boolean bool2 = friendshipStatusImpl.A01;
        if (bool2 != null) {
            anonymousClass182.A0T("followed_by", bool2.booleanValue());
        }
        Boolean bool3 = friendshipStatusImpl.A02;
        if (bool3 != null) {
            anonymousClass182.A0T("following", bool3.booleanValue());
        }
        Boolean bool4 = friendshipStatusImpl.A03;
        if (bool4 != null) {
            anonymousClass182.A0T("incoming_request", bool4.booleanValue());
        }
        Boolean bool5 = friendshipStatusImpl.A04;
        if (bool5 != null) {
            anonymousClass182.A0T("is_banner_profile_upsell", bool5.booleanValue());
        }
        Boolean bool6 = friendshipStatusImpl.A05;
        if (bool6 != null) {
            anonymousClass182.A0T("is_bestie", bool6.booleanValue());
        }
        Boolean bool7 = friendshipStatusImpl.A06;
        if (bool7 != null) {
            anonymousClass182.A0T("is_blocking_reel", bool7.booleanValue());
        }
        Boolean bool8 = friendshipStatusImpl.A07;
        if (bool8 != null) {
            anonymousClass182.A0T("is_eligible_to_subscribe", bool8.booleanValue());
        }
        Boolean bool9 = friendshipStatusImpl.A08;
        if (bool9 != null) {
            anonymousClass182.A0T("is_fb_friends", bool9.booleanValue());
        }
        Boolean bool10 = friendshipStatusImpl.A09;
        if (bool10 != null) {
            anonymousClass182.A0T("is_feed_favorite", bool10.booleanValue());
        }
        Boolean bool11 = friendshipStatusImpl.A0A;
        if (bool11 != null) {
            anonymousClass182.A0T("is_group_creation_reachable", bool11.booleanValue());
        }
        Boolean bool12 = friendshipStatusImpl.A0B;
        if (bool12 != null) {
            anonymousClass182.A0T("is_messaging_only_blocking", bool12.booleanValue());
        }
        Boolean bool13 = friendshipStatusImpl.A0C;
        if (bool13 != null) {
            anonymousClass182.A0T("is_messaging_pseudo_blocking", bool13.booleanValue());
        }
        Boolean bool14 = friendshipStatusImpl.A0D;
        if (bool14 != null) {
            anonymousClass182.A0T("is_muting_friend_map", bool14.booleanValue());
        }
        Boolean bool15 = friendshipStatusImpl.A0E;
        if (bool15 != null) {
            anonymousClass182.A0T("is_muting_media_notes", bool15.booleanValue());
        }
        Boolean bool16 = friendshipStatusImpl.A0F;
        if (bool16 != null) {
            anonymousClass182.A0T("is_muting_notes", bool16.booleanValue());
        }
        Boolean bool17 = friendshipStatusImpl.A0G;
        if (bool17 != null) {
            anonymousClass182.A0T("is_muting_reel", bool17.booleanValue());
        }
        Boolean bool18 = friendshipStatusImpl.A0H;
        if (bool18 != null) {
            anonymousClass182.A0T("is_private", bool18.booleanValue());
        }
        Boolean bool19 = friendshipStatusImpl.A0I;
        if (bool19 != null) {
            anonymousClass182.A0T("is_restricted", bool19.booleanValue());
        }
        Boolean bool20 = friendshipStatusImpl.A0J;
        if (bool20 != null) {
            anonymousClass182.A0T("is_unavailable", bool20.booleanValue());
        }
        Boolean bool21 = friendshipStatusImpl.A0K;
        if (bool21 != null) {
            anonymousClass182.A0T("is_viewer_unconnected", bool21.booleanValue());
        }
        Boolean bool22 = friendshipStatusImpl.A0L;
        if (bool22 != null) {
            anonymousClass182.A0T("muting", bool22.booleanValue());
        }
        Boolean bool23 = friendshipStatusImpl.A0M;
        if (bool23 != null) {
            anonymousClass182.A0T("outgoing_request", bool23.booleanValue());
        }
        Integer num = friendshipStatusImpl.A0Q;
        if (num != null) {
            anonymousClass182.A0Q("reachability_status", num.intValue());
        }
        Boolean bool24 = friendshipStatusImpl.A0N;
        if (bool24 != null) {
            anonymousClass182.A0T("should_show_profile_upsell", bool24.booleanValue());
        }
        Boolean bool25 = friendshipStatusImpl.A0O;
        if (bool25 != null) {
            anonymousClass182.A0T("subscribed", bool25.booleanValue());
        }
        Boolean bool26 = friendshipStatusImpl.A0P;
        if (bool26 != null) {
            anonymousClass182.A0T("text_post_app_pre_following", bool26.booleanValue());
        }
        anonymousClass182.A0a();
    }
}
