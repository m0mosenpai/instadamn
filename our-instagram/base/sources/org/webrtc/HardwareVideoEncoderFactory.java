package org.webrtc;

import X.AbstractC166987dD;
import X.AbstractC37303Gc4;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.MSY;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.webrtc.EglBase;
import org.webrtc.EglBase14;
import org.webrtc.VideoEncoderFactory;

/* loaded from: classes10.dex */
public class HardwareVideoEncoderFactory implements VideoEncoderFactory {
    public static final String C2_EXYNOS_PREFIX = "c2.exynos";
    public static final List H264_HW_EXCEPTION_MODELS = Arrays.asList("SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4");
    public static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_L_MS = 15000;
    public static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS = 20000;
    public static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_N_MS = 15000;
    public static final String TAG = "HardwareVideoEncoderFactory";
    public boolean addH264HighProfileByDefault;
    public final Predicate codecAllowedPredicate;
    public final boolean enableExynosVp8Encoder;
    public final boolean enableH264HighProfile;
    public final boolean enableIntelVp8Encoder;
    public final boolean enableMTKH264Encoder;
    public final boolean enableMTKH265Encoder;
    public int periodicKeyFrameInterval;
    public final EglBase14.Context sharedContext;

    @Deprecated
    public HardwareVideoEncoderFactory(boolean z, boolean z2) {
        this(null, z, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004d, code lost:
    
        if (r0 == false) goto L10;
     */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, org.webrtc.MediaCodecWrapperFactory] */
    @Override // org.webrtc.VideoEncoderFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.webrtc.VideoEncoder createEncoder(org.webrtc.VideoCodecInfo r18) {
        /*
            r17 = this;
            r6 = 0
            r4 = r18
            java.lang.String r0 = r4.name
            org.webrtc.VideoCodecMimeType r9 = org.webrtc.VideoCodecMimeType.valueOf(r0)
            r3 = r17
            android.media.MediaCodecInfo r5 = r3.findCodecForType(r9)
            if (r5 == 0) goto L4f
            java.lang.String r8 = r5.getName()
            java.lang.String r2 = r9.mimeType()
            int[] r1 = org.webrtc.MediaCodecUtils.TEXTURE_COLOR_FORMATS
            android.media.MediaCodecInfo$CodecCapabilities r0 = r5.getCapabilitiesForType(r2)
            java.lang.Integer r10 = org.webrtc.MediaCodecUtils.selectColorFormat(r1, r0)
            int[] r1 = org.webrtc.MediaCodecUtils.ENCODER_COLOR_FORMATS
            android.media.MediaCodecInfo$CodecCapabilities r0 = r5.getCapabilitiesForType(r2)
            java.lang.Integer r11 = org.webrtc.MediaCodecUtils.selectColorFormat(r1, r0)
            org.webrtc.VideoCodecMimeType r0 = org.webrtc.VideoCodecMimeType.H264
            if (r9 != r0) goto L50
            java.util.Map r1 = r4.params
            r0 = 1
            java.util.Map r0 = org.webrtc.MediaCodecUtils.getCodecProperties(r9, r0)
            boolean r2 = org.webrtc.H264Utils.nativeIsSameH264Profile(r1, r0)
            java.util.Map r1 = r4.params
            r0 = 0
            java.util.Map r0 = org.webrtc.MediaCodecUtils.getCodecProperties(r9, r0)
            boolean r0 = org.webrtc.H264Utils.nativeIsSameH264Profile(r1, r0)
            if (r2 == 0) goto L4d
            boolean r0 = r3.isH264HighProfileSupported(r5)
        L4d:
            if (r0 != 0) goto L50
        L4f:
            return r6
        L50:
            org.webrtc.MediaCodecWrapperFactoryImpl r7 = new org.webrtc.MediaCodecWrapperFactoryImpl
            r7.<init>()
            java.util.Map r12 = r4.params
            int r13 = r3.getKeyFrameIntervalSec(r9)
            int r14 = r3.getForcedKeyFrameIntervalMs(r9, r8)
            org.webrtc.BitrateAdjuster r15 = r3.createBitrateAdjuster(r9, r8)
            org.webrtc.EglBase14$Context r0 = r3.sharedContext
            org.webrtc.HardwareVideoEncoder r6 = new org.webrtc.HardwareVideoEncoder
            r16 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoderFactory.createEncoder(org.webrtc.VideoCodecInfo):org.webrtc.VideoEncoder");
    }

    public MediaCodecInfo findCodecForType(VideoCodecMimeType videoCodecMimeType) {
        MediaCodecInfo mediaCodecInfo;
        int i = 0;
        while (true) {
            mediaCodecInfo = null;
            if (i >= MediaCodecList.getCodecCount()) {
                break;
            }
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
            } catch (IllegalArgumentException e) {
                boolean z = Logging.loggingEnabled;
                e.toString();
                Logging.getStackTraceString(e);
            }
            if (mediaCodecInfo != null && mediaCodecInfo.isEncoder() && isSupportedCodec(mediaCodecInfo, videoCodecMimeType)) {
                break;
            }
            i++;
        }
        return mediaCodecInfo;
    }

    @Override // org.webrtc.VideoEncoderFactory
    /* renamed from: getSupportedCodecs */
    public VideoCodecInfo[] getImplementations() {
        ArrayList A1E = AbstractC166987dD.A1E();
        VideoCodecMimeType videoCodecMimeType = VideoCodecMimeType.VP8;
        VideoCodecMimeType videoCodecMimeType2 = VideoCodecMimeType.VP9;
        VideoCodecMimeType videoCodecMimeType3 = VideoCodecMimeType.H264;
        VideoCodecMimeType[] videoCodecMimeTypeArr = {videoCodecMimeType, videoCodecMimeType2, videoCodecMimeType3, VideoCodecMimeType.H265};
        int i = 0;
        do {
            VideoCodecMimeType videoCodecMimeType4 = videoCodecMimeTypeArr[i];
            MediaCodecInfo findCodecForType = findCodecForType(videoCodecMimeType4);
            if (findCodecForType != null) {
                String name = videoCodecMimeType4.name();
                if (videoCodecMimeType4 == videoCodecMimeType3 && isH264HighProfileSupported(findCodecForType)) {
                    AbstractC58319PtB.A1J(name, A1E, MediaCodecUtils.getCodecProperties(videoCodecMimeType4, true));
                }
                AbstractC58319PtB.A1J(name, A1E, MediaCodecUtils.getCodecProperties(videoCodecMimeType4, false));
            }
            i++;
        } while (i < 4);
        return AbstractC58320PtC.A1b(A1E);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r3.addH264HighProfileByDefault != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isH264HighProfileSupported(android.media.MediaCodecInfo r4) {
        /*
            r3 = this;
            r2 = 1
            java.lang.String r1 = r4.getName()
            java.lang.String r0 = "OMX.Exynos."
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L12
            boolean r0 = r3.addH264HighProfileByDefault
            r1 = 0
            if (r0 == 0) goto L13
        L12:
            r1 = 1
        L13:
            boolean r0 = r3.enableH264HighProfile
            if (r0 == 0) goto L1a
            if (r1 == 0) goto L1a
            return r2
        L1a:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoderFactory.isH264HighProfileSupported(android.media.MediaCodecInfo):boolean");
    }

    /* renamed from: org.webrtc.HardwareVideoEncoderFactory$1, reason: invalid class name */
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
                MSY.A1K(VideoCodecMimeType.H264, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MSY.A1L(VideoCodecMimeType.H265, iArr);
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private boolean isHardwareSupportedInCurrentSdkH264(MediaCodecInfo mediaCodecInfo) {
        if (H264_HW_EXCEPTION_MODELS.contains(Build.MODEL)) {
            return false;
        }
        String name = mediaCodecInfo.getName();
        if (!name.startsWith(MediaCodecUtils.QCOM_PREFIX) && !name.startsWith(MediaCodecUtils.EXYNOS_PREFIX) && (((!name.startsWith(MediaCodecUtils.MTK_PREFIX) && !name.startsWith(MediaCodecUtils.MS_PREFIX)) || !this.enableMTKH264Encoder) && !name.startsWith(C2_EXYNOS_PREFIX))) {
            return false;
        }
        return true;
    }

    private boolean isMediaCodecAllowed(MediaCodecInfo mediaCodecInfo) {
        Predicate predicate = this.codecAllowedPredicate;
        if (predicate == null) {
            return true;
        }
        return predicate.test(mediaCodecInfo);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [org.webrtc.BitrateAdjuster, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [org.webrtc.BitrateAdjuster, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [org.webrtc.BitrateAdjuster, java.lang.Object] */
    public BitrateAdjuster createBitrateAdjuster(VideoCodecMimeType videoCodecMimeType, String str) {
        if (str.startsWith(MediaCodecUtils.EXYNOS_PREFIX)) {
            if (videoCodecMimeType == VideoCodecMimeType.VP8) {
                return new Object();
            }
            if (videoCodecMimeType == VideoCodecMimeType.VP9) {
                return new Object();
            }
        }
        return new Object();
    }

    @Override // org.webrtc.VideoEncoderFactory
    public /* synthetic */ VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return null;
    }

    public int getForcedKeyFrameIntervalMs(VideoCodecMimeType videoCodecMimeType, String str) {
        if (videoCodecMimeType == VideoCodecMimeType.VP8 && str.startsWith(MediaCodecUtils.QCOM_PREFIX)) {
            return 15000;
        }
        return 0;
    }

    public int getKeyFrameIntervalSec(VideoCodecMimeType videoCodecMimeType) {
        int i = this.periodicKeyFrameInterval;
        if (i <= 0) {
            int ordinal = videoCodecMimeType.ordinal();
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal != 2 && ordinal != 4) {
                    throw AbstractC37303Gc4.A0M(videoCodecMimeType, "Unsupported VideoCodecMimeType ", AbstractC166987dD.A1C());
                }
                return 20;
            }
            return 100;
        }
        return i;
    }

    public void setPeriodicKeyFrameIntervalSec(int i) {
        boolean z = Logging.loggingEnabled;
        this.periodicKeyFrameInterval = i;
    }

    private boolean isHardwareSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo, VideoCodecMimeType videoCodecMimeType) {
        int ordinal = videoCodecMimeType.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 4) {
                        return false;
                    }
                    return isHardwareSupportedInCurrentSdkH265(mediaCodecInfo);
                }
                return isHardwareSupportedInCurrentSdkH264(mediaCodecInfo);
            }
            return isHardwareSupportedInCurrentSdkVp9(mediaCodecInfo);
        }
        return isHardwareSupportedInCurrentSdkVp8(mediaCodecInfo);
    }

    private boolean isHardwareSupportedInCurrentSdkH265(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (!name.startsWith(MediaCodecUtils.QCOM_PREFIX) && ((!name.startsWith(MediaCodecUtils.MTK_PREFIX) || !this.enableMTKH265Encoder) && !name.startsWith(C2_EXYNOS_PREFIX))) {
            return false;
        }
        return true;
    }

    private boolean isHardwareSupportedInCurrentSdkVp8(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (!name.startsWith(MediaCodecUtils.QCOM_PREFIX) && ((!name.startsWith(MediaCodecUtils.EXYNOS_PREFIX) || !this.enableExynosVp8Encoder) && ((!name.startsWith(MediaCodecUtils.INTEL_PREFIX) || !this.enableIntelVp8Encoder) && !name.startsWith(C2_EXYNOS_PREFIX)))) {
            return false;
        }
        return true;
    }

    private boolean isHardwareSupportedInCurrentSdkVp9(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (!name.startsWith(MediaCodecUtils.QCOM_PREFIX) && !name.startsWith(MediaCodecUtils.EXYNOS_PREFIX)) {
            return false;
        }
        return true;
    }

    private boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, VideoCodecMimeType videoCodecMimeType) {
        if (!MediaCodecUtils.codecSupportsType(mediaCodecInfo, videoCodecMimeType) || MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(videoCodecMimeType.mimeType())) == null || !isHardwareSupportedInCurrentSdk(mediaCodecInfo, videoCodecMimeType) || !isMediaCodecAllowed(mediaCodecInfo)) {
            return false;
        }
        return true;
    }

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2) {
        this(context, z, z2, null);
    }

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Predicate predicate) {
        EglBase14.Context context2;
        this.periodicKeyFrameInterval = -1;
        this.addH264HighProfileByDefault = false;
        if (context instanceof EglBase14.Context) {
            context2 = (EglBase14.Context) context;
        } else {
            boolean z7 = Logging.loggingEnabled;
            context2 = null;
        }
        this.sharedContext = context2;
        this.enableMTKH264Encoder = z5;
        this.enableMTKH265Encoder = z6;
        this.enableIntelVp8Encoder = z;
        this.enableExynosVp8Encoder = z2;
        this.enableH264HighProfile = z3;
        this.addH264HighProfileByDefault = z4;
        this.codecAllowedPredicate = predicate;
    }

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, Predicate predicate) {
        this(context, z, z2, false, predicate);
    }

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Predicate predicate) {
        this(context, z, z2, z3, false, z5, false, predicate);
    }

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, boolean z3, boolean z4, Predicate predicate) {
        this(context, z, z2, z3, false, z4, predicate);
    }

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, boolean z3, Predicate predicate) {
        this(context, z, true, z2, z3, predicate);
    }
}
