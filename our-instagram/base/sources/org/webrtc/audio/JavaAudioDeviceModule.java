package org.webrtc.audio;

import X.AbstractC58318PtA;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import org.webrtc.JniCommon;
import org.webrtc.Logging;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes12.dex */
public class JavaAudioDeviceModule implements AudioDeviceModule {
    public static final String TAG = "JavaAudioDeviceModule";
    public final WebRtcAudioRecord audioInput;
    public final AudioManager audioManager;
    public final WebRtcAudioTrack audioOutput;
    public final Context context;
    public final int inputSampleRate;
    public long nativeAudioDeviceModule;
    public final Object nativeLock;
    public final int outputSampleRate;
    public final boolean useStereoInput;
    public final boolean useStereoOutput;

    /* loaded from: classes12.dex */
    public interface AudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    /* loaded from: classes12.dex */
    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    /* loaded from: classes12.dex */
    public interface AudioRecordStateCallback {
        void onWebRtcAudioRecordStart();

        void onWebRtcAudioRecordStop();
    }

    /* loaded from: classes12.dex */
    public interface AudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    /* loaded from: classes12.dex */
    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    /* loaded from: classes12.dex */
    public interface AudioTrackStateCallback {
        void onWebRtcAudioTrackStart();

        void onWebRtcAudioTrackStop();
    }

    /* loaded from: classes12.dex */
    public class Builder {
        public AudioAttributes audioAttributes;
        public int audioFormat;
        public final AudioManager audioManager;
        public AudioRecordErrorCallback audioRecordErrorCallback;
        public AudioRecordStateCallback audioRecordStateCallback;
        public int audioSource;
        public AudioTrackErrorCallback audioTrackErrorCallback;
        public AudioTrackStateCallback audioTrackStateCallback;
        public final Context context;
        public int inputSampleRate;
        public int outputSampleRate;
        public SamplesReadyCallback samplesReadyCallback;
        public boolean useHardwareAcousticEchoCanceler;
        public boolean useHardwareNoiseSuppressor;
        public boolean useLowLatency;
        public boolean useStereoInput;
        public boolean useStereoOutput;

        public AudioDeviceModule createAudioDeviceModule() {
            boolean z = Logging.loggingEnabled;
            if (!this.useHardwareNoiseSuppressor) {
                WebRtcAudioEffects.isNoiseSuppressorSupported();
            }
            if (!this.useHardwareAcousticEchoCanceler) {
                WebRtcAudioEffects.isAcousticEchoCancelerSupported();
            }
            return new JavaAudioDeviceModule(this.context, this.audioManager, new WebRtcAudioRecord(this.context, this.audioManager, this.audioSource, this.audioFormat, this.audioRecordErrorCallback, this.audioRecordStateCallback, this.samplesReadyCallback, this.useHardwareAcousticEchoCanceler, this.useHardwareNoiseSuppressor), new WebRtcAudioTrack(this.context, this.audioManager, this.audioAttributes, this.audioTrackErrorCallback, this.audioTrackStateCallback, this.useLowLatency), this.inputSampleRate, this.outputSampleRate, this.useStereoInput, this.useStereoOutput);
        }

        public Builder setInputSampleRate(int i) {
            boolean z = Logging.loggingEnabled;
            this.inputSampleRate = i;
            return this;
        }

        public Builder setOutputSampleRate(int i) {
            boolean z = Logging.loggingEnabled;
            this.outputSampleRate = i;
            return this;
        }

        public Builder setSampleRate(int i) {
            boolean z = Logging.loggingEnabled;
            this.inputSampleRate = i;
            this.outputSampleRate = i;
            return this;
        }

        public Builder setUseHardwareAcousticEchoCanceler(boolean z) {
            if (z && !WebRtcAudioEffects.isAcousticEchoCancelerSupported()) {
                boolean z2 = Logging.loggingEnabled;
                z = false;
            }
            this.useHardwareAcousticEchoCanceler = z;
            return this;
        }

        public Builder setUseHardwareNoiseSuppressor(boolean z) {
            if (z && !WebRtcAudioEffects.isNoiseSuppressorSupported()) {
                boolean z2 = Logging.loggingEnabled;
                z = false;
            }
            this.useHardwareNoiseSuppressor = z;
            return this;
        }

        public Builder setAudioAttributes(AudioAttributes audioAttributes) {
            this.audioAttributes = audioAttributes;
            return this;
        }

        public Builder setAudioFormat(int i) {
            this.audioFormat = i;
            return this;
        }

        public Builder setAudioRecordErrorCallback(AudioRecordErrorCallback audioRecordErrorCallback) {
            this.audioRecordErrorCallback = audioRecordErrorCallback;
            return this;
        }

        public Builder setAudioRecordStateCallback(AudioRecordStateCallback audioRecordStateCallback) {
            this.audioRecordStateCallback = audioRecordStateCallback;
            return this;
        }

        public Builder setAudioSource(int i) {
            this.audioSource = i;
            return this;
        }

        public Builder setAudioTrackErrorCallback(AudioTrackErrorCallback audioTrackErrorCallback) {
            this.audioTrackErrorCallback = audioTrackErrorCallback;
            return this;
        }

        public Builder setAudioTrackStateCallback(AudioTrackStateCallback audioTrackStateCallback) {
            this.audioTrackStateCallback = audioTrackStateCallback;
            return this;
        }

        public Builder setSamplesReadyCallback(SamplesReadyCallback samplesReadyCallback) {
            this.samplesReadyCallback = samplesReadyCallback;
            return this;
        }

        public Builder setUseLowLatency(boolean z) {
            this.useLowLatency = z;
            return this;
        }

        public Builder setUseStereoInput(boolean z) {
            this.useStereoInput = z;
            return this;
        }

        public Builder setUseStereoOutput(boolean z) {
            this.useStereoOutput = z;
            return this;
        }

        public Builder(Context context) {
            this.audioSource = 7;
            this.audioFormat = 2;
            this.useHardwareAcousticEchoCanceler = WebRtcAudioEffects.isAcousticEchoCancelerSupported();
            this.useHardwareNoiseSuppressor = WebRtcAudioEffects.isNoiseSuppressorSupported();
            this.context = context;
            AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            this.audioManager = audioManager;
            this.inputSampleRate = WebRtcAudioManager.getSampleRate(audioManager);
            this.outputSampleRate = WebRtcAudioManager.getSampleRate(audioManager);
            this.useLowLatency = false;
        }
    }

    /* loaded from: classes12.dex */
    public interface SamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    public static native long nativeCreateAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i, int i2, boolean z, boolean z2);

    /* loaded from: classes12.dex */
    public class AudioSamples {
        public final int audioFormat;
        public final int channelCount;
        public final byte[] data;
        public final int sampleRate;

        public AudioSamples(int i, int i2, int i3, byte[] bArr) {
            this.audioFormat = i;
            this.channelCount = i2;
            this.sampleRate = i3;
            this.data = bArr;
        }

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }
    }

    public static Builder builder(Context context) {
        return new Builder(context);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public long getNativeAudioDeviceModulePointer() {
        long j;
        synchronized (this.nativeLock) {
            j = this.nativeAudioDeviceModule;
            if (j == 0) {
                j = nativeCreateAudioDeviceModule(this.context, this.audioManager, this.audioInput, this.audioOutput, this.inputSampleRate, this.outputSampleRate, this.useStereoInput, this.useStereoOutput);
                this.nativeAudioDeviceModule = j;
            }
        }
        return j;
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void release() {
        synchronized (this.nativeLock) {
            long j = this.nativeAudioDeviceModule;
            if (j != 0) {
                JniCommon.nativeReleaseRef(j);
                this.nativeAudioDeviceModule = 0L;
            }
        }
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setMicrophoneMute(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        this.audioInput.setMicrophoneMute(z);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setSpeakerMute(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        this.audioOutput.setSpeakerMute(z);
    }

    public JavaAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i, int i2, boolean z, boolean z2) {
        this.nativeLock = AbstractC58318PtA.A0b();
        this.context = context;
        this.audioManager = audioManager;
        this.audioInput = webRtcAudioRecord;
        this.audioOutput = webRtcAudioTrack;
        this.inputSampleRate = i;
        this.outputSampleRate = i2;
        this.useStereoInput = z;
        this.useStereoOutput = z2;
    }

    public static boolean isBuiltInAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.isAcousticEchoCancelerSupported();
    }

    public static boolean isBuiltInNoiseSuppressorSupported() {
        return WebRtcAudioEffects.isNoiseSuppressorSupported();
    }
}
