package X;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes10.dex */
public final class ROB extends TZ5 implements RandomAccess {
    public static final ROB A02 = new ROB(new Object[0], 0, false);
    public int A00;
    public Object[] A01;

    public static ROB A00() {
        return A02;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00;
    }

    private final String A01(int i) {
        return AnonymousClass001.A02(i, this.A00, "Index:", ", Size:");
    }

    private final void A02(int i) {
        if (i >= 0 && i < this.A00) {
        } else {
            throw AbstractC58318PtA.A0a(A01(i));
        }
    }

    @Override // X.InterfaceC65693TsF
    public final /* bridge */ /* synthetic */ InterfaceC65693TsF FG7(int i) {
        if (i >= this.A00) {
            return new ROB(Arrays.copyOf(this.A01, i), this.A00, true);
        }
        throw AbstractC58318PtA.A0Y();
    }

    public ROB(Object[] objArr, int i, boolean z) {
        super(z);
        this.A01 = objArr;
        this.A00 = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        A03();
        if (i >= 0 && i <= (i2 = this.A00)) {
            int i3 = i + 1;
            Object[] objArr = this.A01;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i3, i2 - i);
            } else {
                Object[] A1b = AbstractC58323PtF.A1b(objArr, i2, i);
                System.arraycopy(this.A01, i, A1b, i3, this.A00 - i);
                this.A01 = A1b;
            }
            this.A01[i] = obj;
            this.A00++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw AbstractC58318PtA.A0a(A01(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        A02(i);
        return this.A01[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        A03();
        A02(i);
        Object[] objArr = this.A01;
        Object obj = objArr[i];
        AbstractC58323PtF.A0z(this.A00, i, objArr);
        this.A00--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        A03();
        A02(i);
        Object[] objArr = this.A01;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    public ROB() {
        this(new Object[10], 0, true);
    }

    @Override // X.TZ5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        A03();
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
