package org.webrtc.audio;

import X.AbstractC166987dD;
import X.AbstractC58319PtB;
import X.AbstractC72048XLo;
import X.AbstractC72049XLp;
import X.AnonymousClass001;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import java.util.Arrays;
import org.webrtc.Logging;

/* loaded from: classes12.dex */
public final class WebRtcAudioUtils {
    public static final String TAG = "WebRtcAudioUtilsExternal";

    public static String audioSourceToString(int i) {
        switch (i) {
            case 0:
                return "DEFAULT";
            case 1:
                return "MIC";
            case 2:
                return "VOICE_UPLINK";
            case 3:
                return "VOICE_DOWNLINK";
            case 4:
                return "VOICE_CALL";
            case 5:
                return "CAMCORDER";
            case 6:
                return "VOICE_RECOGNITION";
            case 7:
                return "VOICE_COMMUNICATION";
            case 8:
            default:
                return "INVALID";
            case 9:
                return "UNPROCESSED";
            case 10:
                return "VOICE_PERFORMANCE";
        }
    }

    public static String channelMaskToString(int i) {
        return i != 12 ? i != 16 ? "INVALID" : "IN_MONO" : "IN_STEREO";
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

    public static String audioEncodingToString(int i) {
        if (i != 0) {
            switch (i) {
                case 2:
                    return "PCM_16BIT";
                case 3:
                    return "PCM_8BIT";
                case 4:
                    return "PCM_FLOAT";
                case 5:
                case 6:
                    return "AC3";
                case 7:
                    return "DTS";
                case 8:
                    return "DTS_HD";
                case 9:
                    return "MP3";
                default:
                    return AnonymousClass001.A0O("Invalid encoding: ", i);
            }
        }
        return "INVALID";
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

    public static boolean hasMicrophone(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    public static boolean isVolumeFixed(AudioManager audioManager) {
        return audioManager.isVolumeFixed();
    }

    public static void logAudioState(String str, Context context, AudioManager audioManager) {
        logDeviceInfo(str);
        logAudioStateBasic(str, context, audioManager);
        logAudioStateVolume(str, audioManager);
        logAudioDeviceInfo(str, audioManager);
    }

    public static void logAudioStateBasic(String str, Context context, AudioManager audioManager) {
        audioManager.getMode();
        hasMicrophone(context);
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
