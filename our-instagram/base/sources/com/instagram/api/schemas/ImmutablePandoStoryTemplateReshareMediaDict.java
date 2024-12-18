package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37303Gc4;
import X.AbstractC40335Huf;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoStoryTemplateReshareMediaDict extends C17T implements StoryTemplateReshareMediaDict {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(3);

    @Override // com.instagram.api.schemas.StoryTemplateReshareMediaDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40335Huf.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.StoryTemplateReshareMediaDict
    public final Integer Am9() {
        return getOptionalIntValueByHashCode(-368220877);
    }

    @Override // com.instagram.api.schemas.StoryTemplateReshareMediaDict
    public final StoryTemplateReshareMediaDictImpl F2A() {
        return new StoryTemplateReshareMediaDictImpl(A0f(), getOptionalIntValueByHashCode(-368220877), AbstractC37303Gc4.A0V(this));
    }

    @Override // com.instagram.api.schemas.StoryTemplateReshareMediaDict
    public final String getMediaId() {
        return A0f();
    }

    @Override // com.instagram.api.schemas.StoryTemplateReshareMediaDict
    public final String getUserId() {
        return AbstractC37303Gc4.A0V(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
