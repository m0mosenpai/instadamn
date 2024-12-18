package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25235BEs;
import X.C17T;
import X.C1DY;
import X.C39307HXy;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductTileMetadataDecorations extends C17T implements ProductTileMetadataDecorations {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(59);

    @Override // com.instagram.api.schemas.ProductTileMetadataDecorations
    public final List AfW() {
        return A0o(-336959801, ImmutablePandoProductTileBannerMetadataDecoration.class);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ProductTileMetadataDecorations
    public final boolean BCY() {
        return getBooleanValueByHashCode(103379179);
    }

    @Override // com.instagram.api.schemas.ProductTileMetadataDecorations
    public final boolean BwD() {
        return getBooleanValueByHashCode(445905929);
    }

    @Override // com.instagram.api.schemas.ProductTileMetadataDecorations
    public final boolean Bwk() {
        return getBooleanValueByHashCode(1441419896);
    }

    @Override // com.instagram.api.schemas.ProductTileMetadataDecorations
    public final boolean Bwl() {
        return getBooleanValueByHashCode(454837273);
    }

    @Override // com.instagram.api.schemas.ProductTileMetadataDecorations
    public final boolean Bwp() {
        return getBooleanValueByHashCode(-1813196302);
    }

    @Override // com.instagram.api.schemas.ProductTileMetadataDecorations
    public final ProductTileContext CIo() {
        return (ProductTileContext) A05(951530927, ImmutablePandoProductTileContext.class);
    }

    @Override // com.instagram.api.schemas.ProductTileMetadataDecorations
    public final Boolean CeY() {
        return getOptionalBooleanValueByHashCode(618262526);
    }

    @Override // com.instagram.api.schemas.ProductTileMetadataDecorations
    public final ProductTileMetadataDecorationsImpl EyX(C1DY c1dy) {
        ProductTileContextImpl productTileContextImpl;
        List AfW = AfW();
        ArrayList A0q = AbstractC167017dG.A0q(AfW);
        Iterator it = AfW.iterator();
        while (it.hasNext()) {
            A0q.add(((ProductTileBannerMetadataDecoration) it.next()).EyR());
        }
        ProductTileContext CIo = CIo();
        if (CIo != null) {
            productTileContextImpl = CIo.EyS(c1dy);
        } else {
            productTileContextImpl = null;
        }
        return new ProductTileMetadataDecorationsImpl(productTileContextImpl, getOptionalBooleanValueByHashCode(618262526), A0q, getBooleanValueByHashCode(103379179), getBooleanValueByHashCode(2003884718), getBooleanValueByHashCode(445905929), getBooleanValueByHashCode(2137929178), getBooleanValueByHashCode(1441419896), getBooleanValueByHashCode(454837273), getBooleanValueByHashCode(-1813196302));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
