package org.webrtc;

import X.AbstractC37301Gc2;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes10.dex */
public class VideoCodecInfo {
    public static final String ENCODER_EGL_MAKE_CURRENT_ON_ENCODE_ENABLED = "encoder-egl-make-current-on-encode-enabled";
    public static final String ENCODER_RESCALING_ENABLED = "encoder-rescaling-enabled";
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
    public static final String INIT_FRAMERATE = "init-frame-rate";
    public static final String ROI_ENABLEMENT = "roi-enablement";
    public final String name;
    public final Map params;

    @Deprecated
    public final int payload;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoCodecInfo)) {
            return false;
        }
        VideoCodecInfo videoCodecInfo = (VideoCodecInfo) obj;
        return this.name.equalsIgnoreCase(videoCodecInfo.name) && this.params.equals(videoCodecInfo.params);
    }

    public String getName() {
        return this.name;
    }

    public Map getParams() {
        return this.params;
    }

    public int hashCode() {
        return AbstractC37301Gc2.A02(this.name.toUpperCase(Locale.ROOT), this.params);
    }

    public VideoCodecInfo(String str, Map map) {
        this.payload = 0;
        this.name = str;
        this.params = map;
    }

    @Deprecated
    public VideoCodecInfo(int i, String str, Map map) {
        this.payload = i;
        this.name = str;
        this.params = map;
    }
}
