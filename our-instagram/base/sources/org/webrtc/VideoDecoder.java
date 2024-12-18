package org.webrtc;

/* loaded from: classes12.dex */
public interface VideoDecoder {

    /* loaded from: classes12.dex */
    public interface Callback {
        void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2);
    }

    long createNative(long j);

    VideoCodecStatus decode(EncodedImage encodedImage, DecodeInfo decodeInfo);

    String getImplementationName();

    VideoCodecStatus initDecode(Settings settings, Callback callback);

    VideoCodecStatus release();

    /* loaded from: classes12.dex */
    public class DecodeInfo {
        public final boolean isMissingFrames;
        public final long renderTimeMs;

        public DecodeInfo(boolean z, long j) {
            this.isMissingFrames = z;
            this.renderTimeMs = j;
        }
    }

    /* loaded from: classes12.dex */
    public class Settings {
        public final int height;
        public final int numberOfCores;
        public final int width;

        public Settings(int i, int i2, int i3) {
            this.numberOfCores = i;
            this.width = i2;
            this.height = i3;
        }
    }

    /* renamed from: org.webrtc.VideoDecoder$-CC, reason: invalid class name */
    /* loaded from: classes10.dex */
    public abstract /* synthetic */ class CC {
        public static long $default$createNative(VideoDecoder videoDecoder, long j) {
            return 0L;
        }
    }
}
