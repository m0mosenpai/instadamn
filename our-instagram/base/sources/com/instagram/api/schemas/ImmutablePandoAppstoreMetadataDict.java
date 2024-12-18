package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC39746HkI;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoAppstoreMetadataDict extends C17T implements AppstoreMetadataDict {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(6);

    @Override // com.instagram.api.schemas.AppstoreMetadataDict
    public final List Bqw() {
        return A08(-24959027, ImmutablePandoIGAdScreenshotURLDataDict.class);
    }

    @Override // com.instagram.api.schemas.AppstoreMetadataDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39746HkI.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.AppstoreMetadataDict
    public final Float Aen() {
        return A0K(2031429119);
    }

    @Override // com.instagram.api.schemas.AppstoreMetadataDict
    public final String BIT() {
        return A0i(-1343751829);
    }

    @Override // com.instagram.api.schemas.AppstoreMetadataDict
    public final Integer BXz() {
        return getOptionalIntValueByHashCode(-1894227870);
    }

    @Override // com.instagram.api.schemas.AppstoreMetadataDict
    public final String BY0() {
        return A0i(32113727);
    }

    @Override // com.instagram.api.schemas.AppstoreMetadataDict
    public final AppstoreMetadataDictImpl Eqw() {
        ArrayList arrayList;
        Float A0K = A0K(2031429119);
        String A0i = A0i(-1343751829);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-1894227870);
        String A0i2 = A0i(32113727);
        List Bqw = Bqw();
        if (Bqw != null) {
            arrayList = AbstractC167017dG.A0q(Bqw);
            Iterator it = Bqw.iterator();
            while (it.hasNext()) {
                arrayList.add(((IGAdScreenshotURLDataDict) it.next()).EuL());
            }
        } else {
            arrayList = null;
        }
        return new AppstoreMetadataDictImpl(A0K, optionalIntValueByHashCode, A0i, A0i2, arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
