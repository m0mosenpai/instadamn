package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes10.dex */
public final class RWD extends TZ8<Long> implements InterfaceC65670Tr0, RandomAccess, InterfaceC65288ThL {
    public static final RWD A02;
    public long[] A01 = new long[10];
    public int A00 = 0;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.TZ8, X.RWD] */
    static {
        ?? tz8 = new TZ8();
        tz8.A01 = new long[0];
        tz8.A00 = 0;
        A02 = tz8;
        tz8.A00 = false;
    }

    @Override // X.TZ8, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RWD)) {
            return super.equals(obj);
        }
        RWD rwd = (RWD) obj;
        int i = this.A00;
        if (i == rwd.A00) {
            long[] jArr = rwd.A01;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.A01[i2] == jArr[i2]) {
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
            long j = this.A01[i2];
            Charset charset = SVB.A04;
            i = (i * 31) + AbstractC25228BEl.A03(j);
        }
        return i;
    }

    public static void A00(RWD rwd, int i) {
        if (i >= 0 && i < rwd.A00) {
        } else {
            throw AbstractC25229BEm.A0l("Index:", ", Size:", i, rwd.A00);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.TsD, X.TZ8, X.RWD] */
    @Override // X.InterfaceC65691TsD
    public final /* bridge */ /* synthetic */ InterfaceC65691TsD Cq5(int i) {
        if (i >= this.A00) {
            long[] copyOf = Arrays.copyOf(this.A01, i);
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
        if (obj instanceof Long) {
            long A0N = AbstractC166987dD.A0N(obj);
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.A01[i] == A0N) {
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

    public final void A02(long j) {
        A01();
        int i = this.A00;
        long[] jArr = this.A01;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.A01 = jArr2;
            jArr = jArr2;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        jArr[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long A0N = AbstractC166987dD.A0N(obj);
        A01();
        if (i >= 0 && i <= (i2 = this.A00)) {
            long[] jArr = this.A01;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.A01, i, jArr2, i + 1, this.A00 - i);
                this.A01 = jArr2;
            }
            this.A01[i] = A0N;
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
        if (!(collection instanceof RWD)) {
            return super.addAll(collection);
        }
        RWD rwd = (RWD) collection;
        int i = rwd.A00;
        if (i == 0) {
            return false;
        }
        int i2 = this.A00;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.A01;
            if (i3 > jArr.length) {
                jArr = Arrays.copyOf(jArr, i3);
                this.A01 = jArr;
            }
            System.arraycopy(rwd.A01, 0, jArr, this.A00, rwd.A00);
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
        return Long.valueOf(this.A01[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        A01();
        A00(this, i);
        long[] jArr = this.A01;
        long j = jArr[i];
        AbstractC58323PtF.A0z(this.A00, i, jArr);
        this.A00--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        A01();
        if (i2 >= i) {
            long[] jArr = this.A01;
            System.arraycopy(jArr, i2, jArr, i, this.A00 - i2);
            this.A00 -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw AbstractC58318PtA.A0a("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long A0N = AbstractC166987dD.A0N(obj);
        A01();
        A00(this, i);
        long[] jArr = this.A01;
        long j = jArr[i];
        jArr[i] = A0N;
        return Long.valueOf(j);
    }

    @Override // X.TZ8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        A02(AbstractC166987dD.A0N(obj));
        return true;
    }
}
