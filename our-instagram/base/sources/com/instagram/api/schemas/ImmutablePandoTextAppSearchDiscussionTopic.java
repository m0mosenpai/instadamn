package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC46596KjZ;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoTextAppSearchDiscussionTopic extends C17T implements TextAppSearchDiscussionTopic {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(10);

    @Override // com.instagram.api.schemas.TextAppSearchDiscussionTopic
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC46596KjZ.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.TextAppSearchDiscussionTopic
    public final String B5E() {
        return A0j(3136215);
    }

    @Override // com.instagram.api.schemas.TextAppSearchDiscussionTopic
    public final String BGu() {
        return A0i(-877823861);
    }

    @Override // com.instagram.api.schemas.TextAppSearchDiscussionTopic
    public final String BTa() {
        return A0i(1485732072);
    }

    @Override // com.instagram.api.schemas.TextAppSearchDiscussionTopic
    public final String ByO() {
        return A0i(-1775780078);
    }

    @Override // com.instagram.api.schemas.TextAppSearchDiscussionTopic
    public final TextAppSearchDiscussionTopicImpl F2y() {
        return new TextAppSearchDiscussionTopicImpl(A0j(3136215), A0i(-877823861), A0i(1485732072), A0i(-1775780078), A0Y());
    }

    @Override // com.instagram.api.schemas.TextAppSearchDiscussionTopic
    public final String getTitle() {
        return A0Y();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
