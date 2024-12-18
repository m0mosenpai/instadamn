package X;

import java.lang.reflect.Array;
import java.util.List;

/* loaded from: classes10.dex */
public final class SQ8 {
    public int A00;
    public Object[] A01;
    public C1126556v A02;
    public C1126556v A03;

    public final Object[] A04(Object[] objArr) {
        C1126556v c1126556v = new C1126556v(null, objArr);
        if (this.A02 == null) {
            this.A03 = c1126556v;
            this.A02 = c1126556v;
        } else {
            C1126556v c1126556v2 = this.A03;
            if (c1126556v2.A00 == null) {
                c1126556v2.A00 = c1126556v;
                this.A03 = c1126556v;
            } else {
                throw AbstractC58318PtA.A0Z();
            }
        }
        int length = objArr.length;
        this.A00 += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new Object[length];
    }

    public final void A00() {
        C1126556v c1126556v = this.A03;
        if (c1126556v != null) {
            this.A01 = (Object[]) c1126556v.A01;
        }
        this.A03 = null;
        this.A02 = null;
        this.A00 = 0;
    }

    public final void A01(List list, Object[] objArr, int i) {
        int i2;
        C1126556v c1126556v = this.A02;
        while (true) {
            i2 = 0;
            if (c1126556v == null) {
                break;
            }
            Object[] objArr2 = (Object[]) c1126556v.A01;
            int length = objArr2.length;
            while (i2 < length) {
                list.add(objArr2[i2]);
                i2++;
            }
            c1126556v = c1126556v.A00;
        }
        while (i2 < i) {
            list.add(objArr[i2]);
            i2++;
        }
        A00();
    }

    public final void A02(Object[] objArr, int i, int i2, Object obj) {
        int i3 = 0;
        for (C1126556v c1126556v = this.A02; c1126556v != null; c1126556v = c1126556v.A00) {
            Object[] objArr2 = (Object[]) c1126556v.A01;
            int length = objArr2.length;
            System.arraycopy(objArr2, 0, obj, i3, length);
            i3 += length;
        }
        System.arraycopy(objArr, 0, obj, i3, i2);
        int i4 = i3 + i2;
        if (i4 != i) {
            throw AbstractC166987dD.A14(AnonymousClass001.A02(i, i4, "Should have gotten ", " entries, got "));
        }
    }

    public final Object[] A06(Object[] objArr, int i, Class cls) {
        int i2 = this.A00 + i;
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) cls, i2);
        A02(objArr, i2, i, objArr2);
        A00();
        return objArr2;
    }

    public final Object[] A03() {
        A00();
        Object[] objArr = this.A01;
        if (objArr == null) {
            Object[] objArr2 = new Object[12];
            this.A01 = objArr2;
            return objArr2;
        }
        return objArr;
    }

    public final Object[] A05(Object[] objArr, int i) {
        A00();
        Object[] objArr2 = this.A01;
        if (objArr2 == null || objArr2.length < i) {
            objArr2 = new Object[Math.max(12, i)];
            this.A01 = objArr2;
        }
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return this.A01;
    }
}
