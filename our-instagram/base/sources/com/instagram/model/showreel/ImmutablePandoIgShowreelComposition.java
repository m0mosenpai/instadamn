package com.instagram.model.showreel;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39305HXw;
import X.I4N;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoIgShowreelComposition extends C17T implements IgShowreelComposition {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(74);

    @Override // com.instagram.model.showreel.IgShowreelComposition
    public final List Acz() {
        return A08(-2143919126, ImmutablePandoIgShowreelCompositionAssetInfo.class);
    }

    @Override // com.instagram.model.showreel.IgShowreelComposition
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I4N.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.showreel.IgShowreelComposition
    public final String Anz() {
        return A0h(-173873537);
    }

    @Override // com.instagram.model.showreel.IgShowreelComposition
    public final String Aqq() {
        return A0h(951530617);
    }

    @Override // com.instagram.model.showreel.IgShowreelComposition
    public final String C5i() {
        return A0h(-180214992);
    }

    @Override // com.instagram.model.showreel.IgShowreelComposition
    public final IgShowreelCompositionImpl F6Y() {
        ArrayList arrayList;
        List Acz = Acz();
        if (Acz != null) {
            arrayList = AbstractC167017dG.A0q(Acz);
            Iterator it = Acz.iterator();
            while (it.hasNext()) {
                arrayList.add(((IgShowreelCompositionAssetInfoIntf) it.next()).F6X());
            }
        } else {
            arrayList = null;
        }
        return new IgShowreelCompositionImpl(A0h(-173873537), A0h(951530617), A0h(-180214992), arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
