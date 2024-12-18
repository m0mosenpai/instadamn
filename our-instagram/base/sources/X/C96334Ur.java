package X;

import com.facebook.common.dextricks.Constants;
import java.util.Arrays;

/* renamed from: X.4Ur, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96334Ur implements InterfaceC96344Us {
    public int A00;
    public int A01 = 0;
    public C96354Ut[] A02 = new C96354Ut[100];
    public int A03;

    public final synchronized void A00(int i) {
        boolean z = false;
        if (i < this.A03) {
            z = true;
        }
        this.A03 = i;
        if (z) {
            F8c();
        }
    }

    @Override // X.InterfaceC96344Us
    public final synchronized int C9k() {
        return this.A00 * Constants.LOAD_RESULT_PGO_ATTEMPTED;
    }

    @Override // X.InterfaceC96344Us
    public final synchronized void F8c() {
        int max = Math.max(0, (((this.A03 + Constants.LOAD_RESULT_PGO_ATTEMPTED) - 1) / Constants.LOAD_RESULT_PGO_ATTEMPTED) - this.A00);
        int i = this.A01;
        if (max < i) {
            Arrays.fill(this.A02, max, i, (Object) null);
            this.A01 = max;
        }
    }
}
