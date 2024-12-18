package org.webrtc;

import X.AbstractC31171DnF;
import X.AbstractC58320PtC;
import java.util.Arrays;
import java.util.LinkedHashSet;
import org.webrtc.EglBase;
import org.webrtc.VideoEncoderFactory;

/* loaded from: classes10.dex */
public class DefaultVideoEncoderFactory implements VideoEncoderFactory {
    public final VideoEncoderFactory hardwareVideoEncoderFactory;
    public final VideoEncoderFactory softwareVideoEncoderFactory = new Object();

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        VideoEncoder createEncoder = this.softwareVideoEncoderFactory.createEncoder(videoCodecInfo);
        VideoEncoder createEncoder2 = this.hardwareVideoEncoderFactory.createEncoder(videoCodecInfo);
        if (createEncoder2 != null) {
            if (createEncoder != null) {
                return new VideoEncoderFallback(createEncoder, createEncoder2);
            }
            return createEncoder2;
        }
        return createEncoder;
    }

    @Override // org.webrtc.VideoEncoderFactory
    public /* synthetic */ VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [org.webrtc.VideoEncoderFactory, java.lang.Object] */
    public DefaultVideoEncoderFactory(VideoEncoderFactory videoEncoderFactory) {
        this.hardwareVideoEncoderFactory = videoEncoderFactory;
    }

    @Override // org.webrtc.VideoEncoderFactory
    /* renamed from: getSupportedCodecs */
    public VideoCodecInfo[] getImplementations() {
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        A0l.addAll(Arrays.asList(this.softwareVideoEncoderFactory.getImplementations()));
        A0l.addAll(Arrays.asList(this.hardwareVideoEncoderFactory.getImplementations()));
        return AbstractC58320PtC.A1b(A0l);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [org.webrtc.VideoEncoderFactory, java.lang.Object] */
    public DefaultVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2) {
        this.hardwareVideoEncoderFactory = new HardwareVideoEncoderFactory(context, z, z2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [org.webrtc.VideoEncoderFactory, java.lang.Object] */
    public DefaultVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, boolean z3) {
        this.hardwareVideoEncoderFactory = new HardwareVideoEncoderFactory(context, z, z2, z3, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [org.webrtc.VideoEncoderFactory, java.lang.Object] */
    public DefaultVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        this.hardwareVideoEncoderFactory = new HardwareVideoEncoderFactory(context, z, z2, z3, z4, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [org.webrtc.VideoEncoderFactory, java.lang.Object] */
    public DefaultVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.hardwareVideoEncoderFactory = new HardwareVideoEncoderFactory(context, z, z2, z3, z4, z5, z6, null);
    }
}
