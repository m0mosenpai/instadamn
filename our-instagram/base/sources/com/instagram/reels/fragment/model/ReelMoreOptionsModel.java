package com.instagram.reels.fragment.model;

import X.AbstractC50102Ry;
import X.C9Ay;
import X.EnumC183928Dt;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.model.shopping.reels.InstagramShopLink;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ReelMultiProductLink;
import com.instagram.model.shopping.reels.ReelProductLink;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public final class ReelMoreOptionsModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(55);
    public BrandedContentGatingInfo A00;
    public BrandedContentProjectMetadata A01;
    public MediaGenAIDetectionMethod A02;
    public InstagramShopLink A03;
    public ProductCollectionLink A04;
    public ProductCollectionLink A05;
    public ProfileShopLink A06;
    public ReelMultiProductLink A07;
    public ReelProductLink A08;
    public EnumC183928Dt A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public List A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ReelMoreOptionsModel reelMoreOptionsModel = (ReelMoreOptionsModel) obj;
            if (!AbstractC50102Ry.A00(this.A09, reelMoreOptionsModel.A09) || !AbstractC50102Ry.A00(this.A0C, reelMoreOptionsModel.A0C) || !AbstractC50102Ry.A00(this.A0B, reelMoreOptionsModel.A0B) || !AbstractC50102Ry.A00(this.A0A, reelMoreOptionsModel.A0A) || !AbstractC50102Ry.A00(this.A06, reelMoreOptionsModel.A06) || !AbstractC50102Ry.A00(this.A03, reelMoreOptionsModel.A03) || !AbstractC50102Ry.A00(this.A04, reelMoreOptionsModel.A04) || !AbstractC50102Ry.A00(this.A05, reelMoreOptionsModel.A05) || !AbstractC50102Ry.A00(this.A08, reelMoreOptionsModel.A08) || !AbstractC50102Ry.A00(this.A07, reelMoreOptionsModel.A07) || !AbstractC50102Ry.A00(this.A00, reelMoreOptionsModel.A00) || !AbstractC50102Ry.A00(this.A0D, reelMoreOptionsModel.A0D) || !AbstractC50102Ry.A00(this.A01, reelMoreOptionsModel.A01) || !AbstractC50102Ry.A00(Boolean.valueOf(this.A0H), Boolean.valueOf(reelMoreOptionsModel.A0H)) || !AbstractC50102Ry.A00(Boolean.valueOf(this.A0E), Boolean.valueOf(reelMoreOptionsModel.A0E)) || !AbstractC50102Ry.A00(Boolean.valueOf(this.A0G), Boolean.valueOf(reelMoreOptionsModel.A0G)) || !AbstractC50102Ry.A00(Boolean.valueOf(this.A0F), Boolean.valueOf(reelMoreOptionsModel.A0F)) || !AbstractC50102Ry.A00(this.A02, reelMoreOptionsModel.A02)) {
                return false;
            }
        }
        return true;
    }

    public final List A00() {
        List list = this.A0D;
        if (list != null && list.size() > 0) {
            return list;
        }
        return null;
    }

    public final boolean A01() {
        if (!(!TextUtils.isEmpty(this.A0C)) && this.A0B == null && this.A06 == null && this.A03 == null && this.A04 == null && this.A05 == null && this.A08 == null && this.A07 == null && this.A0A == null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A09, this.A0C, this.A0B, this.A0A, this.A06, this.A03, this.A04, this.A05, this.A08, this.A07, this.A00, this.A0D, this.A01, Boolean.valueOf(this.A0H), Boolean.valueOf(this.A0E), Boolean.valueOf(this.A0G), Boolean.valueOf(this.A0F), this.A02});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        EnumC183928Dt enumC183928Dt = this.A09;
        String str2 = null;
        if (enumC183928Dt != null) {
            str = enumC183928Dt.name();
        } else {
            str = null;
        }
        parcel.writeString(str);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A08, i);
        parcel.writeParcelable(this.A07, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeList(this.A0D);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod = this.A02;
        if (mediaGenAIDetectionMethod != null) {
            str2 = mediaGenAIDetectionMethod.A00;
        }
        parcel.writeString(str2);
    }
}
