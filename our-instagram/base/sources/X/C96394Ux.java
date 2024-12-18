package X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.util.Util;
import java.util.Map;

/* renamed from: X.4Ux, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96394Ux extends C96404Uy {

    @Deprecated
    public static final C96394Ux A0G;
    public static final C96394Ux A0H;
    public final SparseArray A00;
    public final SparseBooleanArray A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    @Override // X.C96404Uy
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C96394Ux c96394Ux = (C96394Ux) obj;
            if (super.equals(c96394Ux) && this.A0E == c96394Ux.A0E && this.A08 == c96394Ux.A08 && this.A09 == c96394Ux.A09 && this.A07 == c96394Ux.A07 && this.A0B == c96394Ux.A0B && this.A04 == c96394Ux.A04 && this.A05 == c96394Ux.A05 && this.A02 == c96394Ux.A02 && this.A03 == c96394Ux.A03 && this.A0A == c96394Ux.A0A && this.A0D == c96394Ux.A0D && this.A0F == c96394Ux.A0F && this.A06 == c96394Ux.A06) {
                SparseBooleanArray sparseBooleanArray = this.A01;
                SparseBooleanArray sparseBooleanArray2 = c96394Ux.A01;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            return false;
                        }
                    }
                    SparseArray sparseArray = this.A00;
                    SparseArray sparseArray2 = c96394Ux.A00;
                    int size2 = sparseArray.size();
                    if (sparseArray2.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                            if (indexOfKey >= 0) {
                                Map map = (Map) sparseArray.valueAt(i2);
                                Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        Object key = entry.getKey();
                                        if (!map2.containsKey(key) || !Util.A0I(entry.getValue(), map2.get(key))) {
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
        C96394Ux c96394Ux = new C96394Ux(new C96414Uz());
        A0H = c96394Ux;
        A0G = c96394Ux;
    }

    public C96394Ux(C96414Uz c96414Uz) {
        super(c96414Uz);
        this.A0E = c96414Uz.A0C;
        this.A08 = c96414Uz.A06;
        this.A09 = c96414Uz.A07;
        this.A07 = c96414Uz.A05;
        this.A0B = c96414Uz.A09;
        this.A04 = c96414Uz.A02;
        this.A05 = c96414Uz.A03;
        this.A02 = c96414Uz.A00;
        this.A03 = c96414Uz.A01;
        this.A0A = c96414Uz.A08;
        this.A0D = c96414Uz.A0B;
        this.A0F = c96414Uz.A0D;
        this.A06 = c96414Uz.A04;
        this.A00 = c96414Uz.A0E;
        this.A01 = c96414Uz.A0F;
        this.A0C = c96414Uz.A0A;
    }

    @Override // X.C96404Uy
    public final int hashCode() {
        return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.A0E ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A04 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A0A ? 1 : 0)) * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A0F ? 1 : 0)) * 31) + (this.A06 ? 1 : 0);
    }
}
