package org.webrtc;

import X.AbstractC166987dD;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import java.util.ArrayList;
import org.webrtc.VideoEncoderFactory;

/* loaded from: classes10.dex */
public class SoftwareVideoEncoderFactory implements VideoEncoderFactory {
    /* JADX WARN: Type inference failed for: r0v7, types: [org.webrtc.VideoEncoder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [org.webrtc.VideoEncoder, java.lang.Object] */
    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        String str = videoCodecInfo.name;
        if (str.equalsIgnoreCase("VP8")) {
            return new Object();
        }
        if (str.equalsIgnoreCase("VP9") && LibvpxVp9Encoder.nativeIsSupported()) {
            return new Object();
        }
        return null;
    }

    @Override // org.webrtc.VideoEncoderFactory
    public /* synthetic */ VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return null;
    }

    public static VideoCodecInfo[] supportedCodecs() {
        ArrayList A1E = AbstractC166987dD.A1E();
        AbstractC58319PtB.A1J("VP8", A1E, AbstractC166987dD.A1G());
        if (LibvpxVp9Encoder.nativeIsSupported()) {
            AbstractC58319PtB.A1J("VP9", A1E, AbstractC166987dD.A1G());
        }
        return AbstractC58320PtC.A1b(A1E);
    }

    @Override // org.webrtc.VideoEncoderFactory
    /* renamed from: getSupportedCodecs, reason: merged with bridge method [inline-methods] */
    public VideoCodecInfo[] getImplementations() {
        return supportedCodecs();
    }
}
