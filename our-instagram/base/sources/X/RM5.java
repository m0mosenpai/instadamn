package X;

import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class RM5 extends AbstractC64897TYx implements java.util.Set {
    public transient RLz A00;

    public static int A01(int i) {
        int i2;
        int max = Math.max(i, 2);
        if (max < 751619276) {
            i2 = Integer.highestOneBit(max - 1);
            do {
                i2 += i2;
            } while (i2 * 0.7d < max);
        } else {
            i2 = AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
            if (max >= 1073741824) {
                throw AbstractC166987dD.A12("collection too large");
            }
        }
        return i2;
    }

    public static RM5 A02(Object[] objArr, int i) {
        Object[] objArr2 = objArr;
        if (i != 0) {
            if (i != 1) {
                int A01 = A01(i);
                Object[] objArr3 = new Object[A01];
                int i2 = A01 - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr2[i5];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int A05 = AbstractC58321PtD.A05(hashCode);
                        while (true) {
                            int i6 = A05 & i2;
                            Object obj2 = objArr3[i6];
                            if (obj2 == null) {
                                objArr2[i4] = obj;
                                objArr3[i6] = obj;
                                i3 += hashCode;
                                i4++;
                                break;
                            }
                            if (!obj2.equals(obj)) {
                                A05++;
                            }
                        }
                    } else {
                        throw AbstractC58322PtE.A0k(i5);
                    }
                }
                Arrays.fill(objArr2, i4, i, (Object) null);
                if (i4 != 1) {
                    if (A01(i4) < A01 / 2) {
                        return A02(objArr2, i4);
                    }
                    if (i4 <= 0) {
                        objArr2 = Arrays.copyOf(objArr2, i4);
                    }
                    return new RM3(objArr2, objArr3, i3, i2, i4);
                }
            }
            Object obj3 = objArr2[0];
            obj3.getClass();
            return new RM1(obj3);
        }
        return RM3.A05;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj != this) {
            if ((!(obj instanceof RM5) || !(this instanceof RM3) || !(((RM5) obj) instanceof RM3) || hashCode() == obj.hashCode()) && (obj instanceof java.util.Set)) {
                java.util.Set set = (java.util.Set) obj;
                try {
                    if (size() == set.size()) {
                        if (!containsAll(set)) {
                        }
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final RLz A08() {
        Object[] array;
        int length;
        RLz rLv;
        if (this instanceof RM1) {
            Object obj = ((RM1) this).A00;
            RMC rmc = RLz.A00;
            Object[] objArr = {obj};
            if (objArr[0] != null) {
                return new RLy(objArr, 1);
            }
            throw AbstractC58322PtE.A0k(0);
        }
        if (this instanceof RM4) {
            return ((RM4) this).A01;
        }
        RLz rLz = this.A00;
        if (rLz != null) {
            return rLz;
        }
        if (this instanceof RM3) {
            RM3 rm3 = (RM3) this;
            array = rm3.A01;
            length = rm3.A00;
        } else {
            if (this instanceof RM2) {
                rLv = new RLv((RM2) this);
                this.A00 = rLv;
                return rLv;
            }
            array = toArray();
            length = array.length;
        }
        RMC rmc2 = RLz.A00;
        if (length == 0) {
            rLv = RLy.A02;
        } else {
            rLv = new RLy(array, length);
        }
        this.A00 = rLv;
        return rLv;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += AbstractC25235BEs.A06(it.next());
        }
        return i;
    }
}
