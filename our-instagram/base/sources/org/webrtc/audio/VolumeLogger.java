package org.webrtc.audio;

import android.media.AudioManager;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.Logging;

/* loaded from: classes12.dex */
public class VolumeLogger {
    public static final String TAG = "VolumeLogger";
    public static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
    public static final int TIMER_PERIOD_IN_SECONDS = 30;
    public final AudioManager audioManager;
    public Timer timer;

    /* loaded from: classes12.dex */
    public class LogVolumeTask extends TimerTask {
        public final int maxRingVolume;
        public final int maxVoiceCallVolume;

        public LogVolumeTask(int i, int i2) {
            this.maxRingVolume = i;
            this.maxVoiceCallVolume = i2;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AudioManager audioManager;
            int i;
            int mode = VolumeLogger.this.audioManager.getMode();
            if (mode == 1) {
                audioManager = VolumeLogger.this.audioManager;
                i = 2;
            } else {
                if (mode != 3) {
                    return;
                }
                audioManager = VolumeLogger.this.audioManager;
                i = 0;
            }
            audioManager.getStreamVolume(i);
            boolean z = Logging.loggingEnabled;
        }
    }

    public VolumeLogger(AudioManager audioManager) {
        this.audioManager = audioManager;
    }

    public void start() {
        WebRtcAudioUtils.getThreadInfo();
        boolean z = Logging.loggingEnabled;
        if (this.timer == null) {
            this.audioManager.getMode();
            Timer timer = new Timer("WebRtcVolumeLevelLoggerThread");
            this.timer = timer;
            timer.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0L, 30000L);
        }
    }

    public void stop() {
        WebRtcAudioUtils.getThreadInfo();
        boolean z = Logging.loggingEnabled;
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer = null;
        }
    }
}
