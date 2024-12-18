package X;

import com.instagram.api.schemas.FanClubNextStepsCompletionState;
import com.instagram.api.schemas.FanClubNextStepsRecommendationsType;

/* renamed from: X.Mun, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51783Mun extends C0T6 implements InterfaceC58224PrU {
    public final FanClubNextStepsCompletionState A00;
    public final FanClubNextStepsRecommendationsType A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;

    public C51783Mun(FanClubNextStepsCompletionState fanClubNextStepsCompletionState, FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        C14360o3.A0B(fanClubNextStepsCompletionState, 1);
        AbstractC25233BEq.A0z(14, str13, str15, str16);
        C14360o3.A0B(fanClubNextStepsRecommendationsType, 18);
        this.A00 = fanClubNextStepsCompletionState;
        this.A02 = str;
        this.A0C = str2;
        this.A0D = str3;
        this.A03 = str4;
        this.A0E = str5;
        this.A04 = str6;
        this.A05 = str7;
        this.A06 = str8;
        this.A07 = str9;
        this.A0F = str10;
        this.A0G = str11;
        this.A08 = str12;
        this.A09 = str13;
        this.A0H = str14;
        this.A0A = str15;
        this.A0B = str16;
        this.A01 = fanClubNextStepsRecommendationsType;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51783Mun) {
                C51783Mun c51783Mun = (C51783Mun) obj;
                if (this.A00 != c51783Mun.A00 || !C14360o3.A0K(this.A02, c51783Mun.A02) || !C14360o3.A0K(this.A0C, c51783Mun.A0C) || !C14360o3.A0K(this.A0D, c51783Mun.A0D) || !C14360o3.A0K(this.A03, c51783Mun.A03) || !C14360o3.A0K(this.A0E, c51783Mun.A0E) || !C14360o3.A0K(this.A04, c51783Mun.A04) || !C14360o3.A0K(this.A05, c51783Mun.A05) || !C14360o3.A0K(this.A06, c51783Mun.A06) || !C14360o3.A0K(this.A07, c51783Mun.A07) || !C14360o3.A0K(this.A0F, c51783Mun.A0F) || !C14360o3.A0K(this.A0G, c51783Mun.A0G) || !C14360o3.A0K(this.A08, c51783Mun.A08) || !C14360o3.A0K(this.A09, c51783Mun.A09) || !C14360o3.A0K(this.A0H, c51783Mun.A0H) || !C14360o3.A0K(this.A0A, c51783Mun.A0A) || !C14360o3.A0K(this.A0B, c51783Mun.A0B) || this.A01 != c51783Mun.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0K(this.A0B, AbstractC166997dE.A0K(this.A0A, (AbstractC166997dE.A0K(this.A09, (((((((((((((((((((((((AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A0E)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A0F)) * 31) + AbstractC167017dG.A0O(this.A0G)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC25227BEk.A07(this.A0H)) * 31)));
    }
}
