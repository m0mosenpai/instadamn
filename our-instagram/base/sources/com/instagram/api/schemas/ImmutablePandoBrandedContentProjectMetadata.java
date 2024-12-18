package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC53770NqM;
import X.C17T;
import X.C39306HXx;
import X.C57607PhJ;
import X.C57608PhK;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoBrandedContentProjectMetadata extends C17T implements BrandedContentProjectMetadataIntf {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(22);

    @Override // com.instagram.api.schemas.BrandedContentProjectMetadataIntf
    public final BrandedContentProjectAction AYK() {
        return (BrandedContentProjectAction) A0M(-1422950858, C57607PhJ.A00);
    }

    @Override // com.instagram.api.schemas.BrandedContentProjectMetadataIntf
    public final BCPDealOutputTypeEnum Avs() {
        return (BCPDealOutputTypeEnum) A0N(1856290917, C57608PhK.A00);
    }

    @Override // com.instagram.api.schemas.BrandedContentProjectMetadataIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC53770NqM.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.BrandedContentProjectMetadataIntf
    public final Boolean AaB() {
        return getOptionalBooleanValueByHashCode(-659718656);
    }

    @Override // com.instagram.api.schemas.BrandedContentProjectMetadataIntf
    public final String Ahu() {
        return A0j(-25385773);
    }

    @Override // com.instagram.api.schemas.BrandedContentProjectMetadataIntf
    public final String Ai2() {
        return A0i(-200051058);
    }

    @Override // com.instagram.api.schemas.BrandedContentProjectMetadataIntf
    public final String AkB() {
        return A0i(362868321);
    }

    @Override // com.instagram.api.schemas.BrandedContentProjectMetadataIntf
    public final String AkC() {
        return A0j(1039285120);
    }

    @Override // com.instagram.api.schemas.BrandedContentProjectMetadataIntf
    public final String BiT() {
        return A0k(-1969970175);
    }

    @Override // com.instagram.api.schemas.BrandedContentProjectMetadataIntf
    public final String BiU() {
        return A0i(939388913);
    }

    @Override // com.instagram.api.schemas.BrandedContentProjectMetadataIntf
    public final BrandedContentProjectMetadata ErO() {
        return new BrandedContentProjectMetadata(Avs(), AYK(), getOptionalBooleanValueByHashCode(-659718656), A0j(-25385773), A0i(-200051058), A0i(362868321), A0j(1039285120), A0k(-1969970175), A0i(939388913));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
