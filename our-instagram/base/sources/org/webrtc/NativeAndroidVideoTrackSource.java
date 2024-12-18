package org.webrtc;

import org.webrtc.VideoFrame;
import org.webrtc.VideoProcessor;
import org.webrtc.VideoSource;

/* loaded from: classes12.dex */
public class NativeAndroidVideoTrackSource {
    public final long nativeAndroidVideoTrackSource;

    public static native VideoProcessor.FrameAdaptationParameters nativeAdaptFrame(long j, int i, int i2, int i3, long j2);

    public static native void nativeAdaptOutputFormat(long j, int i, int i2, Integer num, int i3, int i4, Integer num2, Integer num3);

    public static native void nativeOnFrameCaptured(long j, int i, long j2, VideoFrame.Buffer buffer);

    public static native void nativeSetIsScreencast(long j, boolean z);

    public static native void nativeSetState(long j, boolean z);

    public static VideoProcessor.FrameAdaptationParameters createFrameAdaptationParameters(int i, int i2, int i3, int i4, int i5, int i6, long j, boolean z) {
        return new VideoProcessor.FrameAdaptationParameters(i, i2, i3, i4, i5, i6, j, z);
    }

    public VideoProcessor.FrameAdaptationParameters adaptFrame(VideoFrame videoFrame) {
        return nativeAdaptFrame(this.nativeAndroidVideoTrackSource, videoFrame.buffer.getWidth(), videoFrame.buffer.getHeight(), videoFrame.rotation, videoFrame.timestampNs);
    }

    public void adaptOutputFormat(VideoSource.AspectRatio aspectRatio, Integer num, VideoSource.AspectRatio aspectRatio2, Integer num2, Integer num3) {
        nativeAdaptOutputFormat(this.nativeAndroidVideoTrackSource, aspectRatio.width, aspectRatio.height, num, aspectRatio2.width, aspectRatio2.height, num2, num3);
    }

    public void onFrameCaptured(VideoFrame videoFrame) {
        nativeOnFrameCaptured(this.nativeAndroidVideoTrackSource, videoFrame.rotation, videoFrame.timestampNs, videoFrame.buffer);
    }

    public void setIsScreencast(boolean z) {
        nativeSetIsScreencast(this.nativeAndroidVideoTrackSource, z);
    }

    public void setState(boolean z) {
        nativeSetState(this.nativeAndroidVideoTrackSource, z);
    }

    public NativeAndroidVideoTrackSource(long j) {
        this.nativeAndroidVideoTrackSource = j;
    }
}
