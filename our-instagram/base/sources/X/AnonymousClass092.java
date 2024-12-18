package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* renamed from: X.092, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass092<T> extends AbstractC06990Yq<T> implements RandomAccess {
    public int A00;
    public int A01;
    public final int A02;
    public final Object[] A03;

    public final void A09(int i) {
        if (i >= 0) {
            if (i <= size()) {
                if (i > 0) {
                    int i2 = this.A01;
                    int i3 = this.A02;
                    int i4 = (i2 + i) % i3;
                    Object[] objArr = this.A03;
                    if (i2 > i4) {
                        AbstractC06960Yn.A0V(objArr, i2, i3);
                        AbstractC06960Yn.A0V(objArr, 0, i4);
                    } else {
                        AbstractC06960Yn.A0V(objArr, i2, i4);
                    }
                    this.A01 = i4;
                    this.A00 = size() - i;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(AnonymousClass001.A02(i, size(), "n shouldn't be greater than the buffer size: n = ", ", size = "));
        }
        throw new IllegalArgumentException(AnonymousClass001.A0O("n shouldn't be negative but it is ", i));
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        C14360o3.A0B(objArr, 0);
        if (objArr.length < size()) {
            objArr = Arrays.copyOf(objArr, size());
            C14360o3.A07(objArr);
        }
        int size = size();
        int i = 0;
        int i2 = 0;
        for (int i3 = this.A01; i2 < size && i3 < this.A02; i3++) {
            objArr[i2] = this.A03[i3];
            i2++;
        }
        while (i2 < size) {
            objArr[i2] = this.A03[i];
            i2++;
            i++;
        }
        if (size < objArr.length) {
            objArr[size] = null;
        }
        return objArr;
    }

    @Override // X.AbstractC17040sw
    public final int A08() {
        return this.A00;
    }

    @Override // X.AbstractC06990Yq, X.AbstractC17040sw, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new AbstractC17030sv() { // from class: X.0Yj
            public int A00;
            public int A01;

            {
                this.A00 = AnonymousClass092.this.size();
                this.A01 = AnonymousClass092.this.A01;
            }

            @Override // X.AbstractC17030sv
            public final void A00() {
                int i = this.A00;
                if (i == 0) {
                    super.A00 = 2;
                    return;
                }
                AnonymousClass092 anonymousClass092 = AnonymousClass092.this;
                Object[] objArr = anonymousClass092.A03;
                int i2 = this.A01;
                super.A01 = objArr[i2];
                super.A00 = 1;
                this.A01 = (i2 + 1) % anonymousClass092.A02;
                this.A00 = i - 1;
            }
        };
    }

    public AnonymousClass092(Object[] objArr, int i) {
        this.A03 = objArr;
        if (i >= 0) {
            int length = objArr.length;
            if (i <= length) {
                this.A02 = length;
                this.A00 = i;
                return;
            }
            throw new IllegalArgumentException(AnonymousClass001.A02(i, length, "ring buffer filled size: ", " cannot be larger than the buffer size: "));
        }
        throw new IllegalArgumentException(AnonymousClass001.A0O("ring buffer filled size should not be negative but it is ", i));
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final Object get(int i) {
        C0eC.A02(i, size());
        return this.A03[(this.A01 + i) % this.A02];
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
