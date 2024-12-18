package org.webrtc.voiceengine;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import org.webrtc.Logging;

/* loaded from: classes12.dex */
public final class WebRtcAudioLatencyUtils {
    public static final String TAG = "WebRtcAudioLatencyUtils";
    public static final long TRACK_LATENCY_ESTIMATE_INTERVAL_S = 5;
    public static int bytesPerFrame;
    public static long framesPerLatencyEstimate;
    public static int latencyMillis;
    public static AudioTimestamp timestamp = new AudioTimestamp();
    public static long writePosition;

    public static int calculateTrackLatencyInMs(AudioTrack audioTrack, long j) {
        int i = bytesPerFrame;
        if (i != 0) {
            long j2 = writePosition + (j / i);
            writePosition = j2;
            if (j2 % framesPerLatencyEstimate == 0) {
                if (audioTrack.getTimestamp(timestamp)) {
                    AudioTimestamp audioTimestamp = timestamp;
                    long j3 = audioTimestamp.framePosition;
                    long j4 = audioTimestamp.nanoTime;
                    long j5 = writePosition - j3;
                    double sampleRate = ((j4 + ((j5 * 1000000000) / audioTrack.getSampleRate())) - System.nanoTime()) / 1000000.0d;
                    if (sampleRate > 0.0d && sampleRate < 2.147483647E9d) {
                        latencyMillis = (int) sampleRate;
                    }
                }
                boolean z = Logging.loggingEnabled;
            }
            return latencyMillis;
        }
        return 0;
    }

    public static void initTrackLatencyEstimator(int i, int i2) {
        bytesPerFrame = i;
        framesPerLatencyEstimate = i2 * 5;
        writePosition = 0L;
    }
}
