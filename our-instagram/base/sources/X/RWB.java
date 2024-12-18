package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes10.dex */
public final class RWB extends TZ8<Float> implements InterfaceC65671Tr1, RandomAccess, InterfaceC65288ThL {
    public static final RWB A02;
    public float[] A01 = new float[10];
    public int A00 = 0;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.TZ8, X.RWB] */
    static {
        ?? tz8 = new TZ8();
        tz8.A01 = new float[0];
        tz8.A00 = 0;
        A02 = tz8;
        tz8.A00 = false;
    }

    @Override // X.TZ8, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RWB)) {
            return super.equals(obj);
        }
        RWB rwb = (RWB) obj;
        int i = this.A00;
        if (i == rwb.A00) {
            float[] fArr = rwb.A01;
            for (int i2 = 0; i2 < i; i2++) {
                if (Float.floatToIntBits(this.A01[i2]) == Float.floatToIntBits(fArr[i2])) {
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
            i = (i * 31) + Float.floatToIntBits(this.A01[i2]);
        }
        return i;
    }

    private void A00(int i) {
        if (i >= 0 && i < this.A00) {
        } else {
            throw AbstractC25229BEm.A0l("Index:", ", Size:", i, this.A00);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.TsD, X.TZ8, X.RWB] */
    @Override // X.InterfaceC65691TsD
    public final /* bridge */ /* synthetic */ InterfaceC65691TsD Cq5(int i) {
        if (i >= this.A00) {
            float[] copyOf = Arrays.copyOf(this.A01, i);
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
        if (obj instanceof Float) {
            float A09 = AbstractC166987dD.A09(obj);
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.A01[i] == A09) {
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

    @Override // X.InterfaceC65671Tr1
    public final void A8b(float f) {
        A01();
        int i = this.A00;
        float[] fArr = this.A01;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.A01 = fArr2;
            fArr = fArr2;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        fArr[i2] = f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float A09 = AbstractC166987dD.A09(obj);
        A01();
        if (i >= 0 && i <= (i2 = this.A00)) {
            float[] fArr = this.A01;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.A01, i, fArr2, i + 1, this.A00 - i);
                this.A01 = fArr2;
            }
            this.A01[i] = A09;
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
        if (!(collection instanceof RWB)) {
            return super.addAll(collection);
        }
        RWB rwb = (RWB) collection;
        int i = rwb.A00;
        if (i == 0) {
            return false;
        }
        int i2 = this.A00;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.A01;
            if (i3 > fArr.length) {
                fArr = Arrays.copyOf(fArr, i3);
                this.A01 = fArr;
            }
            System.arraycopy(rwb.A01, 0, fArr, this.A00, rwb.A00);
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
        A00(i);
        return Float.valueOf(this.A01[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        A01();
        A00(i);
        float[] fArr = this.A01;
        float f = fArr[i];
        AbstractC58323PtF.A0z(this.A00, i, fArr);
        this.A00--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        A01();
        if (i2 >= i) {
            float[] fArr = this.A01;
            System.arraycopy(fArr, i2, fArr, i, this.A00 - i2);
            this.A00 -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw AbstractC58318PtA.A0a("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float A09 = AbstractC166987dD.A09(obj);
        A01();
        A00(i);
        float[] fArr = this.A01;
        float f = fArr[i];
        fArr[i] = A09;
        return Float.valueOf(f);
    }

    @Override // X.TZ8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        A8b(AbstractC166987dD.A09(obj));
        return true;
    }
}
