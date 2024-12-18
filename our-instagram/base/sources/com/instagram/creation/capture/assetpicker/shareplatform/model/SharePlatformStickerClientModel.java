package com.instagram.creation.capture.assetpicker.shareplatform.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.C05F;
import X.C0T6;
import X.C14360o3;
import X.C16930sl;
import X.C5NG;
import X.C5NL;
import X.EnumC222859sQ;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import java.util.List;

/* loaded from: classes4.dex */
public final class SharePlatformStickerClientModel extends C0T6 implements Parcelable, C5NL {
    public static final Parcelable.Creator CREATOR = new LNM(41);
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public MediaUploadMetadata A07;
    public EnumC222859sQ A08;
    public String A09;
    public String A0A;
    public boolean A0B;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SharePlatformStickerClientModel) {
                SharePlatformStickerClientModel sharePlatformStickerClientModel = (SharePlatformStickerClientModel) obj;
                if (!C14360o3.A0K(this.A07, sharePlatformStickerClientModel.A07) || !C14360o3.A0K(this.A09, sharePlatformStickerClientModel.A09) || !C14360o3.A0K(this.A0A, sharePlatformStickerClientModel.A0A) || this.A03 != sharePlatformStickerClientModel.A03 || this.A02 != sharePlatformStickerClientModel.A02 || this.A04 != sharePlatformStickerClientModel.A04 || this.A06 != sharePlatformStickerClientModel.A06 || this.A05 != sharePlatformStickerClientModel.A05 || this.A0B != sharePlatformStickerClientModel.A0B || this.A08 != sharePlatformStickerClientModel.A08 || Float.compare(this.A01, sharePlatformStickerClientModel.A01) != 0 || Float.compare(this.A00, sharePlatformStickerClientModel.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A07, i);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A0B ? 1 : 0);
        AbstractC166997dE.A1I(parcel, this.A08);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
    }

    @Override // X.C5NL
    public final /* synthetic */ List B6F() {
        return C16930sl.A00;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A0m;
    }

    public final int hashCode() {
        return AbstractC166997dE.A00(AbstractC166997dE.A0J(this.A08, AbstractC167007dF.A0D(this.A0B, (((((((((AbstractC166997dE.A0K(this.A0A, (AbstractC166987dD.A0G(this.A07) + AbstractC167017dG.A0O(this.A09)) * 31) + this.A03) * 31) + this.A02) * 31) + this.A04) * 31) + this.A06) * 31) + this.A05) * 31)), this.A01) + Float.floatToIntBits(this.A00);
    }

    public SharePlatformStickerClientModel(MediaUploadMetadata mediaUploadMetadata, EnumC222859sQ enumC222859sQ, String str, String str2, float f, float f2, int i, int i2, int i3, int i4, int i5, boolean z) {
        AbstractC167017dG.A1Q(mediaUploadMetadata, str2);
        C14360o3.A0B(enumC222859sQ, 10);
        this.A07 = mediaUploadMetadata;
        this.A09 = str;
        this.A0A = str2;
        this.A03 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A06 = i4;
        this.A05 = i5;
        this.A0B = z;
        this.A08 = enumC222859sQ;
        this.A01 = f;
        this.A00 = f2;
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C5NG A0V = AbstractC167007dF.A0V();
        A0V.A06 = AbstractC166987dD.A1J("share_platform_sticker_id");
        return A0V;
    }

    public SharePlatformStickerClientModel() {
        this(new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false), EnumC222859sQ.A06, null, "", 0.0f, 0.0f, 0, 0, 0, 0, 0, false);
    }
}
