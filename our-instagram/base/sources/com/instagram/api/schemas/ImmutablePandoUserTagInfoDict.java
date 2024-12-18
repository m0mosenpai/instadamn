package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC31179DnN;
import X.AbstractC37372GdE;
import X.AbstractC38851rI;
import X.C17T;
import X.C1DY;
import X.C39305HXw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoUserTagInfoDict extends C17T implements UserTagInfoDictIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(19);
    public User A00;

    @Override // com.instagram.api.schemas.UserTagInfoDictIntf
    public final User CDj() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.UserTagInfoDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37372GdE.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.UserTagInfoDictIntf
    public final List AmW() {
        return getOptionalStringListByHashCode(1296516636);
    }

    @Override // com.instagram.api.schemas.UserTagInfoDictIntf
    public final Float Azj() {
        return A0K(1243902634);
    }

    @Override // com.instagram.api.schemas.UserTagInfoDictIntf
    public final List Bec() {
        return A0l(747804969);
    }

    @Override // com.instagram.api.schemas.UserTagInfoDictIntf
    public final Boolean Bw5() {
        return getOptionalBooleanValueByHashCode(-1400935436);
    }

    @Override // com.instagram.api.schemas.UserTagInfoDictIntf
    public final Float Bzn() {
        return A0K(-959763040);
    }

    @Override // com.instagram.api.schemas.UserTagInfoDictIntf
    public final UserTagInfoDictIntf EBA(C1DY c1dy) {
        this.A00 = AbstractC31179DnN.A0T(c1dy, this);
        return this;
    }

    @Override // com.instagram.api.schemas.UserTagInfoDictIntf
    public final UserTagInfoDict F3g(C1DY c1dy) {
        User user;
        ImmutableList optionalStringListByHashCode = getOptionalStringListByHashCode(1296516636);
        Float A0K = A0K(1243902634);
        List A0l = A0l(747804969);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1400935436);
        Float A0K2 = A0K(-959763040);
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) A05(3599307, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            Parcelable.Creator creator = User.CREATOR;
            User A01 = AbstractC38851rI.A01(c1dy, immutablePandoUserDict);
            if (A01 != null) {
                user = (User) c1dy.A00(A01);
                return new UserTagInfoDict(user, optionalBooleanValueByHashCode, A0K, A0K2, optionalStringListByHashCode, A0l);
            }
        }
        user = null;
        return new UserTagInfoDict(user, optionalBooleanValueByHashCode, A0K, A0K2, optionalStringListByHashCode, A0l);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
