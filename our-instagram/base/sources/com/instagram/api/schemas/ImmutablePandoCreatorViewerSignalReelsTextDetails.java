package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC39885HmY;
import X.C17T;
import X.C39306HXx;
import X.C43229J9a;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoCreatorViewerSignalReelsTextDetails extends C17T implements CreatorViewerSignalReelsTextDetails {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(54);

    @Override // com.instagram.api.schemas.CreatorViewerSignalReelsTextDetails
    public final FormattedString C3a() {
        return (FormattedString) A05(-2060497896, ImmutablePandoFormattedString.class);
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalReelsTextDetails
    public final ClipsTextFormatType C6K() {
        return (ClipsTextFormatType) A0N(-824444304, C43229J9a.A00);
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalReelsTextDetails
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39885HmY.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalReelsTextDetails
    public final CreatorViewerSignalReelsTextDetailsImpl Esz() {
        FormattedStringImpl formattedStringImpl;
        FormattedString C3a = C3a();
        if (C3a != null) {
            formattedStringImpl = C3a.Eth();
        } else {
            formattedStringImpl = null;
        }
        return new CreatorViewerSignalReelsTextDetailsImpl(C6K(), formattedStringImpl);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
