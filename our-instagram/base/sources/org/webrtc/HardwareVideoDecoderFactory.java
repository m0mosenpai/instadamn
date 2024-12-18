package org.webrtc;

import android.media.MediaCodecInfo;
import java.util.Map;
import org.webrtc.EglBase;
import org.webrtc.Predicate;

/* loaded from: classes10.dex */
public class HardwareVideoDecoderFactory extends MediaCodecVideoDecoderFactory {
    public static final Predicate defaultAllowedPredicate = new Predicate() { // from class: org.webrtc.HardwareVideoDecoderFactory.1
        @Override // org.webrtc.Predicate
        public /* synthetic */ Predicate and(Predicate predicate) {
            return new Predicate.AnonymousClass2(predicate);
        }

        @Override // org.webrtc.Predicate
        public /* synthetic */ Predicate negate() {
            return new Predicate.AnonymousClass3();
        }

        @Override // org.webrtc.Predicate
        public /* synthetic */ Predicate or(Predicate predicate) {
            return new Predicate.AnonymousClass1(predicate);
        }

        @Override // org.webrtc.Predicate
        public /* bridge */ /* synthetic */ boolean test(Object obj) {
            return MediaCodecUtils.isHardwareAccelerated((MediaCodecInfo) obj);
        }

        public boolean test(MediaCodecInfo mediaCodecInfo) {
            return MediaCodecUtils.isHardwareAccelerated(mediaCodecInfo);
        }
    };

    public HardwareVideoDecoderFactory(EglBase.Context context, Map map) {
        this(context, null, map);
    }

    @Override // org.webrtc.MediaCodecVideoDecoderFactory, org.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return super.createDecoder(videoCodecInfo);
    }

    @Override // org.webrtc.MediaCodecVideoDecoderFactory, org.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoCodecInfo[] getSupportedCodecs() {
        return super.getSupportedCodecs();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HardwareVideoDecoderFactory(org.webrtc.EglBase.Context r2, org.webrtc.Predicate r3, java.util.Map r4) {
        /*
            r1 = this;
            org.webrtc.Predicate r0 = org.webrtc.HardwareVideoDecoderFactory.defaultAllowedPredicate
            if (r3 == 0) goto L8
            org.webrtc.Predicate r0 = r3.and(r0)
        L8:
            r1.<init>(r2, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoDecoderFactory.<init>(org.webrtc.EglBase$Context, org.webrtc.Predicate, java.util.Map):void");
    }

    public HardwareVideoDecoderFactory(EglBase.Context context, Predicate predicate) {
        this(context, predicate, null);
    }

    public HardwareVideoDecoderFactory(EglBase.Context context) {
        this(context, null, null);
    }

    @Deprecated
    public HardwareVideoDecoderFactory() {
        this(null);
    }
}
