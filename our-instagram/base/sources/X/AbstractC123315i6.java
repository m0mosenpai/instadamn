package X;

import android.app.Activity;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5i6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC123315i6 {
    public static final void A00(Activity activity, View view, ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, UserSession userSession) {
        InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
        boolean z = false;
        if (interfaceC19630xq.getInt("preference_feed_picker_nux_count", 0) < 3) {
            z = true;
        }
        boolean z2 = false;
        if (System.currentTimeMillis() - interfaceC19630xq.getLong("preference_feed_picker_nux_last_seen_time", 0L) > TimeUnit.DAYS.toMillis(1L)) {
            z2 = true;
        }
        if (z && z2 && viewOnTouchListenerC60632pm.A01 < 2.0f && C18U.A06(C06090Tz.A05, userSession, 2342156884689029405L)) {
            String string = activity.getString(2131962497);
            C14360o3.A07(string);
            C5SU c5su = new C5SU(activity, new C149686oL(string));
            c5su.A04(view, 0, activity.getResources().getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap), true);
            c5su.A04 = new P3Y(userSession);
            c5su.A07(C5SV.A07);
            c5su.A00().A07(userSession);
        }
    }
}
