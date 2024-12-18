package org.webrtc.audio;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import java.util.UUID;
import org.webrtc.Logging;

/* loaded from: classes12.dex */
public class WebRtcAudioEffects {
    public static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    public static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    public static final boolean DEBUG = false;
    public static final String TAG = "WebRtcAudioEffectsExternal";
    public static AudioEffect.Descriptor[] cachedEffects;
    public AcousticEchoCanceler aec;
    public NoiseSuppressor ns;
    public boolean shouldEnableAec;
    public boolean shouldEnableNs;

    private boolean effectTypeIsVoIP(UUID uuid) {
        return (AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerSupported()) || (AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorSupported());
    }

    public static void assertTrue(boolean z) {
        if (z) {
        } else {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr == null) {
            AudioEffect.Descriptor[] queryEffects = AudioEffect.queryEffects();
            cachedEffects = queryEffects;
            return queryEffects;
        }
        return descriptorArr;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC, AOSP_ACOUSTIC_ECHO_CANCELER);
    }

    public static boolean isNoiseSuppressorSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS, AOSP_NOISE_SUPPRESSOR);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (isAcousticEchoCancelerSupported() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void enable(int r4) {
        /*
            r3 = this;
            boolean r0 = org.webrtc.Logging.loggingEnabled
            android.media.audiofx.AcousticEchoCanceler r0 = r3.aec
            r2 = 1
            boolean r0 = X.AbstractC25229BEm.A1Z(r0)
            assertTrue(r0)
            android.media.audiofx.NoiseSuppressor r0 = r3.ns
            boolean r0 = X.AbstractC25229BEm.A1Z(r0)
            assertTrue(r0)
            boolean r0 = isAcousticEchoCancelerSupported()
            if (r0 == 0) goto L3c
            android.media.audiofx.AcousticEchoCanceler r0 = android.media.audiofx.AcousticEchoCanceler.create(r4)
            r3.aec = r0
            if (r0 == 0) goto L3c
            r0.getEnabled()
            boolean r0 = r3.shouldEnableAec
            if (r0 == 0) goto L31
            boolean r0 = isAcousticEchoCancelerSupported()
            r1 = 1
            if (r0 != 0) goto L32
        L31:
            r1 = 0
        L32:
            android.media.audiofx.AcousticEchoCanceler r0 = r3.aec
            r0.setEnabled(r1)
            android.media.audiofx.AcousticEchoCanceler r0 = r3.aec
            r0.getEnabled()
        L3c:
            boolean r0 = isNoiseSuppressorSupported()
            if (r0 == 0) goto L61
            android.media.audiofx.NoiseSuppressor r0 = android.media.audiofx.NoiseSuppressor.create(r4)
            r3.ns = r0
            if (r0 == 0) goto L61
            r0.getEnabled()
            boolean r0 = r3.shouldEnableNs
            if (r0 == 0) goto L62
            boolean r0 = isNoiseSuppressorSupported()
            if (r0 == 0) goto L62
        L57:
            android.media.audiofx.NoiseSuppressor r0 = r3.ns
            r0.setEnabled(r2)
            android.media.audiofx.NoiseSuppressor r0 = r3.ns
            r0.getEnabled()
        L61:
            return
        L62:
            r2 = 0
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.audio.WebRtcAudioEffects.enable(int):void");
    }

    public void release() {
        boolean z = Logging.loggingEnabled;
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        NoiseSuppressor noiseSuppressor = this.ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.ns = null;
        }
    }

    public boolean setAEC(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        if (!isAcousticEchoCancelerSupported()) {
            this.shouldEnableAec = false;
            return false;
        }
        if (this.aec != null && z != this.shouldEnableAec) {
            return false;
        }
        this.shouldEnableAec = z;
        return true;
    }

    public boolean setNS(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        if (!isNoiseSuppressorSupported()) {
            this.shouldEnableNs = false;
            return false;
        }
        if (this.ns != null && z != this.shouldEnableNs) {
            return false;
        }
        this.shouldEnableNs = z;
        return true;
    }

    public WebRtcAudioEffects() {
        WebRtcAudioUtils.getThreadInfo();
        boolean z = Logging.loggingEnabled;
    }

    public static boolean isEffectTypeAvailable(UUID uuid, UUID uuid2) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return !r1.uuid.equals(uuid2);
            }
        }
        return false;
    }
}
