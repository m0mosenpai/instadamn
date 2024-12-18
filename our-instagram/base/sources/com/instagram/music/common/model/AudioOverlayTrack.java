package com.instagram.music.common.model;

import X.AnonymousClass001;
import X.C0T6;
import X.C14360o3;
import X.C9Ay;
import X.EnumC185288Jt;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class AudioOverlayTrack extends C0T6 implements Parcelable {
    public static final C9Ay CREATOR = new C9Ay(46);
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public EnumC185288Jt A05;
    public DownloadedTrack A06;
    public InstagramAudioApplySource A07;
    public MusicAssetModel A08;
    public MusicBrowseCategory A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioOverlayTrack(MusicAssetModel musicAssetModel, int i, int i2) {
        this(null, null, null, musicAssetModel, null, musicAssetModel.A0B, musicAssetModel.A0E, musicAssetModel.A0G, null, 1.0f, i, i2, 0, 0);
        C14360o3.A0B(musicAssetModel, 1);
        if (i >= 0) {
            if (i2 > 0) {
                return;
            } else {
                throw new IllegalStateException(AnonymousClass001.A0O("Snippet must have a duration longer than zero: ", i2));
            }
        }
        throw new IllegalStateException(AnonymousClass001.A0O("Snippet start time must be greater than or equal to zero: ", i));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudioOverlayTrack) {
                AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) obj;
                if (this.A03 != audioOverlayTrack.A03 || this.A02 != audioOverlayTrack.A02 || this.A04 != audioOverlayTrack.A04 || this.A01 != audioOverlayTrack.A01 || !C14360o3.A0K(this.A0B, audioOverlayTrack.A0B) || !C14360o3.A0K(this.A0A, audioOverlayTrack.A0A) || !C14360o3.A0K(this.A0E, audioOverlayTrack.A0E) || !C14360o3.A0K(this.A09, audioOverlayTrack.A09) || !C14360o3.A0K(this.A08, audioOverlayTrack.A08) || !C14360o3.A0K(this.A06, audioOverlayTrack.A06) || this.A05 != audioOverlayTrack.A05 || Float.compare(this.A00, audioOverlayTrack.A00) != 0 || !C14360o3.A0K(this.A0C, audioOverlayTrack.A0C) || this.A07 != audioOverlayTrack.A07) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((((((this.A03 * 31) + this.A02) * 31) + this.A04) * 31) + this.A01) * 31;
        String str = this.A0B;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A0A;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A0E;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MusicBrowseCategory musicBrowseCategory = this.A09;
        int hashCode4 = (hashCode3 + (musicBrowseCategory == null ? 0 : musicBrowseCategory.hashCode())) * 31;
        MusicAssetModel musicAssetModel = this.A08;
        int hashCode5 = (hashCode4 + (musicAssetModel == null ? 0 : musicAssetModel.hashCode())) * 31;
        DownloadedTrack downloadedTrack = this.A06;
        int hashCode6 = (hashCode5 + (downloadedTrack == null ? 0 : downloadedTrack.hashCode())) * 31;
        EnumC185288Jt enumC185288Jt = this.A05;
        int hashCode7 = (((hashCode6 + (enumC185288Jt == null ? 0 : enumC185288Jt.hashCode())) * 31) + Float.floatToIntBits(this.A00)) * 31;
        String str4 = this.A0C;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        InstagramAudioApplySource instagramAudioApplySource = this.A07;
        return hashCode8 + (instagramAudioApplySource != null ? instagramAudioApplySource.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0E);
        parcel.writeParcelable(this.A09, i);
        parcel.writeParcelable(this.A08, i);
        parcel.writeParcelable(this.A06, i);
        EnumC185288Jt enumC185288Jt = this.A05;
        if (enumC185288Jt != null) {
            str = enumC185288Jt.name();
        } else {
            str = null;
        }
        parcel.writeString(str);
        parcel.writeFloat(this.A00);
        parcel.writeString(this.A0C);
        parcel.writeParcelable(this.A07, i);
        parcel.writeString(this.A0D);
    }

    public final void A00(MusicAssetModel musicAssetModel) {
        this.A08 = musicAssetModel;
        this.A0A = musicAssetModel.A0E;
        this.A0B = musicAssetModel.A0B;
        this.A0E = musicAssetModel.A0G;
    }

    public final boolean A01() {
        MusicAssetModel musicAssetModel = this.A08;
        if (musicAssetModel != null && musicAssetModel.A0T) {
            return true;
        }
        return false;
    }

    public AudioOverlayTrack(EnumC185288Jt enumC185288Jt, DownloadedTrack downloadedTrack, InstagramAudioApplySource instagramAudioApplySource, MusicAssetModel musicAssetModel, MusicBrowseCategory musicBrowseCategory, String str, String str2, String str3, String str4, float f, int i, int i2, int i3, int i4) {
        this.A03 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A01 = i4;
        this.A0B = str;
        this.A0A = str2;
        this.A0E = str3;
        this.A09 = musicBrowseCategory;
        this.A08 = musicAssetModel;
        this.A06 = downloadedTrack;
        this.A05 = enumC185288Jt;
        this.A00 = f;
        this.A0C = str4;
        this.A07 = instagramAudioApplySource;
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        this.A0D = obj;
    }

    public AudioOverlayTrack() {
        this(null, null, null, null, null, null, null, null, null, 1.0f, 0, 0, 0, 0);
    }
}
