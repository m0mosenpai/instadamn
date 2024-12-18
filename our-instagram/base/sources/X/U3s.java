package X;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes11.dex */
public final class U3s {
    public static final VM8 A01 = new Object();
    public static volatile U3s A02;
    public final java.util.Set A00 = new LinkedHashSet();

    private final java.util.Set A00() {
        java.util.Set A0k;
        java.util.Set set = this.A00;
        synchronized (set) {
            if (!set.isEmpty()) {
                A0k = AbstractC001800i.A0k(set);
            } else {
                A0k = null;
            }
        }
        return A0k;
    }

    public final void A01(int i, int i2) {
        java.util.Set A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((U3s) it.next()).A01(i, i2);
            }
        }
    }

    public final void A02(int i, int i2, long j) {
        java.util.Set A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((U3s) it.next()).A02(i, i2, j);
            }
        }
    }

    public final void A03(int i, int i2, long j, long j2, short s) {
        java.util.Set A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((U3s) it.next()).A03(i, i2, j, j2, s);
            }
        }
    }

    public final void A04(int i, int i2, String str, int i3) {
        java.util.Set A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((U3s) it.next()).A04(i, i2, str, i3);
            }
        }
    }

    public final void A05(int i, int i2, String str, long j) {
        java.util.Set A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((U3s) it.next()).A05(i, i2, str, j);
            }
        }
    }

    public final void A06(int i, int i2, String str, long j) {
        java.util.Set A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((U3s) it.next()).A06(i, i2, str, j);
            }
        }
    }

    public final void A07(int i, int i2, String str, String str2) {
        java.util.Set A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((U3s) it.next()).A07(i, i2, str, str2);
            }
        }
    }

    public final void A08(int i, int i2, String str, boolean z) {
        java.util.Set A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((U3s) it.next()).A08(i, i2, str, z);
            }
        }
    }

    public final void A09(int i, int i2, String str, String[] strArr) {
        java.util.Set A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((U3s) it.next()).A09(i, i2, str, strArr);
            }
        }
    }
}
