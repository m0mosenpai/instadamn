package X;

/* renamed from: X.E8w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32098E8w extends C0T6 implements InterfaceC66482zP {
    public final int A00;
    public final C38686GzR A01;
    public final C26069Bfx A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public C32098E8w(C38686GzR c38686GzR, C26069Bfx c26069Bfx, Integer num, String str, String str2, String str3, String str4, int i, boolean z) {
        C14360o3.A0B(str, 1);
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A00 = i;
        this.A04 = str4;
        this.A03 = num;
        this.A08 = z;
        this.A02 = c26069Bfx;
        this.A01 = c38686GzR;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32098E8w) {
                C32098E8w c32098E8w = (C32098E8w) obj;
                if (!C14360o3.A0K(this.A05, c32098E8w.A05) || !C14360o3.A0K(this.A06, c32098E8w.A06) || !C14360o3.A0K(this.A07, c32098E8w.A07) || this.A00 != c32098E8w.A00 || !C14360o3.A0K(this.A04, c32098E8w.A04) || !C14360o3.A0K(this.A03, c32098E8w.A03) || this.A08 != c32098E8w.A08 || !C14360o3.A0K(this.A02, c32098E8w.A02) || !C14360o3.A0K(this.A01, c32098E8w.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A08, (((((AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0K(this.A06, AbstractC166987dD.A0J(this.A05))) + this.A00) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C32098E8w c32098E8w = (C32098E8w) obj;
        String str2 = this.A05;
        if (c32098E8w != null) {
            str = c32098E8w.A05;
        } else {
            str = null;
        }
        return C14360o3.A0K(str2, str);
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A05;
    }

    public final String toString() {
        return this.A05;
    }
}
