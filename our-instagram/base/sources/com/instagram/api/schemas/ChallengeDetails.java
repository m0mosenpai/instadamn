package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC25233BEq;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class ChallengeDetails extends C0T6 implements Parcelable, ChallengeDetailsIntf {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(96);
    public final int A00;
    public final int A01;
    public final ChallengeButtonInfo A02;
    public final ChallengeButtonInfo A03;
    public final ChallengeButtonInfo A04;
    public final ChallengeName A05;
    public final ChallengeState A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;

    public ChallengeDetails(ChallengeButtonInfo challengeButtonInfo, ChallengeButtonInfo challengeButtonInfo2, ChallengeButtonInfo challengeButtonInfo3, ChallengeName challengeName, ChallengeState challengeState, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, boolean z) {
        AbstractC25233BEq.A0x(1, str, str3, challengeName);
        AbstractC25229BEm.A1O(challengeState, 13, str8);
        this.A07 = str;
        this.A08 = str2;
        this.A0F = z;
        this.A09 = str3;
        this.A05 = challengeName;
        this.A02 = challengeButtonInfo;
        this.A00 = i;
        this.A0A = str4;
        this.A0B = str5;
        this.A0C = str6;
        this.A03 = challengeButtonInfo2;
        this.A04 = challengeButtonInfo3;
        this.A06 = challengeState;
        this.A0D = str7;
        this.A0E = str8;
        this.A01 = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChallengeDetails) {
                ChallengeDetails challengeDetails = (ChallengeDetails) obj;
                if (!C14360o3.A0K(this.A07, challengeDetails.A07) || !C14360o3.A0K(this.A08, challengeDetails.A08) || this.A0F != challengeDetails.A0F || !C14360o3.A0K(this.A09, challengeDetails.A09) || this.A05 != challengeDetails.A05 || !C14360o3.A0K(this.A02, challengeDetails.A02) || this.A00 != challengeDetails.A00 || !C14360o3.A0K(this.A0A, challengeDetails.A0A) || !C14360o3.A0K(this.A0B, challengeDetails.A0B) || !C14360o3.A0K(this.A0C, challengeDetails.A0C) || !C14360o3.A0K(this.A03, challengeDetails.A03) || !C14360o3.A0K(this.A04, challengeDetails.A04) || this.A06 != challengeDetails.A06 || !C14360o3.A0K(this.A0D, challengeDetails.A0D) || !C14360o3.A0K(this.A0E, challengeDetails.A0E) || this.A01 != challengeDetails.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A01);
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A0E, (AbstractC166997dE.A0J(this.A06, (((((((((((((AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0K(this.A09, AbstractC167007dF.A0D(this.A0F, (AbstractC166987dD.A0J(this.A07) + AbstractC167017dG.A0O(this.A08)) * 31))) + AbstractC167017dG.A0M(this.A02)) * 31) + this.A00) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC25227BEk.A07(this.A0D)) * 31) + this.A01;
    }
}
