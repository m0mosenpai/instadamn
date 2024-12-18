package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.AbstractC40019Hp0;
import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class IGRFSurveyContextDictImpl extends C0T6 implements Parcelable, IGRFSurveyContextDict {
    public static final Parcelable.Creator CREATOR = C41858IgC.A00(47);
    public final String A00;
    public final List A01;

    @Override // com.instagram.api.schemas.IGRFSurveyContextDict
    public final IGRFSurveyContextDictImpl EvT() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGRFSurveyContextDictImpl) {
                IGRFSurveyContextDictImpl iGRFSurveyContextDictImpl = (IGRFSurveyContextDictImpl) obj;
                if (!C14360o3.A0K(this.A01, iGRFSurveyContextDictImpl.A01) || !C14360o3.A0K(this.A00, iGRFSurveyContextDictImpl.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        List list = this.A01;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A0l = AbstractC37304Gc5.A0l(parcel, list);
            while (A0l.hasNext()) {
                AbstractC25229BEm.A15(parcel, A0l, i);
            }
        }
        parcel.writeString(this.A00);
    }

    @Override // com.instagram.api.schemas.IGRFSurveyContextDict
    public final List ArK() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.IGRFSurveyContextDict
    public final String BIk() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.IGRFSurveyContextDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGRFSurveyContextDict", AbstractC40019Hp0.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A01) * 31) + AbstractC25227BEk.A07(this.A00);
    }

    public IGRFSurveyContextDictImpl(List list, String str) {
        this.A01 = list;
        this.A00 = str;
    }
}
