package androidx.media;

import X.AbstractC63032Sb4;
import X.InterfaceC175987sE;

/* loaded from: classes10.dex */
public class AudioAttributesCompatParcelizer {
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, androidx.media.AudioAttributesCompat] */
    public static AudioAttributesCompat read(AbstractC63032Sb4 abstractC63032Sb4) {
        ?? obj = new Object();
        InterfaceC175987sE interfaceC175987sE = obj.A00;
        if (abstractC63032Sb4.A09(1)) {
            interfaceC175987sE = abstractC63032Sb4.A04();
        }
        obj.A00 = (AudioAttributesImpl) interfaceC175987sE;
        return obj;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC63032Sb4 abstractC63032Sb4) {
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.A00;
        abstractC63032Sb4.A05(1);
        abstractC63032Sb4.A08(audioAttributesImpl);
    }
}
