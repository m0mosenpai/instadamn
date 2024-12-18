package X;

import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.56p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1126156p implements Comparator {
    public static final C1126156p A00 = new Object();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C1125456i c1125456i = ((C5JJ) obj).A01;
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        long A02 = c1125456i.A02(timeUnit);
        long A03 = ((C5JJ) obj2).A01.A03(timeUnit);
        if (A02 < A03) {
            return -1;
        }
        if (A02 <= A03) {
            return 0;
        }
        return 1;
    }
}
