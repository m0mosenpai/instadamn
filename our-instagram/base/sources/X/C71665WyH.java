package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.WyH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71665WyH<K, V> implements Map<K, V>, Cloneable, Serializable {
    public static final Object A07 = new C69670VtE();
    public transient int A00;
    public transient Collection A04;
    public transient java.util.Set A05;
    public transient java.util.Set A06;
    public transient int A02 = 3;
    public transient int A01 = 0;
    public transient Object[] A03 = new Object[8];

    @Override // java.util.Map
    public final void clear() {
        this.A01 = 0;
        Arrays.fill(this.A03, (Object) null);
        this.A00++;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (size() == map.size()) {
                    int A04 = A04(-1);
                    while (A04 >= 0) {
                        Object A05 = A05(A04);
                        Object A06 = A06(A04);
                        if (map.containsKey(A05)) {
                            Object obj2 = map.get(A05);
                            if (obj2 == null) {
                                if (A06 == null) {
                                    A04 = A04(A04);
                                }
                            } else if (obj2.equals(A06)) {
                                A04 = A04(A04);
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int A04 = A04(-1);
        int i = 0;
        while (A04 >= 0) {
            i += AbstractC167017dG.A0M(A05(A04)) ^ AbstractC167017dG.A0M(A06(A04));
            A04 = A04(A04);
        }
        return i;
    }

    public static int A00(C71665WyH c71665WyH, Object obj) {
        if (c71665WyH.A01 != 0) {
            if (obj == null) {
                obj = A07;
            }
            int A01 = c71665WyH.A01(obj);
            while (true) {
                Object obj2 = c71665WyH.A03[A01 << 1];
                if (obj2 == null) {
                    break;
                }
                if (obj2 == obj || obj2.equals(obj)) {
                    break;
                }
                A01 = (A01 + 1) & ((c71665WyH.A03.length >>> 1) - 1);
            }
            return A01;
        }
        return -1;
    }

    private void A02(int i) {
        if (((i - 1) & i) == 0) {
            Object[] objArr = this.A03;
            int length = objArr.length >>> 1;
            if (i > length) {
                if (i <= 268435456) {
                    int i2 = this.A01;
                    this.A02 = (i >> 1) + (i >> 2);
                    this.A01 = 0;
                    this.A03 = new Object[i * 2];
                    if (i2 > 0) {
                        int i3 = 0;
                        for (int i4 = 0; i4 < length && i3 < i2; i4++) {
                            Object obj = objArr[i4 << 1];
                            if (obj != null) {
                                put(obj, objArr[(i4 << 1) + 1]);
                                i3++;
                            }
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("New capacity is greater than maximum capacity.");
            }
            throw new IllegalArgumentException("New capacity must be greater than current capacity.");
        }
        throw new IllegalArgumentException("New capacity must be a power of two.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r0 > r6) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(X.C71665WyH r5, int r6) {
        /*
            java.lang.Object[] r2 = r5.A03
            int r0 = r6 << 1
            r0 = r2[r0]
            if (r0 == 0) goto L5f
            int r4 = r6 + 1
        La:
            int r0 = r2.length
            int r0 = r0 >>> 1
            int r0 = r0 + (-1)
            r4 = r4 & r0
            int r0 = r4 << 1
            r0 = r2[r0]
            if (r0 == 0) goto L49
            if (r6 == r4) goto L3b
            int r0 = r4 << 1
            r0 = r2[r0]
            if (r0 == 0) goto L43
            int r0 = r5.A01(r0)
            if (r6 >= r4) goto L40
            if (r0 <= r6) goto L28
        L26:
            if (r0 <= r4) goto L3b
        L28:
            java.lang.Object[] r3 = r5.A03
            int r1 = r6 << 1
            int r2 = r4 << 1
            r0 = r3[r2]
            r3[r1] = r0
            int r1 = r1 + 1
            int r0 = r2 + 1
            r0 = r3[r0]
            r3[r1] = r0
            r6 = r4
        L3b:
            int r4 = r4 + 1
            java.lang.Object[] r2 = r5.A03
            goto La
        L40:
            if (r0 > r6) goto L3b
            goto L26
        L43:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L49:
            int r0 = r6 << 1
            r1 = 0
            r2[r0] = r1
            int r0 = r0 + 1
            r2[r0] = r1
            int r0 = r5.A01
            int r0 = r0 + (-1)
            r5.A01 = r0
            int r0 = r5.A00
            int r0 = r0 + 1
            r5.A00 = r0
            return
        L5f:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71665WyH.A03(X.WyH, int):void");
    }

    public final int A04(int i) {
        if (this.A01 > 0) {
            Object[] objArr = this.A03;
            int length = objArr.length >>> 1;
            do {
                i++;
                if (i >= length) {
                    return -1;
                }
            } while (objArr[i << 1] == null);
            return i;
        }
        return -1;
    }

    public final Object A05(int i) {
        Object obj = this.A03[i << 1];
        if (obj != null) {
            if (obj == A07) {
                return null;
            }
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final Object A06(int i) {
        Object[] objArr = this.A03;
        int i2 = i << 1;
        if (objArr[i2] != null) {
            return objArr[i2 + 1];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            Object[] objArr = this.A03;
            int length = objArr.length >>> 1;
            for (int i = 0; i < length; i++) {
                if (objArr[(i << 1) + 1] != null || objArr[i << 1] == null) {
                }
            }
            return false;
        }
        int length2 = this.A03.length >>> 1;
        for (int i2 = 0; i2 < length2; i2++) {
            Object obj2 = this.A03[(i2 << 1) + 1];
            if (obj2 == null || (obj2 != obj && !obj2.equals(obj))) {
            }
        }
        return false;
        return true;
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        java.util.Set set = this.A05;
        if (set == null) {
            X21 x21 = new X21(this);
            this.A05 = x21;
            return x21;
        }
        return set;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return AbstractC167007dF.A1N(this.A01);
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        java.util.Set set = this.A06;
        if (set == null) {
            X22 x22 = new X22(this);
            this.A06 = x22;
            return x22;
        }
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        r1 = (r1 << 1) + 1;
        r0 = r4.A03;
        r2 = r0[r1];
        r0[r1] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
    
        return r2;
     */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object put(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            if (r5 != 0) goto L4
            java.lang.Object r5 = X.C71665WyH.A07
        L4:
            int r1 = r4.A01(r5)
        L8:
            java.lang.Object[] r3 = r4.A03
            int r0 = r1 << 1
            r0 = r3[r0]
            if (r0 != 0) goto L37
            int r2 = r4.A01
            r0 = 268435456(0x10000000, float:2.524355E-29)
            if (r2 == r0) goto L5e
            int r0 = r4.A02
            if (r2 < r0) goto L26
            int r0 = r3.length
            int r0 = r0 >>> 1
            int r0 = r0 * 2
            r4.A02(r0)
            int r1 = r4.A01(r5)
        L26:
            java.lang.Object[] r3 = r4.A03
            int r2 = r1 << 1
            r0 = r3[r2]
            if (r0 == 0) goto L4a
            int r1 = r1 + 1
            int r0 = r3.length
            int r0 = r0 >>> 1
            int r0 = r0 + (-1)
            r1 = r1 & r0
            goto L26
        L37:
            if (r0 == r5) goto L66
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L66
            int r1 = r1 + 1
            java.lang.Object[] r0 = r4.A03
            int r0 = r0.length
            int r0 = r0 >>> 1
            int r0 = r0 + (-1)
            r1 = r1 & r0
            goto L8
        L4a:
            r3[r2] = r5
            int r0 = r2 + 1
            r3[r0] = r6
            int r0 = r4.A01
            int r0 = r0 + 1
            r4.A01 = r0
            int r0 = r4.A00
            int r0 = r0 + 1
            r4.A00 = r0
            r2 = 0
            return r2
        L5e:
            java.lang.String r1 = "Maximum capacity reached, cannot add new item."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L66:
            int r0 = r1 << 1
            int r1 = r0 + 1
            java.lang.Object[] r0 = r4.A03
            r2 = r0[r1]
            r0[r1] = r6
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71665WyH.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.A01;
    }

    @Override // java.util.Map
    public final Collection values() {
        Collection collection = this.A04;
        if (collection == null) {
            X20 x20 = new X20(this);
            this.A04 = x20;
            return x20;
        }
        return collection;
    }

    private int A01(Object obj) {
        int hashCode = obj.hashCode();
        int i = hashCode + ((hashCode << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return (i5 ^ (i5 >>> 16)) & ((this.A03.length >>> 1) - 1);
    }

    public final Object clone() {
        try {
            C71665WyH c71665WyH = (C71665WyH) super.clone();
            Object[] objArr = new Object[this.A03.length];
            c71665WyH.A03 = objArr;
            Object[] objArr2 = this.A03;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            return c71665WyH;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return MSY.A1R(A00(this, obj));
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int A00 = A00(this, obj);
        if (A00 >= 0) {
            return this.A03[(A00 << 1) + 1];
        }
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        if (map.size() != 0) {
            if (map.size() > size() && map.size() > (this.A03.length >>> 1)) {
                int size = map.size() - 1;
                int i = size | (size >>> 1);
                int i2 = i | (i >>> 2);
                int i3 = i2 | (i2 >>> 4);
                int i4 = i3 | (i3 >>> 8);
                A02((i4 | (i4 >>> 16)) + 1);
            }
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry entry = (Map.Entry) A15.next();
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        int A00 = A00(this, obj);
        if (A00 >= 0) {
            Object A06 = A06(A00);
            A03(this, A00);
            return A06;
        }
        return null;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        boolean z = true;
        int A04 = A04(-1);
        while (A04 >= 0) {
            if (!z) {
                sb.append(", ");
            }
            Object A05 = A05(A04);
            if (A05 == null) {
                A05 = "null";
            }
            sb.append(A05);
            sb.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
            sb.append(A06(A04));
            z = false;
            A04 = A04(A04);
        }
        return AbstractC166997dE.A0x("}", sb);
    }
}
