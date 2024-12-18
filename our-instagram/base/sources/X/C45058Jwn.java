package X;

/* renamed from: X.Jwn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45058Jwn extends C0T6 {
    public final int A00;
    public final EnumC46295KeR A01;
    public final Boolean A02;
    public final Boolean A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final String A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45058Jwn) {
                C45058Jwn c45058Jwn = (C45058Jwn) obj;
                if (this.A01 != c45058Jwn.A01 || this.A00 != c45058Jwn.A00 || this.A06 != c45058Jwn.A06 || !C14360o3.A0K(this.A04, c45058Jwn.A04) || !C14360o3.A0K(this.A07, c45058Jwn.A07) || !C14360o3.A0K(this.A02, c45058Jwn.A02) || !C14360o3.A0K(this.A03, c45058Jwn.A03) || !C14360o3.A0K(this.A05, c45058Jwn.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((AbstractC167007dF.A0D(this.A06, (AbstractC166987dD.A0G(this.A01) + this.A00) * 31) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC25227BEk.A07(this.A05);
    }

    public C45058Jwn(EnumC46295KeR enumC46295KeR, Boolean bool, Boolean bool2, String str, String str2, String str3, int i, boolean z) {
        this.A01 = enumC46295KeR;
        this.A00 = i;
        this.A06 = z;
        this.A04 = str;
        this.A07 = str2;
        this.A02 = bool;
        this.A03 = bool2;
        this.A05 = str3;
    }
}
