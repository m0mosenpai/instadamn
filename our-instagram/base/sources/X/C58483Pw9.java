package X;

import java.util.NoSuchElementException;

/* renamed from: X.Pw9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58483Pw9 extends C6C6 {
    public final C58482Pw8 A00;
    public final Object[] A01;

    public C58483Pw9(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        AbstractC167017dG.A1P(objArr, objArr2);
        super.A00 = i;
        super.A01 = i2;
        this.A01 = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.A00 = new C58482Pw8(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // X.C6C6, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            C58482Pw8 c58482Pw8 = this.A00;
            if (c58482Pw8.hasNext()) {
                super.A00++;
                return c58482Pw8.next();
            }
            Object[] objArr = this.A01;
            int i = super.A00;
            super.A00 = i + 1;
            return objArr[i - ((C6C6) c58482Pw8).A01];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = super.A00;
            C58482Pw8 c58482Pw8 = this.A00;
            int i2 = ((C6C6) c58482Pw8).A01;
            if (i > i2) {
                Object[] objArr = this.A01;
                int i3 = i - 1;
                super.A00 = i3;
                return objArr[i3 - i2];
            }
            super.A00 = i - 1;
            return c58482Pw8.previous();
        }
        throw AbstractC58318PtA.A13();
    }
}
