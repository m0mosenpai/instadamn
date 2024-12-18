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
public final class ImmutablePandoDirectMediaFallbackUrl extends C17T implements DirectMediaFallbackUrlIntf {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(59);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.DirectMediaFallbackUrlIntf
    public final DirectMediaFallbackUrl Et7() {
        return new DirectMediaFallbackUrl(A0R());
    }

    @Override // com.instagram.api.schemas.DirectMediaFallbackUrlIntf
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (A0R() != null) {
            AbstractC37300Gc1.A13(A0R(), A0X);
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }

    @Override // com.instagram.api.schemas.DirectMediaFallbackUrlIntf
    public final String getUrl() {
        return A0R();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
