package X;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7oY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C173807oY {
    public final SparseArray A00;

    public C173807oY(C88X c88x, List list, List list2, List list3) {
        List list4;
        C14360o3.A0B(list2, 4);
        SparseArray sparseArray = new SparseArray();
        this.A00 = sparseArray;
        if (c88x != null) {
            list4 = Collections.singletonList(c88x);
            C14360o3.A07(list4);
        } else {
            list4 = C16930sl.A00;
        }
        sparseArray.put(0, list4);
        sparseArray.put(4, C16930sl.A00);
        sparseArray.put(1, list);
        sparseArray.put(2, list2);
        sparseArray.put(3, list3);
    }
}
