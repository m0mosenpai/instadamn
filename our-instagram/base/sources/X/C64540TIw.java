package X;

import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.TIw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64540TIw implements Iterable, Serializable {
    public int A00;
    public int A01;
    public int A02;
    public Object[] A03;
    public final Locale A04;
    public final Map A05;
    public final Map A06;
    public final boolean A07;
    public final RBV[] A08;

    public static final int A00(RBV rbv, C64540TIw c64540TIw) {
        RBV[] rbvArr = c64540TIw.A08;
        int length = rbvArr.length;
        for (int i = 0; i < length; i++) {
            if (rbvArr[i] == rbv) {
                return i;
            }
        }
        throw AbstractC58319PtB.A0k("Illegal state: property '", rbv.A06.A02, "' missing from _propsInOrder");
    }

    public final RBV A02(String str) {
        if (str != null) {
            if (this.A07) {
                str = str.toLowerCase(this.A04);
            }
            int hashCode = str.hashCode();
            int i = this.A00;
            int i2 = hashCode & i;
            int i3 = i2 << 1;
            Object[] objArr = this.A03;
            Object obj = objArr[i3];
            if (obj != str && !str.equals(obj)) {
                if (obj != null) {
                    int i4 = i + 1;
                    i3 = ((i2 >> 1) + i4) << 1;
                    Object obj2 = objArr[i3];
                    if (!str.equals(obj2)) {
                        if (obj2 != null) {
                            i3 = (i4 + (i4 >> 1)) << 1;
                            int i5 = this.A02 + i3;
                            while (i3 < i5) {
                                Object obj3 = objArr[i3];
                                if (obj3 == str || str.equals(obj3)) {
                                    break;
                                }
                                i3 += 2;
                            }
                        }
                    }
                }
                String A1A = AbstractC166987dD.A1A(str, this.A06);
                if (A1A == null) {
                    return null;
                }
                int hashCode2 = A1A.hashCode();
                int i6 = this.A00;
                int i7 = hashCode2 & i6;
                i3 = i7 << 1;
                objArr = this.A03;
                Object obj4 = objArr[i3];
                if (!A1A.equals(obj4)) {
                    if (obj4 == null) {
                        return null;
                    }
                    int i8 = i6 + 1;
                    i3 = ((i7 >> 1) + i8) << 1;
                    Object obj5 = objArr[i3];
                    if (!A1A.equals(obj5)) {
                        if (obj5 == null) {
                            return null;
                        }
                        i3 = (i8 + (i8 >> 1)) << 1;
                        int i9 = this.A02 + i3;
                        while (i3 < i9) {
                            Object obj6 = objArr[i3];
                            if (obj6 != A1A && !A1A.equals(obj6)) {
                                i3 += 2;
                            }
                        }
                        return null;
                    }
                }
            }
            return (RBV) objArr[i3 + 1];
        }
        throw AbstractC166987dD.A12("Cannot pass null property name");
    }

    public final C64540TIw A03(RBV rbv) {
        boolean z = this.A07;
        String str = rbv.A06.A02;
        if (z) {
            str = str.toLowerCase(this.A04);
        }
        Object[] objArr = this.A03;
        int length = objArr.length;
        for (int i = 1; i < length; i += 2) {
            RBV rbv2 = (RBV) objArr[i];
            if (rbv2 != null && rbv2.A06.A02.equals(str)) {
                return new C64540TIw(rbv, this, i, A00(rbv2, this));
            }
        }
        return new C64540TIw(rbv, this, str, str.hashCode() & this.A00);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList A17 = AbstractC25225BEi.A17(this.A01);
        Object[] objArr = this.A03;
        int length = objArr.length;
        for (int i = 1; i < length; i += 2) {
            Object obj = objArr[i];
            if (obj != null) {
                A17.add(obj);
            }
        }
        return A17.iterator();
    }

    public C64540TIw(C64540TIw c64540TIw, boolean z) {
        this.A07 = z;
        this.A04 = c64540TIw.A04;
        this.A05 = c64540TIw.A05;
        this.A06 = c64540TIw.A06;
        RBV[] rbvArr = c64540TIw.A08;
        RBV[] rbvArr2 = (RBV[]) Arrays.copyOf(rbvArr, rbvArr.length);
        this.A08 = rbvArr2;
        A04(Arrays.asList(rbvArr2));
    }

    public static RBV A01(C16L c16l, BeanDeserializerBase beanDeserializerBase, String str) {
        c16l.A1J();
        return beanDeserializerBase.A0A.A02(str);
    }

    public final void A04(Collection collection) {
        int i;
        int size = collection.size();
        this.A01 = size;
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
        this.A00 = i - 1;
        int i2 = (i >> 1) + i;
        Object[] objArr = new Object[i2 * 2];
        Iterator it = collection.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            RBV rbv = (RBV) it.next();
            if (rbv != null) {
                boolean z = this.A07;
                String str = rbv.A06.A02;
                if (z) {
                    str = str.toLowerCase(this.A04);
                }
                int hashCode = str.hashCode() & this.A00;
                int i4 = hashCode << 1;
                if (objArr[i4] != null) {
                    i4 = ((hashCode >> 1) + i) << 1;
                    if (objArr[i4] != null) {
                        i4 = (i2 << 1) + i3;
                        i3 += 2;
                        if (i4 >= objArr.length) {
                            objArr = Arrays.copyOf(objArr, objArr.length + 4);
                        }
                    }
                }
                objArr[i4] = str;
                objArr[i4 + 1] = rbv;
            }
        }
        this.A03 = objArr;
        this.A02 = i3;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Properties=[");
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            RBV rbv = (RBV) it.next();
            int i2 = i + 1;
            if (i > 0) {
                AbstractC58318PtA.A1S(A1C);
            }
            A1C.append(rbv.A06.A02);
            A1C.append('(');
            A1C.append(rbv.A04);
            A1C.append(')');
            i = i2;
        }
        A1C.append(']');
        Map map = this.A05;
        if (!map.isEmpty()) {
            A1C.append("(aliases: ");
            A1C.append(map);
            A1C.append(")");
        }
        return A1C.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.AbstractMap, java.util.HashMap] */
    public C64540TIw(Collection collection, Locale locale, Map map, boolean z) {
        ?? emptyMap;
        this.A07 = z;
        this.A08 = (RBV[]) collection.toArray(new RBV[collection.size()]);
        this.A05 = map;
        this.A04 = locale;
        if (map != null && !map.isEmpty()) {
            emptyMap = AbstractC166987dD.A1G();
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                String A17 = AbstractC31172DnG.A17(A1K);
                A17 = z ? A17.toLowerCase(locale) : A17;
                Iterator A1J = AbstractC25226BEj.A1J(A1K.getValue());
                while (A1J.hasNext()) {
                    String str = ((C913945y) A1J.next()).A02;
                    if (z) {
                        str = str.toLowerCase(locale);
                    }
                    emptyMap.put(str, A17);
                }
            }
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.A06 = emptyMap;
        A04(collection);
    }

    public C64540TIw(RBV rbv, C64540TIw c64540TIw, String str, int i) {
        this.A07 = c64540TIw.A07;
        this.A04 = c64540TIw.A04;
        this.A00 = c64540TIw.A00;
        this.A01 = c64540TIw.A01;
        this.A02 = c64540TIw.A02;
        this.A05 = c64540TIw.A05;
        this.A06 = c64540TIw.A06;
        Object[] objArr = c64540TIw.A03;
        this.A03 = Arrays.copyOf(objArr, objArr.length);
        RBV[] rbvArr = c64540TIw.A08;
        int length = rbvArr.length;
        RBV[] rbvArr2 = (RBV[]) Arrays.copyOf(rbvArr, length + 1);
        this.A08 = rbvArr2;
        rbvArr2[length] = rbv;
        int i2 = this.A00 + 1;
        int i3 = i << 1;
        Object[] objArr2 = this.A03;
        if (objArr2[i3] != null) {
            i3 = ((i >> 1) + i2) << 1;
            if (objArr2[i3] != null) {
                int i4 = this.A02;
                i3 = ((i2 + (i2 >> 1)) << 1) + i4;
                this.A02 = i4 + 2;
                int length2 = objArr2.length;
                if (i3 >= length2) {
                    objArr2 = Arrays.copyOf(objArr2, length2 + 4);
                    this.A03 = objArr2;
                }
            }
        }
        objArr2[i3] = str;
        objArr2[i3 + 1] = rbv;
    }

    public C64540TIw(RBV rbv, C64540TIw c64540TIw, int i, int i2) {
        this.A07 = c64540TIw.A07;
        this.A04 = c64540TIw.A04;
        this.A00 = c64540TIw.A00;
        this.A01 = c64540TIw.A01;
        this.A02 = c64540TIw.A02;
        this.A05 = c64540TIw.A05;
        this.A06 = c64540TIw.A06;
        Object[] objArr = c64540TIw.A03;
        this.A03 = Arrays.copyOf(objArr, objArr.length);
        RBV[] rbvArr = c64540TIw.A08;
        RBV[] rbvArr2 = (RBV[]) Arrays.copyOf(rbvArr, rbvArr.length);
        this.A08 = rbvArr2;
        this.A03[i] = rbv;
        rbvArr2[i2] = rbv;
    }
}
