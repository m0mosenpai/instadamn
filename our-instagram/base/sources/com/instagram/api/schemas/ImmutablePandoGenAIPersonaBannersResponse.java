package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC39939HnU;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoGenAIPersonaBannersResponse extends C17T implements GenAIPersonaBannersResponse {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(75);

    @Override // com.instagram.api.schemas.GenAIPersonaBannersResponse
    public final List AfW() {
        return A0o(-336959801, ImmutablePandoGenAIPersonaBannerDict.class);
    }

    @Override // com.instagram.api.schemas.GenAIPersonaBannersResponse
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39939HnU.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.GenAIPersonaBannersResponse
    public final GenAIPersonaBannersResponseImpl Etp() {
        List AfW = AfW();
        ArrayList A0q = AbstractC167017dG.A0q(AfW);
        Iterator it = AfW.iterator();
        while (it.hasNext()) {
            A0q.add(((GenAIPersonaBannerDict) it.next()).Eto());
        }
        return new GenAIPersonaBannersResponseImpl(A0q);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
