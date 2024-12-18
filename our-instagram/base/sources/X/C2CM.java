package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;

/* renamed from: X.2CM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CM {
    public final C006802i A00;
    public final C2CJ A01;

    public final void A00(C4SH c4sh, String str, String str2, String str3, String str4, int i) {
        String str5;
        C14360o3.A0B(str4, 4);
        C2CJ c2cj = this.A01;
        if (c2cj.A00()) {
            C2CG c2cg = C2CF.A0D;
            int hashCode = str.hashCode();
            C006802i c006802i = this.A00;
            if (!c006802i.isMarkerOn(1900557, hashCode) && c2cj.A00()) {
                c006802i.markerStart(1900557, hashCode);
            }
            String A00 = AbstractC95664Sa.A00(c4sh);
            C75363a3 c75363a3 = c4sh.A04;
            boolean z = c4sh.A0Q;
            HashMap hashMap = new HashMap();
            hashMap.put("player_type", A00);
            hashMap.put("player_origin", str4);
            hashMap.put("video_id", str);
            hashMap.put("original_play_reason", str2);
            if (str3 != null) {
                hashMap.put("viewer_session_id", str3);
            }
            hashMap.put("requested_playing_start_video_time_position_ms", String.valueOf(i));
            if (C14360o3.A0K(A00, "live")) {
                str5 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str5 = "0";
            }
            hashMap.put("is_live_streaming", str5);
            if (c75363a3 != null) {
                hashMap.put("streaming_format", AbstractC92554Cp.A00(c75363a3));
            }
            hashMap.put("is_sponsored", String.valueOf(z));
            hashMap.put("app_startup_time_bucket", String.valueOf(C1CC.A00()));
            hashMap.put("app_startup_type", C1CC.A09.toString());
            c2cg.A03(1900557, hashCode, hashMap);
        }
    }

    public C2CM(C006802i c006802i, C2CJ c2cj) {
        this.A00 = c006802i;
        this.A01 = c2cj;
    }
}
