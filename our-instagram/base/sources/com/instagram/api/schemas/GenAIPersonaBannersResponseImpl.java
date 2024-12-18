package com.instagram.api.schemas;

import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.AbstractC37300Gc1;
import X.AbstractC39939HnU;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class GenAIPersonaBannersResponseImpl extends C0T6 implements Parcelable, GenAIPersonaBannersResponse {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(94);
    public final List A00;

    public GenAIPersonaBannersResponseImpl(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    @Override // com.instagram.api.schemas.GenAIPersonaBannersResponse
    public final GenAIPersonaBannersResponseImpl Etp() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof GenAIPersonaBannersResponseImpl) && C14360o3.A0K(this.A00, ((GenAIPersonaBannersResponseImpl) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A00);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
    }

    @Override // com.instagram.api.schemas.GenAIPersonaBannersResponse
    public final List AfW() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.GenAIPersonaBannersResponse
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTGenAIPersonaBannersResponse", AbstractC39939HnU.A00(this));
    }
}
