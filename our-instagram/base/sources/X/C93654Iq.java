package X;

import java.util.Comparator;

/* renamed from: X.4Iq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93654Iq implements Comparator {
    public static final C93654Iq A00 = new Object();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C93694Iy c93694Iy = (C93694Iy) obj;
        C93694Iy c93694Iy2 = (C93694Iy) obj2;
        int compare = Double.compare(c93694Iy.A00, c93694Iy2.A00);
        if (compare == 0) {
            return Double.compare(c93694Iy.A03.A03.A03, c93694Iy2.A03.A03.A03);
        }
        return compare;
    }
}
