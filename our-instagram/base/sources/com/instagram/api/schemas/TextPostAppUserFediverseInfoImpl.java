package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC37300Gc1;
import X.AbstractC40407Hvu;
import X.C0T6;
import X.C14360o3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class TextPostAppUserFediverseInfoImpl extends C0T6 implements Parcelable, TextPostAppUserFediverseInfo {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(61);
    public final Integer A00;
    public final Integer A01;

    @Override // com.instagram.api.schemas.TextPostAppUserFediverseInfo
    public final TextPostAppUserFediverseInfoImpl F3B() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextPostAppUserFediverseInfoImpl) {
                TextPostAppUserFediverseInfoImpl textPostAppUserFediverseInfoImpl = (TextPostAppUserFediverseInfoImpl) obj;
                if (!C14360o3.A0K(this.A00, textPostAppUserFediverseInfoImpl.A00) || !C14360o3.A0K(this.A01, textPostAppUserFediverseInfoImpl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC167027dH.A0o(parcel, this.A00, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A01, 0, 1);
    }

    @Override // com.instagram.api.schemas.TextPostAppUserFediverseInfo
    public final Integer C6S() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.TextPostAppUserFediverseInfo
    public final Integer C6T() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.TextPostAppUserFediverseInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTTextPostAppUserFediverseInfo", AbstractC40407Hvu.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public TextPostAppUserFediverseInfoImpl(Integer num, Integer num2) {
        this.A00 = num;
        this.A01 = num2;
    }
}
