package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC39935HnQ;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoGenAIMessagingData extends C17T implements GenAIMessagingData {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(73);

    @Override // com.instagram.api.schemas.GenAIMessagingData
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39935HnQ.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.GenAIMessagingData
    public final String AhP() {
        return A0j(-1383249261);
    }

    @Override // com.instagram.api.schemas.GenAIMessagingData
    public final String C7I() {
        return A0j(-1562235024);
    }

    @Override // com.instagram.api.schemas.GenAIMessagingData
    public final GenAIMessagingDataImpl Etn() {
        return new GenAIMessagingDataImpl(A0j(-1383249261), A0j(-1562235024));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
