package X;

import com.google.common.collect.ImmutableList;

/* loaded from: classes11.dex */
public final class UGI extends AbstractC66542zW {
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final /* synthetic */ C66420UGp A02;

    public UGI(C66420UGp c66420UGp, ImmutableList immutableList, ImmutableList immutableList2) {
        this.A02 = c66420UGp;
        this.A01 = immutableList;
        this.A00 = immutableList2;
    }

    @Override // X.AbstractC66542zW
    public final int A02() {
        return this.A00.size();
    }

    @Override // X.AbstractC66542zW
    public final int A03() {
        return this.A01.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC66542zW
    public final boolean A04(int i, int i2) {
        return ((AbstractC70120W4v) this.A01.get(i)).A02((AbstractC70120W4v) this.A00.get(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC66542zW
    public final boolean A05(int i, int i2) {
        return AbstractC167007dF.A1P(((AbstractC70120W4v) this.A01.get(i)).A00.A05, ((AbstractC70120W4v) this.A00.get(i2)).A00.A05);
    }
}
