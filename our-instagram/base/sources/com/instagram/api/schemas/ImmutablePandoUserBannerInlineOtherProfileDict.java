package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40432HwN;
import X.C17T;
import X.C39305HXw;
import X.JC8;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoUserBannerInlineOtherProfileDict extends C17T implements UserBannerInlineOtherProfileDict {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(17);

    @Override // com.instagram.api.schemas.UserBannerInlineOtherProfileDict
    public final IgUserRelatedAccountTypeEnum AY7() {
        return (IgUserRelatedAccountTypeEnum) A0N(1091441164, JC8.A00);
    }

    @Override // com.instagram.api.schemas.UserBannerInlineOtherProfileDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40432HwN.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.UserBannerInlineOtherProfileDict
    public final String AY2() {
        return A0j(-803333011);
    }

    @Override // com.instagram.api.schemas.UserBannerInlineOtherProfileDict
    public final String AY6() {
        return A0i(-525534778);
    }

    @Override // com.instagram.api.schemas.UserBannerInlineOtherProfileDict
    public final UserBannerInlineOtherProfileDictImpl F3Z() {
        return new UserBannerInlineOtherProfileDictImpl(AY7(), A0j(-803333011), A0i(-525534778));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
