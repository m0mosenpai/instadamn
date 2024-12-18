package org.webrtc.voiceengine;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25229BEm;
import X.AbstractC72049XLp;
import X.AnonymousClass001;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Process;
import java.nio.ByteBuffer;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;
import org.webrtc.MediaStreamTrack;
import org.webrtc.ThreadUtils;

/* loaded from: classes12.dex */
public class WebRtcAudioTrack {
    public static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    public static final int BITS_PER_SAMPLE = 16;
    public static final int BUFFERS_PER_SECOND = 100;
    public static final int CALLBACK_BUFFER_SIZE_MS = 10;
    public static final boolean DEBUG = false;
    public static final String TAG = "WebRtcAudioTrack";
    public static ErrorCallback errorCallback;
    public static WebRtcAudioTrackErrorCallback errorCallbackOld;
    public static volatile boolean speakerMute;
    public final AudioManager audioManager;
    public AudioTrackThread audioThread;
    public AudioTrack audioTrack;
    public ByteBuffer byteBuffer;
    public WebRtcAudioEffects effects;
    public byte[] emptyBytes;
    public final long nativeAudioTrack;
    public final ThreadUtils.ThreadChecker threadChecker;
    public static final int DEFAULT_USAGE = 2;
    public static int usageAttribute = 2;

    /* loaded from: classes12.dex */
    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    /* loaded from: classes12.dex */
    public class AudioTrackThread extends Thread {
        public volatile boolean keepAlive;

        private int writeBytes(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
            return audioTrack.write(byteBuffer, i, 0);
        }

        public AudioTrackThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            WebRtcAudioUtils.getThreadInfo();
            boolean z = Logging.loggingEnabled;
            WebRtcAudioTrack.assertTrue(AbstractC167007dF.A1P(WebRtcAudioTrack.this.audioTrack.getPlayState(), 3));
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                webRtcAudioTrack.nativeGetPlayoutData(capacity, webRtcAudioTrack.nativeAudioTrack);
                boolean z2 = false;
                if (capacity <= WebRtcAudioTrack.this.byteBuffer.remaining()) {
                    z2 = true;
                }
                WebRtcAudioTrack.assertTrue(z2);
                if (WebRtcAudioTrack.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack webRtcAudioTrack2 = WebRtcAudioTrack.this;
                    webRtcAudioTrack2.byteBuffer.put(webRtcAudioTrack2.emptyBytes);
                    WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                WebRtcAudioTrack webRtcAudioTrack3 = WebRtcAudioTrack.this;
                int write = webRtcAudioTrack3.audioTrack.write(webRtcAudioTrack3.byteBuffer, capacity, 0);
                if (write != capacity && write < 0) {
                    this.keepAlive = false;
                    WebRtcAudioTrack.this.reportWebRtcAudioTrackError(AnonymousClass001.A0O("AudioTrack.write failed: ", write));
                }
                WebRtcAudioTrack.this.byteBuffer.rewind();
                WebRtcAudioTrack webRtcAudioTrack4 = WebRtcAudioTrack.this;
                webRtcAudioTrack4.nativeReportWebRtcTrackLatencyInMs(WebRtcAudioLatencyUtils.calculateTrackLatencyInMs(webRtcAudioTrack4.audioTrack, write), WebRtcAudioTrack.this.nativeAudioTrack);
            }
            try {
                AudioTrack audioTrack = WebRtcAudioTrack.this.audioTrack;
                if (audioTrack != null) {
                    audioTrack.stop();
                }
            } catch (IllegalStateException e) {
                e.getMessage();
            }
        }

        public void stopThread() {
            boolean z = Logging.loggingEnabled;
            this.keepAlive = false;
        }
    }

    /* loaded from: classes12.dex */
    public interface ErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    @Deprecated
    /* loaded from: classes12.dex */
    public interface WebRtcAudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(String str);
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 4 : 12;
    }

    public static AudioTrack createAudioTrackOnLowerThanLollipop(int i, int i2, int i3) {
        return new AudioTrack(0, i, i2, 2, i3, 1);
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeGetPlayoutData(int i, long j);

    private native void nativeReportWebRtcAudioTrackError(String str, long j);

    private native void nativeReportWebRtcAudioTrackInitError(String str, long j);

    private native void nativeReportWebRtcAudioTrackStartError(String str, String str2, long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeReportWebRtcTrackLatencyInMs(int i, long j);

    public static void assertTrue(boolean z) {
        if (z) {
        } else {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static AudioTrack createAudioTrackOnLollipopOrHigher(int i, int i2, int i3) {
        boolean z = Logging.loggingEnabled;
        AudioTrack.getNativeOutputSampleRate(0);
        return new AudioTrack(new AudioAttributes.Builder().setUsage(usageAttribute).setContentType(1).build(), AbstractC72049XLp.A04(i, i2), i3, 1, 0);
    }

    private boolean enableBuiltInDP(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            return false;
        }
        return webRtcAudioEffects.setDP(z);
    }

    private boolean enableBuiltInEQ(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            return false;
        }
        return webRtcAudioEffects.setEQ(z);
    }

    private boolean enableBuiltInLE(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            return false;
        }
        return webRtcAudioEffects.setLE(z);
    }

    private int getBufferSizeInFrames() {
        return this.audioTrack.getBufferSizeInFrames();
    }

    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        boolean z = Logging.loggingEnabled;
        assertTrue(AbstractC167007dF.A1W(this.audioManager));
        return this.audioManager.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        boolean z = Logging.loggingEnabled;
        assertTrue(AbstractC167007dF.A1W(this.audioManager));
        return this.audioManager.getStreamVolume(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int initPlayout(int r12, int r13, double r14, boolean r16, int r17) {
        /*
            r11 = this;
            r10 = r17
            org.webrtc.ThreadUtils$ThreadChecker r0 = r11.threadChecker
            r0.checkIsOnValidThread()
            boolean r0 = org.webrtc.Logging.loggingEnabled
            int r1 = r13 * 2
            org.webrtc.voiceengine.WebRtcAudioLatencyUtils.initTrackLatencyEstimator(r1, r12)
            int r0 = r12 / 100
            int r1 = r1 * r0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r1)
            r11.byteBuffer = r0
            int r0 = r0.capacity()
            byte[] r0 = new byte[r0]
            r11.emptyBytes = r0
            java.nio.ByteBuffer r2 = r11.byteBuffer
            long r0 = r11.nativeAudioTrack
            r11.nativeCacheDirectBufferAddress(r2, r0)
            r3 = 1
            r2 = 12
            if (r13 != r3) goto L2c
            r2 = 4
        L2c:
            r0 = 2
            int r1 = android.media.AudioTrack.getMinBufferSize(r12, r2, r0)
            r0 = -2
            r4 = -1
            if (r1 == r0) goto L79
            if (r1 != r4) goto L3c
            java.lang.String r0 = "Error while finding AudioTrack min buffer size: ERROR"
        L39:
            r11.reportWebRtcAudioTrackInitError(r0)
        L3c:
            double r0 = (double) r1
            double r0 = r0 * r14
            int r8 = (int) r0
            java.lang.String r6 = " whereas the configured frame size is = "
            java.nio.ByteBuffer r0 = r11.byteBuffer
            int r0 = r0.capacity()
            if (r16 == 0) goto L66
            if (r8 >= r0) goto L77
            java.lang.String r5 = "AudioTrack.getMinBufferSize returned a size that is too small.  bufferSizeInBytes = "
            java.nio.ByteBuffer r0 = r11.byteBuffer
            int r9 = r0.capacity()
            java.lang.String r7 = " bytes. Falling back to buffer size = "
            java.lang.String r0 = X.AnonymousClass001.A0p(r5, r6, r7, r8, r9, r10)
            r11.reportWebRtcAudioTrackInitError(r0)
        L5c:
            android.media.AudioTrack r0 = r11.audioTrack
            if (r0 == 0) goto L7c
            java.lang.String r0 = "Conflict with existing AudioTrack."
        L62:
            r11.reportWebRtcAudioTrackInitError(r0)
            return r4
        L66:
            if (r8 >= r0) goto L77
            java.lang.String r2 = "AudioTrack.getMinBufferSize returns an invalid value. bufferSizeInBytes = "
            java.nio.ByteBuffer r0 = r11.byteBuffer
            int r1 = r0.capacity()
            java.lang.String r0 = " bytes."
            java.lang.String r0 = X.AnonymousClass001.A0n(r2, r6, r0, r8, r1)
            goto L62
        L77:
            r10 = r8
            goto L5c
        L79:
            java.lang.String r0 = "Error while finding AudioTrack min buffer size: ERROR_BAD_VALUE"
            goto L39
        L7c:
            android.media.AudioTrack r0 = createAudioTrackOnLollipopOrHigher(r12, r2, r10)     // Catch: java.lang.IllegalArgumentException -> La6
            r11.audioTrack = r0     // Catch: java.lang.IllegalArgumentException -> La6
            int r0 = r0.getState()
            if (r0 == r3) goto L91
            java.lang.String r0 = "Initialization of audio track failed."
            r11.reportWebRtcAudioTrackInitError(r0)
            r11.releaseAudioResources()
            return r4
        L91:
            org.webrtc.voiceengine.WebRtcAudioEffects r2 = r11.effects
            if (r2 == 0) goto L9f
            android.media.AudioTrack r0 = r11.audioTrack
            int r1 = r0.getAudioSessionId()
            r0 = 0
            r2.enable(r1, r0)
        L9f:
            r11.logMainParameters()
            r11.logMainParametersExtended()
            return r10
        La6:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r11.reportWebRtcAudioTrackInitError(r0)
            r11.releaseAudioResources()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.voiceengine.WebRtcAudioTrack.initPlayout(int, int, double, boolean, int):int");
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
        WebRtcAudioUtils.logAudioState(TAG);
        nativeReportWebRtcAudioTrackError(AnonymousClass001.A0R("Run-time playback error: ", str), this.nativeAudioTrack);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        boolean z = Logging.loggingEnabled;
        WebRtcAudioUtils.logAudioState(TAG);
        nativeReportWebRtcAudioTrackInitError(AnonymousClass001.A0R("Init playout error: ", str), this.nativeAudioTrack);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        boolean z = Logging.loggingEnabled;
        WebRtcAudioUtils.logAudioState(TAG);
        nativeReportWebRtcAudioTrackStartError(audioTrackStartErrorCode.toString(), AnonymousClass001.A0R("Start playout error: ", str), this.nativeAudioTrack);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackStartError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    public static synchronized void setAudioTrackUsageAttribute(int i) {
        synchronized (WebRtcAudioTrack.class) {
            boolean z = Logging.loggingEnabled;
            usageAttribute = i;
        }
    }

    private boolean setBuiltInEQPreset(int i) {
        boolean z = Logging.loggingEnabled;
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            return false;
        }
        return webRtcAudioEffects.setBuiltInEQPreset(i);
    }

    private boolean setBuiltInLEGainDb(int i) {
        boolean z = Logging.loggingEnabled;
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            return false;
        }
        return webRtcAudioEffects.setBuiltInLEGainDb(i);
    }

    public static void setErrorCallback(ErrorCallback errorCallback2) {
        boolean z = Logging.loggingEnabled;
        errorCallback = errorCallback2;
    }

    public static void setSpeakerMute(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        speakerMute = z;
    }

    private boolean setStreamVolume(int i) {
        this.threadChecker.checkIsOnValidThread();
        boolean z = Logging.loggingEnabled;
        assertTrue(AbstractC167007dF.A1W(this.audioManager));
        if (this.audioManager.isVolumeFixed()) {
            return false;
        }
        this.audioManager.setStreamVolume(0, i, 0);
        return true;
    }

    private boolean startPlayout() {
        this.threadChecker.checkIsOnValidThread();
        boolean z = Logging.loggingEnabled;
        assertTrue(AbstractC167007dF.A1W(this.audioTrack));
        assertTrue(AbstractC25229BEm.A1Z(this.audioThread));
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, AnonymousClass001.A0O("AudioTrack.play failed - incorrect state :", this.audioTrack.getPlayState()));
                releaseAudioResources();
                return false;
            }
            AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        } catch (IllegalStateException e) {
            reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, AbstractC166997dE.A0y("AudioTrack.play failed: ", e));
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopPlayout() {
        this.threadChecker.checkIsOnValidThread();
        boolean z = Logging.loggingEnabled;
        assertTrue(AbstractC167007dF.A1W(this.audioThread));
        logUnderrunCount();
        this.audioThread.stopThread();
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
            WebRtcAudioUtils.logAudioState(TAG);
        }
        this.audioThread = null;
        releaseAudioResources();
        return true;
    }

    public WebRtcAudioTrack(long j) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        threadChecker.checkIsOnValidThread();
        WebRtcAudioUtils.getThreadInfo();
        boolean z = Logging.loggingEnabled;
        this.nativeAudioTrack = j;
        this.audioManager = (AudioManager) ContextUtils.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.effects = new WebRtcAudioEffects();
    }

    public static int getDefaultUsageAttribute() {
        return 2;
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    @Deprecated
    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        boolean z = Logging.loggingEnabled;
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }
}
