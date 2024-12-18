package X;

import com.facebook.common.dextricks.Constants;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class WRB implements InterfaceC71875X8i {
    public int A00;
    public int A01 = 0;
    public C68650VZi[] A02 = new C68650VZi[100];
    public int A03;

    public final synchronized void A00(int i) {
        boolean A1Q = AbstractC167007dF.A1Q(i, this.A03);
        this.A03 = i;
        if (A1Q) {
            F8c();
        }
    }

    @Override // X.InterfaceC71875X8i
    public final synchronized void F8c() {
        int max = Math.max(0, (((this.A03 + Constants.LOAD_RESULT_PGO_ATTEMPTED) - 1) / Constants.LOAD_RESULT_PGO_ATTEMPTED) - this.A00);
        int i = this.A01;
        if (max < i) {
            Arrays.fill(this.A02, max, i, (Object) null);
            this.A01 = max;
        }
    }
}
