package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import X.Hs7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class ProfileThemeImpl extends C0T6 implements Parcelable, ProfileTheme {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(74);
    public final ProfileThemeType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public ProfileThemeImpl(ProfileThemeType profileThemeType, String str, String str2, String str3, String str4, String str5, List list) {
        C14360o3.A0B(list, 4);
        AbstractC167017dG.A1T(str4, profileThemeType);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A06 = list;
        this.A04 = str4;
        this.A00 = profileThemeType;
        this.A05 = str5;
    }

    @Override // com.instagram.api.schemas.ProfileTheme
    public final ProfileThemeImpl Eyh() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProfileThemeImpl) {
                ProfileThemeImpl profileThemeImpl = (ProfileThemeImpl) obj;
                if (!C14360o3.A0K(this.A01, profileThemeImpl.A01) || !C14360o3.A0K(this.A02, profileThemeImpl.A02) || !C14360o3.A0K(this.A03, profileThemeImpl.A03) || !C14360o3.A0K(this.A06, profileThemeImpl.A06) || !C14360o3.A0K(this.A04, profileThemeImpl.A04) || this.A00 != profileThemeImpl.A00 || !C14360o3.A0K(this.A05, profileThemeImpl.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeStringList(this.A06);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A05);
    }

    @Override // com.instagram.api.schemas.ProfileTheme
    public final String AbT() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.ProfileTheme
    public final String AbU() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.ProfileTheme
    public final String Af8() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.ProfileTheme
    public final List BAF() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.ProfileTheme
    public final String C71() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.ProfileTheme
    public final ProfileThemeType C74() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.ProfileTheme
    public final String C8B() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.ProfileTheme
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTProfileTheme", Hs7.A00(this));
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0J(this.A06, ((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31))) + AbstractC25227BEk.A07(this.A05);
    }
}
