package X;

/* renamed from: X.MvN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51819MvN extends C0T6 implements InterfaceC66482zP {
    public final EnumC53099NeC A00;
    public final C7IK A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51819MvN) {
                C51819MvN c51819MvN = (C51819MvN) obj;
                if (this.A00 != c51819MvN.A00 || this.A06 != c51819MvN.A06 || !C14360o3.A0K(this.A01, c51819MvN.A01) || !C14360o3.A0K(this.A02, c51819MvN.A02) || !C14360o3.A0K(this.A03, c51819MvN.A03) || !C14360o3.A0K(this.A04, c51819MvN.A04) || this.A05 != c51819MvN.A05) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A01;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, (((((((AbstractC167007dF.A0D(this.A06, AbstractC166987dD.A0G(this.A00)) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC25227BEk.A07(this.A04)) * 31);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C51819MvN c51819MvN = (C51819MvN) obj;
        C14360o3.A0B(c51819MvN, 0);
        if (this.A00 == c51819MvN.A00 && C14360o3.A0K(this.A02, c51819MvN.A02) && C14360o3.A0K(this.A01, c51819MvN.A01) && this.A06 == c51819MvN.A06 && C14360o3.A0K(this.A03, c51819MvN.A03) && C14360o3.A0K(this.A04, c51819MvN.A04) && this.A05 == c51819MvN.A05) {
            return true;
        }
        return false;
    }

    public C51819MvN(EnumC53099NeC enumC53099NeC, C7IK c7ik, String str, String str2, String str3, boolean z, boolean z2) {
        this.A00 = enumC53099NeC;
        this.A06 = z;
        this.A01 = c7ik;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = z2;
    }
}
