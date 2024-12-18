package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcEnterCallArgs;
import com.instagram.rtc.activity.RtcCallIntentHandlerActivity;

/* renamed from: X.Nwj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54147Nwj {
    public static final Intent A00(Context context, UserSession userSession, RtcEnterCallArgs rtcEnterCallArgs) {
        C14360o3.A0B(context, 0);
        Intent A08 = MSW.A08(context, RtcCallIntentHandlerActivity.class);
        A08.setAction("rtc_call_activity_intent_action_create_or_join_call");
        A08.setData(AbstractC54066NvQ.A00("video_call_incoming", rtcEnterCallArgs.Bye().A02.A02));
        AbstractC31173DnH.A18(A08, userSession);
        A08.putExtra("rtc_call_activity_arguments_key_enter_call_args", rtcEnterCallArgs);
        return A08;
    }
}
