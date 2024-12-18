package X;

/* renamed from: X.MvW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51828MvW extends C0T6 implements InterfaceC58034PoK {
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51828MvW) {
                C51828MvW c51828MvW = (C51828MvW) obj;
                if (this.A00 != c51828MvW.A00 || !C14360o3.A0K(this.A02, c51828MvW.A02) || !C14360o3.A0K(this.A01, c51828MvW.A01) || this.A03 != c51828MvW.A03 || this.A04 != c51828MvW.A04) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC58034PoK
    public final boolean Cce() {
        return this.A04;
    }

    @Override // X.InterfaceC58034PoK
    public final String getName() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, AbstractC167007dF.A0D(this.A03, ((((this.A00 * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A01)) * 31));
    }

    public C51828MvW(Integer num, String str, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = num;
        this.A03 = z;
        this.A04 = z2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AudioFilterModel(filterId=");
        A1C.append(this.A00);
        A1C.append(", name=");
        A1C.append(this.A02);
        A1C.append(", icon=");
        A1C.append(this.A01);
        A1C.append(", isFiltering=");
        A1C.append(this.A03);
        A1C.append(", isSelected=");
        return AbstractC25236BEt.A0a(A1C, this.A04);
    }
}
