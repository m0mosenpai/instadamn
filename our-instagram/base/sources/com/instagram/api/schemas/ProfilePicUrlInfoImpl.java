package com.instagram.api.schemas;

import X.AbstractC31218Do1;
import X.C0T6;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes.dex */
public final class ProfilePicUrlInfoImpl extends C0T6 implements Parcelable, ProfilePicUrlInfo {
    public static final Parcelable.Creator CREATOR = new C206159Ax(88);
    public final int A00;
    public final int A01;
    public final String A02;

    public ProfilePicUrlInfoImpl(int i, String str, int i2) {
        C14360o3.A0B(str, 2);
        this.A00 = i;
        this.A02 = str;
        this.A01 = i2;
    }

    @Override // com.instagram.api.schemas.ProfilePicUrlInfo
    public final ProfilePicUrlInfoImpl Eyf() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProfilePicUrlInfoImpl) {
                ProfilePicUrlInfoImpl profilePicUrlInfoImpl = (ProfilePicUrlInfoImpl) obj;
                if (this.A00 != profilePicUrlInfoImpl.A00 || !C14360o3.A0K(this.A02, profilePicUrlInfoImpl.A02) || this.A01 != profilePicUrlInfoImpl.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00 * 31) + this.A02.hashCode()) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A01);
    }

    @Override // com.instagram.api.schemas.ProfilePicUrlInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTProfilePicUrlInfo", AbstractC31218Do1.A00(this));
    }

    @Override // com.instagram.api.schemas.ProfilePicUrlInfo
    public final int getHeight() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.ProfilePicUrlInfo
    public final String getUrl() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.ProfilePicUrlInfo
    public final int getWidth() {
        return this.A01;
    }
}
