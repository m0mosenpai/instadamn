package X;

import java.io.Serializable;

/* loaded from: classes10.dex */
public final class TI9 implements Serializable {
    public static final TI9 A03 = new TI9(new Object[4], 1, 0);
    public final int A00;
    public final int A01;
    public final Object[] A02;

    public TI9(Object[] objArr, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = objArr;
    }

    public final Object A00(String str) {
        int hashCode = str.hashCode();
        int i = this.A00;
        int i2 = hashCode & i;
        int i3 = i2 << 1;
        Object[] objArr = this.A02;
        Object obj = objArr[i3];
        if (obj != str && !str.equals(obj)) {
            if (obj == null) {
                return null;
            }
            int i4 = i + 1;
            i3 = ((i2 >> 1) + i4) << 1;
            Object obj2 = objArr[i3];
            if (!str.equals(obj2)) {
                if (obj2 == null) {
                    return null;
                }
                i3 = (i4 + (i4 >> 1)) << 1;
                int i5 = this.A01 + i3;
                while (i3 < i5) {
                    Object obj3 = objArr[i3];
                    if (obj3 != str && !str.equals(obj3)) {
                        i3 += 2;
                    }
                }
                return null;
            }
        }
        return objArr[i3 + 1];
    }
}
