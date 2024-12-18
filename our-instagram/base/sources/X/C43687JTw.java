package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.JTw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43687JTw {
    public static final C43687JTw A00 = new Object();

    public static final void A00(Activity activity, View view, UserSession userSession) {
        int i;
        View findViewById;
        C14360o3.A0B(userSession, 1);
        A01(activity, view, userSession, AbstractC52812bN.A00(activity), AbstractC13890nF.A01(activity));
        View findViewById2 = activity.findViewById(R.id.direct_inbox_null_state);
        if (findViewById2 != null) {
            if (A03(activity, userSession) && ((findViewById = activity.findViewById(R.id.layout_direct_thread)) == null || findViewById.findViewById(R.id.thread_fragment_container) == null)) {
                i = 0;
            } else {
                i = 8;
            }
            findViewById2.setVisibility(i);
        }
    }

    public static final void A01(Activity activity, View view, UserSession userSession, Integer num, int i) {
        View findViewById;
        if (AbstractC52812bN.A02(num)) {
            if (view == null || (findViewById = view.findViewById(R.id.layout_container_direct_wrapper)) == null) {
                findViewById = activity.findViewById(R.id.layout_container_direct_wrapper);
            }
            if (C18U.A06(C06090Tz.A05, userSession, 36320197665104000L) && findViewById != null) {
                C14360o3.A0B(num, 0);
                if (num == C05F.A0C) {
                    i /= 3;
                } else {
                    View findViewById2 = activity.findViewById(R.id.layout_direct_thread);
                    if (findViewById2 != null && findViewById2.findViewById(R.id.thread_fragment_container) != null) {
                        i /= 2;
                    }
                }
                View findViewById3 = activity.findViewById(R.id.ls_nav_bar);
                Rect A0U = AbstractC166987dD.A0U();
                AbstractC43592JPx.A08(activity).getHitRect(A0U);
                if (findViewById3 != null && findViewById3.getLocalVisibleRect(A0U)) {
                    try {
                        i -= activity.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_material);
                    } catch (Resources.NotFoundException unused) {
                    }
                }
                AbstractC13880nE.A0g(findViewById, i);
            }
        }
    }

    public static final boolean A02(Activity activity) {
        View findViewById = activity.findViewById(R.id.layout_direct_sliding_pane);
        Rect A0U = AbstractC166987dD.A0U();
        AbstractC43592JPx.A08(activity).getHitRect(A0U);
        if (findViewById != null) {
            return findViewById.getLocalVisibleRect(A0U);
        }
        return false;
    }

    public static final boolean A03(Context context, UserSession userSession) {
        AbstractC167017dG.A1N(context, userSession);
        if (C18U.A06(C06090Tz.A05, userSession, 36320197665104000L) && AbstractC52812bN.A02(AbstractC52812bN.A00(context))) {
            return true;
        }
        return false;
    }
}
