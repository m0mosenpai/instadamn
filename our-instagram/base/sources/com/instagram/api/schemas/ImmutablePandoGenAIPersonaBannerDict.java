package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC39937HnS;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoGenAIPersonaBannerDict extends C17T implements GenAIPersonaBannerDict {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(74);

    @Override // com.instagram.api.schemas.GenAIPersonaBannerDict
    public final GenAIMessagingData BG4() {
        return (GenAIMessagingData) A04(256177478, ImmutablePandoGenAIMessagingData.class);
    }

    @Override // com.instagram.api.schemas.GenAIPersonaBannerDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39937HnS.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.GenAIPersonaBannerDict
    public final String Bcd() {
        return A0k(679047822);
    }

    @Override // com.instagram.api.schemas.GenAIPersonaBannerDict
    public final String Bhp() {
        return A0i(-174080651);
    }

    @Override // com.instagram.api.schemas.GenAIPersonaBannerDict
    public final GenAIPersonaBannerDictImpl Eto() {
        return new GenAIPersonaBannerDictImpl(BG4().Etn(), A0Q(), A0k(679047822), A0i(-174080651));
    }

    @Override // com.instagram.api.schemas.GenAIPersonaBannerDict
    public final String getName() {
        return A0Q();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
