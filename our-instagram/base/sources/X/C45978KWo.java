package X;

/* renamed from: X.KWo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45978KWo extends AbstractC160207Gg {
    public final String A00;
    public final int A01;
    public final C7FZ A02;
    public final C7FY A03;
    public final Integer A04;
    public final String A05;

    public C45978KWo(C7FZ c7fz, C7FY c7fy, Integer num, String str, String str2, int i) {
        AbstractC25233BEq.A0x(1, str, c7fz, c7fy);
        this.A00 = str;
        this.A05 = str2;
        this.A01 = i;
        this.A02 = c7fz;
        this.A03 = c7fy;
        this.A04 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45978KWo) {
                C45978KWo c45978KWo = (C45978KWo) obj;
                if (!C14360o3.A0K(this.A00, c45978KWo.A00) || !C14360o3.A0K(this.A05, c45978KWo.A05) || this.A01 != c45978KWo.A01 || this.A02 != c45978KWo.A02 || this.A03 != c45978KWo.A03 || !C14360o3.A0K(this.A04, c45978KWo.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC160207Gg
    public final int A00() {
        return this.A01;
    }

    @Override // X.AbstractC160207Gg
    public final C7FZ A01() {
        return this.A02;
    }

    @Override // X.AbstractC160207Gg
    public final C7FY A02() {
        return this.A03;
    }

    @Override // X.AbstractC160207Gg
    public final Integer A03() {
        return this.A04;
    }

    @Override // X.AbstractC160207Gg
    public final String A04() {
        return this.A05;
    }

    @Override // X.AbstractC160207Gg
    public final String A05() {
        return this.A00;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A02, (((AbstractC166987dD.A0J(this.A00) + AbstractC167017dG.A0O(this.A05)) * 31) + this.A01) * 31)) + AbstractC166997dE.A0I(this.A04)) * 31) + AbstractC53644Nnp.A00();
    }
}
