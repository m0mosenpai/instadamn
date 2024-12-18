package X;

import java.util.List;

/* renamed from: X.Mhl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51086Mhl extends AbstractC66542zW {
    public final List A00;
    public final List A01;

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
        return C14360o3.A0K(AbstractC001800i.A0O(this.A01, i), AbstractC001800i.A0O(this.A00, i2));
    }

    public C51086Mhl(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }

    @Override // X.AbstractC66542zW
    public final boolean A05(int i, int i2) {
        return AbstractC167007dF.A1P(i, i2);
    }
}
