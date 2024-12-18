package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.AbstractC37300Gc1;
import X.AbstractC39951Hng;
import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class GrowthFrictionInterventionDetailImpl extends C0T6 implements Parcelable, GrowthFrictionInterventionDetail {
    public static final Parcelable.Creator CREATOR = C41858IgC.A00(4);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public GrowthFrictionInterventionDetailImpl(String str, String str2, String str3, String str4, String str5, List list) {
        AbstractC167027dH.A0a(1, str, list, str2, str3);
        C14360o3.A0B(str4, 5);
        this.A00 = str;
        this.A05 = list;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionDetail
    public final GrowthFrictionInterventionDetailImpl Eu3() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GrowthFrictionInterventionDetailImpl) {
                GrowthFrictionInterventionDetailImpl growthFrictionInterventionDetailImpl = (GrowthFrictionInterventionDetailImpl) obj;
                if (!C14360o3.A0K(this.A00, growthFrictionInterventionDetailImpl.A00) || !C14360o3.A0K(this.A05, growthFrictionInterventionDetailImpl.A05) || !C14360o3.A0K(this.A01, growthFrictionInterventionDetailImpl.A01) || !C14360o3.A0K(this.A02, growthFrictionInterventionDetailImpl.A02) || !C14360o3.A0K(this.A03, growthFrictionInterventionDetailImpl.A03) || !C14360o3.A0K(this.A04, growthFrictionInterventionDetailImpl.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A05);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionDetail
    public final String AYR() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionDetail
    public final List AjH() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionDetail
    public final String BJA() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionDetail
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTGrowthFrictionInterventionDetail", AbstractC39951Hng.A00(this));
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionDetail
    public final String getDescription() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionDetail
    public final String getTitle() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionDetail
    public final String getUrl() {
        return this.A04;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0J(this.A05, AbstractC166987dD.A0J(this.A00))))) + AbstractC167017dG.A0O(this.A04);
    }
}
