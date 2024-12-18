package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.RtcIgNotification;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1W4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1W4 {
    public final String A00;
    public static final C1W5 A02 = new Object();
    public static final long A01 = TimeUnit.MINUTES.toMillis(1);

    public static final C19280xC A00(RtcCallKey rtcCallKey, C1W4 c1w4, Integer num, Integer num2, String str, String str2, String str3, String str4) {
        Integer num3 = C05F.A00;
        if (num2 != num3) {
            num3 = C05F.A01;
        }
        C19280xC A012 = A01(C7T3.A0M, c1w4, num, str, null, rtcCallKey.A00, str2, str3, str4, null);
        A012.A0C("notification_type", AbstractC54162Nwy.A00(num3));
        A012.A0C("push_type", "mqtt");
        return A012;
    }

    public final void A03(RtcIgNotification rtcIgNotification, Integer num, String str, String str2, String str3, String str4) {
        String str5;
        C19280xC A022 = A02(rtcIgNotification, this, C05F.A01, str4, str, str2, str3, null);
        if (A022 == null) {
            return;
        }
        switch (num.intValue()) {
            case 0:
                str5 = "not logged in";
                break;
            case 1:
                str5 = "not supported";
                break;
            case 2:
                str5 = "not active user";
                break;
            case 3:
                str5 = DialogModule.ACTION_DISMISSED;
                break;
            case 4:
                str5 = "foreground and dnd";
                break;
            default:
                str5 = "background and dnd";
                break;
        }
        A022.A0C("reason", str5);
        C1W5.A00(A022, rtcIgNotification.A02);
        C1W5.A01(rtcIgNotification);
    }

    public static final C19280xC A01(C7T3 c7t3, C1W4 c1w4, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8;
        C19280xC A012 = C19280xC.A01("ig_video_call_notification_waterfall", c7t3.A00);
        A012.A0C("waterfall_id", AnonymousClass001.A0j(str2, str, c1w4.A00, '_', '_'));
        switch (num.intValue()) {
            case 0:
                str8 = "notif_received";
                break;
            case 1:
                str8 = "notif_ignored";
                break;
            case 2:
                str8 = "notif_displayed";
                break;
            case 3:
                str8 = "notif_action";
                break;
            case 4:
                str8 = "incoming_call_screen_displayed";
                break;
            case 5:
                str8 = "ring_response_success";
                break;
            default:
                str8 = "ring_response_failure";
                break;
        }
        A012.A0C(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str8);
        A012.A0C(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str4);
        A012.A0C("open_thread_id", str5);
        A012.A0C("armadillo_thread_id", str6);
        A012.A0C("occamadillo_thread_id", str7);
        if (str2 != null && str2.length() != 0) {
            A012.A0C("video_call_id", str2);
            return A012;
        }
        A012.A0C("server_info_data", str3);
        return A012;
    }

    public static final C19280xC A02(RtcIgNotification rtcIgNotification, C1W4 c1w4, Integer num, String str, String str2, String str3, String str4, String str5) {
        String str6 = str2;
        String str7 = rtcIgNotification.A01;
        if (str7 == null) {
            return null;
        }
        android.net.Uri A03 = AbstractC08820cl.A03(str7);
        C14360o3.A07(A03);
        String str8 = rtcIgNotification.A02;
        String queryParameter = A03.getQueryParameter("vc_id");
        String queryParameter2 = A03.getQueryParameter("surface_id");
        C7T3 c7t3 = C7T3.A0O;
        if (str2 == null) {
            str6 = queryParameter2;
        }
        C19280xC A012 = A01(c7t3, c1w4, num, str8, queryParameter, str, str6, str3, str4, str5);
        A012.A0C("notification_id", A03.getQueryParameter("push_notification_id"));
        A012.A0C("notification_type", AbstractC54162Nwy.A00(A2I.A00(rtcIgNotification.A00)));
        String queryParameter3 = A03.getQueryParameter(TraceFieldType.StartTime);
        long j = -1;
        if (queryParameter3 != null) {
            try {
                j = Long.parseLong(queryParameter3);
            } catch (NumberFormatException unused) {
            }
        }
        A012.A0B("server_job_start_time", Long.valueOf(j));
        A012.A0C("push_type", "normal");
        return A012;
    }

    public C1W4(String str) {
        this.A00 = str;
    }
}
