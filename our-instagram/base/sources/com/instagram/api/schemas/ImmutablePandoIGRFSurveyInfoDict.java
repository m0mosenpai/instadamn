package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ImmutablePandoIGRFSurveyInfoDict extends C17T implements IGRFSurveyInfoDict {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(4);

    @Override // com.instagram.api.schemas.IGRFSurveyInfoDict
    public final IGRFSurveyContextDict B5d() {
        return (IGRFSurveyContextDict) A05(-536984562, ImmutablePandoIGRFSurveyContextDict.class);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.IGRFSurveyInfoDict
    public final IGRFSurveyInfoDictImpl EvV() {
        IGRFSurveyContextDictImpl iGRFSurveyContextDictImpl;
        IGRFSurveyContextDict B5d = B5d();
        if (B5d != null) {
            iGRFSurveyContextDictImpl = B5d.EvT();
        } else {
            iGRFSurveyContextDictImpl = null;
        }
        return new IGRFSurveyInfoDictImpl(iGRFSurveyContextDictImpl);
    }

    @Override // com.instagram.api.schemas.IGRFSurveyInfoDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (B5d() != null) {
            IGRFSurveyContextDict B5d = B5d();
            if (B5d != null) {
                treeUpdaterJNI = B5d.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A0X.put("feed_context", treeUpdaterJNI);
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
