package X;

import java.util.List;

/* loaded from: classes11.dex */
public final class UGJ extends AbstractC66542zW {
    public final UGK A00;
    public final List A01;
    public final List A02;
    public final /* synthetic */ C66421UGq A03;

    public UGJ(UGK ugk, C66421UGq c66421UGq, List list, List list2) {
        this.A03 = c66421UGq;
        this.A00 = ugk;
        this.A02 = list;
        this.A01 = list2;
    }

    @Override // X.AbstractC66542zW
    public final int A02() {
        return this.A01.size();
    }

    @Override // X.AbstractC66542zW
    public final int A03() {
        return this.A02.size();
    }

    @Override // X.AbstractC66542zW
    public final boolean A04(int i, int i2) {
        return this.A00.areContentsTheSame((C63406Sjd) this.A02.get(i), (C63406Sjd) this.A01.get(i2));
    }

    @Override // X.AbstractC66542zW
    public final boolean A05(int i, int i2) {
        return this.A00.areItemsTheSame((C63406Sjd) this.A02.get(i), (C63406Sjd) this.A01.get(i2));
    }
}
