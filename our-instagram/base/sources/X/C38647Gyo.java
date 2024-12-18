package X;

import com.instagram.api.schemas.RankingInfo;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Gyo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38647Gyo extends C0T6 {
    public final C74433Vz A00;
    public final C111074zO A01;
    public final RankingInfo A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Integer A05;
    public final String A06;
    public final HashMap A07;
    public final List A08;
    public final List A09;
    public final List A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38647Gyo) {
                C38647Gyo c38647Gyo = (C38647Gyo) obj;
                if (!C14360o3.A0K(this.A00, c38647Gyo.A00) || !C14360o3.A0K(this.A06, c38647Gyo.A06) || !C14360o3.A0K(this.A03, c38647Gyo.A03) || !C14360o3.A0K(this.A09, c38647Gyo.A09) || !C14360o3.A0K(this.A0A, c38647Gyo.A0A) || !C14360o3.A0K(this.A08, c38647Gyo.A08) || !C14360o3.A0K(this.A07, c38647Gyo.A07) || !C14360o3.A0K(this.A01, c38647Gyo.A01) || !C14360o3.A0K(this.A05, c38647Gyo.A05) || !C14360o3.A0K(this.A02, c38647Gyo.A02) || !C14360o3.A0K(this.A04, c38647Gyo.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC166997dE.A0J(this.A01, (((((AbstractC166997dE.A0J(this.A09, ((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A04);
    }

    public C38647Gyo(C74433Vz c74433Vz, C111074zO c111074zO, RankingInfo rankingInfo, Boolean bool, Boolean bool2, Integer num, String str, HashMap hashMap, List list, List list2, List list3) {
        this.A00 = c74433Vz;
        this.A06 = str;
        this.A03 = bool;
        this.A09 = list;
        this.A0A = list2;
        this.A08 = list3;
        this.A07 = hashMap;
        this.A01 = c111074zO;
        this.A05 = num;
        this.A02 = rankingInfo;
        this.A04 = bool2;
    }
}
