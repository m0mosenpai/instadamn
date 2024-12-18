package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;

/* loaded from: classes9.dex */
public abstract class NsW {
    public static final C54671OCx A00(MediaComposition mediaComposition, C115525Km c115525Km, Integer num, String str) {
        int i;
        int i2;
        int i3;
        if (num == C05F.A01 && (i3 = c115525Km.A07) != 0 && i3 != 180) {
            i = c115525Km.A05;
            i2 = c115525Km.A09;
        } else {
            i = c115525Km.A09;
            i2 = c115525Km.A05;
        }
        return new C54671OCx(mediaComposition, num, str, i, i2);
    }
}
