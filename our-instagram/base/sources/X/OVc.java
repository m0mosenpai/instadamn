package X;

import android.os.Build;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* loaded from: classes9.dex */
public final class OVc {
    public final O6A A00;
    public volatile String A01;

    public static void A00(StringBuilder sb) {
        if (sb.length() != 1) {
            sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        }
    }

    public final void A01(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder("{");
        A00(sb);
        AbstractC62283S5c.A00(sb, "broadcast_transition_from");
        sb.append(":");
        AbstractC62283S5c.A00(sb, str);
        A00(sb);
        AbstractC62283S5c.A00(sb, "broadcast_transition_to");
        sb.append(":");
        AbstractC62283S5c.A00(sb, str2);
        A00(sb);
        AbstractC62283S5c.A00(sb, "broadcast_transition_reason");
        sb.append(":");
        AbstractC62283S5c.A00(sb, str3);
        if (str4 != null) {
            A00(sb);
            AbstractC62283S5c.A00(sb, "facecast_event_extra");
            sb.append(":");
            AbstractC62283S5c.A00(sb, str4);
        }
        String str5 = Build.VERSION.RELEASE;
        A00(sb);
        AbstractC62283S5c.A00(sb, "base_system_version");
        sb.append(":");
        AbstractC62283S5c.A00(sb, str5);
        String str6 = this.A01;
        if (str6 != null) {
            A00(sb);
            AbstractC62283S5c.A00(sb, TraceFieldType.BroadcastId);
            sb.append(":");
            AbstractC62283S5c.A00(sb, str6);
        }
        O6A o6a = this.A00;
        String A0x = AbstractC166997dE.A0x("}", sb);
        sb.deleteCharAt(sb.length() - 1);
        C14360o3.A07(A0x);
        o6a.A00.logEvent("facecast_broadcaster_update", A0x);
    }

    public OVc(O6A o6a) {
        this.A00 = o6a;
    }
}
