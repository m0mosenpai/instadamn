package com.instagram.leadgen.core.api;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;

/* loaded from: classes7.dex */
public final class ImmutablePandoLeadGenInfoFieldData extends C17T implements LeadGenInfoFieldDataIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(38);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.leadgen.core.api.LeadGenInfoFieldDataIntf
    public final LeadGenInfoFieldData F52() {
        return new LeadGenInfoFieldData(A0Q(), getOptionalStringListByHashCode(-1249474914), getBooleanValueByHashCode(2133721055));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
