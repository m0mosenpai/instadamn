package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC37300Gc1;
import X.AbstractC40014Hov;
import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class IGProjectPortalInfoDictImpl extends C0T6 implements Parcelable, IGProjectPortalInfoDict {
    public static final Parcelable.Creator CREATOR = C41858IgC.A00(46);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    @Override // com.instagram.api.schemas.IGProjectPortalInfoDict
    public final IGProjectPortalInfoDictImpl EvQ() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGProjectPortalInfoDictImpl) {
                IGProjectPortalInfoDictImpl iGProjectPortalInfoDictImpl = (IGProjectPortalInfoDictImpl) obj;
                if (!C14360o3.A0K(this.A00, iGProjectPortalInfoDictImpl.A00) || !C14360o3.A0K(this.A01, iGProjectPortalInfoDictImpl.A01) || !C14360o3.A0K(this.A02, iGProjectPortalInfoDictImpl.A02) || !C14360o3.A0K(this.A03, iGProjectPortalInfoDictImpl.A03) || !C14360o3.A0K(this.A04, iGProjectPortalInfoDictImpl.A04) || !C14360o3.A0K(this.A05, iGProjectPortalInfoDictImpl.A05)) {
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
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
    }

    @Override // com.instagram.api.schemas.IGProjectPortalInfoDict
    public final String AhU() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.IGProjectPortalInfoDict
    public final String Alf() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.IGProjectPortalInfoDict
    public final String Alg() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.IGProjectPortalInfoDict
    public final String Alk() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.IGProjectPortalInfoDict
    public final String C5f() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.IGProjectPortalInfoDict
    public final String C9T() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.IGProjectPortalInfoDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGProjectPortalInfoDict", AbstractC40014Hov.A00(this));
    }

    public final int hashCode() {
        return (((((((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC25227BEk.A07(this.A05);
    }

    public IGProjectPortalInfoDictImpl(String str, String str2, String str3, String str4, String str5, String str6) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
    }
}
