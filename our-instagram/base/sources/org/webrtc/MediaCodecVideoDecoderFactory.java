package org.webrtc;

import X.AbstractC166987dD;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.C00O;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.ArrayList;
import java.util.Map;
import org.webrtc.EglBase;
import org.webrtc.VideoDecoderFactory;

/* loaded from: classes10.dex */
public class MediaCodecVideoDecoderFactory implements VideoDecoderFactory {
    public static final String TAG = "MediaCodecVideoDecoderFactory";
    public final Predicate codecAllowedPredicate;
    public final Map extendedSettings;
    public final EglBase.Context sharedContext;

    public MediaCodecVideoDecoderFactory(EglBase.Context context, Predicate predicate) {
        this(context, predicate, null);
    }

    private MediaCodecInfo findCodecForType(VideoCodecMimeType videoCodecMimeType) {
        MediaCodecInfo mediaCodecInfo;
        for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
            } catch (IllegalArgumentException e) {
                boolean z = Logging.loggingEnabled;
                e.toString();
                Logging.getStackTraceString(e);
                mediaCodecInfo = null;
            }
            if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder() && isSupportedCodec(mediaCodecInfo, videoCodecMimeType)) {
                return mediaCodecInfo;
            }
        }
        return null;
    }

    @Override // org.webrtc.VideoDecoderFactory
    public /* synthetic */ VideoDecoder createDecoder(String str) {
        VideoDecoderFactory.CC.$default$createDecoder(this, str);
        throw C00O.createAndThrow();
    }

    private boolean isCodecAllowed(MediaCodecInfo mediaCodecInfo) {
        Predicate predicate = this.codecAllowedPredicate;
        if (predicate == null) {
            return true;
        }
        return predicate.test(mediaCodecInfo);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, org.webrtc.MediaCodecWrapperFactory] */
    @Override // org.webrtc.VideoDecoderFactory
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        VideoCodecMimeType valueOf = VideoCodecMimeType.valueOf(videoCodecInfo.name);
        MediaCodecInfo findCodecForType = findCodecForType(valueOf);
        if (findCodecForType == null) {
            return null;
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = findCodecForType.getCapabilitiesForType(valueOf.mimeType());
        return new AndroidVideoDecoder(new Object(), findCodecForType.getName(), valueOf, MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, capabilitiesForType).intValue(), this.sharedContext, capabilitiesForType.isFeatureSupported("adaptive-playback"), this.extendedSettings);
    }

    private boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (!name.startsWith(MediaCodecUtils.QCOM_PREFIX) && !name.startsWith(MediaCodecUtils.EXYNOS_PREFIX)) {
            Map map = this.extendedSettings;
            if (map != null) {
                Integer num = 1;
                if (!num.equals(map.get("fb-add-264highprofile-by-default"))) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    private boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, VideoCodecMimeType videoCodecMimeType) {
        mediaCodecInfo.getName();
        if (!MediaCodecUtils.codecSupportsType(mediaCodecInfo, videoCodecMimeType) || MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(videoCodecMimeType.mimeType())) == null) {
            return false;
        }
        return isCodecAllowed(mediaCodecInfo);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
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

    public MediaCodecVideoDecoderFactory(EglBase.Context context, Predicate predicate, Map map) {
        this.sharedContext = context;
        this.codecAllowedPredicate = predicate;
        this.extendedSettings = map;
    }
}
