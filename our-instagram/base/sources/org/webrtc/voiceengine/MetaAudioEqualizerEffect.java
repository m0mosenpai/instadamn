package org.webrtc.voiceengine;

import android.media.audiofx.Equalizer;
import java.lang.reflect.Array;
import org.webrtc.Logging;

/* loaded from: classes12.dex */
public class MetaAudioEqualizerEffect {
    public static final String TAG = "MetaAudioEqualizerEffect";
    public Equalizer eq;

    /* loaded from: classes12.dex */
    public class EqualizerEffectConfig {
        public int preset;
    }

    public MetaAudioEqualizerEffect(int i, EqualizerEffectConfig equalizerEffectConfig) {
        short s;
        if (WebRtcAudioEffects.canUseEqualizer()) {
            try {
                this.eq = new Equalizer(0, i);
            } catch (Exception e) {
                Logging.e(TAG, "MetaAudioEqualizerEffect failed to create Equalizer object", e);
                this.eq = null;
            } catch (NoClassDefFoundError e2) {
                Logging.e(TAG, "MetaAudioEqualizerEffect creation encountered NoClassDefFoundError", e2);
            }
            Equalizer equalizer = this.eq;
            if (equalizer != null) {
                short numberOfPresets = equalizer.getNumberOfPresets();
                boolean z = Logging.loggingEnabled;
                for (int i2 = 0; i2 < numberOfPresets; i2++) {
                    this.eq.getPresetName((short) i2);
                }
                if (equalizerEffectConfig != null && (s = (short) equalizerEffectConfig.preset) >= 0 && s < numberOfPresets) {
                    this.eq.usePreset(s);
                    this.eq.getCurrentPreset();
                }
                short numberOfBands = this.eq.getNumberOfBands();
                Object[] objArr = (Object[]) Array.newInstance((Class<?>) Integer.TYPE, numberOfBands, 2);
                for (int i3 = 0; i3 < numberOfBands; i3++) {
                    short s2 = (short) i3;
                    objArr[i3] = this.eq.getBandFreqRange(s2);
                    this.eq.getBandLevelRange();
                    this.eq.setBandLevel(s2, (short) -1000);
                    this.eq.getBandLevel(s2);
                }
            }
        }
    }

    public void enable(boolean z) {
        Equalizer equalizer = this.eq;
        if (equalizer != null) {
            equalizer.getEnabled();
            if (this.eq.setEnabled(z) != 0) {
                boolean z2 = Logging.loggingEnabled;
            }
            this.eq.getEnabled();
            boolean z3 = Logging.loggingEnabled;
        }
    }

    public void release() {
        Equalizer equalizer = this.eq;
        if (equalizer != null) {
            equalizer.release();
            this.eq = null;
        }
    }
}
