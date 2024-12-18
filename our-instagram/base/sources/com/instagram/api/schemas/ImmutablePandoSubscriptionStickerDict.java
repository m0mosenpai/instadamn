package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC225549xZ;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.AbstractC37303Gc4;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class ImmutablePandoSubscriptionStickerDict extends C17T implements SubscriptionStickerDictIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(8);
    public User A00;

    @Override // com.instagram.api.schemas.SubscriptionStickerDictIntf
    public final User Asq() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.SubscriptionStickerDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC225549xZ.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.SubscriptionStickerDictIntf
    public final String Asv() {
        return A0j(1379332622);
    }

    @Override // com.instagram.api.schemas.SubscriptionStickerDictIntf
    public final String Asz() {
        return A0i(-858044783);
    }

    @Override // com.instagram.api.schemas.SubscriptionStickerDictIntf
    public final String At6() {
        return A0i(-2060473463);
    }

    @Override // com.instagram.api.schemas.SubscriptionStickerDictIntf
    public final SubscriptionStickerDictIntf EAt(C1DY c1dy) {
        this.A00 = AbstractC37303Gc4.A0J(c1dy, this, 1028554796);
        return this;
    }

    @Override // com.instagram.api.schemas.SubscriptionStickerDictIntf
    public final SubscriptionStickerDict F2W(C1DY c1dy) {
        User user;
        User A0N;
        ImmutablePandoUserDict A0K = AbstractC37300Gc1.A0K(this, 1028554796);
        if (A0K != null && (A0N = AbstractC37300Gc1.A0N(c1dy, A0K)) != null) {
            user = AbstractC37300Gc1.A0M(c1dy, A0N);
        } else {
            user = null;
        }
        return new SubscriptionStickerDict(user, A0j(1379332622), A0i(-858044783), A0i(-2060473463));
    }

    @Override // com.instagram.api.schemas.SubscriptionStickerDictIntf
    public final SubscriptionStickerDict F2X(C1DV c1dv) {
        return F2W(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
