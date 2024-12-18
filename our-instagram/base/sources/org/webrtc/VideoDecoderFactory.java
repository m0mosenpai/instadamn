package org.webrtc;

import X.AbstractC166987dD;

/* loaded from: classes10.dex */
public interface VideoDecoderFactory {

    /* renamed from: org.webrtc.VideoDecoderFactory$-CC */
    /* loaded from: classes10.dex */
    public abstract /* synthetic */ class CC {
        public static VideoCodecInfo[] $default$getSupportedCodecs(VideoDecoderFactory videoDecoderFactory) {
            return new VideoCodecInfo[0];
        }

        @Deprecated
        public static VideoDecoder $default$createDecoder(VideoDecoderFactory videoDecoderFactory, String str) {
            throw AbstractC166987dD.A1D("Deprecated and not implemented.");
        }
    }

    @Deprecated
    VideoDecoder createDecoder(String str);

    VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo);

    VideoCodecInfo[] getSupportedCodecs();
}
