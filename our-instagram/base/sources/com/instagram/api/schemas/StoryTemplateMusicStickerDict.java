package com.instagram.api.schemas;

import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import X.C9xX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes2.dex */
public final class StoryTemplateMusicStickerDict extends C0T6 implements StoryTemplateMusicStickerDictIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(24);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Lyrics A09;
    public final StoryTemplateMusicAssetInfoDict A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;

    public StoryTemplateMusicStickerDict(Lyrics lyrics, StoryTemplateMusicAssetInfoDict storyTemplateMusicAssetInfoDict, String str, String str2, String str3, String str4, String str5, float f, float f2, float f3, float f4, float f5, int i, int i2, int i3, int i4) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 4);
        C14360o3.A0B(str4, 5);
        C14360o3.A0B(str5, 7);
        this.A0B = str;
        this.A0C = str2;
        this.A05 = i;
        this.A0D = str3;
        this.A0E = str4;
        this.A06 = i2;
        this.A0F = str5;
        this.A00 = f;
        this.A09 = lyrics;
        this.A0A = storyTemplateMusicAssetInfoDict;
        this.A07 = i3;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A08 = i4;
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final StoryTemplateMusicStickerDict F29() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryTemplateMusicStickerDict) {
                StoryTemplateMusicStickerDict storyTemplateMusicStickerDict = (StoryTemplateMusicStickerDict) obj;
                if (!C14360o3.A0K(this.A0B, storyTemplateMusicStickerDict.A0B) || !C14360o3.A0K(this.A0C, storyTemplateMusicStickerDict.A0C) || this.A05 != storyTemplateMusicStickerDict.A05 || !C14360o3.A0K(this.A0D, storyTemplateMusicStickerDict.A0D) || !C14360o3.A0K(this.A0E, storyTemplateMusicStickerDict.A0E) || this.A06 != storyTemplateMusicStickerDict.A06 || !C14360o3.A0K(this.A0F, storyTemplateMusicStickerDict.A0F) || Float.compare(this.A00, storyTemplateMusicStickerDict.A00) != 0 || !C14360o3.A0K(this.A09, storyTemplateMusicStickerDict.A09) || !C14360o3.A0K(this.A0A, storyTemplateMusicStickerDict.A0A) || this.A07 != storyTemplateMusicStickerDict.A07 || Float.compare(this.A01, storyTemplateMusicStickerDict.A01) != 0 || Float.compare(this.A02, storyTemplateMusicStickerDict.A02) != 0 || Float.compare(this.A03, storyTemplateMusicStickerDict.A03) != 0 || Float.compare(this.A04, storyTemplateMusicStickerDict.A04) != 0 || this.A08 != storyTemplateMusicStickerDict.A08) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((((((((((((this.A0B.hashCode() * 31) + this.A0C.hashCode()) * 31) + this.A05) * 31) + this.A0D.hashCode()) * 31) + this.A0E.hashCode()) * 31) + this.A06) * 31) + this.A0F.hashCode()) * 31) + Float.floatToIntBits(this.A00)) * 31;
        Lyrics lyrics = this.A09;
        int hashCode2 = (hashCode + (lyrics == null ? 0 : lyrics.hashCode())) * 31;
        StoryTemplateMusicAssetInfoDict storyTemplateMusicAssetInfoDict = this.A0A;
        return ((((((((((((hashCode2 + (storyTemplateMusicAssetInfoDict != null ? storyTemplateMusicAssetInfoDict.hashCode() : 0)) * 31) + this.A07) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A03)) * 31) + Float.floatToIntBits(this.A04)) * 31) + this.A08;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A05);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A06);
        parcel.writeString(this.A0F);
        parcel.writeFloat(this.A00);
        parcel.writeParcelable(this.A09, i);
        parcel.writeParcelable(this.A0A, i);
        parcel.writeInt(this.A07);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A04);
        parcel.writeInt(this.A08);
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final String AdC() {
        return this.A0B;
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final int Awo() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final String Ayd() {
        return this.A0F;
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final float BDQ() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final /* bridge */ /* synthetic */ LyricsIntf BPT() {
        return this.A09;
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final /* bridge */ /* synthetic */ StoryTemplateMusicAssetInfoDictIntf BVU() {
        return this.A0A;
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final float BpY() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final float CHe() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final float CI0() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final float CIZ() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryTemplateMusicStickerDict", C9xX.A00(this));
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final String getAudioAssetId() {
        return this.A0C;
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final int getAudioAssetStartTimeInMs() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final String getAudioClusterId() {
        return this.A0D;
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final String getColor() {
        return this.A0E;
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final int getOverlapDurationInMs() {
        return this.A07;
    }

    @Override // com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf
    public final int getZIndex() {
        return this.A08;
    }
}
