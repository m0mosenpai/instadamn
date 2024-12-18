package X;

import com.facebook.common.dextricks.Constants;

/* loaded from: classes5.dex */
public final class CUY {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof CUY) && this.A00 == ((CUY) obj).A00);
    }

    public CUY(boolean z, boolean z2) {
        int i = z ? Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED : 262152;
        this.A00 = z2 ? i : i | 512;
    }

    public final int hashCode() {
        return (((((((((this.A00 * 31) + 1231) * 31) + 1231) * 31) + 1231) * 31) + 1231) * 31) + AbstractC53644Nnp.A00();
    }
}
