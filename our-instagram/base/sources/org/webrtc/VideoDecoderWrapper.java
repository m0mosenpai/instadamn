package org.webrtc;

import org.webrtc.VideoDecoder;

/* loaded from: classes12.dex */
public class VideoDecoderWrapper {
    public static native void nativeOnDecodedFrame(long j, VideoFrame videoFrame, Integer num, Integer num2);

    public static VideoDecoder.Callback createDecoderCallback(final long j) {
        return new VideoDecoder.Callback() { // from class: org.webrtc.VideoDecoderWrapper$$ExternalSyntheticLambda0
            @Override // org.webrtc.VideoDecoder.Callback
            public final void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
                VideoDecoderWrapper.nativeOnDecodedFrame(j, videoFrame, num, num2);
            }
        };
    }
}
