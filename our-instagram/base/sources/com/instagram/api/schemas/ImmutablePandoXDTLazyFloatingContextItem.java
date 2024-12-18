package com.instagram.api.schemas;

import X.AbstractC06930Yk;
import X.AbstractC136426Fv;
import X.AbstractC166987dD;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC31179DnN;
import X.AbstractC37300Gc1;
import X.AbstractC37301Gc2;
import X.AbstractC37302Gc3;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39305HXw;
import X.JCC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ImmutablePandoXDTLazyFloatingContextItem extends C17T implements XDTLazyFloatingContextItem {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(26);
    public User A00;

    @Override // com.instagram.api.schemas.XDTLazyFloatingContextItem
    public final XDTFloatingContextItemType B73() {
        return (XDTFloatingContextItemType) A0N(-2081415587, JCC.A00);
    }

    @Override // com.instagram.api.schemas.XDTLazyFloatingContextItem
    public final User CDj() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.XDTLazyFloatingContextItem
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String str = null;
        if (B73() != null) {
            XDTFloatingContextItemType B73 = B73();
            if (B73 != null) {
                str = B73.A00;
            }
            A1I.put("floating_context_item_type", str);
        }
        AbstractC37302Gc3.A1T(CDj(), A1I);
        return AbstractC25234BEr.A0P(this, AbstractC06930Yk.A0B(A1I));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.XDTLazyFloatingContextItem
    public final XDTLazyFloatingContextItem EBF(C1DY c1dy) {
        this.A00 = AbstractC31179DnN.A0T(c1dy, this);
        return this;
    }

    @Override // com.instagram.api.schemas.XDTLazyFloatingContextItem
    public final XDTLazyFloatingContextItemImpl F41(C1DY c1dy) {
        User user;
        User A0N;
        XDTFloatingContextItemType B73 = B73();
        ImmutablePandoUserDict A0R = AbstractC37301Gc2.A0R(this);
        if (A0R != null && (A0N = AbstractC37300Gc1.A0N(c1dy, A0R)) != null) {
            user = AbstractC37300Gc1.A0M(c1dy, A0N);
        } else {
            user = null;
        }
        return new XDTLazyFloatingContextItemImpl(B73, user);
    }

    @Override // com.instagram.api.schemas.XDTLazyFloatingContextItem
    public final XDTLazyFloatingContextItemImpl F42(C1DV c1dv) {
        return F41(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
