package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.03n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC009903n extends AbstractC06960Yn {
    public static final int A00(int[] iArr) {
        C14360o3.A0B(iArr, 0);
        int length = iArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[length - 1];
    }

    public static final int A01(int[] iArr) {
        int length = iArr.length;
        int i = 1;
        if (length == 0) {
            throw new NoSuchElementException();
        }
        int i2 = iArr[0];
        int i3 = length - 1;
        if (1 <= i3) {
            while (true) {
                int i4 = iArr[i];
                if (i2 < i4) {
                    i2 = i4;
                }
                if (i == i3) {
                    break;
                }
                i++;
            }
        }
        return i2;
    }

    public static final int A02(Object[] objArr, Object obj) {
        C14360o3.A0B(objArr, 0);
        int i = 0;
        int length = objArr.length;
        if (obj == null) {
            while (i < length) {
                if (objArr[i] != null) {
                    i++;
                } else {
                    return i;
                }
            }
        } else {
            while (i < length) {
                if (!obj.equals(objArr[i])) {
                    i++;
                } else {
                    return i;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A03(java.lang.Object[] r4, java.lang.Object r5) {
        /*
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            r3 = -1
            int r0 = r4.length
            int r2 = r0 + (-1)
            if (r5 != 0) goto L16
            if (r2 < 0) goto L27
        Lc:
            int r1 = r2 + (-1)
            r0 = r4[r2]
            if (r0 == 0) goto L26
            if (r1 < 0) goto L27
            r2 = r1
            goto Lc
        L16:
            if (r2 < 0) goto L27
        L18:
            int r1 = r2 + (-1)
            r0 = r4[r2]
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L26
            if (r1 < 0) goto L27
            r2 = r1
            goto L18
        L26:
            return r2
        L27:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC009903n.A03(java.lang.Object[], java.lang.Object):int");
    }

    public static final Integer A04(int[] iArr, int i) {
        C14360o3.A0B(iArr, 0);
        if (i >= 0 && i < iArr.length) {
            return Integer.valueOf(iArr[i]);
        }
        return null;
    }

    public static final Object A05(Object[] objArr) {
        C14360o3.A0B(objArr, 0);
        if (objArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return objArr[0];
    }

    public static final Object A06(Object[] objArr, int i) {
        C14360o3.A0B(objArr, 0);
        if (i >= 0 && i < objArr.length) {
            return objArr[i];
        }
        return null;
    }

    public static final String A07(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, InterfaceC16660sJ interfaceC16660sJ, Object[] objArr) {
        C14360o3.A0B(objArr, 0);
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            AbstractC18310vI.A0r(sb, obj, interfaceC16660sJ);
        }
        sb.append(charSequence3);
        String obj2 = sb.toString();
        C14360o3.A07(obj2);
        return obj2;
    }

    public static final List A0A(Comparator comparator, Object[] objArr) {
        C14360o3.A0B(objArr, 0);
        int length = objArr.length;
        if (length != 0) {
            objArr = Arrays.copyOf(objArr, length);
            C14360o3.A07(objArr);
            if (objArr.length > 1) {
                Arrays.sort(objArr, comparator);
            }
        }
        List asList = Arrays.asList(objArr);
        C14360o3.A07(asList);
        return asList;
    }

    public static final List A0B(C17u c17u, byte[] bArr) {
        C14360o3.A0B(bArr, 0);
        if (c17u.isEmpty()) {
            return C16930sl.A00;
        }
        return new C024509t(AbstractC06960Yn.A0X(bArr, c17u.A00, c17u.A01 + 1));
    }

    public static final List A0E(byte[] bArr) {
        int i = 0;
        C14360o3.A0B(bArr, 0);
        int length = bArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(length);
                do {
                    arrayList.add(Byte.valueOf(bArr[i]));
                    i++;
                } while (i < length);
                return arrayList;
            }
            List singletonList = Collections.singletonList(Byte.valueOf(bArr[0]));
            C14360o3.A07(singletonList);
            return singletonList;
        }
        return C16930sl.A00;
    }

    public static final List A0F(float[] fArr) {
        int i = 0;
        C14360o3.A0B(fArr, 0);
        int length = fArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(length);
                do {
                    arrayList.add(Float.valueOf(fArr[i]));
                    i++;
                } while (i < length);
                return arrayList;
            }
            List singletonList = Collections.singletonList(Float.valueOf(fArr[0]));
            C14360o3.A07(singletonList);
            return singletonList;
        }
        return C16930sl.A00;
    }

    public static final List A0G(int[] iArr) {
        int i = 0;
        int length = iArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(length);
                do {
                    arrayList.add(Integer.valueOf(iArr[i]));
                    i++;
                } while (i < length);
                return arrayList;
            }
            List singletonList = Collections.singletonList(Integer.valueOf(iArr[0]));
            C14360o3.A07(singletonList);
            return singletonList;
        }
        return C16930sl.A00;
    }

    public static final List A0H(long[] jArr) {
        C14360o3.A0B(jArr, 0);
        int length = jArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(length);
                int i = 0;
                do {
                    arrayList.add(Long.valueOf(jArr[i]));
                    i++;
                } while (i < length);
                return arrayList;
            }
            List singletonList = Collections.singletonList(Long.valueOf(jArr[0]));
            C14360o3.A07(singletonList);
            return singletonList;
        }
        return C16930sl.A00;
    }

    public static final List A0I(Object[] objArr) {
        C14360o3.A0B(objArr, 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List A0J(Object[] objArr) {
        C14360o3.A0B(objArr, 0);
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return new ArrayList(new C17000ss(objArr, false));
            }
            List singletonList = Collections.singletonList(objArr[0]);
            C14360o3.A07(singletonList);
            return singletonList;
        }
        return C16930sl.A00;
    }

    public static final java.util.Set A0K(Object[] objArr) {
        C14360o3.A0B(objArr, 0);
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC16850sd.A0L(length));
                A0M(linkedHashSet, objArr);
                return linkedHashSet;
            }
            java.util.Set singleton = Collections.singleton(objArr[0]);
            C14360o3.A07(singleton);
            return singleton;
        }
        return C16910sj.A00;
    }

    public static final C16900si A0L(Object[] objArr) {
        C14360o3.A0B(objArr, 0);
        return new C16900si(new C024109p(objArr));
    }

    public static final void A0M(Collection collection, Object[] objArr) {
        for (Object obj : objArr) {
            collection.add(obj);
        }
    }

    public static final void A0N(Object[] objArr) {
        for (Object obj : objArr) {
            if (obj == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("null element found in ");
                sb.append(objArr);
                sb.append('.');
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    public static final boolean A0O(Object obj, Object[] objArr) {
        C14360o3.A0B(objArr, 0);
        return A02(objArr, obj) >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000f, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0P(int[] r3, int r4) {
        /*
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            int r2 = r3.length
            r1 = 0
        L6:
            if (r1 >= r2) goto Lf
            r0 = r3[r1]
            if (r4 != r0) goto L11
            r0 = 1
            if (r1 >= 0) goto L10
        Lf:
            r0 = 0
        L10:
            return r0
        L11:
            int r1 = r1 + 1
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC009903n.A0P(int[], int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0Q(long[] r5, long r6) {
        /*
            int r4 = r5.length
            r3 = 0
        L2:
            if (r3 >= r4) goto Ld
            r1 = r5[r3]
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto Lf
            r0 = 1
            if (r3 >= 0) goto Le
        Ld:
            r0 = 0
        Le:
            return r0
        Lf:
            int r3 = r3 + 1
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC009903n.A0Q(long[], long):boolean");
    }

    public static final float[] A0R(C17u c17u, float[] fArr) {
        if (c17u.isEmpty()) {
            return new float[0];
        }
        int i = c17u.A00;
        int i2 = c17u.A01 + 1;
        C0eD.A0c(i2, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, i, i2);
        C14360o3.A07(copyOfRange);
        return copyOfRange;
    }

    public static final String A08(CharSequence charSequence, InterfaceC16660sJ interfaceC16660sJ, byte[] bArr) {
        C14360o3.A0B(bArr, 0);
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            sb.append((CharSequence) interfaceC16660sJ.invoke(Byte.valueOf(b)));
        }
        sb.append((CharSequence) "");
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public static final String A09(CharSequence charSequence, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (int i2 : iArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            sb.append((CharSequence) String.valueOf(i2));
        }
        sb.append((CharSequence) "");
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public static final List A0C(C17u c17u, float[] fArr) {
        if (c17u.isEmpty()) {
            return C16930sl.A00;
        }
        int i = c17u.A00;
        int i2 = c17u.A01 + 1;
        C0eD.A0c(i2, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, i, i2);
        C14360o3.A07(copyOfRange);
        return new C024409s(copyOfRange);
    }

    public static final List A0D(C17u c17u, Object[] objArr) {
        if (c17u.isEmpty()) {
            return C16930sl.A00;
        }
        return AbstractC06960Yn.A0S(AbstractC06960Yn.A0a(objArr, c17u.A00, c17u.A01 + 1));
    }
}
