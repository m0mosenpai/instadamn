package X;

import com.instagram.schools.management.data.SchoolAddress;

/* renamed from: X.Bf2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26014Bf2 extends C0T6 {
    public final int A00;
    public final int A01;
    public final SchoolAddress A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final C5Hc A06;
    public final C5Hc A07;
    public final boolean A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26014Bf2) {
                C26014Bf2 c26014Bf2 = (C26014Bf2) obj;
                if (!C14360o3.A0K(this.A04, c26014Bf2.A04) || !C14360o3.A0K(this.A02, c26014Bf2.A02) || this.A00 != c26014Bf2.A00 || this.A01 != c26014Bf2.A01 || !C14360o3.A0K(this.A06, c26014Bf2.A06) || !C14360o3.A0K(this.A05, c26014Bf2.A05) || this.A09 != c26014Bf2.A09 || this.A08 != c26014Bf2.A08 || !C14360o3.A0K(this.A03, c26014Bf2.A03) || !C14360o3.A0K(this.A07, c26014Bf2.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A03, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A09, AbstractC166997dE.A0K(this.A05, (((((AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0J(this.A04)) + this.A00) * 31) + this.A01) * 31) + AbstractC167017dG.A0M(this.A06)) * 31)))) + AbstractC166997dE.A0I(this.A07);
    }

    public C26014Bf2(SchoolAddress schoolAddress, String str, String str2, String str3, C5Hc c5Hc, C5Hc c5Hc2, int i, int i2, boolean z, boolean z2) {
        this.A04 = str;
        this.A02 = schoolAddress;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = c5Hc;
        this.A05 = str2;
        this.A09 = z;
        this.A08 = z2;
        this.A03 = str3;
        this.A07 = c5Hc2;
    }
}
