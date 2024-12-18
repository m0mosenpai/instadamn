package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.AbstractC39949Hne;
import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class GrowthFrictionInterventionButtonImpl extends C0T6 implements Parcelable, GrowthFrictionInterventionButton {
    public static final Parcelable.Creator CREATOR = C41858IgC.A00(3);
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionButton
    public final GrowthFrictionInterventionButtonImpl Eu1() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GrowthFrictionInterventionButtonImpl) {
                GrowthFrictionInterventionButtonImpl growthFrictionInterventionButtonImpl = (GrowthFrictionInterventionButtonImpl) obj;
                if (!C14360o3.A0K(this.A01, growthFrictionInterventionButtonImpl.A01) || !C14360o3.A0K(this.A00, growthFrictionInterventionButtonImpl.A00) || !C14360o3.A0K(this.A02, growthFrictionInterventionButtonImpl.A02) || !C14360o3.A0K(this.A03, growthFrictionInterventionButtonImpl.A03)) {
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
        parcel.writeInt(AbstractC37304Gc5.A1Y(parcel, this.A00) ? 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionButton
    public final String AYR() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionButton
    public final Boolean Cb0() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionButton
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTGrowthFrictionInterventionButton", AbstractC39949Hne.A00(this));
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionButton
    public final String getText() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionButton
    public final String getUrl() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public GrowthFrictionInterventionButtonImpl(Boolean bool, String str, String str2, String str3) {
        this.A01 = str;
        this.A00 = bool;
        this.A02 = str2;
        this.A03 = str3;
    }
}
