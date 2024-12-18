package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.AbstractC25233BEq;
import X.AbstractC25236BEt;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class Achievement extends C0T6 implements AchievementIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(26);
    public final int A00;
    public final long A01;
    public final AchievementCategory A02;
    public final AchievementName A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final AchievementButtonInfo A0C;
    public final AchievementButtonInfo A0D;
    public final AchievementButtonInfo A0E;
    public final EarnedOnMediaState A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final List A0N;

    public Achievement(AchievementButtonInfo achievementButtonInfo, AchievementButtonInfo achievementButtonInfo2, AchievementButtonInfo achievementButtonInfo3, AchievementCategory achievementCategory, AchievementName achievementName, EarnedOnMediaState earnedOnMediaState, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, int i, long j) {
        AbstractC25233BEq.A0w(1, str, str2, achievementCategory);
        AbstractC25229BEm.A1O(str9, 14, str10);
        C14360o3.A0B(achievementName, 16);
        C14360o3.A0B(str12, 22);
        C14360o3.A0B(str13, 23);
        this.A06 = str;
        this.A01 = j;
        this.A0G = str2;
        this.A02 = achievementCategory;
        this.A0N = list;
        this.A0H = str3;
        this.A07 = str4;
        this.A0I = str5;
        this.A0J = str6;
        this.A0K = str7;
        this.A0F = earnedOnMediaState;
        this.A0L = str8;
        this.A0C = achievementButtonInfo;
        this.A08 = str9;
        this.A09 = str10;
        this.A03 = achievementName;
        this.A0D = achievementButtonInfo2;
        this.A04 = num;
        this.A0E = achievementButtonInfo3;
        this.A0M = str11;
        this.A05 = num2;
        this.A0A = str12;
        this.A0B = str13;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Achievement) {
                Achievement achievement = (Achievement) obj;
                if (!C14360o3.A0K(this.A06, achievement.A06) || this.A01 != achievement.A01 || !C14360o3.A0K(this.A0G, achievement.A0G) || this.A02 != achievement.A02 || !C14360o3.A0K(this.A0N, achievement.A0N) || !C14360o3.A0K(this.A0H, achievement.A0H) || !C14360o3.A0K(this.A07, achievement.A07) || !C14360o3.A0K(this.A0I, achievement.A0I) || !C14360o3.A0K(this.A0J, achievement.A0J) || !C14360o3.A0K(this.A0K, achievement.A0K) || this.A0F != achievement.A0F || !C14360o3.A0K(this.A0L, achievement.A0L) || !C14360o3.A0K(this.A0C, achievement.A0C) || !C14360o3.A0K(this.A08, achievement.A08) || !C14360o3.A0K(this.A09, achievement.A09) || this.A03 != achievement.A03 || !C14360o3.A0K(this.A0D, achievement.A0D) || !C14360o3.A0K(this.A04, achievement.A04) || !C14360o3.A0K(this.A0E, achievement.A0E) || !C14360o3.A0K(this.A0M, achievement.A0M) || !C14360o3.A0K(this.A05, achievement.A05) || !C14360o3.A0K(this.A0A, achievement.A0A) || !C14360o3.A0K(this.A0B, achievement.A0B) || this.A00 != achievement.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A0G);
        parcel.writeParcelable(this.A02, i);
        List list = this.A0N;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0u = AbstractC25231BEo.A0u(parcel, list);
            while (A0u.hasNext()) {
                AbstractC25229BEm.A15(parcel, A0u, i);
            }
        }
        parcel.writeString(this.A0H);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0K);
        parcel.writeParcelable(this.A0F, i);
        parcel.writeString(this.A0L);
        parcel.writeParcelable(this.A0C, i);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A0D, i);
        AbstractC167027dH.A0o(parcel, this.A04, 0, 1);
        parcel.writeParcelable(this.A0E, i);
        parcel.writeString(this.A0M);
        AbstractC167027dH.A0o(parcel, this.A05, 0, 1);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A00);
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A0B, AbstractC166997dE.A0K(this.A0A, (((((((((AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0K(this.A09, AbstractC166997dE.A0K(this.A08, (((((((((((((((((AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0K(this.A0G, AbstractC25236BEt.A01(this.A01, AbstractC166987dD.A0J(this.A06)))) + AbstractC167017dG.A0M(this.A0N)) * 31) + AbstractC167017dG.A0O(this.A0H)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A0I)) * 31) + AbstractC167017dG.A0O(this.A0J)) * 31) + AbstractC167017dG.A0O(this.A0K)) * 31) + AbstractC167017dG.A0M(this.A0F)) * 31) + AbstractC167017dG.A0O(this.A0L)) * 31) + AbstractC167017dG.A0M(this.A0C)) * 31))) + AbstractC167017dG.A0M(this.A0D)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A0E)) * 31) + AbstractC167017dG.A0O(this.A0M)) * 31) + AbstractC166997dE.A0I(this.A05)) * 31)) + this.A00;
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final String AXm() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final long AYD() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final String Abz() {
        return this.A0G;
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final List Aoj() {
        return this.A0N;
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final String Ate() {
        return this.A0H;
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final String B0D() {
        return this.A07;
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final String B0E() {
        return this.A0I;
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final String B0F() {
        return this.A0J;
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final String B0G() {
        return this.A0K;
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final EarnedOnMediaState B0H() {
        return this.A0F;
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final String B0I() {
        return this.A0L;
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final AchievementButtonInfo BEP() {
        return this.A0C;
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final String BGu() {
        return this.A09;
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final AchievementName BW3() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final AchievementButtonInfo BgE() {
        return this.A0D;
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final Integer BiK() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final AchievementButtonInfo BrN() {
        return this.A0E;
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final Integer C8L() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final String CCW() {
        return this.A0B;
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final String getSecondaryText() {
        return this.A0M;
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final String getTitle() {
        return this.A0A;
    }

    @Override // com.instagram.api.schemas.AchievementIntf
    public final int getValue() {
        return this.A00;
    }
}
