package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC25226BEj;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class ChallengeButtonInfoImpl extends C0T6 implements ChallengeButtonInfo, Parcelable {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(95);
    public final ChallengeButtonAction A00;
    public final String A01;
    public final String A02;

    @Override // com.instagram.api.schemas.ChallengeButtonInfo
    public final ChallengeButtonInfoImpl Eri() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChallengeButtonInfoImpl) {
                ChallengeButtonInfoImpl challengeButtonInfoImpl = (ChallengeButtonInfoImpl) obj;
                if (this.A00 != challengeButtonInfoImpl.A00 || !C14360o3.A0K(this.A01, challengeButtonInfoImpl.A01) || !C14360o3.A0K(this.A02, challengeButtonInfoImpl.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0G(this.A00)));
    }

    public ChallengeButtonInfoImpl(ChallengeButtonAction challengeButtonAction, String str, String str2) {
        AbstractC167027dH.A13(challengeButtonAction, str, str2);
        this.A00 = challengeButtonAction;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // com.instagram.api.schemas.ChallengeButtonInfo
    public final ChallengeButtonAction Aiw() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.ChallengeButtonInfo
    public final String Aj7() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.ChallengeButtonInfo
    public final String Aw9() {
        return this.A02;
    }
}
