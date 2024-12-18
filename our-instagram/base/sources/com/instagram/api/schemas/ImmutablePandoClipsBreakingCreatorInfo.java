package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ImmutablePandoClipsBreakingCreatorInfo extends C17T implements ClipsBreakingCreatorInfo {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(29);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ClipsBreakingCreatorInfo
    public final ClipsBreakingCreatorInfoImpl Ert() {
        return new ClipsBreakingCreatorInfoImpl(A0h(-1473781449));
    }

    @Override // com.instagram.api.schemas.ClipsBreakingCreatorInfo
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        A0h(-1473781449);
        A0X.put("display_label", A0h(-1473781449));
        return AbstractC37304Gc5.A07(this, A0X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
