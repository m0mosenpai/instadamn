package X;

import java.util.Iterator;

/* renamed from: X.PKe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56834PKe implements Comparable {
    public int A00;
    public final int[] A01 = new int[O10.A00];

    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C56834PKe c56834PKe) {
        int i;
        int i2;
        C14360o3.A0B(c56834PKe, 0);
        Iterator it = O10.A01.iterator();
        while (true) {
            if (it.hasNext()) {
                EnumC53179Nfb enumC53179Nfb = (EnumC53179Nfb) it.next();
                int[] iArr = this.A01;
                int ordinal = enumC53179Nfb.ordinal();
                i = iArr[ordinal];
                i2 = c56834PKe.A01[ordinal];
                if (i != i2) {
                    break;
                }
            } else {
                i = this.A00;
                i2 = c56834PKe.A00;
                break;
            }
        }
        return i - i2;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C56834PKe) && this.A00 == ((C56834PKe) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return AbstractC25235BEs.A0q("SyncQuality(duration=", this.A00);
    }

    public C56834PKe(int i) {
        this.A00 = i;
        Iterator it = O10.A01.iterator();
        while (it.hasNext()) {
            this.A01[((EnumC53179Nfb) it.next()).ordinal()] = 0;
        }
    }
}
