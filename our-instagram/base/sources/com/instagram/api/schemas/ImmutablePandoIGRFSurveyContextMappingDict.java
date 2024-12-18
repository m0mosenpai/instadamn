package com.instagram.api.schemas;

import X.AbstractC06930Yk;
import X.AbstractC136426Fv;
import X.AbstractC166987dD;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.intent.IntentModule;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ImmutablePandoIGRFSurveyContextMappingDict extends C17T implements IGRFSurveyContextMappingDict {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(3);

    @Override // com.instagram.api.schemas.IGRFSurveyContextMappingDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (getName() != null) {
            AbstractC37300Gc1.A14(getName(), A1I);
        }
        if (getValue() != null) {
            A1I.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, getValue());
        }
        return AbstractC25234BEr.A0P(this, AbstractC06930Yk.A0B(A1I));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.IGRFSurveyContextMappingDict
    public final IGRFSurveyContextMappingDictImpl EvU() {
        return new IGRFSurveyContextMappingDictImpl(A0W(), A0i(111972721));
    }

    @Override // com.instagram.api.schemas.IGRFSurveyContextMappingDict
    public final String getName() {
        return A0W();
    }

    @Override // com.instagram.api.schemas.IGRFSurveyContextMappingDict
    public final String getValue() {
        return A0i(111972721);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
