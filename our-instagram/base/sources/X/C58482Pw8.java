package X;

import java.util.NoSuchElementException;

/* renamed from: X.Pw8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58482Pw8 extends C6C6 {
    public int A00;
    public boolean A01;
    public Object[] A02;

    public C58482Pw8(Object[] objArr, int i, int i2, int i3) {
        C14360o3.A0B(objArr, 1);
        super.A00 = i;
        super.A01 = i2;
        this.A00 = i3;
        Object[] objArr2 = new Object[i3];
        this.A02 = objArr2;
        boolean A1P = AbstractC167007dF.A1P(i, i2);
        this.A01 = A1P;
        objArr2[0] = objArr;
        A00(this, i - (A1P ? 1 : 0), 1);
    }

    public static final void A00(C58482Pw8 c58482Pw8, int i, int i2) {
        int i3 = (c58482Pw8.A00 - i2) * 5;
        while (i2 < c58482Pw8.A00) {
            Object[] objArr = c58482Pw8.A02;
            Object obj = objArr[i2 - 1];
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i2] = ((Object[]) obj)[(i >> i3) & 31];
            i3 -= 5;
            i2++;
        }
    }

    @Override // X.C6C6, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            int i = super.A00 & 31;
            Object obj = this.A02[this.A00 - 1];
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
            Object obj2 = ((Object[]) obj)[i];
            int i2 = super.A00 + 1;
            super.A00 = i2;
            if (i2 == super.A01) {
                this.A01 = true;
            } else {
                int i3 = 0;
                while (((i2 >> i3) & 31) == 0) {
                    i3 += 5;
                }
                if (i3 > 0) {
                    A00(this, i2, ((this.A00 - 1) - (i3 / 5)) + 1);
                    return obj2;
                }
            }
            return obj2;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = super.A00 - 1;
            super.A00 = i;
            if (this.A01) {
                this.A01 = false;
            } else {
                int i2 = 0;
                while (((i >> i2) & 31) == 31) {
                    i2 += 5;
                }
                if (i2 > 0) {
                    A00(this, i, ((this.A00 - 1) - (i2 / 5)) + 1);
                }
            }
            int i3 = super.A00 & 31;
            Object obj = this.A02[this.A00 - 1];
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
            return ((Object[]) obj)[i3];
        }
        throw AbstractC58318PtA.A13();
    }
}
