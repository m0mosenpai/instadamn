package org.webrtc;

/* loaded from: classes10.dex */
public class VideoDecoderFallback extends WrappedNativeVideoDecoder {
    public final VideoDecoder fallback;
    public final VideoDecoder primary;

    public static native long nativeCreate(long j, VideoDecoder videoDecoder, VideoDecoder videoDecoder2);

    @Override // org.webrtc.WrappedNativeVideoDecoder, org.webrtc.VideoDecoder
    public long createNative(long j) {
        return nativeCreate(j, this.fallback, this.primary);
    }

    public VideoDecoderFallback(VideoDecoder videoDecoder, VideoDecoder videoDecoder2) {
        this.fallback = videoDecoder;
        this.primary = videoDecoder2;
    }
}
