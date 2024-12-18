package com.instagram.guides.model;

import X.C14360o3;
import X.EnumC39543HdF;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.shopping.ProductContainer;
import com.instagram.model.simpleplace.SimplePlace;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class GuideItemAttachment implements Parcelable {
    public static final LNL CREATOR = new LNL(97);
    public EnumC39543HdF A00;
    public ProductContainer A01;
    public SimplePlace A02;
    public User A03;

    public GuideItemAttachment() {
        EnumC39543HdF enumC39543HdF = EnumC39543HdF.A05;
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
        this.A00 = enumC39543HdF;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeSerializable(this.A00);
    }
}
