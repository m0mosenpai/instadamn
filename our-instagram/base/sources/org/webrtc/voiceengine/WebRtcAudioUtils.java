package org.webrtc.voiceengine;

import X.AbstractC166987dD;
import X.AbstractC58319PtB;
import X.AbstractC72048XLo;
import X.AbstractC72049XLp;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes12.dex */
public final class WebRtcAudioUtils {
    public static final int DEFAULT_SAMPLE_RATE_HZ = 16000;
    public static final String TAG = "WebRtcAudioUtils";
    public static int defaultSampleRateHz = 16000;
    public static boolean isDefaultSampleRateOverridden;
    public static boolean useWebRtcBasedAcousticEchoCanceler;
    public static boolean useWebRtcBasedNoiseSuppressor;
    public static final String[] BLACKLISTED_OPEN_SL_ES_MODELS = new String[0];
    public static final String[] BLACKLISTED_AEC_MODELS = new String[0];
    public static final String[] BLACKLISTED_NS_MODELS = new String[0];

    public static boolean isAutomaticGainControlSupported() {
        return false;
    }

    public static void logAudioDeviceInfo(String str, AudioManager audioManager) {
        AudioDeviceInfo[] devices = audioManager.getDevices(3);
        int length = devices.length;
        if (length != 0) {
            boolean z = Logging.loggingEnabled;
            int i = 0;
            do {
                AudioDeviceInfo audioDeviceInfo = devices[i];
                audioDeviceInfo.getType();
                audioDeviceInfo.isSource();
                if (audioDeviceInfo.getChannelCounts().length > 0) {
                    Arrays.toString(audioDeviceInfo.getChannelCounts());
                }
                if (audioDeviceInfo.getEncodings().length > 0) {
                    Arrays.toString(audioDeviceInfo.getEncodings());
                }
                if (audioDeviceInfo.getSampleRates().length > 0) {
                    Arrays.toString(audioDeviceInfo.getSampleRates());
                }
                audioDeviceInfo.getId();
                i++;
            } while (i < length);
        }
    }

    public static void logAudioStateVolume(String str, AudioManager audioManager) {
        int[] iArr = {0, 3, 2, 4, 5, 1};
        boolean z = Logging.loggingEnabled;
        if (!audioManager.isVolumeFixed()) {
            int i = 0;
            do {
                int i2 = iArr[i];
                StringBuilder A1C = AbstractC166987dD.A1C();
                AbstractC72048XLo.A1N(AbstractC72048XLo.A0H(i2), audioManager, i2, A1C);
                logIsStreamMute(str, audioManager, i2, A1C);
                i++;
            } while (i < 6);
        }
    }

    public static String modeToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION" : "MODE_IN_CALL" : "MODE_RINGTONE" : "MODE_NORMAL";
    }

    public static boolean deviceIsBlacklistedForOpenSLESUsage() {
        return Arrays.asList(BLACKLISTED_OPEN_SL_ES_MODELS).contains(Build.MODEL);
    }

    public static List getBlackListedModelsForAecUsage() {
        return Arrays.asList(BLACKLISTED_AEC_MODELS);
    }

    public static List getBlackListedModelsForNsUsage() {
        return Arrays.asList(BLACKLISTED_NS_MODELS);
    }

    public static synchronized int getDefaultSampleRateHz() {
        int i;
        synchronized (WebRtcAudioUtils.class) {
            i = defaultSampleRateHz;
        }
        return i;
    }

    public static boolean hasMicrophone() {
        return ContextUtils.applicationContext.getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    public static synchronized boolean isDefaultSampleRateOverridden() {
        boolean z;
        synchronized (WebRtcAudioUtils.class) {
            z = isDefaultSampleRateOverridden;
        }
        return z;
    }

    public static void logIsStreamMute(String str, AudioManager audioManager, int i, StringBuilder sb) {
        sb.append(", muted=");
        sb.append(audioManager.isStreamMute(i));
    }

    public static boolean runningOnEmulator() {
        if (Build.HARDWARE.equals("goldfish") && Build.BRAND.startsWith("generic_")) {
            return true;
        }
        return false;
    }

    public static synchronized void setDefaultSampleRateHz(int i) {
        synchronized (WebRtcAudioUtils.class) {
            isDefaultSampleRateOverridden = true;
            defaultSampleRateHz = i;
        }
    }

    public static synchronized void setWebRtcBasedAcousticEchoCanceler(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            useWebRtcBasedAcousticEchoCanceler = z;
        }
    }

    public static synchronized void setWebRtcBasedAutomaticGainControl(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            boolean z2 = Logging.loggingEnabled;
        }
    }

    public static synchronized void setWebRtcBasedNoiseSuppressor(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            useWebRtcBasedNoiseSuppressor = z;
        }
    }

    public static synchronized boolean useWebRtcBasedAcousticEchoCanceler() {
        boolean z;
        synchronized (WebRtcAudioUtils.class) {
            z = useWebRtcBasedAcousticEchoCanceler;
            if (z) {
                boolean z2 = Logging.loggingEnabled;
            }
        }
        return z;
    }

    public static synchronized boolean useWebRtcBasedAutomaticGainControl() {
        synchronized (WebRtcAudioUtils.class) {
        }
        return true;
    }

    public static synchronized boolean useWebRtcBasedNoiseSuppressor() {
        boolean z;
        synchronized (WebRtcAudioUtils.class) {
            z = useWebRtcBasedNoiseSuppressor;
            if (z) {
                boolean z2 = Logging.loggingEnabled;
            }
        }
        return z;
    }

    public static String deviceTypeToString(int i) {
        return AbstractC72049XLp.A0A(i);
    }

    public static String getThreadInfo() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("@[name=");
        Thread currentThread = Thread.currentThread();
        A1C.append(currentThread.getName());
        A1C.append(", id=");
        A1C.append(currentThread.getId());
        return AbstractC58319PtB.A0w(A1C);
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    public static boolean isDynamicsProcessingSupported() {
        return WebRtcAudioEffects.canUseDynamicsProcessing();
    }

    public static boolean isEqualizerSupported() {
        return WebRtcAudioEffects.canUseEqualizer();
    }

    public static boolean isLoudnessEnhancerSupported() {
        return WebRtcAudioEffects.canUseLoudnessEnhancer();
    }

    public static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    public static boolean isVolumeFixed(AudioManager audioManager) {
        return audioManager.isVolumeFixed();
    }

    public static void logAudioState(String str) {
        logDeviceInfo(str);
        AudioManager audioManager = (AudioManager) ContextUtils.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        logAudioStateBasic(str, audioManager);
        logAudioStateVolume(str, audioManager);
        logAudioDeviceInfo(str, audioManager);
    }

    public static void logAudioStateBasic(String str, AudioManager audioManager) {
        audioManager.getMode();
        hasMicrophone();
        audioManager.isMicrophoneMute();
        audioManager.isMusicActive();
        audioManager.isSpeakerphoneOn();
        audioManager.isBluetoothScoOn();
        boolean z = Logging.loggingEnabled;
    }

    public static String streamTypeToString(int i) {
        return AbstractC72048XLo.A0H(i);
    }

    public static void logDeviceInfo(String str) {
        boolean z = Logging.loggingEnabled;
    }
}
