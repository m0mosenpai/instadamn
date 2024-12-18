package com.instagram.leadgen.core.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes9.dex */
public final class LeadGenProfileContentInfo extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(18);
    public final ImageUrl A00;
    public final LeadGenTrustSignalsPayload A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenProfileContentInfo) {
                LeadGenProfileContentInfo leadGenProfileContentInfo = (LeadGenProfileContentInfo) obj;
                if (!C14360o3.A0K(this.A02, leadGenProfileContentInfo.A02) || !C14360o3.A0K(this.A00, leadGenProfileContentInfo.A00) || !C14360o3.A0K(this.A01, leadGenProfileContentInfo.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        LeadGenTrustSignalsPayload leadGenTrustSignalsPayload = this.A01;
        if (leadGenTrustSignalsPayload == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            leadGenTrustSignalsPayload.writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A02)) + AbstractC167017dG.A0M(this.A01);
    }

    public LeadGenProfileContentInfo(ImageUrl imageUrl, LeadGenTrustSignalsPayload leadGenTrustSignalsPayload, String str) {
        AbstractC167017dG.A1P(str, imageUrl);
        this.A02 = str;
        this.A00 = imageUrl;
        this.A01 = leadGenTrustSignalsPayload;
    }
}
