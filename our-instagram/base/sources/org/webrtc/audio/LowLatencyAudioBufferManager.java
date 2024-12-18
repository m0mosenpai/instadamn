package org.webrtc.audio;

import android.media.AudioTrack;
import org.webrtc.Logging;

/* loaded from: classes12.dex */
public class LowLatencyAudioBufferManager {
    public static final String TAG = "LowLatencyAudioBufferManager";
    public int prevUnderrunCount = 0;
    public int ticksUntilNextDecrease = 10;
    public boolean keepLoweringBufferSize = true;
    public int bufferIncreaseCounter = 0;

    public void maybeAdjustBufferSize(AudioTrack audioTrack) {
        int underrunCount = audioTrack.getUnderrunCount();
        if (underrunCount > this.prevUnderrunCount) {
            if (this.bufferIncreaseCounter < 5) {
                int playbackRate = (audioTrack.getPlaybackRate() / 100) + audioTrack.getBufferSizeInFrames();
                boolean z = Logging.loggingEnabled;
                audioTrack.setBufferSizeInFrames(playbackRate);
                this.bufferIncreaseCounter++;
            }
            this.keepLoweringBufferSize = false;
            this.prevUnderrunCount = underrunCount;
        } else {
            if (!this.keepLoweringBufferSize) {
                return;
            }
            int i = this.ticksUntilNextDecrease - 1;
            this.ticksUntilNextDecrease = i;
            if (i > 0) {
                return;
            }
            int playbackRate2 = audioTrack.getPlaybackRate() / 100;
            int bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
            int max = Math.max(playbackRate2, bufferSizeInFrames - playbackRate2);
            if (max != bufferSizeInFrames) {
                boolean z2 = Logging.loggingEnabled;
                audioTrack.setBufferSizeInFrames(max);
            }
        }
        this.ticksUntilNextDecrease = 10;
    }
}
