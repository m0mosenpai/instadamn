package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC37300Gc1;
import X.AbstractC40461Hwq;
import X.C0T6;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class XpostOriginalSoundFBCreatorInfoImpl extends C0T6 implements Parcelable, XpostOriginalSoundFBCreatorInfo {
    public static final Parcelable.Creator CREATOR = new C70220WId(2);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfo
    public final XpostOriginalSoundFBCreatorInfoImpl F46() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof XpostOriginalSoundFBCreatorInfoImpl) {
                XpostOriginalSoundFBCreatorInfoImpl xpostOriginalSoundFBCreatorInfoImpl = (XpostOriginalSoundFBCreatorInfoImpl) obj;
                if (!C14360o3.A0K(this.A00, xpostOriginalSoundFBCreatorInfoImpl.A00) || !C14360o3.A0K(this.A01, xpostOriginalSoundFBCreatorInfoImpl.A01) || !C14360o3.A0K(this.A02, xpostOriginalSoundFBCreatorInfoImpl.A02) || !C14360o3.A0K(this.A03, xpostOriginalSoundFBCreatorInfoImpl.A03)) {
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
        parcel.writeString(this.A03);
    }

    @Override // com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfo
    public final String Asy() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfo
    public final String At0() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfo
    public final String B4m() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfo
    public final String B4n() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTXpostOriginalSoundFBCreatorInfo", AbstractC40461Hwq.A00(this));
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public XpostOriginalSoundFBCreatorInfoImpl(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }
}
