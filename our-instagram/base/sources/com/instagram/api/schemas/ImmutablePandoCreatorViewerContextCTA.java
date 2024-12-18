package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37304Gc5;
import X.AbstractC39868HmH;
import X.C17T;
import X.C39306HXx;
import X.J9T;
import X.J9U;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoCreatorViewerContextCTA extends C17T implements CreatorViewerContextCTA {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(47);

    @Override // com.instagram.api.schemas.CreatorViewerContextCTA
    public final CreatorViewerContextCTAType ArJ() {
        return (CreatorViewerContextCTAType) A0M(-1400078183, J9T.A00);
    }

    @Override // com.instagram.api.schemas.CreatorViewerContextCTA
    public final CreatorViewerContextCTATarget Ato() {
        return (CreatorViewerContextCTATarget) A0N(1890155168, J9U.A00);
    }

    @Override // com.instagram.api.schemas.CreatorViewerContextCTA
    public final FormattedString B3S() {
        return (FormattedString) A05(1708780659, ImmutablePandoFormattedString.class);
    }

    @Override // com.instagram.api.schemas.CreatorViewerContextCTA
    public final FormattedString B8J() {
        return (FormattedString) A05(-1686936880, ImmutablePandoFormattedString.class);
    }

    @Override // com.instagram.api.schemas.CreatorViewerContextCTA
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39868HmH.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.CreatorViewerContextCTA
    public final String BEi() {
        return AbstractC37304Gc5.A0i(this);
    }

    @Override // com.instagram.api.schemas.CreatorViewerContextCTA
    public final CreatorViewerContextCTAImpl Esm() {
        FormattedStringImpl formattedStringImpl;
        CreatorViewerContextCTAType ArJ = ArJ();
        CreatorViewerContextCTATarget Ato = Ato();
        FormattedString B3S = B3S();
        FormattedStringImpl formattedStringImpl2 = null;
        if (B3S != null) {
            formattedStringImpl = B3S.Eth();
        } else {
            formattedStringImpl = null;
        }
        FormattedString B8J = B8J();
        if (B8J != null) {
            formattedStringImpl2 = B8J.Eth();
        }
        return new CreatorViewerContextCTAImpl(Ato, ArJ, formattedStringImpl, formattedStringImpl2, AbstractC37304Gc5.A0i(this), A0P());
    }

    @Override // com.instagram.api.schemas.CreatorViewerContextCTA
    public final String getText() {
        return A0P();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
