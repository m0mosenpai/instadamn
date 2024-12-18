package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.AbstractC40432HwN;
import X.C0T6;
import X.C14360o3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class UserBannerInlineOtherProfileDictImpl extends C0T6 implements Parcelable, UserBannerInlineOtherProfileDict {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(79);
    public final IgUserRelatedAccountTypeEnum A00;
    public final String A01;
    public final String A02;

    @Override // com.instagram.api.schemas.UserBannerInlineOtherProfileDict
    public final UserBannerInlineOtherProfileDictImpl F3Z() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UserBannerInlineOtherProfileDictImpl) {
                UserBannerInlineOtherProfileDictImpl userBannerInlineOtherProfileDictImpl = (UserBannerInlineOtherProfileDictImpl) obj;
                if (!C14360o3.A0K(this.A01, userBannerInlineOtherProfileDictImpl.A01) || !C14360o3.A0K(this.A02, userBannerInlineOtherProfileDictImpl.A02) || this.A00 != userBannerInlineOtherProfileDictImpl.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.UserBannerInlineOtherProfileDict
    public final String AY2() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.UserBannerInlineOtherProfileDict
    public final String AY6() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.UserBannerInlineOtherProfileDict
    public final IgUserRelatedAccountTypeEnum AY7() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.UserBannerInlineOtherProfileDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTUserBannerInlineOtherProfileDict", AbstractC40432HwN.A00(this));
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public UserBannerInlineOtherProfileDictImpl(IgUserRelatedAccountTypeEnum igUserRelatedAccountTypeEnum, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = igUserRelatedAccountTypeEnum;
    }
}
