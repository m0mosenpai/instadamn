package com.instagram.aistudio.profile.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class AiStudioProfileBannerPersonaModel extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(25);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AiStudioProfileBannerPersonaModel) {
                AiStudioProfileBannerPersonaModel aiStudioProfileBannerPersonaModel = (AiStudioProfileBannerPersonaModel) obj;
                if (!C14360o3.A0K(this.A01, aiStudioProfileBannerPersonaModel.A01) || !C14360o3.A0K(this.A02, aiStudioProfileBannerPersonaModel.A02) || !C14360o3.A0K(this.A03, aiStudioProfileBannerPersonaModel.A03) || !C14360o3.A0K(this.A00, aiStudioProfileBannerPersonaModel.A00) || !C14360o3.A0K(this.A04, aiStudioProfileBannerPersonaModel.A04)) {
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
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A04);
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A00, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A01)))) + AbstractC167017dG.A0O(this.A04);
    }

    public AiStudioProfileBannerPersonaModel(String str, String str2, String str3, String str4, String str5) {
        AbstractC167027dH.A13(str, str2, str3);
        C14360o3.A0B(str4, 4);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = str4;
        this.A04 = str5;
    }
}
