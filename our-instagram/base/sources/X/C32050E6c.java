package X;

import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.E6c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32050E6c extends C0T6 {
    public final E6X A00;
    public final C7Q4 A01;
    public final User A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final HashMap A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32050E6c) {
                C32050E6c c32050E6c = (C32050E6c) obj;
                if (!C14360o3.A0K(this.A05, c32050E6c.A05) || !C14360o3.A0K(this.A00, c32050E6c.A00) || !C14360o3.A0K(this.A01, c32050E6c.A01) || !C14360o3.A0K(this.A08, c32050E6c.A08) || !C14360o3.A0K(this.A06, c32050E6c.A06) || !C14360o3.A0K(this.A04, c32050E6c.A04) || !C14360o3.A0K(this.A02, c32050E6c.A02) || !C14360o3.A0K(this.A07, c32050E6c.A07) || this.A03 != c32050E6c.A03 || this.A0B != c32050E6c.A0B || this.A0A != c32050E6c.A0A || this.A09 != c32050E6c.A09) {
                }
            }
            return false;
        }
        return true;
    }

    public C32050E6c(E6X e6x, C7Q4 c7q4, User user, Integer num, Integer num2, String str, String str2, String str3, HashMap hashMap, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(num2, 9);
        this.A05 = str;
        this.A00 = e6x;
        this.A01 = c7q4;
        this.A08 = hashMap;
        this.A06 = str2;
        this.A04 = num;
        this.A02 = user;
        this.A07 = str3;
        this.A03 = num2;
        this.A0B = z;
        this.A0A = z2;
        this.A09 = z3;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A09, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A0B, ((((((((((((((((AbstractC167017dG.A0O(this.A05) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC25227BEk.A07(this.A07)) * 31) + AbstractC53957NtU.A00(this.A03)) * 31)));
    }
}
