package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class GuidanceTipResponseImpl extends C0T6 implements Parcelable, GuidanceTipResponse {
    public static final Parcelable.Creator CREATOR = C41858IgC.A00(6);
    public final String A00;
    public final GuidanceTipIconAsset A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GuidanceTipResponseImpl) {
                GuidanceTipResponseImpl guidanceTipResponseImpl = (GuidanceTipResponseImpl) obj;
                if (!C14360o3.A0K(this.A00, guidanceTipResponseImpl.A00) || !C14360o3.A0K(this.A02, guidanceTipResponseImpl.A02) || this.A01 != guidanceTipResponseImpl.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
    }

    @Override // com.instagram.api.schemas.GuidanceTipResponse
    public final String Aqq() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.GuidanceTipResponse
    public final String Aw9() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, (AbstractC166987dD.A0J(this.A00) + AbstractC167017dG.A0O(this.A02)) * 31);
    }

    public GuidanceTipResponseImpl(GuidanceTipIconAsset guidanceTipIconAsset, String str, String str2) {
        AbstractC167017dG.A1Q(str, guidanceTipIconAsset);
        this.A00 = str;
        this.A02 = str2;
        this.A01 = guidanceTipIconAsset;
    }
}
