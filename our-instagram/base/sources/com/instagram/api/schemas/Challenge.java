package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC25236BEt;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class Challenge extends C0T6 implements Parcelable, ChallengeIntf {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(93);
    public final int A00;
    public final int A01;
    public final long A02;
    public final ChallengeButtonInfo A03;
    public final ChallengeButtonInfo A04;
    public final ChallengeName A05;
    public final ChallengeState A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final boolean A0G;
    public final ChallengeButtonInfo A0H;
    public final ChallengeButtonInfo A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Challenge) {
                Challenge challenge = (Challenge) obj;
                if (!C14360o3.A0K(this.A0J, challenge.A0J) || !C14360o3.A0K(this.A08, challenge.A08) || !C14360o3.A0K(this.A03, challenge.A03) || !C14360o3.A0K(this.A0K, challenge.A0K) || !C14360o3.A0K(this.A0L, challenge.A0L) || this.A02 != challenge.A02 || !C14360o3.A0K(this.A0H, challenge.A0H) || !C14360o3.A0K(this.A0I, challenge.A0I) || !C14360o3.A0K(this.A09, challenge.A09) || this.A0G != challenge.A0G || !C14360o3.A0K(this.A0A, challenge.A0A) || !C14360o3.A0K(this.A04, challenge.A04) || !C14360o3.A0K(this.A0B, challenge.A0B) || !C14360o3.A0K(this.A0C, challenge.A0C) || !C14360o3.A0K(this.A0D, challenge.A0D) || !C14360o3.A0K(this.A0E, challenge.A0E) || !C14360o3.A0K(this.A07, challenge.A07) || this.A05 != challenge.A05 || this.A00 != challenge.A00 || !C14360o3.A0K(this.A0M, challenge.A0M) || this.A06 != challenge.A06 || !C14360o3.A0K(this.A0F, challenge.A0F) || this.A01 != challenge.A01) {
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
        parcel.writeString(this.A0J);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0L);
        parcel.writeLong(this.A02);
        parcel.writeParcelable(this.A0H, i);
        parcel.writeParcelable(this.A0I, i);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        Integer num = this.A07;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
        parcel.writeParcelable(this.A05, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0M);
        parcel.writeParcelable(this.A06, i);
        parcel.writeString(this.A0F);
        parcel.writeInt(this.A01);
    }

    public Challenge(ChallengeButtonInfo challengeButtonInfo, ChallengeButtonInfo challengeButtonInfo2, ChallengeButtonInfo challengeButtonInfo3, ChallengeButtonInfo challengeButtonInfo4, ChallengeName challengeName, ChallengeState challengeState, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, int i2, long j, boolean z) {
        AbstractC25229BEm.A1P(str8, 14, str10);
        C14360o3.A0B(challengeName, 18);
        C14360o3.A0B(challengeState, 21);
        C14360o3.A0B(str12, 22);
        this.A0J = str;
        this.A08 = str2;
        this.A03 = challengeButtonInfo;
        this.A0K = str3;
        this.A0L = str4;
        this.A02 = j;
        this.A0H = challengeButtonInfo2;
        this.A0I = challengeButtonInfo3;
        this.A09 = str5;
        this.A0G = z;
        this.A0A = str6;
        this.A04 = challengeButtonInfo4;
        this.A0B = str7;
        this.A0C = str8;
        this.A0D = str9;
        this.A0E = str10;
        this.A07 = num;
        this.A05 = challengeName;
        this.A00 = i;
        this.A0M = str11;
        this.A06 = challengeState;
        this.A0F = str12;
        this.A01 = i2;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A0F, AbstractC166997dE.A0J(this.A06, (((AbstractC166997dE.A0J(this.A05, (AbstractC166997dE.A0K(this.A0E, (AbstractC166997dE.A0K(this.A0C, (((((AbstractC167007dF.A0D(this.A0G, (((((AbstractC25236BEt.A01(this.A02, ((((((((AbstractC167017dG.A0O(this.A0J) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A0K)) * 31) + AbstractC167017dG.A0O(this.A0L)) * 31) + AbstractC167017dG.A0M(this.A0H)) * 31) + AbstractC167017dG.A0M(this.A0I)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + this.A00) * 31) + AbstractC25227BEk.A07(this.A0M)) * 31)) + this.A01;
    }
}
