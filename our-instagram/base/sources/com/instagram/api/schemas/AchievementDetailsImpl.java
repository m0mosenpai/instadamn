package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25226BEj;
import X.AbstractC25231BEo;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class AchievementDetailsImpl extends C0T6 implements Parcelable, AchievementDetails {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(30);
    public final int A00;
    public final AchievementButtonInfo A01;
    public final AchievementButtonInfo A02;
    public final AchievementCategory A03;
    public final AchievementName A04;
    public final EarnedOnMedia A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AchievementDetailsImpl) {
                AchievementDetailsImpl achievementDetailsImpl = (AchievementDetailsImpl) obj;
                if (!C14360o3.A0K(this.A08, achievementDetailsImpl.A08) || this.A03 != achievementDetailsImpl.A03 || !C14360o3.A0K(this.A0E, achievementDetailsImpl.A0E) || !C14360o3.A0K(this.A09, achievementDetailsImpl.A09) || !C14360o3.A0K(this.A0A, achievementDetailsImpl.A0A) || !C14360o3.A0K(this.A05, achievementDetailsImpl.A05) || !C14360o3.A0K(this.A0B, achievementDetailsImpl.A0B) || this.A00 != achievementDetailsImpl.A00 || this.A04 != achievementDetailsImpl.A04 || !C14360o3.A0K(this.A01, achievementDetailsImpl.A01) || !C14360o3.A0K(this.A06, achievementDetailsImpl.A06) || !C14360o3.A0K(this.A0C, achievementDetailsImpl.A0C) || !C14360o3.A0K(this.A02, achievementDetailsImpl.A02) || !C14360o3.A0K(this.A07, achievementDetailsImpl.A07) || !C14360o3.A0K(this.A0D, achievementDetailsImpl.A0D)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A03, i);
        List list = this.A0E;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0u = AbstractC25231BEo.A0u(parcel, list);
            while (A0u.hasNext()) {
                parcel.writeParcelable((Parcelable) A0u.next(), i);
            }
        }
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A05, i);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A01, i);
        AbstractC167027dH.A0o(parcel, this.A06, 0, 1);
        parcel.writeString(this.A0C);
        parcel.writeParcelable(this.A02, i);
        AbstractC167027dH.A0o(parcel, this.A07, 0, 1);
        parcel.writeString(this.A0D);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A0D, (((((((((AbstractC166997dE.A0J(this.A04, (AbstractC166997dE.A0K(this.A0B, (((((((AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0J(this.A08)) + AbstractC167017dG.A0M(this.A0E)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A07)) * 31);
    }

    public AchievementDetailsImpl(AchievementButtonInfo achievementButtonInfo, AchievementButtonInfo achievementButtonInfo2, AchievementCategory achievementCategory, AchievementName achievementName, EarnedOnMedia earnedOnMedia, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, List list, int i) {
        AbstractC167017dG.A1P(str, achievementCategory);
        C14360o3.A0B(str4, 7);
        C14360o3.A0B(achievementName, 9);
        C14360o3.A0B(str6, 15);
        this.A08 = str;
        this.A03 = achievementCategory;
        this.A0E = list;
        this.A09 = str2;
        this.A0A = str3;
        this.A05 = earnedOnMedia;
        this.A0B = str4;
        this.A00 = i;
        this.A04 = achievementName;
        this.A01 = achievementButtonInfo;
        this.A06 = num;
        this.A0C = str5;
        this.A02 = achievementButtonInfo2;
        this.A07 = num2;
        this.A0D = str6;
    }
}
