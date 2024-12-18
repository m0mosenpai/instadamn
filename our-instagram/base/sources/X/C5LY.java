package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.5LY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5LY {
    public static final C5LY A00 = new Object();

    public static final boolean A00(UserSession userSession, C38321qM c38321qM, String str) {
        if (!str.equals("feed_timeline") && ((!str.equals("feed_contextual_chain") && !str.equals("feed_contextual_profile")) || !C18U.A06(C06090Tz.A05, userSession, 36326511267362738L))) {
            return false;
        }
        boolean CdW = c38321qM.CdW();
        C06090Tz c06090Tz = C06090Tz.A05;
        if (CdW) {
            boolean A06 = C18U.A06(c06090Tz, userSession, 36326511267231664L);
            C14360o3.A0A(Boolean.valueOf(A06));
            return A06;
        }
        if (C18U.A06(c06090Tz, userSession, 2342169520481122227L) && C18U.A06(c06090Tz, userSession, 36326511267231664L)) {
            return true;
        }
        return false;
    }

    public final int A01(Context context, UserSession userSession, C38321qM c38321qM, String str) {
        Resources resources;
        int i;
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(str, 3);
        if (C5LV.A00.A06(userSession, c38321qM, str)) {
            resources = context.getResources();
            i = R.dimen.audience_selector_pill_layout_height;
        } else {
            if (A00(userSession, c38321qM, str)) {
                return (int) AbstractC13880nE.A04(context, (int) C18U.A00(C06090Tz.A05, userSession, 37170936197153311L));
            }
            resources = context.getResources();
            i = R.dimen.account_group_management_title_text_horizontal_padding;
        }
        return resources.getDimensionPixelSize(i);
    }
}
