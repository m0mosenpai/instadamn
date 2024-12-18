package X;

import android.util.SparseArray;

/* renamed from: X.2WB, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2WB extends C2WC {
    public final int A00;
    public final long A01;
    public final SparseArray A02;
    public final AbstractC50812Vc A03;
    public final C2XE A04;
    public final C50952Vr A05;
    public final int A06;
    public final String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2WB(SparseArray sparseArray, AbstractC50812Vc abstractC50812Vc, C2XE c2xe, C50952Vr c50952Vr, Integer num, String str, int i, int i2, long j) {
        super(num);
        C14360o3.A0B(num, 7);
        this.A01 = j;
        this.A03 = abstractC50812Vc;
        this.A02 = sparseArray;
        this.A05 = c50952Vr;
        this.A00 = i;
        this.A04 = c2xe;
        this.A07 = str;
        this.A06 = i2 == 8 ? 1 : i2;
    }

    @Override // X.C2WC
    public final String A03() {
        String str = this.A07;
        if (str == null) {
            return this.A04.A08();
        }
        return str;
    }

    @Override // X.C2WC
    public final long A0H() {
        return this.A01;
    }

    public final boolean A0J() {
        if (this.A06 == 2) {
            return false;
        }
        C50952Vr c50952Vr = this.A05;
        if (c50952Vr == null || !c50952Vr.A01()) {
            AbstractC50812Vc abstractC50812Vc = this.A03;
            if (!(abstractC50812Vc instanceof AbstractC50792Va) || !((AbstractC50792Va) abstractC50812Vc).A13()) {
                return false;
            }
        }
        return true;
    }
}
