package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.android.maps.StaticMapView$StaticMapOptions;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.maps.ui.IgStaticMapView;

/* renamed from: X.Doc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31254Doc {
    public static final String A00(Context context, double d, double d2) {
        C14360o3.A0B(context, 0);
        StaticMapView$StaticMapOptions staticMapView$StaticMapOptions = new StaticMapView$StaticMapOptions("review_suspicious_login_map");
        staticMapView$StaticMapOptions.A01(d, d2);
        staticMapView$StaticMapOptions.A03(11);
        return AbstractC166987dD.A19(IgStaticMapView.A00(context.getResources(), staticMapView$StaticMapOptions, C2TD.A03, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION));
    }

    public static final void A01(UserSession userSession, FragmentActivity fragmentActivity) {
        AbstractC167007dF.A1K(userSession, fragmentActivity);
        if (AbstractC31177DnL.A1W(userSession)) {
            C35256Fgp.A05((IgFragmentActivity) fragmentActivity, AbstractC31171DnF.A0D("login_notification"), userSession, "login_activities", "login_activities", false);
        } else {
            AbstractC31177DnL.A16(new N7U(), fragmentActivity, userSession);
        }
    }
}
