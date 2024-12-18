package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class DevserverInfoImpl extends C0T6 implements Parcelable, DevserverInfo {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(62);
    public final String A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DevserverInfoImpl) {
                DevserverInfoImpl devserverInfoImpl = (DevserverInfoImpl) obj;
                if (!C14360o3.A0K(this.A00, devserverInfoImpl.A00) || !C14360o3.A0K(this.A01, devserverInfoImpl.A01) || !C14360o3.A0K(this.A02, devserverInfoImpl.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    @Override // com.instagram.api.schemas.DevserverInfo
    public final String getDescription() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.DevserverInfo
    public final String getHostType() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.DevserverInfo
    public final String getUrl() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC167017dG.A0O(this.A00) * 31));
    }

    public DevserverInfoImpl(String str, String str2, String str3) {
        AbstractC167017dG.A1R(str2, str3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
