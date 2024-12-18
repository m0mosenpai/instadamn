package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37304Gc5;
import X.AbstractC39883HmW;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoCreatorViewerSignalPlainDetails extends C17T implements CreatorViewerSignalPlainDetails {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(53);

    @Override // com.instagram.api.schemas.CreatorViewerSignalPlainDetails
    public final FormattedString C3a() {
        return (FormattedString) A05(-2060497896, ImmutablePandoFormattedString.class);
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalPlainDetails
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39883HmW.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalPlainDetails
    public final String BEi() {
        return AbstractC37304Gc5.A0i(this);
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalPlainDetails
    public final CreatorViewerSignalPlainDetailsImpl Esy() {
        FormattedStringImpl formattedStringImpl;
        String A0i = AbstractC37304Gc5.A0i(this);
        FormattedString C3a = C3a();
        if (C3a != null) {
            formattedStringImpl = C3a.Eth();
        } else {
            formattedStringImpl = null;
        }
        return new CreatorViewerSignalPlainDetailsImpl(formattedStringImpl, A0i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
