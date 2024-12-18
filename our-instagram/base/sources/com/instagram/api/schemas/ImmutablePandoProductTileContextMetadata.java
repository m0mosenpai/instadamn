package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC167007dF;
import X.AbstractC25235BEs;
import X.AbstractC37303Gc4;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C1DY;
import X.C39307HXy;
import android.os.Parcel;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductTileContextMetadata extends C17T implements ProductTileContextMetadata {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(54);

    @Override // com.instagram.api.schemas.ProductTileContextMetadata
    public final ProductTileContextMetadataImpl EyT(C1DY c1dy) {
        List A0o = A0o(111578632, ImmutablePandoUserDict.class);
        ArrayList A0i = AbstractC167007dF.A0i(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            AbstractC37304Gc5.A1I(c1dy, A0i, it);
        }
        ArrayList A0i2 = AbstractC167007dF.A0i(A0i);
        Iterator it2 = A0i.iterator();
        while (it2.hasNext()) {
            AbstractC37303Gc4.A18(c1dy, A0i2, it2);
        }
        return new ProductTileContextMetadataImpl(A0i2);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
