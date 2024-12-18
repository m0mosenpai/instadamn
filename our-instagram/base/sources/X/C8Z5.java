package X;

import com.instagram.common.gallery.Medium;
import java.util.Comparator;

/* renamed from: X.8Z5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8Z5 implements Comparator {
    public static final C8Z5 A00 = new C8Z5();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Medium medium = (Medium) obj;
        Medium medium2 = (Medium) obj2;
        if (medium == null) {
            return -1;
        }
        if (medium2 != null) {
            long j = medium.A0C;
            long j2 = medium2.A0C;
            if (j > j2) {
                return -1;
            }
            if (j == j2) {
                long j3 = medium.A0D;
                long j4 = medium2.A0D;
                if (j3 > j4) {
                    return -1;
                }
                if (j3 == j4) {
                    int i = medium.A05;
                    int i2 = medium2.A05;
                    if (i < i2) {
                        return -1;
                    }
                    if (i == i2) {
                        return 0;
                    }
                }
            }
        }
        return 1;
    }
}
