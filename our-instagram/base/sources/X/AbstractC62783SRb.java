package X;

import android.media.MediaCodecInfo;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.SRb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62783SRb {
    public static void A00(MediaCodecInfo.VideoCapabilities videoCapabilities, JSONObject jSONObject) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        JSONArray A0p = AbstractC31171DnF.A0p();
        if (supportedPerformancePoints != null) {
            Iterator<MediaCodecInfo.VideoCapabilities.PerformancePoint> it = supportedPerformancePoints.iterator();
            while (it.hasNext()) {
                A0p.put(it.next().toString());
            }
        }
        jSONObject.put("performance_point", A0p);
    }

    public static void A01(MediaCodecInfo mediaCodecInfo, JSONObject jSONObject) {
        jSONObject.put("vendor", mediaCodecInfo.isVendor());
        jSONObject.put("is_hw", mediaCodecInfo.isHardwareAccelerated());
        jSONObject.put("is_sw_only", mediaCodecInfo.isSoftwareOnly());
        jSONObject.put("is_alias", mediaCodecInfo.isAlias());
    }
}
