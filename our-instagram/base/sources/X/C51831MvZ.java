package X;

/* renamed from: X.MvZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51831MvZ extends C0T6 implements InterfaceC58166PqW {
    public C5RR A00;
    public final int A01;
    public final EnumC53185Nfh A02;
    public final Integer A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51831MvZ) {
                C51831MvZ c51831MvZ = (C51831MvZ) obj;
                if (this.A02 != c51831MvZ.A02 || !C14360o3.A0K(this.A04, c51831MvZ.A04) || !C14360o3.A0K(this.A00, c51831MvZ.A00) || this.A05 != c51831MvZ.A05 || this.A03 != c51831MvZ.A03 || this.A01 != c51831MvZ.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC58166PqW
    public final /* synthetic */ boolean AzK() {
        return AbstractC167007dF.A1X(this.A03, C05F.A01);
    }

    @Override // X.InterfaceC58166PqW
    public final boolean BsU() {
        return this.A05;
    }

    @Override // X.InterfaceC58166PqW
    public final EnumC53185Nfh CBd() {
        return this.A02;
    }

    @Override // X.InterfaceC58166PqW
    public final Integer CGw() {
        return this.A03;
    }

    @Override // X.InterfaceC58166PqW
    public final String getTitle() {
        return this.A04;
    }

    public final int hashCode() {
        int A0D = AbstractC167007dF.A0D(this.A05, (AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0G(this.A02)) + AbstractC167017dG.A0M(this.A00)) * 31);
        Integer num = this.A03;
        return AbstractC167017dG.A0L(num, AbstractC53903Nsc.A00(num), A0D) + this.A01;
    }

    public C51831MvZ(EnumC53185Nfh enumC53185Nfh, C5RR c5rr, Integer num, String str, int i, boolean z) {
        this.A02 = enumC53185Nfh;
        this.A04 = str;
        this.A00 = c5rr;
        this.A05 = z;
        this.A03 = num;
        this.A01 = i;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("InteractiveElementModel(type=");
        A1C.append(this.A02);
        A1C.append(", title=");
        A1C.append(this.A04);
        A1C.append(", drawable=");
        A1C.append(this.A00);
        A1C.append(", selected=");
        A1C.append(this.A05);
        A1C.append(", visualState=");
        Integer num = this.A03;
        if (num != null) {
            str = AbstractC53903Nsc.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", z=");
        return AbstractC25236BEt.A0Z(A1C, this.A01);
    }
}
