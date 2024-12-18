package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39307HXy;
import X.C41091IHi;
import X.C43258JAd;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductTileMetadata extends C17T implements ProductTileMetadata {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(58);

    @Override // com.instagram.api.schemas.ProductTileMetadata
    public final /* synthetic */ C41091IHi AKT() {
        return new C41091IHi(this);
    }

    @Override // com.instagram.api.schemas.ProductTileMetadata
    public final ProductTileMetadataDestination Awx() {
        return (ProductTileMetadataDestination) A0N(-1429847026, C43258JAd.A00);
    }

    @Override // com.instagram.api.schemas.ProductTileMetadata
    public final List BL3() {
        return A0o(-1110417409, ImmutablePandoProductTileLabel.class);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ProductTileMetadata
    public final ProductTileMetadataDecorations Aw6() {
        return (ProductTileMetadataDecorations) A05(638148035, ImmutablePandoProductTileMetadataDecorations.class);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
