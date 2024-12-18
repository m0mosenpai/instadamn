package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40342Hum;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoStoryThenAndNowStickerDict extends C17T implements StoryThenAndNowStickerDictIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(5);

    @Override // com.instagram.api.schemas.StoryThenAndNowStickerDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40342Hum.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.StoryThenAndNowStickerDictIntf
    public final String AaS() {
        return A0i(474040276);
    }

    @Override // com.instagram.api.schemas.StoryThenAndNowStickerDictIntf
    public final String Aft() {
        return A0i(80445649);
    }

    @Override // com.instagram.api.schemas.StoryThenAndNowStickerDictIntf
    public final Boolean CQX() {
        return getOptionalBooleanValueByHashCode(-928846796);
    }

    @Override // com.instagram.api.schemas.StoryThenAndNowStickerDictIntf
    public final StoryThenAndNowStickerDict F2F() {
        return new StoryThenAndNowStickerDict(getOptionalBooleanValueByHashCode(-928846796), A0i(474040276), A0i(80445649), A0e());
    }

    @Override // com.instagram.api.schemas.StoryThenAndNowStickerDictIntf
    public final String getId() {
        return A0e();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
