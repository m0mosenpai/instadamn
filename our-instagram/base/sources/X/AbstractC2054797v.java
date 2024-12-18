package X;

import android.os.Parcelable;
import com.instagram.direct.capabilities.Capabilities;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.97v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2054797v {
    public static final Capabilities A00(List list) {
        C14360o3.A0B(list, 0);
        BitSet bitSet = new BitSet();
        BitSet bitSet2 = new BitSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EnumC2054697t enumC2054697t = (EnumC2054697t) it.next();
            C14360o3.A0B(enumC2054697t, 0);
            int i = enumC2054697t.A00;
            if (i < 0) {
                bitSet.set(-i);
            } else {
                bitSet2.set(i);
            }
        }
        return new Capabilities(bitSet, bitSet2);
    }

    public static final Capabilities A01(long[] jArr) {
        BitSet bitSet = new BitSet(128);
        int i = 0;
        do {
            long j = jArr[i];
            int i2 = 0;
            do {
                if (((1 << i2) & j) != 0) {
                    bitSet.set((i * 64) + i2);
                }
                i2++;
            } while (i2 < 64);
            i++;
        } while (i < 2);
        Parcelable.Creator creator = Capabilities.CREATOR;
        return new Capabilities(new BitSet(), bitSet);
    }
}
