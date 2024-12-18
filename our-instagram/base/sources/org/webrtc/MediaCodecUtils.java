package org.webrtc;

import X.AbstractC166987dD;
import X.AbstractC37303Gc4;
import X.MSY;
import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.Map;

/* loaded from: classes10.dex */
public class MediaCodecUtils {
    public static final String ADAPTIVE_PLAYBACK_ENABLED = "fb-adaptive-playback-enabled";
    public static final String EXYNOS_PREFIX = "OMX.Exynos.";
    public static final String INTEL_PREFIX = "OMX.Intel.";
    public static final String MAXIMUM_OPERATING_RATE = "fb-maximum-operating-rate";
    public static final String MS_PREFIX = "OMX.MS.";
    public static final String MTK_PREFIX = "OMX.MTK.";
    public static final String NVIDIA_PREFIX = "OMX.Nvidia.";
    public static final String QCOM_PREFIX = "OMX.qcom.";
    public static final String TAG = "MediaCodecUtils";
    public static final String[] SOFTWARE_IMPLEMENTATION_PREFIXES = {"OMX.google.", "OMX.SEC.", "c2.android"};
    public static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka = 2141391873;
    public static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka = 2141391874;
    public static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka = 2141391875;
    public static final int COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m = 2141391876;
    public static final int[] DECODER_COLOR_FORMATS = {19, 21, 2141391872, COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka, COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka, COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka, COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m};
    public static final int[] ENCODER_COLOR_FORMATS = {19, 21, 2141391872, COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m};
    public static final int[] TEXTURE_COLOR_FORMATS = {2130708361};

    public static Integer selectColorFormat(int[] iArr, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        for (int i : iArr) {
            for (int i2 : codecCapabilities.colorFormats) {
                if (i2 == i) {
                    return Integer.valueOf(i2);
                }
            }
        }
        return null;
    }

    /* renamed from: org.webrtc.MediaCodecUtils$1, reason: invalid class name */
    /* loaded from: classes10.dex */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$webrtc$VideoCodecMimeType;

        static {
            int[] iArr = new int[VideoCodecMimeType.values().length];
            $SwitchMap$org$webrtc$VideoCodecMimeType = iArr;
            try {
                MSY.A1I(VideoCodecMimeType.VP8, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                MSY.A1J(VideoCodecMimeType.VP9, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MSY.A1K(VideoCodecMimeType.H265, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MSY.A1L(VideoCodecMimeType.H264, iArr);
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static boolean codecSupportsAdaptivePlayback(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean isHardwareAccelerated(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return isHardwareAcceleratedQOrHigher(mediaCodecInfo);
        }
        return !isSoftwareOnly(mediaCodecInfo);
    }

    public static boolean isSoftwareOnly(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return isSoftwareOnlyQOrHigher(mediaCodecInfo);
        }
        String name = mediaCodecInfo.getName();
        for (String str : SOFTWARE_IMPLEMENTATION_PREFIXES) {
            if (name.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean codecSupportsType(MediaCodecInfo mediaCodecInfo, VideoCodecMimeType videoCodecMimeType) {
        for (String str : mediaCodecInfo.getSupportedTypes()) {
            if (videoCodecMimeType.mimeType().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static Map getCodecProperties(VideoCodecMimeType videoCodecMimeType, boolean z) {
        int ordinal = videoCodecMimeType.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 4) {
            if (ordinal == 2) {
                return H264Utils.getDefaultH264Params(z);
            }
            throw AbstractC37303Gc4.A0M(videoCodecMimeType, "Unsupported codec: ", AbstractC166987dD.A1C());
        }
        return AbstractC166987dD.A1G();
    }

    public static int[] getTextureColorFormats() {
        return new int[]{2130708361};
    }

    public static boolean isHardwareAcceleratedQOrHigher(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean isSoftwareOnlyQOrHigher(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }
}
