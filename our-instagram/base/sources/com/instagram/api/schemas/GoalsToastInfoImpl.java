package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.AbstractC39944HnZ;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class GoalsToastInfoImpl extends C0T6 implements Parcelable, GoalsToastInfo {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(98);
    public final GoalsToastType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // com.instagram.api.schemas.GoalsToastInfo
    public final GoalsToastInfoImpl Etu() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GoalsToastInfoImpl) {
                GoalsToastInfoImpl goalsToastInfoImpl = (GoalsToastInfoImpl) obj;
                if (!C14360o3.A0K(this.A01, goalsToastInfoImpl.A01) || !C14360o3.A0K(this.A02, goalsToastInfoImpl.A02) || !C14360o3.A0K(this.A03, goalsToastInfoImpl.A03) || !C14360o3.A0K(this.A04, goalsToastInfoImpl.A04) || this.A00 != goalsToastInfoImpl.A00) {
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
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.GoalsToastInfo
    public final String Aj7() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.GoalsToastInfo
    public final String Aw9() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.GoalsToastInfo
    public final String BAA() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.GoalsToastInfo
    public final String C93() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.GoalsToastInfo
    public final GoalsToastType C97() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.GoalsToastInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTGoalsToastInfo", AbstractC39944HnZ.A00(this));
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public GoalsToastInfoImpl(GoalsToastType goalsToastType, String str, String str2, String str3, String str4) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = goalsToastType;
    }
}
