package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC33700Euo;
import X.C17T;
import X.C39306HXx;
import X.GVE;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes6.dex */
public final class ImmutablePandoIGCTATextVariant extends C17T implements IGCTATextVariant {
    public static final AbstractC136426Fv CREATOR = new C39306HXx(96);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.IGCTATextVariant
    public final IGCTATextVariantSource C6k() {
        return (IGCTATextVariantSource) A0N(-692624531, GVE.A00);
    }

    @Override // com.instagram.api.schemas.IGCTATextVariant
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC33700Euo.A00(this));
    }

    @Override // com.instagram.api.schemas.IGCTATextVariant
    public final String Atp() {
        return A0i(-1061889969);
    }

    @Override // com.instagram.api.schemas.IGCTATextVariant
    public final Boolean BBX() {
        return getOptionalBooleanValueByHashCode(57317985);
    }

    @Override // com.instagram.api.schemas.IGCTATextVariant
    public final String BL7() {
        return A0i(-1613589672);
    }

    @Override // com.instagram.api.schemas.IGCTATextVariant
    public final IGCTATextVariantImpl EuY() {
        String A0i = A0i(-1061889969);
        return new IGCTATextVariantImpl(C6k(), getOptionalBooleanValueByHashCode(57317985), A0i, A0i(-1613589672));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
