package X;

import android.util.SparseArray;
import java.util.List;

/* renamed from: X.3GC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3GC implements InterfaceC13000lm {
    public static final C3GC A02 = new C3GC();
    public final SparseArray A00 = new SparseArray();
    public final SparseArray A01 = new SparseArray();

    public final int A00(C5Hq c5Hq, int i) {
        SparseArray sparseArray = this.A00;
        if (sparseArray.size() > 0) {
            int indexOfKey = sparseArray.indexOfKey(i);
            do {
                indexOfKey--;
                if (indexOfKey < 0) {
                    return -1;
                }
            } while (sparseArray.valueAt(indexOfKey) != c5Hq);
            return (i - sparseArray.keyAt(indexOfKey)) - 1;
        }
        return -1;
    }

    public final int A01(List list, int i) {
        SparseArray sparseArray = this.A01;
        if (sparseArray.size() > 0) {
            if (list.contains(C5Hq.PAE_MULTI_AD) || list.contains(C5Hq.STANDALONE_MULTI_AD)) {
                int indexOfKey = sparseArray.indexOfKey(i);
                do {
                    indexOfKey--;
                    if (indexOfKey < 0) {
                        return -1;
                    }
                } while (!list.contains(sparseArray.valueAt(indexOfKey)));
                return (i - sparseArray.keyAt(indexOfKey)) - 1;
            }
            return -1;
        }
        return -1;
    }

    public final C5Hq A02(List list, int i) {
        SparseArray sparseArray = this.A01;
        if (sparseArray.size() > 0) {
            if (list.contains(C5Hq.PAE_MULTI_AD) || list.contains(C5Hq.STANDALONE_MULTI_AD)) {
                int indexOfKey = sparseArray.indexOfKey(i);
                do {
                    indexOfKey--;
                    if (indexOfKey < 0) {
                        return null;
                    }
                } while (!list.contains(sparseArray.valueAt(indexOfKey)));
                return (C5Hq) sparseArray.valueAt(indexOfKey);
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.clear();
        this.A01.clear();
    }
}
