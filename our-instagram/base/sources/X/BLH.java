package X;

import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class BLH {
    public static final boolean A01(SocialContextType socialContextType, UserSession userSession) {
        C14360o3.A0B(socialContextType, 1);
        int ordinal = socialContextType.ordinal();
        if (ordinal != 9) {
            if (ordinal != 3) {
                return false;
            }
            return C18U.A06(C06090Tz.A05, userSession, 36329586463687072L);
        }
        return A03(userSession);
    }

    public static final boolean A05(UserSession userSession, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 0);
        if (!z && !z2) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36322774646073860L) || C18U.A06(c06090Tz, userSession, 36322774646598155L) || C18U.A06(c06090Tz, userSession, 36326064591287926L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final List A00() {
        return AbstractC16960so.A1Q("ig_android_clips_friendly_viewer.floaty_bubble_diameter", "ig_android_clips_friendly_viewer.hype_style_comment_bubble_enabled", "ig_android_clips_friendly_viewer.is_comment_preview_style_enabled", "ig_android_clips_friendly_viewer.is_floaty_comments_enabled", "ig_android_clips_friendly_viewer.is_floaty_likes_enabled", "ig_android_clips_friendly_viewer.preview_comments_disabled", "ig_android_clips_friendly_viewer.preview_comments_enabled_with_likes", "ig_android_clips_friendly_viewer.should_hide_attribution_hub", "ig_android_clips_friendly_viewer.should_hide_social_context_when_bubbles_showing", "ig_android_clips_friendly_viewer.show_only_high_value_bubbles", "ig_android_clips_friendly_viewer.is_bubble_positioned_under_caption");
    }

    public static final boolean A03(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36329586463621535L) && !C18U.A06(c06090Tz, userSession, 36329586463883681L)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession) {
        return C14360o3.A0K(C18U.A04(AbstractC166997dE.A0U(userSession), userSession, 36892536417158087L), "below_caption");
    }

    public static final boolean A04(UserSession userSession) {
        C06090Tz A0U = AbstractC166997dE.A0U(userSession);
        if (!C18U.A06(A0U, userSession, 36322774646270470L) && !C18U.A06(A0U, userSession, 36326064591353463L)) {
            return false;
        }
        return true;
    }
}
