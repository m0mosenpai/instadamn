package X;

/* renamed from: X.Msi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51713Msi extends C0T6 {
    public final C131995xZ A00;
    public final EnumC53382NjX A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51713Msi) {
                C51713Msi c51713Msi = (C51713Msi) obj;
                if (this.A06 != c51713Msi.A06 || this.A04 != c51713Msi.A04 || !C14360o3.A0K(this.A00, c51713Msi.A00) || !C14360o3.A0K(this.A02, c51713Msi.A02) || this.A03 != c51713Msi.A03 || this.A01 != c51713Msi.A01 || this.A05 != c51713Msi.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A00(C51713Msi c51713Msi, Object obj, C05A c05a, boolean z) {
        boolean z2 = c51713Msi.A06;
        boolean z3 = c51713Msi.A04;
        return c05a.AIi(obj, new C51713Msi(c51713Msi.A00, c51713Msi.A01, c51713Msi.A02, z2, z3, z, c51713Msi.A05));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, (AbstractC167007dF.A0D(this.A03, (((AbstractC167007dF.A0D(this.A04, AbstractC25225BEi.A08(this.A06)) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A01)) * 31);
    }

    public C51713Msi(C131995xZ c131995xZ, EnumC53382NjX enumC53382NjX, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A06 = z;
        this.A04 = z2;
        this.A00 = c131995xZ;
        this.A02 = str;
        this.A03 = z3;
        this.A01 = enumC53382NjX;
        this.A05 = z4;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FacebookXpostUiState(shouldExist=");
        A1C.append(this.A06);
        A1C.append(", isConnected=");
        A1C.append(this.A04);
        A1C.append(", destination=");
        A1C.append(this.A00);
        A1C.append(AbstractC111324zv.A00(3428));
        A1C.append(this.A02);
        A1C.append(", currentPostOn=");
        A1C.append(this.A03);
        A1C.append(", fbSharingAccount=");
        A1C.append(this.A01);
        A1C.append(", needToConfirmAudience=");
        return AbstractC25236BEt.A0a(A1C, this.A05);
    }
}
