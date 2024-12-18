package org.webrtc.audio;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25229BEm;
import X.AbstractC72049XLp;
import X.AnonymousClass001;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import java.nio.ByteBuffer;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes12.dex */
public class WebRtcAudioTrack {
    public static final int AUDIO_TRACK_START = 0;
    public static final int AUDIO_TRACK_STOP = 1;
    public static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    public static final int BITS_PER_SAMPLE = 16;
    public static final int BUFFERS_PER_SECOND = 100;
    public static final int CALLBACK_BUFFER_SIZE_MS = 10;
    public static final int DEFAULT_USAGE = 2;
    public static final String TAG = "WebRtcAudioTrackExternal";
    public final AudioAttributes audioAttributes;
    public final AudioManager audioManager;
    public AudioTrackThread audioThread;
    public AudioTrack audioTrack;
    public ByteBuffer byteBuffer;
    public final Context context;
    public byte[] emptyBytes;
    public final JavaAudioDeviceModule.AudioTrackErrorCallback errorCallback;
    public int initialBufferSizeInFrames;
    public long nativeAudioTrack;
    public volatile boolean speakerMute;
    public final JavaAudioDeviceModule.AudioTrackStateCallback stateCallback;
    public final ThreadUtils.ThreadChecker threadChecker;
    public boolean useLowLatency;
    public final VolumeLogger volumeLogger;

    /* loaded from: classes12.dex */
    public class AudioTrackThread extends Thread {
        public LowLatencyAudioBufferManager bufferManager;
        public volatile boolean keepAlive;

        private int writeBytes(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
            return audioTrack.write(byteBuffer, i, 0);
        }

        public AudioTrackThread(String str) {
            super(str);
            this.keepAlive = true;
            this.bufferManager = new LowLatencyAudioBufferManager();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            WebRtcAudioUtils.getThreadInfo();
            boolean z = Logging.loggingEnabled;
            WebRtcAudioTrack.assertTrue(AbstractC167007dF.A1P(WebRtcAudioTrack.this.audioTrack.getPlayState(), 3));
            WebRtcAudioTrack.this.doAudioTrackStateCallback(0);
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                WebRtcAudioTrack.nativeGetPlayoutData(WebRtcAudioTrack.this.nativeAudioTrack, capacity);
                boolean z2 = false;
                if (capacity <= WebRtcAudioTrack.this.byteBuffer.remaining()) {
                    z2 = true;
                }
                WebRtcAudioTrack.assertTrue(z2);
                if (WebRtcAudioTrack.this.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                    webRtcAudioTrack.byteBuffer.put(webRtcAudioTrack.emptyBytes);
                    WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                WebRtcAudioTrack webRtcAudioTrack2 = WebRtcAudioTrack.this;
                int write = webRtcAudioTrack2.audioTrack.write(webRtcAudioTrack2.byteBuffer, capacity, 0);
                if (write != capacity && write < 0) {
                    this.keepAlive = false;
                    WebRtcAudioTrack.this.reportWebRtcAudioTrackError(AnonymousClass001.A0O("AudioTrack.write failed: ", write));
                }
                WebRtcAudioTrack webRtcAudioTrack3 = WebRtcAudioTrack.this;
                if (webRtcAudioTrack3.useLowLatency) {
                    this.bufferManager.maybeAdjustBufferSize(webRtcAudioTrack3.audioTrack);
                }
                WebRtcAudioTrack.this.byteBuffer.rewind();
            }
        }

        public void stopThread() {
            boolean z = Logging.loggingEnabled;
            this.keepAlive = false;
        }
    }

    public WebRtcAudioTrack(Context context, AudioManager audioManager) {
        this(context, audioManager, null, null, null, false);
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 4 : 12;
    }

    public static AudioTrack createAudioTrackOnLowerThanLollipop(int i, int i2, int i3) {
        return new AudioTrack(0, i, i2, 2, i3, 1);
    }

    public static void logNativeOutputSampleRate(int i) {
        AudioTrack.getNativeOutputSampleRate(0);
        boolean z = Logging.loggingEnabled;
    }

    public static native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer);

    public static native void nativeGetPlayoutData(long j, int i);

    private int GetPlayoutUnderrunCount() {
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            return audioTrack.getUnderrunCount();
        }
        return -1;
    }

    public static void assertTrue(boolean z) {
        if (z) {
        } else {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static AudioTrack createAudioTrackOnLollipopOrHigher(int i, int i2, int i3, AudioAttributes audioAttributes) {
        boolean z = Logging.loggingEnabled;
        logNativeOutputSampleRate(i);
        return new AudioTrack(getAudioAttributes(audioAttributes), AbstractC72049XLp.A04(i, i2), i3, 1, 0);
    }

    public static AudioTrack createAudioTrackOnOreoOrHigher(int i, int i2, int i3, AudioAttributes audioAttributes) {
        boolean z = Logging.loggingEnabled;
        logNativeOutputSampleRate(i);
        return new AudioTrack.Builder().setAudioAttributes(getAudioAttributes(audioAttributes)).setAudioFormat(AbstractC72049XLp.A04(i, i2)).setBufferSizeInBytes(i3).setPerformanceMode(1).setTransferMode(1).setSessionId(0).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doAudioTrackStateCallback(int i) {
        boolean z = Logging.loggingEnabled;
        JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback = this.stateCallback;
        if (audioTrackStateCallback != null) {
            if (i == 0) {
                audioTrackStateCallback.onWebRtcAudioTrackStart();
            } else {
                if (i != 1) {
                    return;
                }
                audioTrackStateCallback.onWebRtcAudioTrackStop();
            }
        }
    }

    public static AudioAttributes getAudioAttributes(AudioAttributes audioAttributes) {
        AudioAttributes.Builder contentType = new AudioAttributes.Builder().setUsage(DEFAULT_USAGE).setContentType(1);
        if (audioAttributes != null) {
            if (audioAttributes.getUsage() != 0) {
                contentType.setUsage(audioAttributes.getUsage());
            }
            if (audioAttributes.getContentType() != 0) {
                contentType.setContentType(audioAttributes.getContentType());
            }
            contentType.setFlags(audioAttributes.getFlags());
            if (Build.VERSION.SDK_INT >= 29) {
                contentType = applyAttributesOnQOrHigher(contentType, audioAttributes);
            }
        }
        return contentType.build();
    }

    private int getBufferSizeInFrames() {
        return this.audioTrack.getBufferSizeInFrames();
    }

    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        boolean z = Logging.loggingEnabled;
        return this.audioManager.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        boolean z = Logging.loggingEnabled;
        return this.audioManager.getStreamVolume(0);
    }

    private int initPlayout(int i, int i2, double d) {
        AudioTrack createAudioTrackOnLollipopOrHigher;
        String str;
        this.threadChecker.checkIsOnValidThread();
        boolean z = Logging.loggingEnabled;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2 * 2 * (i / 100));
        this.byteBuffer = allocateDirect;
        this.emptyBytes = new byte[allocateDirect.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioTrack, this.byteBuffer);
        int i3 = 12;
        if (i2 == 1) {
            i3 = 4;
        }
        int minBufferSize = (int) (AudioTrack.getMinBufferSize(i, i3, 2) * d);
        if (minBufferSize < this.byteBuffer.capacity()) {
            str = "AudioTrack.getMinBufferSize returns an invalid value.";
        } else {
            if (d > 1.0d) {
                this.useLowLatency = false;
            }
            if (this.audioTrack != null) {
                str = "Conflict with existing AudioTrack.";
            } else {
                try {
                    if (this.useLowLatency) {
                        createAudioTrackOnLollipopOrHigher = createAudioTrackOnOreoOrHigher(i, i3, minBufferSize, this.audioAttributes);
                        this.audioTrack = createAudioTrackOnLollipopOrHigher;
                    } else {
                        createAudioTrackOnLollipopOrHigher = createAudioTrackOnLollipopOrHigher(i, i3, minBufferSize, this.audioAttributes);
                        this.audioTrack = createAudioTrackOnLollipopOrHigher;
                    }
                    if (createAudioTrackOnLollipopOrHigher != null && createAudioTrackOnLollipopOrHigher.getState() == 1) {
                        this.initialBufferSizeInFrames = this.audioTrack.getBufferSizeInFrames();
                        logMainParameters();
                        logMainParametersExtended();
                        return minBufferSize;
                    }
                    reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                    releaseAudioResources();
                    return -1;
                } catch (IllegalArgumentException e) {
                    reportWebRtcAudioTrackInitError(e.getMessage());
                    releaseAudioResources();
                    return -1;
                }
            }
        }
        reportWebRtcAudioTrackInitError(str);
        return -1;
    }

    private boolean isVolumeFixed() {
        return this.audioManager.isVolumeFixed();
    }

    private void logBufferCapacityInFrames() {
        this.audioTrack.getBufferCapacityInFrames();
        boolean z = Logging.loggingEnabled;
    }

    private void logBufferSizeInFrames() {
        this.audioTrack.getBufferSizeInFrames();
        boolean z = Logging.loggingEnabled;
    }

    private void logMainParameters() {
        this.audioTrack.getAudioSessionId();
        this.audioTrack.getChannelCount();
        this.audioTrack.getSampleRate();
        AudioTrack.getMaxVolume();
        boolean z = Logging.loggingEnabled;
    }

    private void logUnderrunCount() {
        this.audioTrack.getUnderrunCount();
        boolean z = Logging.loggingEnabled;
    }

    private void releaseAudioResources() {
        boolean z = Logging.loggingEnabled;
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioTrackError(String str) {
        boolean z = Logging.loggingEnabled;
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        boolean z = Logging.loggingEnabled;
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        boolean z = Logging.loggingEnabled;
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    private boolean setStreamVolume(int i) {
        this.threadChecker.checkIsOnValidThread();
        boolean z = Logging.loggingEnabled;
        if (this.audioManager.isVolumeFixed()) {
            return false;
        }
        this.audioManager.setStreamVolume(0, i, 0);
        return true;
    }

    private boolean startPlayout() {
        this.threadChecker.checkIsOnValidThread();
        this.volumeLogger.start();
        boolean z = Logging.loggingEnabled;
        assertTrue(AbstractC167007dF.A1W(this.audioTrack));
        assertTrue(AbstractC25229BEm.A1Z(this.audioThread));
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, AnonymousClass001.A0O("AudioTrack.play failed - incorrect state :", this.audioTrack.getPlayState()));
                releaseAudioResources();
                return false;
            }
            AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        } catch (IllegalStateException e) {
            reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, AbstractC166997dE.A0y("AudioTrack.play failed: ", e));
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopPlayout() {
        this.threadChecker.checkIsOnValidThread();
        this.volumeLogger.stop();
        boolean z = Logging.loggingEnabled;
        assertTrue(AbstractC167007dF.A1W(this.audioThread));
        logUnderrunCount();
        this.audioThread.stopThread();
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
            WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        }
        this.audioThread = null;
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            try {
                audioTrack.stop();
                doAudioTrackStateCallback(1);
            } catch (IllegalStateException e) {
                e.getMessage();
            }
        }
        releaseAudioResources();
        return true;
    }

    public void setSpeakerMute(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        this.speakerMute = z;
    }

    public static AudioAttributes.Builder applyAttributesOnQOrHigher(AudioAttributes.Builder builder, AudioAttributes audioAttributes) {
        return builder.setAllowedCapturePolicy(audioAttributes.getAllowedCapturePolicy());
    }

    public static int getDefaultUsageAttribute() {
        return 2;
    }

    private int getInitialBufferSizeInFrames() {
        return this.initialBufferSizeInFrames;
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    public void setNativeAudioTrack(long j) {
        this.nativeAudioTrack = j;
    }

    public WebRtcAudioTrack(Context context, AudioManager audioManager, AudioAttributes audioAttributes, JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback, JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback, boolean z) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        threadChecker.thread = null;
        this.context = context;
        this.audioManager = audioManager;
        this.audioAttributes = audioAttributes;
        this.errorCallback = audioTrackErrorCallback;
        this.stateCallback = audioTrackStateCallback;
        this.volumeLogger = new VolumeLogger(audioManager);
        this.useLowLatency = z;
        WebRtcAudioUtils.getThreadInfo();
        boolean z2 = Logging.loggingEnabled;
    }
}
