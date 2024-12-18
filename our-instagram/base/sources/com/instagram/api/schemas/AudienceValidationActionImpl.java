package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class AudienceValidationActionImpl extends C0T6 implements Parcelable, AudienceValidationAction {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(56);
    public final AudienceValidationActionType A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudienceValidationActionImpl) {
                AudienceValidationActionImpl audienceValidationActionImpl = (AudienceValidationActionImpl) obj;
                if (this.A00 != audienceValidationActionImpl.A00 || !C14360o3.A0K(this.A01, audienceValidationActionImpl.A01) || !C14360o3.A0K(this.A02, audienceValidationActionImpl.A02)) {
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
        return AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0G(this.A00)) + AbstractC167017dG.A0O(this.A02);
    }

    public AudienceValidationActionImpl(AudienceValidationActionType audienceValidationActionType, String str, String str2) {
        AbstractC167017dG.A1P(audienceValidationActionType, str);
        this.A00 = audienceValidationActionType;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // com.instagram.api.schemas.AudienceValidationAction
    public final String getCtaText() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.AudienceValidationAction
    public final String getUrl() {
        return this.A02;
    }
}
