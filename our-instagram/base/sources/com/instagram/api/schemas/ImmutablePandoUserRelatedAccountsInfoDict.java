package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40440HwV;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoUserRelatedAccountsInfoDict extends C17T implements UserRelatedAccountsInfoDict {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(18);

    @Override // com.instagram.api.schemas.UserRelatedAccountsInfoDict
    public final UserBannerInlineOtherProfileDict AfQ() {
        return (UserBannerInlineOtherProfileDict) A05(1859265415, ImmutablePandoUserBannerInlineOtherProfileDict.class);
    }

    @Override // com.instagram.api.schemas.UserRelatedAccountsInfoDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40440HwV.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.UserRelatedAccountsInfoDict
    public final String AfS() {
        return A0i(-684896309);
    }

    @Override // com.instagram.api.schemas.UserRelatedAccountsInfoDict
    public final UserRelatedAccountsInfoDictImpl F3e() {
        UserBannerInlineOtherProfileDictImpl userBannerInlineOtherProfileDictImpl;
        UserBannerInlineOtherProfileDict AfQ = AfQ();
        if (AfQ != null) {
            userBannerInlineOtherProfileDictImpl = AfQ.F3Z();
        } else {
            userBannerInlineOtherProfileDictImpl = null;
        }
        return new UserRelatedAccountsInfoDictImpl(userBannerInlineOtherProfileDictImpl, A0i(-684896309));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
