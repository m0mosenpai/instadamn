package X;

import java.util.Comparator;

/* renamed from: X.XNg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72087XNg implements Comparator {
    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return false;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int i2;
        C72758Xma c72758Xma = (C72758Xma) obj;
        C72758Xma c72758Xma2 = (C72758Xma) obj2;
        int i3 = c72758Xma.A01;
        int i4 = c72758Xma2.A01;
        if (i3 >= i4) {
            if (i3 <= i4 && (i = c72758Xma.A00) >= (i2 = c72758Xma2.A00)) {
                if (i <= i2) {
                    return 0;
                }
            } else {
                return 1;
            }
        }
        return -1;
    }
}
