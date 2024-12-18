package androidx.media;

import X.AbstractC63032Sb4;

/* loaded from: classes10.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC63032Sb4 abstractC63032Sb4) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.A03 = abstractC63032Sb4.A01(audioAttributesImplBase.A03, 1);
        audioAttributesImplBase.A00 = abstractC63032Sb4.A01(audioAttributesImplBase.A00, 2);
        audioAttributesImplBase.A01 = abstractC63032Sb4.A01(audioAttributesImplBase.A01, 3);
        audioAttributesImplBase.A02 = abstractC63032Sb4.A01(audioAttributesImplBase.A02, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC63032Sb4 abstractC63032Sb4) {
        abstractC63032Sb4.A06(audioAttributesImplBase.A03, 1);
        abstractC63032Sb4.A06(audioAttributesImplBase.A00, 2);
        abstractC63032Sb4.A06(audioAttributesImplBase.A01, 3);
        abstractC63032Sb4.A06(audioAttributesImplBase.A02, 4);
    }
}
