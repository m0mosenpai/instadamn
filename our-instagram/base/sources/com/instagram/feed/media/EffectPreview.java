package com.instagram.feed.media;

import X.AbstractC37382GdO;
import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.EffectThumbnailImageDict;
import com.instagram.model.shopping.EffectThumbnailImageDictIntf;

/* loaded from: classes2.dex */
public final class EffectPreview extends C0T6 implements EffectPreviewIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(96);
    public final AttributionUser A00;
    public final ImageUrl A01;
    public final EffectActionSheet A02;
    public final EffectThumbnailImageDict A03;
    public final Boolean A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public EffectPreview(AttributionUser attributionUser, ImageUrl imageUrl, EffectActionSheet effectActionSheet, EffectThumbnailImageDict effectThumbnailImageDict, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        C14360o3.A0B(attributionUser, 1);
        C14360o3.A0B(str6, 9);
        C14360o3.A0B(str7, 11);
        C14360o3.A0B(str8, 12);
        this.A00 = attributionUser;
        this.A05 = str;
        this.A02 = effectActionSheet;
        this.A06 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A01 = imageUrl;
        this.A0A = str6;
        this.A04 = bool;
        this.A0B = str7;
        this.A0C = str8;
        this.A03 = effectThumbnailImageDict;
        this.A0D = str9;
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final EffectPreview F4a() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EffectPreview) {
                EffectPreview effectPreview = (EffectPreview) obj;
                if (!C14360o3.A0K(this.A00, effectPreview.A00) || !C14360o3.A0K(this.A05, effectPreview.A05) || !C14360o3.A0K(this.A02, effectPreview.A02) || !C14360o3.A0K(this.A06, effectPreview.A06) || !C14360o3.A0K(this.A07, effectPreview.A07) || !C14360o3.A0K(this.A08, effectPreview.A08) || !C14360o3.A0K(this.A09, effectPreview.A09) || !C14360o3.A0K(this.A01, effectPreview.A01) || !C14360o3.A0K(this.A0A, effectPreview.A0A) || !C14360o3.A0K(this.A04, effectPreview.A04) || !C14360o3.A0K(this.A0B, effectPreview.A0B) || !C14360o3.A0K(this.A0C, effectPreview.A0C) || !C14360o3.A0K(this.A03, effectPreview.A03) || !C14360o3.A0K(this.A0D, effectPreview.A0D)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        String str = this.A05;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        EffectActionSheet effectActionSheet = this.A02;
        int hashCode3 = (hashCode2 + (effectActionSheet == null ? 0 : effectActionSheet.hashCode())) * 31;
        String str2 = this.A06;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A07;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A08;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A09;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ImageUrl imageUrl = this.A01;
        int hashCode8 = (((hashCode7 + (imageUrl == null ? 0 : imageUrl.hashCode())) * 31) + this.A0A.hashCode()) * 31;
        Boolean bool = this.A04;
        int hashCode9 = (((((hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31) + this.A0B.hashCode()) * 31) + this.A0C.hashCode()) * 31;
        EffectThumbnailImageDict effectThumbnailImageDict = this.A03;
        int hashCode10 = (hashCode9 + (effectThumbnailImageDict == null ? 0 : effectThumbnailImageDict.hashCode())) * 31;
        String str6 = this.A0D;
        return hashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A05);
        EffectActionSheet effectActionSheet = this.A02;
        if (effectActionSheet == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            effectActionSheet.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A0A);
        Boolean bool = this.A04;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A0D);
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final AttributionUser AdP() {
        return this.A00;
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final String AxJ() {
        return this.A05;
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final /* bridge */ /* synthetic */ EffectActionSheetIntf B0O() {
        return this.A02;
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final ImageUrl BEx() {
        return this.A01;
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final /* bridge */ /* synthetic */ EffectThumbnailImageDictIntf C84() {
        return this.A03;
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final Boolean CPi() {
        return this.A04;
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTEffectPreviewDict", AbstractC37382GdO.A00(this));
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final String getEffectId() {
        return this.A06;
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final String getFailureCode() {
        return this.A07;
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final String getFailureReason() {
        return this.A08;
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final String getFormattedClipsMediaCount() {
        return this.A09;
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final String getId() {
        return this.A0A;
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final String getName() {
        return this.A0B;
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final String getSaveStatus() {
        return this.A0C;
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final String getTitle() {
        return this.A0D;
    }
}
