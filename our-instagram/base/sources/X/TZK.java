package X;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes10.dex */
public final class TZK extends AbstractMap implements Serializable {
    public static final Object A09 = AbstractC58318PtA.A0b();
    public transient int A00 = Math.min(Math.max(12, 1), 1073741823);
    public transient int A01;
    public transient Object A02;
    public transient int[] A03;
    public transient Object[] A04;
    public transient Object[] A05;
    public transient Collection A06;
    public transient java.util.Set A07;
    public transient java.util.Set A08;

    public static final int A00(TZK tzk, Object obj) {
        if (!AbstractC25229BEm.A1Z(tzk.A02)) {
            int A05 = AbstractC58321PtD.A05(AbstractC167017dG.A0M(obj));
            int i = (1 << (tzk.A00 & 31)) - 1;
            Object obj2 = tzk.A02;
            obj2.getClass();
            int A00 = AbstractC63070Sbr.A00(obj2, A05 & i);
            if (A00 != 0) {
                int i2 = i ^ (-1);
                int i3 = A05 & i2;
                do {
                    int i4 = A00 - 1;
                    int[] iArr = tzk.A03;
                    iArr.getClass();
                    int i5 = iArr[i4];
                    if ((i5 & i2) == i3) {
                        Object[] objArr = tzk.A04;
                        objArr.getClass();
                        if (AbstractC62214S2j.A00(obj, objArr[i4])) {
                            return i4;
                        }
                    }
                    A00 = i5 & i;
                } while (A00 != 0);
            }
        }
        return -1;
    }

    public static final Object A01(TZK tzk, Object obj) {
        Object obj2 = tzk.A02;
        if (obj2 != null) {
            int i = (1 << (tzk.A00 & 31)) - 1;
            int[] iArr = tzk.A03;
            iArr.getClass();
            Object[] objArr = tzk.A04;
            objArr.getClass();
            int A05 = AbstractC58321PtD.A05(AbstractC167017dG.A0M(obj));
            int i2 = A05 & i;
            int A00 = AbstractC63070Sbr.A00(obj2, i2);
            if (A00 != 0) {
                int i3 = i ^ (-1);
                int i4 = A05 & i3;
                int i5 = -1;
                while (true) {
                    int i6 = A00 - 1;
                    int i7 = iArr[i6];
                    if ((i7 & i3) == i4 && AbstractC62214S2j.A00(obj, objArr[i6])) {
                        int i8 = i7 & i;
                        if (i5 == -1) {
                            AbstractC63070Sbr.A02(obj2, i2, i8);
                        } else {
                            iArr[i5] = (i8 & i) | (iArr[i5] & i3);
                        }
                        if (i6 != -1) {
                            Object[] objArr2 = tzk.A05;
                            objArr2.getClass();
                            Object obj3 = objArr2[i6];
                            tzk.A03(i6, i);
                            tzk.A01--;
                            tzk.A00 += 32;
                            return obj3;
                        }
                    } else {
                        A00 = i7 & i;
                        if (A00 == 0) {
                            break;
                        }
                        i5 = i6;
                    }
                }
            }
        }
        return A09;
    }

    public final Map A02() {
        Object obj = this.A02;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void A03(int i, int i2) {
        int i3;
        int i4;
        Object obj = this.A02;
        obj.getClass();
        int[] iArr = this.A03;
        iArr.getClass();
        Object[] objArr = this.A04;
        objArr.getClass();
        Object[] objArr2 = this.A05;
        objArr2.getClass();
        int size = size() - 1;
        if (i < size) {
            Object obj2 = objArr[size];
            objArr[i] = obj2;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            iArr[i] = iArr[size];
            iArr[size] = 0;
            int A05 = AbstractC58321PtD.A05(AbstractC167017dG.A0M(obj2)) & i2;
            int A00 = AbstractC63070Sbr.A00(obj, A05);
            int i5 = size + 1;
            if (A00 == i5) {
                AbstractC63070Sbr.A02(obj, A05, i + 1);
                return;
            }
            do {
                i3 = A00 - 1;
                i4 = iArr[i3];
                A00 = i4 & i2;
            } while (A00 != i5);
            iArr[i3] = ((i + 1) & i2) | (i4 & (i2 ^ (-1)));
            return;
        }
        objArr[i] = null;
        objArr2[i] = null;
        iArr[i] = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (this.A02 != null) {
            this.A00 += 32;
            Map A02 = A02();
            if (A02 != null) {
                this.A00 = Math.min(Math.max(size(), 3), 1073741823);
                A02.clear();
                this.A02 = null;
            } else {
                Object[] objArr = this.A04;
                objArr.getClass();
                Arrays.fill(objArr, 0, this.A01, (Object) null);
                Object[] objArr2 = this.A05;
                objArr2.getClass();
                Arrays.fill(objArr2, 0, this.A01, (Object) null);
                Object obj = this.A02;
                obj.getClass();
                if (obj instanceof byte[]) {
                    Arrays.fill((byte[]) obj, (byte) 0);
                } else if (obj instanceof short[]) {
                    Arrays.fill((short[]) obj, (short) 0);
                } else {
                    Arrays.fill((int[]) obj, 0);
                }
                int[] iArr = this.A03;
                iArr.getClass();
                Arrays.fill(iArr, 0, this.A01, 0);
            }
            this.A01 = 0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        java.util.Set set = this.A08;
        if (set == null) {
            TZT tzt = new TZT(this);
            this.A08 = tzt;
            return tzt;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
        java.util.Set set = this.A07;
        if (set == null) {
            TZU tzu = new TZU(this);
            this.A07 = tzu;
            return tzu;
        }
        return set;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0169  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object put(java.lang.Object r20, java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TZK.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.A06;
        if (collection == null) {
            C64886TYm c64886TYm = new C64886TYm(this);
            this.A06 = c64886TYm;
            return c64886TYm;
        }
        return collection;
    }

    public TZK(int i) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map A02 = A02();
        if (A02 != null) {
            return A02.containsKey(obj);
        }
        if (A00(this, obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map A02 = A02();
        if (A02 == null) {
            for (int i = 0; i < this.A01; i++) {
                Object[] objArr = this.A05;
                objArr.getClass();
                if (AbstractC62214S2j.A00(obj, objArr[i])) {
                    return true;
                }
            }
            return false;
        }
        return A02.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map A02 = A02();
        if (A02 != null) {
            return A02.get(obj);
        }
        int A00 = A00(this, obj);
        if (A00 == -1) {
            return null;
        }
        Object[] objArr = this.A05;
        objArr.getClass();
        return objArr[A00];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return AbstractC167007dF.A1N(size());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map A02 = A02();
        if (A02 != null) {
            return A02.remove(obj);
        }
        Object A01 = A01(this, obj);
        if (A01 != A09) {
            return A01;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map A02 = A02();
        if (A02 != null) {
            return A02.size();
        }
        return this.A01;
    }

    public TZK() {
    }
}
