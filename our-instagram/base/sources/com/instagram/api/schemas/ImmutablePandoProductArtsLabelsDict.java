package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39307HXy;
import X.HrZ;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductArtsLabelsDict extends C17T implements ProductArtsLabelsDictIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(47);

    @Override // com.instagram.api.schemas.ProductArtsLabelsDictIntf
    public final List BL3() {
        return A08(-1110417409, ImmutablePandoProductArtsLabelInformationDict.class);
    }

    @Override // com.instagram.api.schemas.ProductArtsLabelsDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, HrZ.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ProductArtsLabelsDictIntf
    public final ProductArtsLabelsDict EyI() {
        ArrayList arrayList;
        List BL3 = BL3();
        if (BL3 != null) {
            arrayList = AbstractC167017dG.A0q(BL3);
            Iterator it = BL3.iterator();
            while (it.hasNext()) {
                arrayList.add(((ProductArtsLabelInformationDict) it.next()).EyH());
            }
        } else {
            arrayList = null;
        }
        return new ProductArtsLabelsDict(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
