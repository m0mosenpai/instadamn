package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC37300Gc1;
import X.AbstractC39841Hlp;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class CommentGiphyMediaFixedHeightImagesImpl extends C0T6 implements CommentGiphyMediaFixedHeightImages, Parcelable {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(26);
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;

    @Override // com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages
    public final CommentGiphyMediaFixedHeightImagesImpl EsN() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CommentGiphyMediaFixedHeightImagesImpl) {
                CommentGiphyMediaFixedHeightImagesImpl commentGiphyMediaFixedHeightImagesImpl = (CommentGiphyMediaFixedHeightImagesImpl) obj;
                if (!C14360o3.A0K(this.A00, commentGiphyMediaFixedHeightImagesImpl.A00) || !C14360o3.A0K(this.A05, commentGiphyMediaFixedHeightImagesImpl.A05) || !C14360o3.A0K(this.A01, commentGiphyMediaFixedHeightImagesImpl.A01) || !C14360o3.A0K(this.A02, commentGiphyMediaFixedHeightImagesImpl.A02) || !C14360o3.A0K(this.A06, commentGiphyMediaFixedHeightImagesImpl.A06) || !C14360o3.A0K(this.A07, commentGiphyMediaFixedHeightImagesImpl.A07) || !C14360o3.A0K(this.A03, commentGiphyMediaFixedHeightImagesImpl.A03) || !C14360o3.A0K(this.A04, commentGiphyMediaFixedHeightImagesImpl.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC167027dH.A0o(parcel, this.A00, 0, 1);
        parcel.writeString(this.A05);
        AbstractC167027dH.A0o(parcel, this.A01, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A02, 0, 1);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        AbstractC167027dH.A0o(parcel, this.A03, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A04, 0, 1);
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages
    public final Integer BDS() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages
    public final String BV4() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages
    public final Integer BV5() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages
    public final Integer Bxa() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages
    public final String CHQ() {
        return this.A07;
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages
    public final Integer CHR() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages
    public final Integer CHg() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTCommentGiphyMediaFixedHeightImages", AbstractC39841Hlp.A00(this));
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages
    public final String getUrl() {
        return this.A06;
    }

    public final int hashCode() {
        return (((((((((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A04);
    }

    public CommentGiphyMediaFixedHeightImagesImpl(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3) {
        this.A00 = num;
        this.A05 = str;
        this.A01 = num2;
        this.A02 = num3;
        this.A06 = str2;
        this.A07 = str3;
        this.A03 = num4;
        this.A04 = num5;
    }
}
