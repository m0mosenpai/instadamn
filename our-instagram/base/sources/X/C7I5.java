package X;

import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.BitSet;

/* renamed from: X.7I5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7I5 {
    public final Capabilities A00(long[] jArr) {
        int length = jArr.length;
        BitSet bitSet = new BitSet(length * 64);
        for (int i = 0; i < length; i++) {
            long j = jArr[i];
            int i2 = 0;
            do {
                if (((1 << i2) & j) != 0) {
                    bitSet.set((i * 64) + i2);
                }
                i2++;
            } while (i2 < 64);
        }
        return new Capabilities(bitSet);
    }
}
