package org.webrtc;

import X.AbstractC31171DnF;
import X.AbstractC58320PtC;
import X.C00O;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import org.webrtc.EglBase;
import org.webrtc.VideoDecoderFactory;

/* loaded from: classes10.dex */
public class DefaultVideoDecoderFactory implements VideoDecoderFactory {
    public final VideoDecoderFactory hardwareVideoDecoderFactory;
    public final VideoDecoderFactory platformSoftwareVideoDecoderFactory;
    public final VideoDecoderFactory softwareVideoDecoderFactory;

    @Override // org.webrtc.VideoDecoderFactory
    public /* synthetic */ VideoDecoder createDecoder(String str) {
        VideoDecoderFactory.CC.$default$createDecoder(this, str);
        throw C00O.createAndThrow();
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        VideoDecoderFactory videoDecoderFactory;
        VideoDecoder createDecoder = this.softwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        VideoDecoder createDecoder2 = this.hardwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        if (createDecoder == null && (videoDecoderFactory = this.platformSoftwareVideoDecoderFactory) != null) {
            createDecoder = videoDecoderFactory.createDecoder(videoCodecInfo);
        }
        if (createDecoder2 != null) {
            if (createDecoder != null) {
                return new VideoDecoderFallback(createDecoder, createDecoder2);
            }
            return createDecoder2;
        }
        return createDecoder;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [org.webrtc.VideoDecoderFactory, java.lang.Object] */
    public DefaultVideoDecoderFactory(EglBase.Context context, Map map) {
        this.softwareVideoDecoderFactory = new Object();
        this.hardwareVideoDecoderFactory = new HardwareVideoDecoderFactory(context, map);
        this.platformSoftwareVideoDecoderFactory = new PlatformSoftwareVideoDecoderFactory(context);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        A0l.addAll(Arrays.asList(this.softwareVideoDecoderFactory.getSupportedCodecs()));
        A0l.addAll(Arrays.asList(this.hardwareVideoDecoderFactory.getSupportedCodecs()));
        VideoDecoderFactory videoDecoderFactory = this.platformSoftwareVideoDecoderFactory;
        if (videoDecoderFactory != null) {
            A0l.addAll(Arrays.asList(videoDecoderFactory.getSupportedCodecs()));
        }
        return AbstractC58320PtC.A1b(A0l);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [org.webrtc.VideoDecoderFactory, java.lang.Object] */
    public DefaultVideoDecoderFactory(EglBase.Context context) {
        this.softwareVideoDecoderFactory = new Object();
        this.hardwareVideoDecoderFactory = new HardwareVideoDecoderFactory(context);
        this.platformSoftwareVideoDecoderFactory = new PlatformSoftwareVideoDecoderFactory(context);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [org.webrtc.VideoDecoderFactory, java.lang.Object] */
    public DefaultVideoDecoderFactory(VideoDecoderFactory videoDecoderFactory) {
        this.softwareVideoDecoderFactory = new Object();
        this.hardwareVideoDecoderFactory = videoDecoderFactory;
        this.platformSoftwareVideoDecoderFactory = null;
    }
}
