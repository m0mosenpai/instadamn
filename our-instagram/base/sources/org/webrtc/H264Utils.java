package org.webrtc;

import X.AbstractC166987dD;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public class H264Utils {
    public static VideoCodecInfo DEFAULT_H264_BASELINE_PROFILE_CODEC = new VideoCodecInfo("H264", getDefaultH264Params(false));
    public static VideoCodecInfo DEFAULT_H264_HIGH_PROFILE_CODEC = new VideoCodecInfo("H264", getDefaultH264Params(true));
    public static final String H264_CONSTRAINED_BASELINE_3_1 = "42e01f";
    public static final String H264_CONSTRAINED_HIGH_3_1 = "640c1f";
    public static final String H264_CONSTRAINED_HIGH_4_1 = "640c29";
    public static final String H264_FMTP_LEVEL_ASYMMETRY_ALLOWED = "level-asymmetry-allowed";
    public static final String H264_FMTP_PACKETIZATION_MODE = "packetization-mode";
    public static final String H264_FMTP_PROFILE_LEVEL_ID = "profile-level-id";
    public static final String H264_LEVEL_3_1 = "1f";
    public static final String H264_LEVEL_4_1 = "29";
    public static final String H264_PROFILE_CONSTRAINED_BASELINE = "42e0";
    public static final String H264_PROFILE_CONSTRAINED_HIGH = "640c";

    public static native boolean nativeIsSameH264Profile(Map map, Map map2);

    public static Map getDefaultH264Params(boolean z) {
        String str;
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("level-asymmetry-allowed", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A1G.put("packetization-mode", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        if (z) {
            str = "640c1f";
        } else {
            str = "42e01f";
        }
        A1G.put("profile-level-id", str);
        return A1G;
    }

    public static boolean isSameH264Profile(Map map, Map map2) {
        return nativeIsSameH264Profile(map, map2);
    }
}
