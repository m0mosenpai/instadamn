package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC37300Gc1;
import X.AbstractC39837Hll;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ColorAtTextRangeDict extends C0T6 implements Parcelable, ColorAtTextRangeDictIntf {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(25);
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    @Override // com.instagram.api.schemas.ColorAtTextRangeDictIntf
    public final ColorAtTextRangeDict EsL() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ColorAtTextRangeDict) {
                ColorAtTextRangeDict colorAtTextRangeDict = (ColorAtTextRangeDict) obj;
                if (!C14360o3.A0K(this.A02, colorAtTextRangeDict.A02) || !C14360o3.A0K(this.A03, colorAtTextRangeDict.A03) || !C14360o3.A0K(this.A00, colorAtTextRangeDict.A00) || !C14360o3.A0K(this.A01, colorAtTextRangeDict.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        AbstractC167027dH.A0o(parcel, this.A00, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A01, 0, 1);
    }

    @Override // com.instagram.api.schemas.ColorAtTextRangeDictIntf
    public final String BDa() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.ColorAtTextRangeDictIntf
    public final String BDb() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.ColorAtTextRangeDictIntf
    public final Integer BN2() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.ColorAtTextRangeDictIntf
    public final Integer BYa() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.ColorAtTextRangeDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTColorAtTextRangeDict", AbstractC39837Hll.A00(this));
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public ColorAtTextRangeDict(Integer num, Integer num2, String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A00 = num;
        this.A01 = num2;
    }
}
