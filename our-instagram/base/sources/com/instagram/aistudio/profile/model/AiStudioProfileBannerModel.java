package com.instagram.aistudio.profile.model;

import X.AbstractC166987dD;
import X.AbstractC25231BEo;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class AiStudioProfileBannerModel extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(24);
    public final List A00;
    public final String A01;

    public AiStudioProfileBannerModel(String str, List list) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AiStudioProfileBannerModel) {
                AiStudioProfileBannerModel aiStudioProfileBannerModel = (AiStudioProfileBannerModel) obj;
                if (!C14360o3.A0K(this.A01, aiStudioProfileBannerModel.A01) || !C14360o3.A0K(this.A00, aiStudioProfileBannerModel.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A00);
        while (A0u.hasNext()) {
            ((AiStudioProfileBannerPersonaModel) A0u.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }
}
