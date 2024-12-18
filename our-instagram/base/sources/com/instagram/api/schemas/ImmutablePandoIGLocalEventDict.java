package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC39992HoZ;
import X.C17T;
import X.C39307HXy;
import X.C43248J9t;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoIGLocalEventDict extends C17T implements IGLocalEventDict {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(0);

    @Override // com.instagram.api.schemas.IGLocalEventDict
    public final EventVisibilityType BFb() {
        return (EventVisibilityType) A0N(-1808927016, C43248J9t.A00);
    }

    @Override // com.instagram.api.schemas.IGLocalEventDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39992HoZ.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.IGLocalEventDict
    public final String BFa() {
        return A0i(561684157);
    }

    @Override // com.instagram.api.schemas.IGLocalEventDict
    public final IGLocalEventDictImpl Ev7() {
        return new IGLocalEventDictImpl(BFb(), A0i(561684157));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
