package X;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes10.dex */
public final class RWF<E> extends TZ8<E> implements RandomAccess {
    public static final RWF A02;
    public Object[] A01 = new Object[10];
    public int A00 = 0;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.TZ8, X.RWF] */
    static {
        ?? tz8 = new TZ8();
        tz8.A01 = new Object[0];
        tz8.A00 = 0;
        A02 = tz8;
        tz8.A00 = false;
    }

    private void A00(int i) {
        if (i >= 0 && i < this.A00) {
        } else {
            throw AbstractC25229BEm.A0l("Index:", ", Size:", i, this.A00);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.TsD, X.TZ8, X.RWF] */
    @Override // X.InterfaceC65691TsD
    public final /* bridge */ /* synthetic */ InterfaceC65691TsD Cq5(int i) {
        if (i >= this.A00) {
            Object[] copyOf = Arrays.copyOf(this.A01, i);
            int i2 = this.A00;
            ?? tz8 = new TZ8();
            tz8.A01 = copyOf;
            tz8.A00 = i2;
            return tz8;
        }
        throw AbstractC58318PtA.A0Y();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        A01();
        if (i >= 0 && i <= (i2 = this.A00)) {
            Object[] objArr = this.A01;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] A1b = AbstractC58323PtF.A1b(objArr, i2, i);
                System.arraycopy(this.A01, i, A1b, i + 1, this.A00 - i);
                this.A01 = A1b;
            }
            this.A01[i] = obj;
            this.A00++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw AbstractC25229BEm.A0l("Index:", ", Size:", i, this.A00);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        A00(i);
        return this.A01[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        A01();
        A00(i);
        Object[] objArr = this.A01;
        Object obj = objArr[i];
        AbstractC58323PtF.A0z(this.A00, i, objArr);
        this.A00--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        A01();
        A00(i);
        Object[] objArr = this.A01;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // X.TZ8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        A01();
        int i = this.A00;
        Object[] objArr = this.A01;
        if (i == objArr.length) {
            objArr = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
            this.A01 = objArr;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
