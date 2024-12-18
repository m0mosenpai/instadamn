package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.SRc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62784SRc {
    public static String A00(boolean z) {
        String str;
        JSONArray A0p = AbstractC31171DnF.A0p();
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            if (supportedTypes != null && supportedTypes.length != 0 && (str = supportedTypes[0]) != null && true == str.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND) && z == mediaCodecInfo.isEncoder()) {
                try {
                    JSONObject A0q = AbstractC31171DnF.A0q();
                    A0q.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, mediaCodecInfo.getName());
                    A0q.put("support_types", new JSONArray(mediaCodecInfo.getSupportedTypes()));
                    if (Build.VERSION.SDK_INT >= 29) {
                        AbstractC62783SRb.A01(mediaCodecInfo, A0q);
                    }
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                    JSONArray A0p2 = AbstractC31171DnF.A0p();
                    JSONArray A0p3 = AbstractC31171DnF.A0p();
                    if (capabilitiesForType != null) {
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                            A0p2.put(codecProfileLevel.profile);
                            A0p3.put(codecProfileLevel.level);
                        }
                    }
                    A0q.put("profiles", A0p2);
                    A0q.put("levels", A0p3);
                    A0p.put(A0q);
                } catch (Throwable unused) {
                }
            }
        }
        String obj = A0p.toString();
        if (obj == null) {
            return "[]";
        }
        return obj;
    }

    public static String A01(boolean z) {
        String[] strArr = {"video/hevc", "video/avc", "video/x-vnd.on2.vp9", "video/x-vnd.on2.vp8", "video/av01"};
        JSONObject A0q = AbstractC31171DnF.A0q();
        for (int i = 0; i < 5; i++) {
            String str = strArr[i];
            try {
                JSONArray A0p = AbstractC31171DnF.A0p();
                for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
                    if (Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str) && z == mediaCodecInfo.isEncoder()) {
                        try {
                            JSONObject A0q2 = AbstractC31171DnF.A0q();
                            A0q2.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, mediaCodecInfo.getName());
                            int i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 29) {
                                AbstractC62783SRb.A01(mediaCodecInfo, A0q2);
                            }
                            for (String str2 : mediaCodecInfo.getSupportedTypes()) {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str2);
                                if (capabilitiesForType != null) {
                                    A0q2.put("max_supported_instances", capabilitiesForType.getMaxSupportedInstances());
                                    if (z) {
                                        MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
                                        if (encoderCapabilities != null) {
                                            A0q2.put("complexity_range", encoderCapabilities.getComplexityRange());
                                            JSONArray A0p2 = AbstractC31171DnF.A0p();
                                            if (encoderCapabilities.isBitrateModeSupported(2)) {
                                                A0p2.put("CBR");
                                            }
                                            if (encoderCapabilities.isBitrateModeSupported(1)) {
                                                A0p2.put("VBR");
                                            }
                                            if (encoderCapabilities.isBitrateModeSupported(0)) {
                                                A0p2.put("CQ");
                                            }
                                            A0q2.put("bitrate_mode", A0p2);
                                            if (i2 >= 29) {
                                                A0q2.put("quality_range", encoderCapabilities.getQualityRange());
                                            }
                                        }
                                    } else {
                                        MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                                        if (videoCapabilities != null) {
                                            A0q2.put("supported_frame_rates", videoCapabilities.getSupportedFrameRates());
                                            A0q2.put("bitrate_range", videoCapabilities.getBitrateRange());
                                            A0q2.put("supported_heights", videoCapabilities.getSupportedHeights());
                                            A0q2.put("supported_widths", videoCapabilities.getSupportedWidths());
                                            if (i2 >= 29) {
                                                AbstractC62783SRb.A00(videoCapabilities, A0q2);
                                            }
                                        }
                                    }
                                }
                            }
                            A0p.put(A0q2);
                        } catch (Throwable unused) {
                        }
                    }
                }
                A0q.put(str, A0p);
            } catch (Throwable unused2) {
            }
        }
        return A0q.toString();
    }
}
