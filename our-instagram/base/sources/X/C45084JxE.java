package X;

/* renamed from: X.JxE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45084JxE extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final EnumC43799JYm A03;
    public final EnumC46214Kcq A04;
    public final AbstractC46972Dl A05;

    public C45084JxE(EnumC43799JYm enumC43799JYm, EnumC46214Kcq enumC46214Kcq, AbstractC46972Dl abstractC46972Dl, int i, int i2, int i3) {
        C14360o3.A0B(enumC46214Kcq, 4);
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = enumC46214Kcq;
        this.A03 = enumC43799JYm;
        this.A05 = abstractC46972Dl;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45084JxE) {
                C45084JxE c45084JxE = (C45084JxE) obj;
                if (this.A02 != c45084JxE.A02 || this.A00 != c45084JxE.A00 || this.A01 != c45084JxE.A01 || this.A04 != c45084JxE.A04 || this.A03 != c45084JxE.A03 || !C14360o3.A0K(this.A05, c45084JxE.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A04, ((((this.A02 * 31) + this.A00) * 31) + this.A01) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A05);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FilterItem(text=");
        A1C.append(this.A02);
        A1C.append(", leftIcon=");
        A1C.append(this.A00);
        A1C.append(", rightIcon=");
        A1C.append(this.A01);
        A1C.append(", inboxTabViewFilter=");
        A1C.append(this.A04);
        A1C.append(", selectedFilter=");
        A1C.append(this.A03);
        A1C.append(", selectedMode=");
        return AbstractC167017dG.A0o(this.A05, A1C);
    }
}
