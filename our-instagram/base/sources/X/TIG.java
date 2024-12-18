package X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class TIG implements Serializable {
    public final Class A00;
    public final Enum A01;
    public final HashMap A02;
    public final boolean A03;
    public final boolean A04;
    public final Enum[] A05;

    public final TI9 A02() {
        int i;
        HashMap hashMap = this.A02;
        if (hashMap.isEmpty()) {
            return TI9.A03;
        }
        int size = hashMap.size();
        if (size <= 5) {
            i = 8;
        } else {
            i = 16;
            if (size > 12) {
                i = 32;
                while (i < size + (size >> 2)) {
                    i += i;
                }
            }
        }
        int i2 = i - 1;
        int i3 = (i >> 1) + i;
        Object[] objArr = new Object[i3 * 2];
        int i4 = 0;
        Iterator A14 = AbstractC166997dE.A14(hashMap);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            String A17 = AbstractC31172DnG.A17(A1K);
            if (A17 != null) {
                int hashCode = A17.hashCode() & i2;
                int i5 = hashCode + hashCode;
                if (objArr[i5] != null) {
                    i5 = ((hashCode >> 1) + i) << 1;
                    if (objArr[i5] != null) {
                        i5 = (i3 << 1) + i4;
                        i4 += 2;
                        if (i5 >= objArr.length) {
                            objArr = Arrays.copyOf(objArr, objArr.length + 4);
                        }
                    }
                }
                objArr[i5] = A17;
                objArr[i5 + 1] = A1K.getValue();
            }
        }
        return new TI9(objArr, i2, i4);
    }

    public TIG(Class cls, Enum r2, HashMap hashMap, Enum[] enumArr, boolean z, boolean z2) {
        this.A00 = cls;
        this.A05 = enumArr;
        this.A02 = hashMap;
        this.A01 = r2;
        this.A04 = z;
        this.A03 = z2;
    }

    public static TIG A00(C912845h c912845h, Class cls) {
        Enum r10;
        C44W A00 = c912845h.A00();
        boolean A08 = c912845h.A08(C45Y.A03);
        Enum[] A01 = A01(cls);
        HashMap A1G = AbstractC166987dD.A1G();
        int length = A01.length;
        String[][] strArr = new String[length];
        if (A00 != null) {
            A00.A0l(cls, A01, strArr);
        }
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            Enum r5 = A01[length];
            A1G.put(r5.toString(), r5);
            String[] strArr2 = strArr[length];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    if (!A1G.containsKey(str)) {
                        A1G.put(str, r5);
                    }
                }
            }
        }
        if (A00 != null) {
            r10 = A00.A0U(cls);
        } else {
            r10 = null;
        }
        return new TIG(cls, r10, A1G, A01, A08, false);
    }

    public static Enum[] A01(Class cls) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr != null) {
            return enumArr;
        }
        throw AbstractC167007dF.A0c("No enum constants for class ", cls.getName());
    }
}
