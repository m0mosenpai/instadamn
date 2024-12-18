package com.instagram.model.shopping.clips;

import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25227BEk;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import X.I3P;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class ClipsShoppingCTABar extends C0T6 implements ClipsShoppingCTABarIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(23);
    public final Float A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;

    @Override // com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf
    public final ClipsShoppingCTABar F5y() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsShoppingCTABar) {
                ClipsShoppingCTABar clipsShoppingCTABar = (ClipsShoppingCTABar) obj;
                if (!C14360o3.A0K(this.A00, clipsShoppingCTABar.A00) || !C14360o3.A0K(this.A02, clipsShoppingCTABar.A02) || !C14360o3.A0K(this.A03, clipsShoppingCTABar.A03) || !C14360o3.A0K(this.A04, clipsShoppingCTABar.A04) || !C14360o3.A0K(this.A01, clipsShoppingCTABar.A01) || !C14360o3.A0K(this.A09, clipsShoppingCTABar.A09) || !C14360o3.A0K(this.A05, clipsShoppingCTABar.A05) || !C14360o3.A0K(this.A06, clipsShoppingCTABar.A06) || !C14360o3.A0K(this.A07, clipsShoppingCTABar.A07) || !C14360o3.A0K(this.A08, clipsShoppingCTABar.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC167027dH.A0m(parcel, this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        AbstractC167027dH.A0o(parcel, this.A01, 0, 1);
        parcel.writeStringList(this.A09);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf
    public final Float Abx() {
        return this.A00;
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf
    public final Integer Azv() {
        return this.A01;
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf
    public final List BhF() {
        return this.A09;
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTClipsShoppingCTABar", I3P.A00(this));
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf
    public final String getCtaBarType() {
        return this.A02;
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf
    public final String getDestination() {
        return this.A03;
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf
    public final String getDominantColor() {
        return this.A04;
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf
    public final String getSubtitle() {
        return this.A05;
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf
    public final String getTitle() {
        return this.A06;
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf
    public final String getToggledDestination() {
        return this.A07;
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf
    public final String getToggledTitle() {
        return this.A08;
    }

    public final int hashCode() {
        return (((((((((((((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC25227BEk.A07(this.A08);
    }

    public ClipsShoppingCTABar(Float f, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        this.A00 = f;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = num;
        this.A09 = list;
        this.A05 = str4;
        this.A06 = str5;
        this.A07 = str6;
        this.A08 = str7;
    }
}
