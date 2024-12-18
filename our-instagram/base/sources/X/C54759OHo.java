package X;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.OHo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54759OHo {
    public final long A00;
    public final HashMap A01 = AbstractC166987dD.A1G();

    public C54759OHo(Iterable iterable, long j) {
        this.A00 = j;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            long A07 = MSY.A07(it);
            HashMap hashMap = this.A01;
            long j2 = A07 / this.A00;
            if (A07 < 0) {
                j2--;
            }
            hashMap.put(Long.valueOf(j2), 1L);
        }
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("BucketizedHashMap(bucketSize=");
        A1C.append(this.A00);
        A1C.append(", bucketIndices=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
