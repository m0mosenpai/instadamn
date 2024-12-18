package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.E6g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32054E6g extends C0T6 {
    public final C51756Mtf A00;
    public final User A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Double A05;
    public final Double A06;
    public final Double A07;
    public final Integer A08;
    public final Integer A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;
    public final Integer A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32054E6g) {
                C32054E6g c32054E6g = (C32054E6g) obj;
                if (!C14360o3.A0K(this.A00, c32054E6g.A00) || !C14360o3.A0K(this.A05, c32054E6g.A05) || !C14360o3.A0K(this.A01, c32054E6g.A01) || !C14360o3.A0K(this.A06, c32054E6g.A06) || !C14360o3.A0K(this.A07, c32054E6g.A07) || !C14360o3.A0K(this.A0A, c32054E6g.A0A) || !C14360o3.A0K(this.A0B, c32054E6g.A0B) || !C14360o3.A0K(this.A0C, c32054E6g.A0C) || !C14360o3.A0K(this.A02, c32054E6g.A02) || !C14360o3.A0K(this.A03, c32054E6g.A03) || !C14360o3.A0K(this.A0E, c32054E6g.A0E) || !C14360o3.A0K(this.A0D, c32054E6g.A0D) || !C14360o3.A0K(this.A08, c32054E6g.A08) || !C14360o3.A0K(this.A0F, c32054E6g.A0F) || !C14360o3.A0K(this.A09, c32054E6g.A09) || !C14360o3.A0K(this.A04, c32054E6g.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A0E)) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0M(this.A0F)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC166997dE.A0I(this.A04);
    }

    public C32054E6g(C51756Mtf c51756Mtf, User user, Boolean bool, Boolean bool2, Boolean bool3, Double d, Double d2, Double d3, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, List list) {
        this.A00 = c51756Mtf;
        this.A05 = d;
        this.A01 = user;
        this.A06 = d2;
        this.A07 = d3;
        this.A0A = str;
        this.A0B = str2;
        this.A0C = str3;
        this.A02 = bool;
        this.A03 = bool2;
        this.A0E = list;
        this.A0D = str4;
        this.A08 = num;
        this.A0F = num2;
        this.A09 = num3;
        this.A04 = bool3;
    }
}
