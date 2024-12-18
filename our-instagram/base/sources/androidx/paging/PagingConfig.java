package androidx.paging;

import X.AbstractC166987dD;

/* loaded from: classes9.dex */
public final class PagingConfig {
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;

    public PagingConfig(int i, int i2, int i3, boolean z) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = z;
        this.A00 = i3;
        if (!z && i2 == 0) {
            throw AbstractC166987dD.A12("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
    }
}
