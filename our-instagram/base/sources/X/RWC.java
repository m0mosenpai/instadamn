package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes10.dex */
public final class RWC extends TZ8<Integer> implements InterfaceC65672Tr2, RandomAccess, InterfaceC65288ThL {
    public static final RWC A02;
    public int[] A01 = new int[10];
    public int A00 = 0;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.TZ8, X.RWC] */
    static {
        ?? tz8 = new TZ8();
        tz8.A01 = new int[0];
        tz8.A00 = 0;
        A02 = tz8;
        tz8.A00 = false;
    }

    @Override // X.TZ8, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RWC)) {
            return super.equals(obj);
        }
        RWC rwc = (RWC) obj;
        int i = this.A00;
        if (i == rwc.A00) {
            int[] iArr = rwc.A01;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.A01[i2] == iArr[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.TZ8, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.A00; i2++) {
            i = (i * 31) + this.A01[i2];
        }
        return i;
    }

    public static void A00(RWC rwc, int i) {
        if (i >= 0 && i < rwc.A00) {
        } else {
            throw AbstractC25229BEm.A0l("Index:", ", Size:", i, rwc.A00);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.TsD, X.TZ8, X.RWC] */
    @Override // X.InterfaceC65691TsD
    public final /* bridge */ /* synthetic */ InterfaceC65691TsD Cq5(int i) {
        if (i >= this.A00) {
            int[] copyOf = Arrays.copyOf(this.A01, i);
            int i2 = this.A00;
            ?? tz8 = new TZ8();
            tz8.A01 = copyOf;
            tz8.A00 = i2;
            return tz8;
        }
        throw AbstractC58318PtA.A0Y();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int A0H = AbstractC166987dD.A0H(obj);
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.A01[i] == A0H) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00;
    }

    @Override // X.InterfaceC65672Tr2
    public final void A8o(int i) {
        A01();
        int i2 = this.A00;
        int[] iArr = this.A01;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.A01 = iArr2;
            iArr = iArr2;
        }
        int i3 = this.A00;
        this.A00 = i3 + 1;
        iArr[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int A0H = AbstractC166987dD.A0H(obj);
        A01();
        if (i >= 0 && i <= (i2 = this.A00)) {
            int[] iArr = this.A01;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[((i2 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.A01, i, iArr2, i + 1, this.A00 - i);
                this.A01 = iArr2;
            }
            this.A01[i] = A0H;
            this.A00++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw AbstractC25229BEm.A0l("Index:", ", Size:", i, this.A00);
    }

    @Override // X.TZ8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        A01();
        Charset charset = SVB.A04;
        collection.getClass();
        if (!(collection instanceof RWC)) {
            return super.addAll(collection);
        }
        RWC rwc = (RWC) collection;
        int i = rwc.A00;
        if (i == 0) {
            return false;
        }
        int i2 = this.A00;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.A01;
            if (i3 > iArr.length) {
                iArr = Arrays.copyOf(iArr, i3);
                this.A01 = iArr;
            }
            System.arraycopy(rwc.A01, 0, iArr, this.A00, rwc.A00);
            this.A00 = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return MSY.A1S(indexOf(obj), -1);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        A00(this, i);
        return Integer.valueOf(this.A01[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        A01();
        A00(this, i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        AbstractC58323PtF.A0z(this.A00, i, iArr);
        this.A00--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        A01();
        if (i2 >= i) {
            int[] iArr = this.A01;
            System.arraycopy(iArr, i2, iArr, i, this.A00 - i2);
            this.A00 -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw AbstractC58318PtA.A0a("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int A0H = AbstractC166987dD.A0H(obj);
        A01();
        A00(this, i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        iArr[i] = A0H;
        return Integer.valueOf(i2);
    }

    @Override // X.TZ8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        A8o(AbstractC166987dD.A0H(obj));
        return true;
    }
}
