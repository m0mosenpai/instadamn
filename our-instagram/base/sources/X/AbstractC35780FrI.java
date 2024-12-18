package X;

import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.FrI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35780FrI implements CallerContextable {
    public static final String __redex_internal_original_name = "SwitchToBusinessUtil";

    public static final C25621Ms A00(UserSession userSession, EnumC222416a enumC222416a, String str) {
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("business/account/convert_account/");
        A0c.A9s(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A0c.A0R(C2045893s.class, C2046093u.class);
        A0c.A0I("creator_destination_migration", enumC222416a == EnumC222416a.A06);
        if (enumC222416a != EnumC222416a.A08) {
            A0c.A9s("to_account_type", String.valueOf(enumC222416a.A00));
        }
        return A0c;
    }
}
