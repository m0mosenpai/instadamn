package X;

import android.app.Activity;
import android.app.KeyguardManager;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.activity.RtcCallActivity;

/* loaded from: classes9.dex */
public final class OGQ {
    public final void A00(Context context, UserSession userSession, Long l) {
        Intent A01;
        Intent A08 = MSW.A08(context, RtcCallActivity.class);
        AbstractC31173DnH.A18(A08, userSession);
        A08.setExtrasClassLoader(RtcCallActivity.class.getClassLoader());
        A08.addFlags(75563008);
        if (AbstractC13320mI.A00(context, Activity.class) == null) {
            A08.addFlags(268435456);
        }
        A08.putExtra("rtc_call_activity_arguments_key_notification_trace_id", l);
        if (!((KeyguardManager) MSZ.A0j(context)).isKeyguardLocked() && C218914p.A08()) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36328594326240924L)) {
                if (C18U.A06(c06090Tz, userSession, 36328594326175387L)) {
                    A01 = AbstractC34770FTt.A00(context, "all", "direct-inbox", null, 335544320);
                } else {
                    A01 = C14H.A03.A00().A01(context);
                }
                C14360o3.A0A(A01);
                TaskStackBuilder.create(context).addNextIntentWithParentStack(A01).addNextIntent(A08).startActivities();
                return;
            }
        }
        C12260kU.A0C(context, A08);
    }
}
