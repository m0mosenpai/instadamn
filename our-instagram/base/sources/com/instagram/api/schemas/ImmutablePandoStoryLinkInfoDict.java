package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39307HXy;
import X.Tx5;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoStoryLinkInfoDict extends C17T implements StoryLinkInfoDictIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(84);

    @Override // com.instagram.api.schemas.StoryLinkInfoDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, Tx5.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.StoryLinkInfoDictIntf
    public final String Anl() {
        return A0j(906452786);
    }

    @Override // com.instagram.api.schemas.StoryLinkInfoDictIntf
    public final String AvF() {
        return A0i(-1581376446);
    }

    @Override // com.instagram.api.schemas.StoryLinkInfoDictIntf
    public final String Ayf() {
        return A0i(1714674802);
    }

    @Override // com.instagram.api.schemas.StoryLinkInfoDictIntf
    public final String BNV() {
        return A0i(1186582995);
    }

    @Override // com.instagram.api.schemas.StoryLinkInfoDictIntf
    public final String BNY() {
        return A0i(-1624275873);
    }

    @Override // com.instagram.api.schemas.StoryLinkInfoDictIntf
    public final Boolean BZ8() {
        return getOptionalBooleanValueByHashCode(4887561);
    }

    @Override // com.instagram.api.schemas.StoryLinkInfoDictIntf
    public final Boolean BvM() {
        return getOptionalBooleanValueByHashCode(-1864688508);
    }

    @Override // com.instagram.api.schemas.StoryLinkInfoDictIntf
    public final Integer C5H() {
        return getOptionalIntValueByHashCode(1488281845);
    }

    @Override // com.instagram.api.schemas.StoryLinkInfoDictIntf
    public final Boolean CSn() {
        return getOptionalBooleanValueByHashCode(-1844659745);
    }

    @Override // com.instagram.api.schemas.StoryLinkInfoDictIntf
    public final Boolean Cf2() {
        return getOptionalBooleanValueByHashCode(488622371);
    }

    @Override // com.instagram.api.schemas.StoryLinkInfoDictIntf
    public final StoryLinkInfoDict F0p() {
        String A0j = A0j(906452786);
        String A0i = A0i(-1581376446);
        String A0i2 = A0i(1714674802);
        return new StoryLinkInfoDict(getOptionalBooleanValueByHashCode(-1844659745), getOptionalBooleanValueByHashCode(488622371), getOptionalBooleanValueByHashCode(4887561), getOptionalBooleanValueByHashCode(-1864688508), getOptionalIntValueByHashCode(1488281845), A0j, A0i, A0i2, A0i(1186582995), A0i(-1624275873), A0V());
    }

    @Override // com.instagram.api.schemas.StoryLinkInfoDictIntf
    public final String getUrl() {
        return A0V();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
