package org.webrtc.voiceengine;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import java.util.Arrays;
import java.util.UUID;
import org.webrtc.Logging;
import org.webrtc.voiceengine.MetaAudioEqualizerEffect;
import org.webrtc.voiceengine.MetaAudioLoudnessEnhancerEffect;

/* loaded from: classes12.dex */
public class WebRtcAudioEffects {
    public static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    public static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    public static final boolean DEBUG = false;
    public static final String TAG = "WebRtcAudioEffects";
    public static AudioEffect.Descriptor[] cachedEffects;
    public static volatile MetaAudioDynamicsProcessingEffect dp;
    public static volatile MetaAudioEqualizerEffect eq;
    public static volatile MetaAudioLoudnessEnhancerEffect le;
    public AcousticEchoCanceler aec;
    public MetaAudioEqualizerEffect.EqualizerEffectConfig eqConfig = new Object();
    public MetaAudioLoudnessEnhancerEffect.LoudnessEnhancerEffectConfig leConfig = new Object();
    public NoiseSuppressor ns;
    public boolean shouldEnableAec;
    public boolean shouldEnableDp;
    public boolean shouldEnableEq;
    public boolean shouldEnableLe;
    public boolean shouldEnableNs;

    private boolean effectTypeIsVoIP(UUID uuid) {
        UUID uuid2 = AudioEffect.EFFECT_TYPE_AEC;
        if (!uuid2.equals(uuid) || !isEffectTypeAvailable(uuid2)) {
            UUID uuid3 = AudioEffect.EFFECT_TYPE_NS;
            if (!uuid3.equals(uuid) || !isEffectTypeAvailable(uuid3)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAcousticEchoCancelerExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AEC) && descriptor.uuid.equals(AOSP_ACOUSTIC_ECHO_CANCELER)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_NS) && descriptor.uuid.equals(AOSP_NOISE_SUPPRESSOR)) {
                return true;
            }
        }
        return false;
    }

    public static void assertTrue(boolean z) {
        if (z) {
        } else {
            throw new AssertionError("Expected condition to be true");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (isAcousticEchoCancelerExcludedByUUID() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean canUseAcousticEchoCanceler() {
        /*
            java.util.UUID r0 = android.media.audiofx.AudioEffect.EFFECT_TYPE_AEC
            boolean r0 = isEffectTypeAvailable(r0)
            if (r0 == 0) goto L1b
            boolean r0 = org.webrtc.voiceengine.WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler()
            if (r0 != 0) goto L1b
            boolean r0 = isAcousticEchoCancelerBlacklisted()
            if (r0 != 0) goto L1b
            boolean r0 = isAcousticEchoCancelerExcludedByUUID()
            r1 = 1
            if (r0 == 0) goto L1c
        L1b:
            r1 = 0
        L1c:
            boolean r0 = org.webrtc.Logging.loggingEnabled
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.voiceengine.WebRtcAudioEffects.canUseAcousticEchoCanceler():boolean");
    }

    public static boolean canUseDynamicsProcessing() {
        boolean isEffectTypeAvailable = isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_DYNAMICS_PROCESSING);
        boolean z = Logging.loggingEnabled;
        return isEffectTypeAvailable;
    }

    public static boolean canUseEqualizer() {
        boolean isEffectTypeAvailable = isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_EQUALIZER);
        boolean z = Logging.loggingEnabled;
        return isEffectTypeAvailable;
    }

    public static boolean canUseLoudnessEnhancer() {
        boolean isEffectTypeAvailable = isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_LOUDNESS_ENHANCER);
        boolean z = Logging.loggingEnabled;
        return isEffectTypeAvailable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (isNoiseSuppressorExcludedByUUID() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean canUseNoiseSuppressor() {
        /*
            java.util.UUID r0 = android.media.audiofx.AudioEffect.EFFECT_TYPE_NS
            boolean r0 = isEffectTypeAvailable(r0)
            if (r0 == 0) goto L1b
            boolean r0 = org.webrtc.voiceengine.WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor()
            if (r0 != 0) goto L1b
            boolean r0 = isNoiseSuppressorBlacklisted()
            if (r0 != 0) goto L1b
            boolean r0 = isNoiseSuppressorExcludedByUUID()
            r1 = 1
            if (r0 == 0) goto L1c
        L1b:
            r1 = 0
        L1c:
            boolean r0 = org.webrtc.Logging.loggingEnabled
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.voiceengine.WebRtcAudioEffects.canUseNoiseSuppressor():boolean");
    }

    public static WebRtcAudioEffects create() {
        return new WebRtcAudioEffects();
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

    public static boolean isAcousticEchoCancelerBlacklisted() {
        boolean contains = Arrays.asList(WebRtcAudioUtils.BLACKLISTED_AEC_MODELS).contains(Build.MODEL);
        if (contains) {
            boolean z = Logging.loggingEnabled;
        }
        return contains;
    }

    public static boolean isAcousticEchoCancelerEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC);
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC);
    }

    public static boolean isDynamicsProcessingEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_DYNAMICS_PROCESSING);
    }

    public static boolean isDynamicsProcessingSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_DYNAMICS_PROCESSING);
    }

    public static boolean isEqualizerEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_EQUALIZER);
    }

    public static boolean isEqualizerSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_EQUALIZER);
    }

    public static boolean isLoudnessEnhancerEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_LOUDNESS_ENHANCER);
    }

    public static boolean isLoudnessEnhancerSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_LOUDNESS_ENHANCER);
    }

    public static boolean isNoiseSuppressorBlacklisted() {
        boolean contains = Arrays.asList(WebRtcAudioUtils.BLACKLISTED_NS_MODELS).contains(Build.MODEL);
        if (contains) {
            boolean z = Logging.loggingEnabled;
        }
        return contains;
    }

    public static boolean isNoiseSuppressorEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS);
    }

    public static boolean isNoiseSuppressorSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS);
    }

    public static void toggleAudioPlayerEffects(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        try {
            if (dp != null) {
                dp.enable(z);
            }
            if (eq != null) {
                eq.enable(z);
            }
            if (le != null) {
                le.enable(z);
            }
        } catch (Exception e) {
            Logging.e(TAG, "Failed to toggle audio effects for the player", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ab, code lost:
    
        if (canUseAcousticEchoCanceler() == false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void enable(int r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r3 = "WebRtcAudioEffects"
            boolean r0 = org.webrtc.Logging.loggingEnabled
            r2 = 1
            if (r6 != 0) goto L8f
            android.media.audiofx.AcousticEchoCanceler r0 = r4.aec
            boolean r0 = X.AbstractC25229BEm.A1Z(r0)
            assertTrue(r0)
            android.media.audiofx.NoiseSuppressor r0 = r4.ns
            boolean r0 = X.AbstractC25229BEm.A1Z(r0)
            assertTrue(r0)
            java.util.UUID r0 = android.media.audiofx.AudioEffect.EFFECT_TYPE_EQUALIZER
            boolean r0 = isEffectTypeAvailable(r0)
            if (r0 == 0) goto L3d
            boolean r0 = r4.shouldEnableEq
            if (r0 == 0) goto L3d
            boolean r0 = canUseEqualizer()
            if (r0 == 0) goto L3d
            org.webrtc.voiceengine.MetaAudioEqualizerEffect$EqualizerEffectConfig r1 = r4.eqConfig
            org.webrtc.voiceengine.MetaAudioEqualizerEffect r0 = new org.webrtc.voiceengine.MetaAudioEqualizerEffect
            r0.<init>(r5, r1)
            org.webrtc.voiceengine.WebRtcAudioEffects.eq = r0
            org.webrtc.voiceengine.MetaAudioEqualizerEffect r0 = org.webrtc.voiceengine.WebRtcAudioEffects.eq
            if (r0 == 0) goto L3d
            org.webrtc.voiceengine.MetaAudioEqualizerEffect r0 = org.webrtc.voiceengine.WebRtcAudioEffects.eq
            r0.enable(r2)
        L3d:
            java.util.UUID r0 = android.media.audiofx.AudioEffect.EFFECT_TYPE_LOUDNESS_ENHANCER
            boolean r0 = isEffectTypeAvailable(r0)
            if (r0 == 0) goto L61
            boolean r0 = r4.shouldEnableLe
            if (r0 == 0) goto L61
            boolean r0 = canUseLoudnessEnhancer()
            if (r0 == 0) goto L61
            org.webrtc.voiceengine.MetaAudioLoudnessEnhancerEffect$LoudnessEnhancerEffectConfig r1 = r4.leConfig
            org.webrtc.voiceengine.MetaAudioLoudnessEnhancerEffect r0 = new org.webrtc.voiceengine.MetaAudioLoudnessEnhancerEffect
            r0.<init>(r5, r1)
            org.webrtc.voiceengine.WebRtcAudioEffects.le = r0
            org.webrtc.voiceengine.MetaAudioLoudnessEnhancerEffect r0 = org.webrtc.voiceengine.WebRtcAudioEffects.le
            if (r0 == 0) goto L61
            org.webrtc.voiceengine.MetaAudioLoudnessEnhancerEffect r0 = org.webrtc.voiceengine.WebRtcAudioEffects.le
            r0.enable(r2)
        L61:
            java.util.UUID r0 = android.media.audiofx.AudioEffect.EFFECT_TYPE_DYNAMICS_PROCESSING
            boolean r0 = isEffectTypeAvailable(r0)
            if (r0 == 0) goto Ldf
            boolean r0 = r4.shouldEnableDp
            if (r0 == 0) goto Ldf
            boolean r0 = canUseDynamicsProcessing()
            if (r0 == 0) goto Ldf
            android.media.audiofx.DynamicsProcessing$Config r1 = org.webrtc.voiceengine.MetaAudioDynamicsProcessingEffectConfig.config     // Catch: java.lang.Exception -> L88
            if (r1 == 0) goto Ldf
            org.webrtc.voiceengine.MetaAudioDynamicsProcessingEffect r0 = new org.webrtc.voiceengine.MetaAudioDynamicsProcessingEffect     // Catch: java.lang.Exception -> L88
            r0.<init>(r5, r1)     // Catch: java.lang.Exception -> L88
            org.webrtc.voiceengine.WebRtcAudioEffects.dp = r0     // Catch: java.lang.Exception -> L88
            org.webrtc.voiceengine.MetaAudioDynamicsProcessingEffect r0 = org.webrtc.voiceengine.WebRtcAudioEffects.dp     // Catch: java.lang.Exception -> L88
            if (r0 == 0) goto Ldf
            org.webrtc.voiceengine.MetaAudioDynamicsProcessingEffect r0 = org.webrtc.voiceengine.WebRtcAudioEffects.dp     // Catch: java.lang.Exception -> L88
            r0.enable(r2)     // Catch: java.lang.Exception -> L88
            return
        L88:
            r1 = move-exception
            java.lang.String r0 = "Failed to create the Meta DynamicsProcessing instance"
            org.webrtc.Logging.e(r3, r0, r1)
            return
        L8f:
            java.util.UUID r0 = android.media.audiofx.AudioEffect.EFFECT_TYPE_AEC
            boolean r0 = isEffectTypeAvailable(r0)
            if (r0 == 0) goto Lb8
            android.media.audiofx.AcousticEchoCanceler r0 = android.media.audiofx.AcousticEchoCanceler.create(r5)
            r4.aec = r0
            if (r0 == 0) goto Lb8
            r0.getEnabled()
            boolean r0 = r4.shouldEnableAec
            if (r0 == 0) goto Lad
            boolean r0 = canUseAcousticEchoCanceler()
            r1 = 1
            if (r0 != 0) goto Lae
        Lad:
            r1 = 0
        Lae:
            android.media.audiofx.AcousticEchoCanceler r0 = r4.aec
            r0.setEnabled(r1)
            android.media.audiofx.AcousticEchoCanceler r0 = r4.aec
            r0.getEnabled()
        Lb8:
            java.util.UUID r0 = android.media.audiofx.AudioEffect.EFFECT_TYPE_NS
            boolean r0 = isEffectTypeAvailable(r0)
            if (r0 == 0) goto Ldf
            android.media.audiofx.NoiseSuppressor r0 = android.media.audiofx.NoiseSuppressor.create(r5)
            r4.ns = r0
            if (r0 == 0) goto Ldf
            r0.getEnabled()
            boolean r0 = r4.shouldEnableNs
            if (r0 == 0) goto Le0
            boolean r0 = canUseNoiseSuppressor()
            if (r0 == 0) goto Le0
        Ld5:
            android.media.audiofx.NoiseSuppressor r0 = r4.ns
            r0.setEnabled(r2)
            android.media.audiofx.NoiseSuppressor r0 = r4.ns
            r0.getEnabled()
        Ldf:
            return
        Le0:
            r2 = 0
            goto Ld5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.voiceengine.WebRtcAudioEffects.enable(int, boolean):void");
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
        if (eq != null) {
            eq.release();
            eq = null;
        }
        if (le != null) {
            le.release();
            le = null;
        }
        if (dp != null) {
            dp.release();
            dp = null;
        }
    }

    public boolean setAEC(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        if (!canUseAcousticEchoCanceler()) {
            this.shouldEnableAec = false;
            return false;
        }
        if (this.aec != null && z != this.shouldEnableAec) {
            return false;
        }
        this.shouldEnableAec = z;
        return true;
    }

    public boolean setDP(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        if (!canUseDynamicsProcessing()) {
            this.shouldEnableDp = false;
            return false;
        }
        if (dp != null && z != this.shouldEnableDp) {
            return false;
        }
        this.shouldEnableDp = z;
        return true;
    }

    public boolean setEQ(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        if (!canUseEqualizer()) {
            this.shouldEnableEq = false;
            return false;
        }
        if (eq != null && z != this.shouldEnableEq) {
            return false;
        }
        this.shouldEnableEq = z;
        return true;
    }

    public boolean setLE(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        if (!canUseLoudnessEnhancer()) {
            this.shouldEnableLe = false;
            return false;
        }
        if (le != null && z != this.shouldEnableLe) {
            return false;
        }
        this.shouldEnableLe = z;
        return true;
    }

    public boolean setNS(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        if (!canUseNoiseSuppressor()) {
            this.shouldEnableNs = false;
            return false;
        }
        if (this.ns != null && z != this.shouldEnableNs) {
            return false;
        }
        this.shouldEnableNs = z;
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, org.webrtc.voiceengine.MetaAudioEqualizerEffect$EqualizerEffectConfig] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, org.webrtc.voiceengine.MetaAudioLoudnessEnhancerEffect$LoudnessEnhancerEffectConfig] */
    public WebRtcAudioEffects() {
        WebRtcAudioUtils.getThreadInfo();
        boolean z = Logging.loggingEnabled;
    }

    public static boolean isEffectTypeAvailable(UUID uuid) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public boolean setBuiltInEQPreset(int i) {
        if (!canUseEqualizer()) {
            boolean z = Logging.loggingEnabled;
            this.shouldEnableEq = false;
            return false;
        }
        this.eqConfig.preset = i;
        return true;
    }

    public boolean setBuiltInLEGainDb(int i) {
        if (!canUseLoudnessEnhancer()) {
            boolean z = Logging.loggingEnabled;
            this.shouldEnableLe = false;
            return false;
        }
        this.leConfig.targetGainDb = i;
        return true;
    }
}
