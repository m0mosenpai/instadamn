package X;

import com.instagram.api.schemas.RankingAlgorithm;
import java.util.List;

/* renamed from: X.E6b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32049E6b extends C0T6 {
    public final Boolean A00;
    public final List A01;
    public final RankingAlgorithm A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32049E6b) {
                C32049E6b c32049E6b = (C32049E6b) obj;
                if (!C14360o3.A0K(this.A0A, c32049E6b.A0A) || !C14360o3.A0K(this.A03, c32049E6b.A03) || !C14360o3.A0K(this.A07, c32049E6b.A07) || !C14360o3.A0K(this.A04, c32049E6b.A04) || !C14360o3.A0K(this.A00, c32049E6b.A00) || !C14360o3.A0K(this.A01, c32049E6b.A01) || !C14360o3.A0K(this.A08, c32049E6b.A08) || !C14360o3.A0K(this.A05, c32049E6b.A05) || this.A02 != c32049E6b.A02 || !C14360o3.A0K(this.A09, c32049E6b.A09) || !C14360o3.A0K(this.A06, c32049E6b.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((AbstractC167017dG.A0M(this.A0A) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC166997dE.A0I(this.A06);
    }

    public C32049E6b(RankingAlgorithm rankingAlgorithm, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, String str2, String str3, List list, List list2) {
        this.A0A = list;
        this.A03 = bool;
        this.A07 = str;
        this.A04 = bool2;
        this.A00 = bool3;
        this.A01 = list2;
        this.A08 = str2;
        this.A05 = bool4;
        this.A02 = rankingAlgorithm;
        this.A09 = str3;
        this.A06 = bool5;
    }
}
