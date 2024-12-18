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
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoBrandSafetyContentBlocklistBitmapQLObj extends C17T implements BrandSafetyContentBlocklistBitmapQLObj {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(19);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj
    public final List Ag9() {
        return getOptionalIntListByHashCode(-17963191);
    }

    @Override // com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj
    public final BrandSafetyContentBlocklistBitmapQLObjImpl ErL() {
        return new BrandSafetyContentBlocklistBitmapQLObjImpl(getOptionalIntListByHashCode(-17963191));
    }

    @Override // com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (getOptionalIntListByHashCode(-17963191) != null) {
            A0X.put("bitmap_array", getOptionalIntListByHashCode(-17963191));
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
