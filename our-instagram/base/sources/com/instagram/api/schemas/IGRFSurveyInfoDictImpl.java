package com.instagram.api.schemas;

import X.AbstractC06930Yk;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class IGRFSurveyInfoDictImpl extends C0T6 implements Parcelable, IGRFSurveyInfoDict {
    public static final Parcelable.Creator CREATOR = C41858IgC.A00(49);
    public final IGRFSurveyContextDict A00;

    @Override // com.instagram.api.schemas.IGRFSurveyInfoDict
    public final IGRFSurveyInfoDictImpl EvV() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof IGRFSurveyInfoDictImpl) && C14360o3.A0K(this.A00, ((IGRFSurveyInfoDictImpl) obj).A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.IGRFSurveyInfoDict
    public final IGRFSurveyContextDict B5d() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public IGRFSurveyInfoDictImpl(IGRFSurveyContextDict iGRFSurveyContextDict) {
        this.A00 = iGRFSurveyContextDict;
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
        return AbstractC37300Gc1.A05("XDTIGRFSurveyInfoDict", AbstractC06930Yk.A0B(A0X));
    }
}
