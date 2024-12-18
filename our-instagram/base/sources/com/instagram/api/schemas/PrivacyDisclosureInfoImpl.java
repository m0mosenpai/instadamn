package com.instagram.api.schemas;

import X.C0T6;
import X.C14360o3;
import X.C206159Ax;
import X.HrT;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes3.dex */
public final class PrivacyDisclosureInfoImpl extends C0T6 implements Parcelable, PrivacyDisclosureInfo {
    public static final Parcelable.Creator CREATOR = new C206159Ax(83);
    public final String A00;
    public final String A01;

    @Override // com.instagram.api.schemas.PrivacyDisclosureInfo
    public final PrivacyDisclosureInfoImpl EyC() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PrivacyDisclosureInfoImpl) {
                PrivacyDisclosureInfoImpl privacyDisclosureInfoImpl = (PrivacyDisclosureInfoImpl) obj;
                if (!C14360o3.A0K(this.A00, privacyDisclosureInfoImpl.A00) || !C14360o3.A0K(this.A01, privacyDisclosureInfoImpl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    @Override // com.instagram.api.schemas.PrivacyDisclosureInfo
    public final String B4W() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.PrivacyDisclosureInfo
    public final String Bgf() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.PrivacyDisclosureInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTPrivacyDisclosureInfo", HrT.A00(this));
    }

    public PrivacyDisclosureInfoImpl(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
