package X;

import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Wxy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71649Wxy implements Comparator {
    public final boolean A00;

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C1125456i c1125456i = ((VK9) obj).A00;
        C1125456i c1125456i2 = ((VK9) obj2).A00;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long A03 = c1125456i.A03(timeUnit);
        long A02 = c1125456i.A02(timeUnit);
        long A032 = c1125456i2.A03(timeUnit);
        long A022 = c1125456i2.A02(timeUnit);
        if (this.A00) {
            int i = (A03 > A032 ? 1 : (A03 == A032 ? 0 : -1));
            if (i == 0) {
                return (A02 > A022 ? 1 : (A02 == A022 ? 0 : -1));
            }
            return i;
        }
        int i2 = (A02 > A022 ? 1 : (A02 == A022 ? 0 : -1));
        if (i2 != 0) {
            return i2;
        }
        return (A03 > A032 ? 1 : (A03 == A032 ? 0 : -1));
    }

    public C71649Wxy(boolean z) {
        this.A00 = z;
    }
}
