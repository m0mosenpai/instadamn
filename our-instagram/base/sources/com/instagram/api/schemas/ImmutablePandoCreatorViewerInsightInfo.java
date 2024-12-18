package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC39870HmJ;
import X.C17T;
import X.C39306HXx;
import X.J9X;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoCreatorViewerInsightInfo extends C17T implements CreatorViewerInsightInfo {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(48);

    @Override // com.instagram.api.schemas.CreatorViewerInsightInfo
    public final FormattedString B8J() {
        return (FormattedString) A05(-1686936880, ImmutablePandoFormattedString.class);
    }

    @Override // com.instagram.api.schemas.CreatorViewerInsightInfo
    public final CreatorViewerInsightTypeV2 BII() {
        return (CreatorViewerInsightTypeV2) A0M(-476664838, J9X.A00);
    }

    @Override // com.instagram.api.schemas.CreatorViewerInsightInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39870HmJ.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.CreatorViewerInsightInfo
    public final CreatorViewerInsightInfoImpl Eso() {
        FormattedStringImpl formattedStringImpl;
        FormattedString B8J = B8J();
        if (B8J != null) {
            formattedStringImpl = B8J.Eth();
        } else {
            formattedStringImpl = null;
        }
        return new CreatorViewerInsightInfoImpl(BII(), formattedStringImpl, A0P());
    }

    @Override // com.instagram.api.schemas.CreatorViewerInsightInfo
    public final String getText() {
        return A0P();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
