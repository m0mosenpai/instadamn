package androidx.media;

import X.InterfaceC175987sE;
import android.util.SparseIntArray;

/* loaded from: classes4.dex */
public class AudioAttributesCompat implements InterfaceC175987sE {
    public static final SparseIntArray A01;
    public AudioAttributesImpl A00;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A01 = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesImpl audioAttributesImpl = this.A00;
        AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).A00;
        if (audioAttributesImpl == null) {
            if (audioAttributesImpl2 != null) {
                return false;
            }
            return true;
        }
        return audioAttributesImpl.equals(audioAttributesImpl2);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return this.A00.toString();
    }
}
