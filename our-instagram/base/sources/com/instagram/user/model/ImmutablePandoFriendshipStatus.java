package com.instagram.user.model;

import X.AbstractC136426Fv;
import X.AbstractC39881tC;
import X.C14360o3;
import X.C17T;
import X.C206129Au;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes.dex */
public final class ImmutablePandoFriendshipStatus extends C17T implements FriendshipStatus {
    public static final AbstractC136426Fv CREATOR = new C206129Au(5);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC39881tC.A01(this), this);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean AgM() {
        return getOptionalBooleanValueByHashCode(-664572875);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean B7Q() {
        return getOptionalBooleanValueByHashCode(1601672934);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean B7V() {
        return getOptionalBooleanValueByHashCode(765915793);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean BHO() {
        return getOptionalBooleanValueByHashCode(-1441330314);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean BVx() {
        return getOptionalBooleanValueByHashCode(-1062777706);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean BaD() {
        return getOptionalBooleanValueByHashCode(59220156);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Integer Bkc() {
        return getOptionalIntValueByHashCode(850307290);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean Bvc() {
        return getOptionalBooleanValueByHashCode(-1655476039);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean C3Q() {
        return getOptionalBooleanValueByHashCode(-1219769254);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean C6a() {
        return getOptionalBooleanValueByHashCode(-1608245302);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CQV() {
        return getOptionalBooleanValueByHashCode(-2104889375);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CQa() {
        return getOptionalBooleanValueByHashCode(-928454987);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CQg() {
        return getOptionalBooleanValueByHashCode(1282641295);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CTh() {
        return getOptionalBooleanValueByHashCode(-2020859751);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CUV() {
        return getOptionalBooleanValueByHashCode(162122567);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CUg() {
        return getOptionalBooleanValueByHashCode(871306440);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CVR() {
        return getOptionalBooleanValueByHashCode(1834733346);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CYZ() {
        return getOptionalBooleanValueByHashCode(-435976872);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CYa() {
        return getOptionalBooleanValueByHashCode(-152364154);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CZA() {
        return getOptionalBooleanValueByHashCode(-1889235025);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CZB() {
        return getOptionalBooleanValueByHashCode(175990194);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CZC() {
        return getOptionalBooleanValueByHashCode(1015236301);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean CZD() {
        return getOptionalBooleanValueByHashCode(-382783346);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean Cb1() {
        return getOptionalBooleanValueByHashCode(1185812334);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean Cc1() {
        return getOptionalBooleanValueByHashCode(1008095888);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean Cex() {
        return getOptionalBooleanValueByHashCode(2081805499);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final Boolean Cfx() {
        return getOptionalBooleanValueByHashCode(242453272);
    }

    @Override // com.instagram.user.model.FriendshipStatus
    public final FriendshipStatusImpl F7P() {
        return new FriendshipStatusImpl(getOptionalBooleanValueByHashCode(-664572875), getOptionalBooleanValueByHashCode(1601672934), getOptionalBooleanValueByHashCode(765915793), getOptionalBooleanValueByHashCode(-1441330314), getOptionalBooleanValueByHashCode(-2104889375), getOptionalBooleanValueByHashCode(-928454987), getOptionalBooleanValueByHashCode(1282641295), getOptionalBooleanValueByHashCode(-2020859751), getOptionalBooleanValueByHashCode(162122567), getOptionalBooleanValueByHashCode(871306440), getOptionalBooleanValueByHashCode(1834733346), getOptionalBooleanValueByHashCode(-435976872), getOptionalBooleanValueByHashCode(-152364154), getOptionalBooleanValueByHashCode(-1889235025), getOptionalBooleanValueByHashCode(175990194), getOptionalBooleanValueByHashCode(1015236301), getOptionalBooleanValueByHashCode(-382783346), getOptionalBooleanValueByHashCode(1185812334), getOptionalBooleanValueByHashCode(1008095888), getOptionalBooleanValueByHashCode(2081805499), getOptionalBooleanValueByHashCode(242453272), getOptionalBooleanValueByHashCode(-1062777706), getOptionalBooleanValueByHashCode(59220156), getOptionalBooleanValueByHashCode(-1655476039), getOptionalBooleanValueByHashCode(-1219769254), getOptionalBooleanValueByHashCode(-1608245302), getOptionalIntValueByHashCode(850307290));
    }
}
