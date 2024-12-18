package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37304Gc5;
import X.AbstractC39887Hma;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoCreatorViewerSignalWithInsightsInfo extends C17T implements CreatorViewerSignalWithInsightsInfo {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(55);

    @Override // com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfo
    public final List BIJ() {
        return A08(545142747, ImmutablePandoCreatorViewerInsightInfo.class);
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfo
    public final CreatorViewerSignalInfo BxE() {
        return (CreatorViewerSignalInfo) A04(-902467928, ImmutablePandoCreatorViewerSignalInfo.class);
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39887Hma.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfo
    public final String BEi() {
        return AbstractC37304Gc5.A0i(this);
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfo
    public final String BGW() {
        return A0i(100313435);
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfo
    public final CreatorViewerSignalWithInsightsInfoImpl Et0() {
        ArrayList arrayList;
        String A0i = AbstractC37304Gc5.A0i(this);
        String A0i2 = A0i(100313435);
        List BIJ = BIJ();
        if (BIJ != null) {
            arrayList = AbstractC167017dG.A0q(BIJ);
            Iterator it = BIJ.iterator();
            while (it.hasNext()) {
                arrayList.add(((CreatorViewerInsightInfo) it.next()).Eso());
            }
        } else {
            arrayList = null;
        }
        return new CreatorViewerSignalWithInsightsInfoImpl(BxE().Esv(), A0i, A0i2, arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
