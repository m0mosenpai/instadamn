package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;

/* loaded from: classes7.dex */
public final class ImmutablePandoMiniShopColorCustomization extends C17T implements MiniShopColorCustomizationIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(21);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}