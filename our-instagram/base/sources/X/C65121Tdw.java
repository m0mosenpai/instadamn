package X;

import java.util.ListIterator;

/* renamed from: X.Tdw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65121Tdw extends C6C6 implements ListIterator, C0s1 {
    public int A00;
    public int A01;
    public C58482Pw8 A02;
    public final C58484PwA A03;

    private final void A00() {
        if (this.A00 == this.A03.A0O()) {
        } else {
            throw AbstractC58318PtA.A0z();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    private final void A01() {
        C58482Pw8 c58482Pw8;
        C58484PwA c58484PwA = this.A03;
        Object[] objArr = c58484PwA.A03;
        if (objArr == null) {
            c58482Pw8 = null;
        } else {
            int A08 = AbstractC58318PtA.A08(c58484PwA) & (-32);
            int i = super.A00;
            if (i > A08) {
                i = A08;
            }
            int i2 = (c58484PwA.A00 / 5) + 1;
            C58482Pw8 c58482Pw82 = this.A02;
            if (c58482Pw82 == null) {
                c58482Pw8 = new C58482Pw8(objArr, i, A08, i2);
            } else {
                ((C6C6) c58482Pw82).A00 = i;
                ((C6C6) c58482Pw82).A01 = A08;
                c58482Pw82.A00 = i2;
                Object[] objArr2 = c58482Pw82.A02;
                if (objArr2.length < i2) {
                    objArr2 = new Object[i2];
                    c58482Pw82.A02 = objArr2;
                }
                ?? r1 = 0;
                objArr2[0] = objArr;
                if (i == A08) {
                    r1 = 1;
                }
                c58482Pw82.A01 = r1;
                C58482Pw8.A00(c58482Pw82, i - r1, 1);
                return;
            }
        }
        this.A02 = c58482Pw8;
    }

    public C65121Tdw(C58484PwA c58484PwA, int i) {
        int size = c58484PwA.size();
        super.A00 = i;
        super.A01 = size;
        this.A03 = c58484PwA;
        this.A00 = c58484PwA.A0O();
        this.A01 = -1;
        A01();
    }

    @Override // X.C6C6, java.util.ListIterator
    public final void add(Object obj) {
        A00();
        C58484PwA c58484PwA = this.A03;
        c58484PwA.add(super.A00, obj);
        super.A00++;
        super.A01 = c58484PwA.size();
        this.A00 = c58484PwA.A0O();
        this.A01 = -1;
        A01();
    }

    @Override // X.C6C6, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        Object[] objArr;
        A00();
        if (hasNext()) {
            int i = super.A00;
            this.A01 = i;
            C58482Pw8 c58482Pw8 = this.A02;
            if (c58482Pw8 == null) {
                objArr = this.A03.A04;
                super.A00 = i + 1;
            } else {
                if (c58482Pw8.hasNext()) {
                    super.A00 = i + 1;
                    return c58482Pw8.next();
                }
                objArr = this.A03.A04;
                super.A00 = i + 1;
                i -= ((C6C6) c58482Pw8).A01;
            }
            return objArr[i];
        }
        throw AbstractC58318PtA.A13();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        Object[] objArr;
        A00();
        if (hasPrevious()) {
            int i = super.A00;
            int i2 = i - 1;
            this.A01 = i2;
            C58482Pw8 c58482Pw8 = this.A02;
            if (c58482Pw8 == null) {
                objArr = this.A03.A04;
                super.A00 = i2;
            } else {
                int i3 = ((C6C6) c58482Pw8).A01;
                if (i > i3) {
                    objArr = this.A03.A04;
                    super.A00 = i2;
                    i2 -= i3;
                } else {
                    super.A00 = i2;
                    return c58482Pw8.previous();
                }
            }
            return objArr[i2];
        }
        throw AbstractC58318PtA.A13();
    }

    @Override // X.C6C6, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        A00();
        int i = this.A01;
        if (i != -1) {
            C58484PwA c58484PwA = this.A03;
            c58484PwA.remove(i);
            int i2 = this.A01;
            if (i2 < super.A00) {
                super.A00 = i2;
            }
            super.A01 = c58484PwA.size();
            this.A00 = c58484PwA.A0O();
            this.A01 = -1;
            A01();
            return;
        }
        throw AbstractC58318PtA.A0Z();
    }

    @Override // X.C6C6, java.util.ListIterator
    public final void set(Object obj) {
        A00();
        int i = this.A01;
        if (i != -1) {
            C58484PwA c58484PwA = this.A03;
            c58484PwA.set(i, obj);
            this.A00 = c58484PwA.A0O();
            A01();
            return;
        }
        throw AbstractC58318PtA.A0Z();
    }
}
