package org.webrtc;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import org.webrtc.EncodedImage;

/* loaded from: classes12.dex */
public interface VideoEncoder {

    /* renamed from: org.webrtc.VideoEncoder$-CC, reason: invalid class name */
    /* loaded from: classes12.dex */
    public abstract /* synthetic */ class CC {
        public static EncoderInfo $default$getEncoderInfo(VideoEncoder videoEncoder) {
            return new EncoderInfo(1, false);
        }

        public static ResolutionBitrateLimits[] $default$getResolutionBitrateLimits(VideoEncoder videoEncoder) {
            return new ResolutionBitrateLimits[0];
        }

        public static boolean $default$isHardwareEncoder(VideoEncoder videoEncoder) {
            return true;
        }

        public static long $default$createNative(VideoEncoder videoEncoder, long j) {
            return 0L;
        }
    }

    /* loaded from: classes12.dex */
    public class BitrateAllocation {
        public final int[][] bitratesBbs;

        public int getSum() {
            int i = 0;
            for (int[] iArr : this.bitratesBbs) {
                for (int i2 : iArr) {
                    i += i2;
                }
            }
            return i;
        }

        public BitrateAllocation(int[][] iArr) {
            this.bitratesBbs = iArr;
        }
    }

    /* loaded from: classes12.dex */
    public interface Callback {
        void onEncodedFrame(EncodedImage encodedImage, CodecSpecificInfo codecSpecificInfo);
    }

    /* loaded from: classes12.dex */
    public class CodecSpecificInfo {
    }

    /* loaded from: classes12.dex */
    public class CodecSpecificInfoH264 extends CodecSpecificInfo {
    }

    /* loaded from: classes12.dex */
    public class CodecSpecificInfoVP8 extends CodecSpecificInfo {
    }

    /* loaded from: classes12.dex */
    public class CodecSpecificInfoVP9 extends CodecSpecificInfo {
    }

    /* loaded from: classes12.dex */
    public class ScalingSettings {
        public static final ScalingSettings OFF = new ScalingSettings();
        public final Integer high;
        public final Integer low;
        public final boolean on;

        public String toString() {
            if (this.on) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("[ ");
                A1C.append(this.low);
                A1C.append(", ");
                A1C.append(this.high);
                return AbstractC166997dE.A0x(" ]", A1C);
            }
            return "OFF";
        }

        public ScalingSettings(int i, int i2) {
            this.on = true;
            this.low = Integer.valueOf(i);
            this.high = Integer.valueOf(i2);
        }

        @Deprecated
        public ScalingSettings(boolean z) {
            this.on = z;
            this.low = null;
            this.high = null;
        }

        @Deprecated
        public ScalingSettings(boolean z, int i, int i2) {
            this.on = z;
            this.low = Integer.valueOf(i);
            this.high = Integer.valueOf(i2);
        }

        public ScalingSettings() {
            this.on = false;
            this.low = null;
            this.high = null;
        }
    }

    long createNative(long j);

    VideoCodecStatus encode(VideoFrame videoFrame, EncodeInfo encodeInfo);

    EncoderInfo getEncoderInfo();

    String getImplementationName();

    ResolutionBitrateLimits[] getResolutionBitrateLimits();

    ScalingSettings getScalingSettings();

    VideoCodecStatus initEncode(Settings settings, Callback callback);

    boolean isHardwareEncoder();

    VideoCodecStatus release();

    VideoCodecStatus setRateAllocation(BitrateAllocation bitrateAllocation, int i);

    VideoCodecStatus setRates(RateControlParameters rateControlParameters);

    /* loaded from: classes12.dex */
    public class Capabilities {
        public final boolean lossNotification;

        public Capabilities(boolean z) {
            this.lossNotification = z;
        }
    }

    /* loaded from: classes12.dex */
    public class EncodeInfo {
        public final EncodedImage.FrameType[] frameTypes;

        public EncodeInfo(EncodedImage.FrameType[] frameTypeArr) {
            this.frameTypes = frameTypeArr;
        }
    }

    /* loaded from: classes12.dex */
    public class EncoderInfo {
        public final boolean applyAlignmentToAllSimulcastLayers;
        public final int requestedResolutionAlignment;

        public EncoderInfo(int i, boolean z) {
            this.requestedResolutionAlignment = i;
            this.applyAlignmentToAllSimulcastLayers = z;
        }

        public boolean getApplyAlignmentToAllSimulcastLayers() {
            return this.applyAlignmentToAllSimulcastLayers;
        }

        public int getRequestedResolutionAlignment() {
            return this.requestedResolutionAlignment;
        }
    }

    /* loaded from: classes12.dex */
    public class RateControlParameters {
        public final BitrateAllocation bitrate;
        public final double framerateFps;

        public RateControlParameters(BitrateAllocation bitrateAllocation, double d) {
            this.bitrate = bitrateAllocation;
            this.framerateFps = d;
        }
    }

    /* loaded from: classes12.dex */
    public class ResolutionBitrateLimits {
        public final int frameSizePixels;
        public final int maxBitrateBps;
        public final int minBitrateBps;
        public final int minStartBitrateBps;

        public ResolutionBitrateLimits(int i, int i2, int i3, int i4) {
            this.frameSizePixels = i;
            this.minStartBitrateBps = i2;
            this.minBitrateBps = i3;
            this.maxBitrateBps = i4;
        }

        public int getFrameSizePixels() {
            return this.frameSizePixels;
        }

        public int getMaxBitrateBps() {
            return this.maxBitrateBps;
        }

        public int getMinBitrateBps() {
            return this.minBitrateBps;
        }

        public int getMinStartBitrateBps() {
            return this.minStartBitrateBps;
        }
    }

    /* loaded from: classes12.dex */
    public class Settings {
        public final boolean automaticResizeOn;
        public final Capabilities capabilities;
        public final int height;
        public final int maxFramerate;
        public final int numberOfCores;
        public final int numberOfSimulcastStreams;
        public final int startBitrate;
        public final int width;

        public Settings(int i, int i2, int i3, int i4, int i5, int i6, boolean z, Capabilities capabilities) {
            this.numberOfCores = i;
            this.width = i2;
            this.height = i3;
            this.startBitrate = i4;
            this.maxFramerate = i5;
            this.numberOfSimulcastStreams = i6;
            this.automaticResizeOn = z;
            this.capabilities = capabilities;
        }

        @Deprecated
        public Settings(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
            this(i, i2, i3, i4, i5, i6, z, new Capabilities(false));
        }
    }
}
