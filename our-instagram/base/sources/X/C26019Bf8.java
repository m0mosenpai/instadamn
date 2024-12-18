package X;

import com.instagram.user.model.User;

/* renamed from: X.Bf8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26019Bf8 extends C0T6 {
    public final C5C3 A00;
    public final User A01;
    public final C27915CSa A02;
    public final InterfaceC58259Ps3 A03;
    public final String A04;
    public final String A05;
    public final C5Hc A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26019Bf8) {
                C26019Bf8 c26019Bf8 = (C26019Bf8) obj;
                if (!C14360o3.A0K(this.A01, c26019Bf8.A01) || !C14360o3.A0K(this.A00, c26019Bf8.A00) || !C14360o3.A0K(this.A03, c26019Bf8.A03) || !C14360o3.A0K(this.A06, c26019Bf8.A06) || this.A07 != c26019Bf8.A07 || !C14360o3.A0K(this.A04, c26019Bf8.A04) || this.A0B != c26019Bf8.A0B || !C14360o3.A0K(this.A05, c26019Bf8.A05) || this.A0A != c26019Bf8.A0A || this.A09 != c26019Bf8.A09 || !C14360o3.A0K(this.A02, c26019Bf8.A02) || this.A08 != c26019Bf8.A08) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A08, (AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A0A, (AbstractC167007dF.A0D(this.A0B, AbstractC166997dE.A0K(this.A04, AbstractC167007dF.A0D(this.A07, AbstractC166997dE.A0J(this.A06, (AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A01)) + AbstractC167017dG.A0M(this.A03)) * 31)))) + AbstractC167017dG.A0O(this.A05)) * 31)) + AbstractC166997dE.A0I(this.A02)) * 31);
    }

    public C26019Bf8(C5C3 c5c3, User user, C27915CSa c27915CSa, InterfaceC58259Ps3 interfaceC58259Ps3, String str, String str2, C5Hc c5Hc, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = user;
        this.A00 = c5c3;
        this.A03 = interfaceC58259Ps3;
        this.A06 = c5Hc;
        this.A07 = z;
        this.A04 = str;
        this.A0B = z2;
        this.A05 = str2;
        this.A0A = z3;
        this.A09 = z4;
        this.A02 = c27915CSa;
        this.A08 = z5;
    }
}
