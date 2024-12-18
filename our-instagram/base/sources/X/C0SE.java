package X;

import android.util.SparseArray;

/* renamed from: X.0SE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0SE extends AbstractC02960Bu {
    public static final C0SK A03 = new Object();
    public boolean A00;
    public final SparseArray A01;
    public final C0SK A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0SE c0se = (C0SE) obj;
        if (this.A00 == c0se.A00 && this.A02.equals(c0se.A02)) {
            SparseArray sparseArray = this.A01;
            SparseArray sparseArray2 = c0se.A01;
            if (sparseArray == sparseArray2) {
                return true;
            }
            if (sparseArray != null && sparseArray2 != null && sparseArray.size() == sparseArray2.size()) {
                for (int i = 0; i < sparseArray.size(); i++) {
                    int keyAt = sparseArray.keyAt(i);
                    if (sparseArray.get(keyAt).equals(sparseArray2.get(keyAt))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A01(AbstractC02960Bu abstractC02960Bu) {
        A04((C0SE) abstractC02960Bu);
        return this;
    }

    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A02(AbstractC02960Bu abstractC02960Bu, AbstractC02960Bu abstractC02960Bu2) {
        C0SE c0se = (C0SE) abstractC02960Bu;
        C0SE c0se2 = (C0SE) abstractC02960Bu2;
        if (c0se2 == null) {
            c0se2 = new C0SE(this.A00);
        }
        if (c0se == null) {
            c0se2.A04(this);
        } else {
            this.A02.A02(c0se.A02, c0se2.A02);
            if (c0se2.A00) {
                A00(this.A01, c0se.A01, c0se2.A01, -1);
                return c0se2;
            }
        }
        return c0se2;
    }

    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A03(AbstractC02960Bu abstractC02960Bu, AbstractC02960Bu abstractC02960Bu2) {
        C0SE c0se = (C0SE) abstractC02960Bu;
        C0SE c0se2 = (C0SE) abstractC02960Bu2;
        if (c0se2 == null) {
            c0se2 = new C0SE(this.A00);
        }
        if (c0se == null) {
            c0se2.A04(this);
        } else {
            this.A02.A03(c0se.A02, c0se2.A02);
            if (c0se2.A00) {
                A00(this.A01, c0se.A01, c0se2.A01, 1);
                return c0se2;
            }
        }
        return c0se2;
    }

    public final void A04(C0SE c0se) {
        this.A02.A06(c0se.A02);
        if (this.A00 && c0se.A00) {
            SparseArray sparseArray = this.A01;
            sparseArray.clear();
            SparseArray sparseArray2 = c0se.A01;
            int size = sparseArray2.size();
            for (int i = 0; i < size; i++) {
                sparseArray.put(sparseArray2.keyAt(i), sparseArray2.valueAt(i));
            }
        }
    }

    public final int hashCode() {
        return ((((this.A00 ? 1 : 0) * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SensorMetrics{isAttributionEnabled=");
        sb.append(this.A00);
        sb.append(", total=");
        sb.append(this.A02);
        sb.append(", sensorConsumption=");
        sb.append(this.A01);
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.0SK] */
    public C0SE(boolean z) {
        this.A02 = new Object();
        this.A01 = new SparseArray();
        this.A00 = z;
    }

    public static void A00(SparseArray sparseArray, SparseArray sparseArray2, SparseArray sparseArray3, int i) {
        AbstractC02960Bu A02;
        AbstractC02960Bu A022;
        sparseArray3.clear();
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            AbstractC02960Bu abstractC02960Bu = (AbstractC02960Bu) sparseArray.valueAt(i2);
            C0SK c0sk = A03;
            AbstractC02960Bu abstractC02960Bu2 = (AbstractC02960Bu) sparseArray2.get(keyAt, c0sk);
            if (i > 0) {
                A022 = abstractC02960Bu.A03(abstractC02960Bu2, null);
            } else {
                A022 = abstractC02960Bu.A02(abstractC02960Bu2, null);
            }
            if (!c0sk.equals(A022)) {
                sparseArray3.put(keyAt, A022);
            }
        }
        int size2 = sparseArray2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            int keyAt2 = sparseArray2.keyAt(i3);
            if (sparseArray.get(keyAt2) == null) {
                C0SK c0sk2 = A03;
                AbstractC02960Bu abstractC02960Bu3 = (AbstractC02960Bu) sparseArray2.valueAt(i3);
                if (i > 0) {
                    A02 = c0sk2.A03(abstractC02960Bu3, null);
                } else {
                    A02 = c0sk2.A02(abstractC02960Bu3, null);
                }
                if (!c0sk2.equals(A02)) {
                    sparseArray3.put(keyAt2, A02);
                }
            }
        }
    }

    public C0SE() {
        this(false);
    }
}
