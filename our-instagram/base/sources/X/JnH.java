package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class JnH extends AbstractC66542zW {
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
        return C14360o3.A0K(this.A01.get(i), this.A00.get(i2));
    }

    @Override // X.AbstractC66542zW
    public final boolean A05(int i, int i2) {
        return C14360o3.A0K(((C45056Jwl) this.A01.get(i)).A05, ((C45056Jwl) this.A00.get(i2)).A05);
    }

    public JnH(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
