package X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.util.Util;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Q8p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58780Q8p extends SZt {

    @Deprecated
    public static final C58780Q8p A09;
    public static final C58780Q8p A0A;
    public final SparseArray A00;
    public final SparseBooleanArray A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    @Override // X.SZt
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C58780Q8p c58780Q8p = (C58780Q8p) obj;
            if (super.equals(c58780Q8p) && this.A08 == c58780Q8p.A08 && this.A04 == c58780Q8p.A04 && this.A06 == c58780Q8p.A06 && this.A02 == c58780Q8p.A02 && this.A05 == c58780Q8p.A05 && this.A07 == c58780Q8p.A07 && this.A03 == c58780Q8p.A03) {
                SparseBooleanArray sparseBooleanArray = this.A01;
                SparseBooleanArray sparseBooleanArray2 = c58780Q8p.A01;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            return false;
                        }
                    }
                    SparseArray sparseArray = this.A00;
                    SparseArray sparseArray2 = c58780Q8p.A00;
                    int size2 = sparseArray.size();
                    if (sparseArray2.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                            if (indexOfKey >= 0) {
                                Map map = (Map) sparseArray.valueAt(i2);
                                Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                if (map2.size() == map.size()) {
                                    Iterator A15 = AbstractC166997dE.A15(map);
                                    while (A15.hasNext()) {
                                        Map.Entry A1K = AbstractC166987dD.A1K(A15);
                                        Object key = A1K.getKey();
                                        if (!map2.containsKey(key) || !Util.A0F(A1K.getValue(), map2.get(key))) {
                                            return false;
                                        }
                                    }
                                } else {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    static {
        C58780Q8p c58780Q8p = new C58780Q8p(new C58779Q8o());
        A0A = c58780Q8p;
        A09 = c58780Q8p;
    }

    public C58780Q8p(C58779Q8o c58779Q8o) {
        super(c58779Q8o);
        this.A08 = c58779Q8o.A06;
        this.A04 = c58779Q8o.A02;
        this.A06 = c58779Q8o.A04;
        this.A02 = c58779Q8o.A00;
        this.A05 = c58779Q8o.A03;
        this.A07 = c58779Q8o.A05;
        this.A03 = c58779Q8o.A01;
        this.A00 = c58779Q8o.A07;
        this.A01 = c58779Q8o.A08;
    }

    @Override // X.SZt
    public final int hashCode() {
        return (AbstractC25225BEi.A05(((((AbstractC25225BEi.A05(AbstractC25225BEi.A05(AbstractC25225BEi.A05((super.hashCode() + 31) * 31, this.A08 ? 1 : 0), this.A04 ? 1 : 0), this.A06 ? 1 : 0) * 31 * 31 * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0)) * 31, this.A07 ? 1 : 0) + (this.A03 ? 1 : 0)) * 31;
    }
}
