package X;

import com.instagram.user.model.User;

/* renamed from: X.BfC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26023BfC extends C0T6 {
    public final int A00;
    public final User A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final String A0F;
    public final String A0G;
    public final boolean A0H;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26023BfC) {
                C26023BfC c26023BfC = (C26023BfC) obj;
                if (!C14360o3.A0K(this.A01, c26023BfC.A01) || this.A00 != c26023BfC.A00 || !C14360o3.A0K(this.A07, c26023BfC.A07) || !C14360o3.A0K(this.A06, c26023BfC.A06) || !C14360o3.A0K(this.A08, c26023BfC.A08) || !C14360o3.A0K(this.A0A, c26023BfC.A0A) || !C14360o3.A0K(this.A0B, c26023BfC.A0B) || !C14360o3.A0K(this.A09, c26023BfC.A09) || !C14360o3.A0K(this.A0G, c26023BfC.A0G) || !C14360o3.A0K(this.A0F, c26023BfC.A0F) || this.A05 != c26023BfC.A05 || !C14360o3.A0K(this.A04, c26023BfC.A04) || this.A0H != c26023BfC.A0H || this.A0C != c26023BfC.A0C || this.A0D != c26023BfC.A0D || this.A0E != c26023BfC.A0E || !C14360o3.A0K(this.A03, c26023BfC.A03) || !C14360o3.A0K(this.A02, c26023BfC.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public C26023BfC(User user, Boolean bool, Boolean bool2, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(num, 11);
        this.A01 = user;
        this.A00 = i;
        this.A07 = str;
        this.A06 = str2;
        this.A08 = str3;
        this.A0A = str4;
        this.A0B = str5;
        this.A09 = str6;
        this.A0G = str7;
        this.A0F = str8;
        this.A05 = num;
        this.A04 = num2;
        this.A0H = z;
        this.A0C = z2;
        this.A0D = z3;
        this.A0E = z4;
        this.A03 = bool;
        this.A02 = bool2;
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0H, (((((((((AbstractC166997dE.A0K(this.A0B, (AbstractC166997dE.A0K(this.A08, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A07, (AbstractC166987dD.A0G(this.A01) + this.A00) * 31))) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A0G)) * 31) + AbstractC167017dG.A0O(this.A0F)) * 31) + CJK.A00(this.A05)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31)))) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A02);
    }
}
