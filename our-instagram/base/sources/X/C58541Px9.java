package X;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: X.Px9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58541Px9<E> extends AbstractC58537Px5<E> implements RandomAccess {
    public static final C58541Px9 A02;
    public int A00;
    public Object[] A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Px9, X.Px5] */
    static {
        ?? abstractC58537Px5 = new AbstractC58537Px5(false);
        abstractC58537Px5.A01 = new Object[0];
        abstractC58537Px5.A00 = 0;
        A02 = abstractC58537Px5;
    }

    public C58541Px9() {
        super(true);
        this.A01 = new Object[10];
        this.A00 = 0;
    }

    private void A00(int index) {
        if (index >= 0 && index < this.A00) {
        } else {
            throw new IndexOutOfBoundsException(AnonymousClass001.A02(index, this.A00, "Index:", ", Size:"));
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.TsC, X.Px9, X.Px5] */
    @Override // X.InterfaceC65690TsC
    public final /* bridge */ /* synthetic */ InterfaceC65690TsC Cq4(int capacity) {
        if (capacity >= this.A00) {
            Object[] copyOf = Arrays.copyOf(this.A01, capacity);
            int i = this.A00;
            ?? abstractC58537Px5 = new AbstractC58537Px5(true);
            abstractC58537Px5.A01 = copyOf;
            abstractC58537Px5.A00 = i;
            return abstractC58537Px5;
        }
        throw AbstractC58318PtA.A0Y();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int index, Object element) {
        int i;
        A01();
        if (index >= 0 && index <= (i = this.A00)) {
            Object[] objArr = this.A01;
            if (i < objArr.length) {
                System.arraycopy(objArr, index, objArr, index + 1, i - index);
            } else {
                Object[] A1b = AbstractC58323PtF.A1b(objArr, i, index);
                System.arraycopy(this.A01, index, A1b, index + 1, this.A00 - index);
                this.A01 = A1b;
            }
            this.A01[index] = element;
            this.A00++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw AbstractC25229BEm.A0l("Index:", ", Size:", index, this.A00);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int index) {
        A00(index);
        return this.A01[index];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int index) {
        A01();
        A00(index);
        Object[] objArr = this.A01;
        Object obj = objArr[index];
        AbstractC58323PtF.A0z(this.A00, index, objArr);
        this.A00--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int index, Object element) {
        A01();
        A00(index);
        Object[] objArr = this.A01;
        Object obj = objArr[index];
        objArr[index] = element;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // X.AbstractC58537Px5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object element) {
        A01();
        int i = this.A00;
        Object[] objArr = this.A01;
        if (i == objArr.length) {
            objArr = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
            this.A01 = objArr;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        objArr[i2] = element;
        ((AbstractList) this).modCount++;
        return true;
    }
}
