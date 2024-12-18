package X;

import java.util.TreeMap;

/* renamed from: X.SfM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63216SfM {
    public static final C16R[] A04;
    public long A00;
    public C63216SfM A01;
    public TreeMap A02;
    public final Object[] A03 = new Object[16];

    static {
        C16R[] c16rArr = new C16R[16];
        A04 = c16rArr;
        C16R[] values = C16R.values();
        System.arraycopy(values, 1, c16rArr, 1, Math.min(15, values.length - 1));
    }

    private final void A00(int i, Object obj, Object obj2) {
        TreeMap treeMap = this.A02;
        if (treeMap == null) {
            treeMap = new TreeMap();
            this.A02 = treeMap;
        }
        if (obj != null) {
            AbstractC58319PtB.A1H(obj, treeMap, i + i + 1);
        }
        if (obj2 != null) {
            AbstractC58319PtB.A1H(obj2, this.A02, i + i);
        }
    }

    public final C63216SfM A01(C16R c16r, int i) {
        if (i < 16) {
            long ordinal = c16r.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this.A00 |= ordinal;
            return null;
        }
        C63216SfM c63216SfM = new C63216SfM();
        this.A01 = c63216SfM;
        c63216SfM.A00 |= c16r.ordinal();
        return c63216SfM;
    }

    public final C63216SfM A02(C16R c16r, Object obj, int i) {
        if (i < 16) {
            this.A03[i] = obj;
            long ordinal = c16r.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this.A00 = ordinal | this.A00;
            return null;
        }
        C63216SfM c63216SfM = new C63216SfM();
        this.A01 = c63216SfM;
        c63216SfM.A03[0] = obj;
        c63216SfM.A00 = c16r.ordinal() | c63216SfM.A00;
        return c63216SfM;
    }

    public final C63216SfM A03(C16R c16r, Object obj, Object obj2, int i) {
        if (i < 16) {
            long ordinal = c16r.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this.A00 = ordinal | this.A00;
            A00(i, obj, obj2);
            return null;
        }
        C63216SfM c63216SfM = new C63216SfM();
        this.A01 = c63216SfM;
        c63216SfM.A00 = c16r.ordinal() | c63216SfM.A00;
        c63216SfM.A00(0, obj, obj2);
        return this.A01;
    }

    public final C63216SfM A04(C16R c16r, Object obj, Object obj2, Object obj3, int i) {
        if (i < 16) {
            this.A03[i] = obj;
            long ordinal = c16r.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this.A00 = ordinal | this.A00;
            A00(i, obj2, obj3);
            return null;
        }
        C63216SfM c63216SfM = new C63216SfM();
        this.A01 = c63216SfM;
        c63216SfM.A03[0] = obj;
        c63216SfM.A00 = c16r.ordinal() | c63216SfM.A00;
        c63216SfM.A00(0, obj2, obj3);
        return this.A01;
    }
}
