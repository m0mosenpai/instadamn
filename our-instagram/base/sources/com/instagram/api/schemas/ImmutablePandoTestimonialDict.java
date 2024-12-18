package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC27530CDa;
import X.AbstractC37300Gc1;
import X.AbstractC37303Gc4;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class ImmutablePandoTestimonialDict extends C17T implements TestimonialDict {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(9);
    public User A00;

    @Override // com.instagram.api.schemas.TestimonialDict
    public final User Ae9() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.TestimonialDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC27530CDa.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.TestimonialDict
    public final Long Asa() {
        return A0L(1369680106);
    }

    @Override // com.instagram.api.schemas.TestimonialDict
    public final String BQz() {
        return A0i(66353792);
    }

    @Override // com.instagram.api.schemas.TestimonialDict
    public final TestimonialDict EB1(C1DY c1dy) {
        this.A00 = AbstractC37303Gc4.A0J(c1dy, this, -1406328437);
        return this;
    }

    @Override // com.instagram.api.schemas.TestimonialDict
    public final TestimonialDictImpl F2r(C1DY c1dy) {
        User user;
        User A0N;
        ImmutablePandoUserDict A0K = AbstractC37300Gc1.A0K(this, -1406328437);
        if (A0K != null && (A0N = AbstractC37300Gc1.A0N(c1dy, A0K)) != null) {
            user = AbstractC37300Gc1.A0M(c1dy, A0N);
        } else {
            user = null;
        }
        return new TestimonialDictImpl(user, A0L(1369680106), A0i(66353792), A0X());
    }

    @Override // com.instagram.api.schemas.TestimonialDict
    public final TestimonialDictImpl F2s(C1DV c1dv) {
        return F2r(AbstractC37304Gc5.A09(c1dv));
    }

    @Override // com.instagram.api.schemas.TestimonialDict
    public final String getText() {
        return A0X();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
