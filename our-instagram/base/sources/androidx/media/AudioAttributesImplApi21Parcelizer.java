package androidx.media;

import X.AbstractC63032Sb4;
import android.media.AudioAttributes;

/* loaded from: classes12.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC63032Sb4 abstractC63032Sb4) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.A01 = (AudioAttributes) abstractC63032Sb4.A02(audioAttributesImplApi21.A01, 1);
        audioAttributesImplApi21.A00 = abstractC63032Sb4.A01(audioAttributesImplApi21.A00, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC63032Sb4 abstractC63032Sb4) {
        abstractC63032Sb4.A07(audioAttributesImplApi21.A01, 1);
        abstractC63032Sb4.A06(audioAttributesImplApi21.A00, 2);
    }
}
