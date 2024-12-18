package X;

import java.util.NoSuchElementException;

/* renamed from: X.6C5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6C5 extends C6C6 {
    public final Object[] A00;

    public C6C5(Object[] objArr, int i, int i2) {
        C14360o3.A0B(objArr, 1);
        super.A00 = i;
        this.A01 = i2;
        this.A00 = objArr;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            Object[] objArr = this.A00;
            int i = super.A00 - 1;
            super.A00 = i;
            return objArr[i];
        }
        throw new NoSuchElementException();
    }
}
