package com.instagram.creator.achievements.modules.models;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.AbstractC25233BEq;
import X.AbstractC25235BEs;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.Achievement;
import com.instagram.api.schemas.Challenge;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class Badge implements Parcelable {
    public final Integer A00;
    public final Integer A01;
    public final boolean A02;

    /* loaded from: classes5.dex */
    public final class AchievementBadge extends Badge implements Parcelable {
        public static final Parcelable.Creator CREATOR = new LNM(80);
        public final long A00;
        public final Achievement A01;
        public final Integer A02;
        public final Integer A03;
        public final Integer A04;
        public final String A05;
        public final String A06;
        public final String A07;
        public final String A08;
        public final boolean A09;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AchievementBadge) {
                    AchievementBadge achievementBadge = (AchievementBadge) obj;
                    if (this.A00 != achievementBadge.A00 || !C14360o3.A0K(this.A07, achievementBadge.A07) || !C14360o3.A0K(this.A08, achievementBadge.A08) || !C14360o3.A0K(this.A05, achievementBadge.A05) || !C14360o3.A0K(this.A06, achievementBadge.A06) || !C14360o3.A0K(this.A03, achievementBadge.A03) || !C14360o3.A0K(this.A02, achievementBadge.A02) || !C14360o3.A0K(this.A04, achievementBadge.A04) || this.A09 != achievementBadge.A09 || !C14360o3.A0K(this.A01, achievementBadge.A01)) {
                    }
                }
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeLong(this.A00);
            parcel.writeString(this.A07);
            parcel.writeString(this.A08);
            parcel.writeString(this.A05);
            parcel.writeString(this.A06);
            AbstractC167027dH.A0o(parcel, this.A03, 0, 1);
            AbstractC167027dH.A0o(parcel, this.A02, 0, 1);
            AbstractC167027dH.A0o(parcel, this.A04, 0, 1);
            parcel.writeInt(this.A09 ? 1 : 0);
            parcel.writeParcelable(this.A01, i);
        }

        public final int hashCode() {
            return AbstractC166987dD.A0I(this.A01, AbstractC167007dF.A0D(this.A09, (((((AbstractC166997dE.A0K(this.A06, (AbstractC166997dE.A0K(this.A08, AbstractC166997dE.A0K(this.A07, AbstractC25235BEs.A03(this.A00))) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A04)) * 31));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AchievementBadge(Achievement achievement, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, long j, boolean z) {
            super(num2, num3, true);
            AbstractC167017dG.A1R(str, str2);
            AbstractC25229BEm.A1J(str4, 5, achievement);
            this.A00 = j;
            this.A07 = str;
            this.A08 = str2;
            this.A05 = str3;
            this.A06 = str4;
            this.A03 = num;
            this.A02 = num2;
            this.A04 = num3;
            this.A09 = z;
            this.A01 = achievement;
        }
    }

    /* loaded from: classes5.dex */
    public final class AchievementTieredBadge extends Badge implements Parcelable {
        public static final Parcelable.Creator CREATOR = new LNM(81);
        public final long A00;
        public final Integer A01;
        public final String A02;
        public final String A03;
        public final List A04;
        public final List A05;
        public final String A06;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AchievementTieredBadge(Integer num, String str, String str2, String str3, List list, List list2, long j) {
            super(null, null, false);
            AbstractC25233BEq.A0w(2, str, str2, str3);
            this.A00 = j;
            this.A06 = str;
            this.A03 = str2;
            this.A02 = str3;
            this.A01 = num;
            this.A04 = list;
            this.A05 = list2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AchievementTieredBadge) {
                    AchievementTieredBadge achievementTieredBadge = (AchievementTieredBadge) obj;
                    if (this.A00 != achievementTieredBadge.A00 || !C14360o3.A0K(this.A06, achievementTieredBadge.A06) || !C14360o3.A0K(this.A03, achievementTieredBadge.A03) || !C14360o3.A0K(this.A02, achievementTieredBadge.A02) || !C14360o3.A0K(this.A01, achievementTieredBadge.A01) || !C14360o3.A0K(this.A04, achievementTieredBadge.A04) || !C14360o3.A0K(this.A05, achievementTieredBadge.A05)) {
                    }
                }
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeLong(this.A00);
            parcel.writeString(this.A06);
            parcel.writeString(this.A03);
            parcel.writeString(this.A02);
            AbstractC167027dH.A0o(parcel, this.A01, 0, 1);
            Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A04);
            while (A0u.hasNext()) {
                ((AchievementBadge) A0u.next()).writeToParcel(parcel, i);
            }
            List list = this.A05;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            Iterator A0u2 = AbstractC25231BEo.A0u(parcel, list);
            while (A0u2.hasNext()) {
                ((AchievementBadge) A0u2.next()).writeToParcel(parcel, i);
            }
        }

        public final int hashCode() {
            return AbstractC166997dE.A0J(this.A04, (AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A06, AbstractC25235BEs.A03(this.A00)))) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A05);
        }
    }

    /* loaded from: classes5.dex */
    public final class ChallengeBadge extends Badge implements Parcelable {
        public static final Parcelable.Creator CREATOR = new LNM(82);
        public final long A00;
        public final Challenge A01;
        public final Integer A02;
        public final Integer A03;
        public final Integer A04;
        public final String A05;
        public final String A06;
        public final String A07;
        public final String A08;
        public final String A09;
        public final String A0A;
        public final String A0B;
        public final String A0C;
        public final boolean A0D;
        public final String A0E;
        public final boolean A0F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChallengeBadge(Challenge challenge, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j, boolean z, boolean z2) {
            super(num2, num3, z2);
            AbstractC25233BEq.A0w(2, str, str2, str3);
            AbstractC25229BEm.A1P(str6, 7, challenge);
            this.A00 = j;
            this.A08 = str;
            this.A0C = str2;
            this.A07 = str3;
            this.A0E = str4;
            this.A05 = str5;
            this.A06 = str6;
            this.A09 = str7;
            this.A03 = num;
            this.A02 = num2;
            this.A04 = num3;
            this.A0F = z;
            this.A0D = z2;
            this.A0A = str8;
            this.A0B = str9;
            this.A01 = challenge;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ChallengeBadge) {
                    ChallengeBadge challengeBadge = (ChallengeBadge) obj;
                    if (this.A00 != challengeBadge.A00 || !C14360o3.A0K(this.A08, challengeBadge.A08) || !C14360o3.A0K(this.A0C, challengeBadge.A0C) || !C14360o3.A0K(this.A07, challengeBadge.A07) || !C14360o3.A0K(this.A0E, challengeBadge.A0E) || !C14360o3.A0K(this.A05, challengeBadge.A05) || !C14360o3.A0K(this.A06, challengeBadge.A06) || !C14360o3.A0K(this.A09, challengeBadge.A09) || !C14360o3.A0K(this.A03, challengeBadge.A03) || !C14360o3.A0K(this.A02, challengeBadge.A02) || !C14360o3.A0K(this.A04, challengeBadge.A04) || this.A0F != challengeBadge.A0F || this.A0D != challengeBadge.A0D || !C14360o3.A0K(this.A0A, challengeBadge.A0A) || !C14360o3.A0K(this.A0B, challengeBadge.A0B) || !C14360o3.A0K(this.A01, challengeBadge.A01)) {
                    }
                }
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeLong(this.A00);
            parcel.writeString(this.A08);
            parcel.writeString(this.A0C);
            parcel.writeString(this.A07);
            parcel.writeString(this.A0E);
            parcel.writeString(this.A05);
            parcel.writeString(this.A06);
            parcel.writeString(this.A09);
            AbstractC167027dH.A0o(parcel, this.A03, 0, 1);
            AbstractC167027dH.A0o(parcel, this.A02, 0, 1);
            AbstractC167027dH.A0o(parcel, this.A04, 0, 1);
            parcel.writeInt(this.A0F ? 1 : 0);
            parcel.writeInt(this.A0D ? 1 : 0);
            parcel.writeString(this.A0A);
            parcel.writeString(this.A0B);
            parcel.writeParcelable(this.A01, i);
        }

        public final int hashCode() {
            return AbstractC166987dD.A0I(this.A01, (((AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A0F, (((((((AbstractC166997dE.A0K(this.A06, (((AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0K(this.A0C, AbstractC166997dE.A0K(this.A08, AbstractC25235BEs.A03(this.A00)))) + AbstractC167017dG.A0O(this.A0E)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31)) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC25227BEk.A07(this.A0B)) * 31);
        }
    }

    /* loaded from: classes5.dex */
    public final class ChallengeTieredBadge extends Badge implements Parcelable {
        public static final Parcelable.Creator CREATOR = new LNM(83);
        public final long A00;
        public final Integer A01;
        public final String A02;
        public final String A03;
        public final List A04;
        public final String A05;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChallengeTieredBadge(Integer num, String str, String str2, String str3, List list, long j) {
            super(null, null, false);
            AbstractC25233BEq.A0w(2, str, str2, str3);
            this.A00 = j;
            this.A05 = str;
            this.A03 = str2;
            this.A02 = str3;
            this.A01 = num;
            this.A04 = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ChallengeTieredBadge) {
                    ChallengeTieredBadge challengeTieredBadge = (ChallengeTieredBadge) obj;
                    if (this.A00 != challengeTieredBadge.A00 || !C14360o3.A0K(this.A05, challengeTieredBadge.A05) || !C14360o3.A0K(this.A03, challengeTieredBadge.A03) || !C14360o3.A0K(this.A02, challengeTieredBadge.A02) || !C14360o3.A0K(this.A01, challengeTieredBadge.A01) || !C14360o3.A0K(this.A04, challengeTieredBadge.A04)) {
                    }
                }
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int intValue;
            C14360o3.A0B(parcel, 0);
            parcel.writeLong(this.A00);
            parcel.writeString(this.A05);
            parcel.writeString(this.A03);
            parcel.writeString(this.A02);
            Integer num = this.A01;
            if (num == null) {
                intValue = 0;
            } else {
                parcel.writeInt(1);
                intValue = num.intValue();
            }
            parcel.writeInt(intValue);
            Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A04);
            while (A0u.hasNext()) {
                ((ChallengeBadge) A0u.next()).writeToParcel(parcel, i);
            }
        }

        public final int hashCode() {
            return AbstractC166987dD.A0I(this.A04, (AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A05, AbstractC25235BEs.A03(this.A00)))) + AbstractC167017dG.A0M(this.A01)) * 31);
        }
    }

    public final long A00() {
        if (this instanceof ChallengeTieredBadge) {
            return ((ChallengeTieredBadge) this).A00;
        }
        if (this instanceof ChallengeBadge) {
            return ((ChallengeBadge) this).A00;
        }
        if (this instanceof AchievementTieredBadge) {
            return ((AchievementTieredBadge) this).A00;
        }
        return ((AchievementBadge) this).A00;
    }

    public final Integer A01() {
        if (this instanceof ChallengeTieredBadge) {
            return ((ChallengeTieredBadge) this).A01;
        }
        if (this instanceof ChallengeBadge) {
            return ((ChallengeBadge) this).A03;
        }
        if (this instanceof AchievementTieredBadge) {
            return ((AchievementTieredBadge) this).A01;
        }
        return ((AchievementBadge) this).A03;
    }

    public final String A02() {
        if (this instanceof ChallengeTieredBadge) {
            return ((ChallengeTieredBadge) this).A02;
        }
        if (this instanceof ChallengeBadge) {
            return ((ChallengeBadge) this).A06;
        }
        if (this instanceof AchievementTieredBadge) {
            return ((AchievementTieredBadge) this).A02;
        }
        return ((AchievementBadge) this).A06;
    }

    public final String A03() {
        if (this instanceof ChallengeTieredBadge) {
            return ((ChallengeTieredBadge) this).A03;
        }
        if (this instanceof ChallengeBadge) {
            return ((ChallengeBadge) this).A0C;
        }
        if (this instanceof AchievementTieredBadge) {
            return ((AchievementTieredBadge) this).A03;
        }
        return ((AchievementBadge) this).A08;
    }

    public Badge(Integer num, Integer num2, boolean z) {
        this.A00 = num;
        this.A01 = num2;
        this.A02 = z;
    }
}
