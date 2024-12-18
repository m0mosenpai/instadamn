package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC37300Gc1;
import X.AbstractC40440HwV;
import X.C0T6;
import X.C14360o3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class UserRelatedAccountsInfoDictImpl extends C0T6 implements Parcelable, UserRelatedAccountsInfoDict {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(81);
    public final UserBannerInlineOtherProfileDict A00;
    public final String A01;

    @Override // com.instagram.api.schemas.UserRelatedAccountsInfoDict
    public final UserRelatedAccountsInfoDictImpl F3e() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UserRelatedAccountsInfoDictImpl) {
                UserRelatedAccountsInfoDictImpl userRelatedAccountsInfoDictImpl = (UserRelatedAccountsInfoDictImpl) obj;
                if (!C14360o3.A0K(this.A00, userRelatedAccountsInfoDictImpl.A00) || !C14360o3.A0K(this.A01, userRelatedAccountsInfoDictImpl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    @Override // com.instagram.api.schemas.UserRelatedAccountsInfoDict
    public final UserBannerInlineOtherProfileDict AfQ() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.UserRelatedAccountsInfoDict
    public final String AfS() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.UserRelatedAccountsInfoDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTUserRelatedAccountsInfoDict", AbstractC40440HwV.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public UserRelatedAccountsInfoDictImpl(UserBannerInlineOtherProfileDict userBannerInlineOtherProfileDict, String str) {
        this.A00 = userBannerInlineOtherProfileDict;
        this.A01 = str;
    }
}
