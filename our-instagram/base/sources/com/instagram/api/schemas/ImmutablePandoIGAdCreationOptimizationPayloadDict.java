package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC39968Hnx;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoIGAdCreationOptimizationPayloadDict extends C17T implements IGAdCreationOptimizationPayloadDict {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(89);

    @Override // com.instagram.api.schemas.IGAdCreationOptimizationPayloadDict
    public final List AZ8() {
        return A08(-623401166, ImmutablePandoIGAdCreativeOptimizationConfigByTypeDict.class);
    }

    @Override // com.instagram.api.schemas.IGAdCreationOptimizationPayloadDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39968Hnx.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.IGAdCreationOptimizationPayloadDict
    public final IGAdCreationOptimizationPayloadDictImpl EuE() {
        ArrayList arrayList;
        List AZ8 = AZ8();
        if (AZ8 != null) {
            arrayList = AbstractC167017dG.A0q(AZ8);
            Iterator it = AZ8.iterator();
            while (it.hasNext()) {
                arrayList.add(((IGAdCreativeOptimizationConfigByTypeDict) it.next()).EuF());
            }
        } else {
            arrayList = null;
        }
        return new IGAdCreationOptimizationPayloadDictImpl(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
