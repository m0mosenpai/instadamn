package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40454Hwj;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoWhatsAppAttributionInfo extends C17T implements WhatsAppAttributionInfo {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(21);

    @Override // com.instagram.api.schemas.WhatsAppAttributionInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40454Hwj.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.WhatsAppAttributionInfo
    public final String AYb() {
        return A0i(1851627344);
    }

    @Override // com.instagram.api.schemas.WhatsAppAttributionInfo
    public final String AZS() {
        return A0i(551467614);
    }

    @Override // com.instagram.api.schemas.WhatsAppAttributionInfo
    public final WhatsAppAttributionInfoImpl F3v() {
        return new WhatsAppAttributionInfoImpl(A0i(1851627344), A0i(551467614));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
