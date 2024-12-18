package X;

import java.util.List;

/* renamed from: X.Mhn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51088Mhn extends AbstractC66542zW {
    public final List A00;
    public final List A01;
    public final boolean A02;

    @Override // X.AbstractC66542zW
    public final int A02() {
        return this.A00.size();
    }

    @Override // X.AbstractC66542zW
    public final int A03() {
        return this.A01.size();
    }

    @Override // X.AbstractC66542zW
    public final boolean A04(int i, int i2) {
        return C14360o3.A0K(this.A01.get(i), this.A00.get(i2));
    }

    @Override // X.AbstractC66542zW
    public final boolean A05(int i, int i2) {
        if (this.A02) {
            return AbstractC167007dF.A1P(i, i2);
        }
        return C14360o3.A0K(((O7N) this.A01.get(i)).A01, ((O7N) this.A00.get(i2)).A01);
    }

    public C51088Mhn(List list, List list2, boolean z) {
        this.A01 = list;
        this.A00 = list2;
        this.A02 = z;
    }
}
