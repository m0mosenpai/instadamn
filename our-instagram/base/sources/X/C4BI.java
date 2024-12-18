package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.4BI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4BI {
    public final long A00;
    public final C92164Aw A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public final int A00(int i) {
        List list = this.A03;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C4BF) list.get(i2)).A01 == i) {
                return i2;
            }
        }
        return -1;
    }

    public C4BI(long j, String str, List list) {
        this(null, str, list, Collections.emptyList(), j);
    }

    public C4BI(C92164Aw c92164Aw, String str, List list, List list2, long j) {
        this.A02 = str;
        this.A00 = j;
        this.A03 = Collections.unmodifiableList(list);
        this.A04 = Collections.unmodifiableList(list2);
        this.A01 = c92164Aw;
    }
}
