package X;

import java.util.BitSet;
import java.util.Collection;
import java.util.HashSet;

/* renamed from: X.2EO, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2EO {
    public final Collection[] A01 = new HashSet[30];
    public int A00 = 0;

    public abstract BitSet A00(Object obj, int i);

    public final void A01() {
        Collection[] collectionArr = this.A01;
        int i = 0;
        do {
            Collection collection = collectionArr[i];
            if (collection != null) {
                collection.clear();
            }
            i++;
        } while (i < 30);
        this.A00 = 0;
    }

    public final void A02(Object obj) {
        BitSet A00 = A00(obj, 30);
        int i = 0;
        while (true) {
            int nextSetBit = A00.nextSetBit(i);
            if (nextSetBit >= 0) {
                Collection[] collectionArr = this.A01;
                if (collectionArr[nextSetBit] == null) {
                    collectionArr[nextSetBit] = new HashSet();
                }
                collectionArr[nextSetBit].add(obj);
                this.A00++;
                i = nextSetBit + 1;
            } else {
                return;
            }
        }
    }

    public final void A03(Object obj) {
        BitSet A00 = A00(obj, 30);
        int i = 0;
        while (true) {
            int nextSetBit = A00.nextSetBit(i);
            if (nextSetBit >= 0) {
                Collection collection = this.A01[nextSetBit];
                if (collection != null) {
                    collection.remove(obj);
                    this.A00--;
                }
                i = nextSetBit + 1;
            } else {
                return;
            }
        }
    }
}
