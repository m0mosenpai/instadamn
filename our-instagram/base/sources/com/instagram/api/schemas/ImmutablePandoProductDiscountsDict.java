package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40169Hrh;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductDiscountsDict extends C17T implements ProductDiscountsDict {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(50);

    @Override // com.instagram.api.schemas.ProductDiscountsDict
    public final List AyM() {
        return A08(-121228462, ImmutablePandoProductDiscountInformationDict.class);
    }

    @Override // com.instagram.api.schemas.ProductDiscountsDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40169Hrh.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ProductDiscountsDict
    public final ProductDiscountsDictImpl EyN() {
        ArrayList arrayList;
        List AyM = AyM();
        if (AyM != null) {
            arrayList = AbstractC167017dG.A0q(AyM);
            Iterator it = AyM.iterator();
            while (it.hasNext()) {
                arrayList.add(((ProductDiscountInformationDict) it.next()).EyM());
            }
        } else {
            arrayList = null;
        }
        return new ProductDiscountsDictImpl(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}