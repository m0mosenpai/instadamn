package org.webrtc;

import X.AbstractC166987dD;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public class SoftwareVideoDecoderFactory implements VideoDecoderFactory {
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, org.webrtc.VideoDecoder] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, org.webrtc.VideoDecoder] */
    @Override // org.webrtc.VideoDecoderFactory
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        String str = videoCodecInfo.name;
        if (str.equalsIgnoreCase("VP8")) {
            return new Object();
        }
        if (str.equalsIgnoreCase("VP9") && LibvpxVp9Decoder.nativeIsSupported()) {
            return new Object();
        }
        return null;
    }

    public static VideoCodecInfo[] supportedCodecs() {
        ArrayList A1E = AbstractC166987dD.A1E();
        AbstractC58319PtB.A1J("VP8", A1E, AbstractC166987dD.A1G());
        if (LibvpxVp9Decoder.nativeIsSupported()) {
            AbstractC58319PtB.A1J("VP9", A1E, AbstractC166987dD.A1G());
        }
        return AbstractC58320PtC.A1b(A1E);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return supportedCodecs();
    }

    @Override // org.webrtc.VideoDecoderFactory
    @Deprecated
    public VideoDecoder createDecoder(String str) {
        return createDecoder(new VideoCodecInfo(str, AbstractC166987dD.A1G()));
    }
}
