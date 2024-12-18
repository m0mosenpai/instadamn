package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40422HwD;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoTopic extends C17T implements TopicIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(13);

    @Override // com.instagram.api.schemas.TopicIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40422HwD.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.TopicIntf
    public final String C9c() {
        return A0k(-957291989);
    }

    @Override // com.instagram.api.schemas.TopicIntf
    public final Topic F3O() {
        return new Topic(A0i(-892481550), A0k(-957291989));
    }

    @Override // com.instagram.api.schemas.TopicIntf
    public final String getStatus() {
        return A0i(-892481550);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
