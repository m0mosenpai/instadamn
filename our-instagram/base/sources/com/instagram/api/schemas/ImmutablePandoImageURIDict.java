package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ImmutablePandoImageURIDict extends C17T implements ImageURIDict {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(6);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ImageURIDict
    public final ImageURIDictImpl Evf() {
        return new ImageURIDictImpl(A0h(116076));
    }

    @Override // com.instagram.api.schemas.ImageURIDict
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        A0h(116076);
        A0X.put("uri", A0h(116076));
        return AbstractC37304Gc5.A07(this, A0X);
    }

    @Override // com.instagram.api.schemas.ImageURIDict
    public final String getUri() {
        return A0h(116076);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
