package com.instagram.model.shopping.reels;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC31179DnN;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C41856IgA;
import X.I41;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class MultiProductSticker extends C0T6 implements Parcelable, MultiProductStickerIntf {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(55);
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final List A09;
    public final List A0A;

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final MultiProductSticker F6F(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final MultiProductSticker F6G(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MultiProductSticker) {
                MultiProductSticker multiProductSticker = (MultiProductSticker) obj;
                if (!C14360o3.A0K(this.A01, multiProductSticker.A01) || !C14360o3.A0K(this.A00, multiProductSticker.A00) || !C14360o3.A0K(this.A08, multiProductSticker.A08) || !C14360o3.A0K(this.A02, multiProductSticker.A02) || !C14360o3.A0K(this.A09, multiProductSticker.A09) || !C14360o3.A0K(this.A0A, multiProductSticker.A0A) || !C14360o3.A0K(this.A03, multiProductSticker.A03) || !C14360o3.A0K(this.A04, multiProductSticker.A04) || !C14360o3.A0K(this.A05, multiProductSticker.A05) || !C14360o3.A0K(this.A06, multiProductSticker.A06) || !C14360o3.A0K(this.A07, multiProductSticker.A07)) {
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
        AbstractC31179DnN.A0p(parcel, this.A00);
        List list = this.A08;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A0l = AbstractC37304Gc5.A0l(parcel, list);
            while (A0l.hasNext()) {
                AbstractC25229BEm.A15(parcel, A0l, i);
            }
        }
        parcel.writeString(this.A02);
        List list2 = this.A09;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator A0l2 = AbstractC37304Gc5.A0l(parcel, list2);
            while (A0l2.hasNext()) {
                AbstractC25229BEm.A15(parcel, A0l2, i);
            }
        }
        List list3 = this.A0A;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator A0l3 = AbstractC37304Gc5.A0l(parcel, list3);
            while (A0l3.hasNext()) {
                AbstractC25229BEm.A15(parcel, A0l3, i);
            }
        }
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final List BNi() {
        return this.A08;
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final List BVN() {
        return this.A09;
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final List C0p() {
        return this.A0A;
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final String C6J() {
        return this.A04;
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final String C6i() {
        return this.A05;
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final String CEu() {
        return this.A07;
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final Boolean CZo() {
        return this.A00;
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryMultiProductStickerTappableData", I41.A00(this));
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final String getId() {
        return this.A01;
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final String getMediaId() {
        return this.A02;
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final String getText() {
        return this.A03;
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final String getUserId() {
        return this.A06;
    }

    public final int hashCode() {
        return (((((((((((((((((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0M(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC25227BEk.A07(this.A07);
    }

    public MultiProductSticker(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3) {
        this.A01 = str;
        this.A00 = bool;
        this.A08 = list;
        this.A02 = str2;
        this.A09 = list2;
        this.A0A = list3;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A07 = str7;
    }

    @Override // com.instagram.model.shopping.reels.MultiProductStickerIntf
    public final MultiProductStickerIntf EBq(C1DY c1dy) {
        return this;
    }
}
