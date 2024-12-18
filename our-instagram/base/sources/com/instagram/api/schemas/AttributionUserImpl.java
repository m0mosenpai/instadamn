package com.instagram.api.schemas;

import X.AbstractC37377GdJ;
import X.C0T6;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes2.dex */
public final class AttributionUserImpl extends C0T6 implements Parcelable, AttributionUser {
    public static final Parcelable.Creator CREATOR = new C206149Aw(45);
    public final ProfilePicture A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;

    @Override // com.instagram.api.schemas.AttributionUser
    public final AttributionUserImpl Eqz() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AttributionUserImpl) {
                AttributionUserImpl attributionUserImpl = (AttributionUserImpl) obj;
                if (!C14360o3.A0K(this.A02, attributionUserImpl.A02) || !C14360o3.A0K(this.A01, attributionUserImpl.A01) || !C14360o3.A0K(this.A00, attributionUserImpl.A00) || !C14360o3.A0K(this.A03, attributionUserImpl.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A02;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.A01;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        ProfilePicture profilePicture = this.A00;
        int hashCode3 = (hashCode2 + (profilePicture == null ? 0 : profilePicture.hashCode())) * 31;
        String str2 = this.A03;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        Boolean bool = this.A01;
        if (bool == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = bool.booleanValue();
        }
        parcel.writeInt(i2);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
    }

    @Override // com.instagram.api.schemas.AttributionUser
    public final ProfilePicture Bhx() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.AttributionUser
    public final Boolean CfY() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.AttributionUser
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAttributionUser", AbstractC37377GdJ.A00(this));
    }

    @Override // com.instagram.api.schemas.AttributionUser
    public final String getInstagramUserId() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.AttributionUser
    public final String getUsername() {
        return this.A03;
    }

    public AttributionUserImpl(ProfilePicture profilePicture, Boolean bool, String str, String str2) {
        this.A02 = str;
        this.A01 = bool;
        this.A00 = profilePicture;
        this.A03 = str2;
    }
}
