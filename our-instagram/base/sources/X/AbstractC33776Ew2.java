package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ew2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33776Ew2 {
    public static final Drawable A00(Context context, UserSession userSession) {
        Drawable drawable;
        C06090Tz A0j = AbstractC25225BEi.A0j(userSession, 1);
        if (C18U.A06(A0j, userSession, 36325278612206558L)) {
            drawable = context.getDrawable(R.drawable.ig_avatars_style_2_g6_casual_alpha_style2);
            if (drawable == null) {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else if (C18U.A06(A0j, userSession, 36322190529931313L)) {
            drawable = context.getDrawable(R.drawable.ig_avatar_assets_avatar_nux_sp);
            if (drawable == null) {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            drawable = context.getDrawable(R.drawable.ig_avatar_assets_avatar_nux_static);
            if (drawable == null) {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        return drawable;
    }
}
