package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40019Hp0;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoIGRFSurveyContextDict extends C17T implements IGRFSurveyContextDict {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(2);

    @Override // com.instagram.api.schemas.IGRFSurveyContextDict
    public final List ArK() {
        return A08(1116448826, ImmutablePandoIGRFSurveyContextMappingDict.class);
    }

    @Override // com.instagram.api.schemas.IGRFSurveyContextDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40019Hp0.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.IGRFSurveyContextDict
    public final String BIk() {
        return A0j(-2092532683);
    }

    @Override // com.instagram.api.schemas.IGRFSurveyContextDict
    public final IGRFSurveyContextDictImpl EvT() {
        ArrayList arrayList;
        List ArK = ArK();
        if (ArK != null) {
            arrayList = AbstractC167017dG.A0q(ArK);
            Iterator it = ArK.iterator();
            while (it.hasNext()) {
                arrayList.add(((IGRFSurveyContextMappingDict) it.next()).EvU());
            }
        } else {
            arrayList = null;
        }
        return new IGRFSurveyContextDictImpl(arrayList, A0j(-2092532683));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
