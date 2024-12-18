package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.57S, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C57S implements RandomAccess {
    public int A00 = 0;
    public List A01;
    public Object[] A02;

    public C57S(Object[] objArr) {
        this.A02 = objArr;
    }

    public final Object A00(int i) {
        Object[] objArr = this.A02;
        Object obj = objArr[i];
        int i2 = this.A00;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.A00 - 1;
        this.A00 = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void A01() {
        Object[] objArr = this.A02;
        int i = this.A00;
        while (true) {
            i--;
            if (-1 < i) {
                objArr[i] = null;
            } else {
                this.A00 = 0;
                return;
            }
        }
    }

    public final void A02(int i) {
        Object[] objArr = this.A02;
        int length = objArr.length;
        if (length < i) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i, length * 2));
            C14360o3.A07(copyOf);
            this.A02 = copyOf;
        }
    }

    public final void A03(int i, int i2) {
        if (i2 > i) {
            int i3 = this.A00;
            if (i2 < i3) {
                Object[] objArr = this.A02;
                AbstractC06960Yn.A0W(objArr, objArr, i, i2, i3);
            }
            int i4 = this.A00;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.A02[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.A00 = i5;
        }
    }

    public final void A04(int i, Object obj) {
        A02(this.A00 + 1);
        Object[] objArr = this.A02;
        int i2 = this.A00;
        if (i != i2) {
            AbstractC06960Yn.A0W(objArr, objArr, i + 1, i, i2);
        }
        objArr[i] = obj;
        this.A00++;
    }

    public final void A06(C57S c57s, int i) {
        int i2 = c57s.A00;
        if (i2 != 0) {
            A02(this.A00 + i2);
            Object[] objArr = this.A02;
            int i3 = this.A00;
            if (i != i3) {
                AbstractC06960Yn.A0W(objArr, objArr, c57s.A00 + i, i, i3);
            }
            AbstractC06960Yn.A0W(c57s.A02, objArr, i, 0, c57s.A00);
            this.A00 += c57s.A00;
        }
    }

    public final void A07(Comparator comparator) {
        Arrays.sort(this.A02, 0, this.A00, comparator);
    }

    public final boolean A09(Object obj) {
        A02(this.A00 + 1);
        Object[] objArr = this.A02;
        int i = this.A00;
        objArr[i] = obj;
        this.A00 = i + 1;
        return true;
    }

    public final boolean A0A(Object obj) {
        int i = this.A00 - 1;
        if (i >= 0) {
            for (int i2 = 0; !C14360o3.A0K(this.A02[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean A0B(Object obj) {
        int i = this.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = this.A02;
            while (!C14360o3.A0K(obj, objArr[i2])) {
                i2++;
                if (i2 >= i) {
                    return false;
                }
            }
            if (i2 >= 0) {
                A00(i2);
                return true;
            }
            return false;
        }
        return false;
    }

    public final void A05(int i, List list) {
        if (!list.isEmpty()) {
            A02(this.A00 + list.size());
            Object[] objArr = this.A02;
            if (i != this.A00) {
                AbstractC06960Yn.A0W(objArr, objArr, list.size() + i, i, this.A00);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i + i2] = list.get(i2);
            }
            this.A00 += list.size();
        }
    }

    public final boolean A08(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        A02(this.A00 + collection.size());
        Object[] objArr = this.A02;
        if (i != this.A00) {
            AbstractC06960Yn.A0W(objArr, objArr, collection.size() + i, i, this.A00);
        }
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            objArr[i2 + i] = obj;
            i2 = i3;
        }
        this.A00 += collection.size();
        return true;
    }
}
