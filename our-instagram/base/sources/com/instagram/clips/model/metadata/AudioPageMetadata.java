package com.instagram.clips.model.metadata;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AnonymousClass001;
import X.C0T6;
import X.C0w9;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicDataSource;

/* loaded from: classes7.dex */
public final class AudioPageMetadata extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(4);
    public String A00;
    public final AudioFilterType A01;
    public final ImageUrl A02;
    public final ImageUrl A03;
    public final MusicAttributionConfig A04;
    public final AudioType A05;
    public final MusicDataSource A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudioPageMetadata) {
                AudioPageMetadata audioPageMetadata = (AudioPageMetadata) obj;
                if (!C14360o3.A0K(this.A00, audioPageMetadata.A00) || !C14360o3.A0K(this.A07, audioPageMetadata.A07) || !C14360o3.A0K(this.A08, audioPageMetadata.A08) || this.A0O != audioPageMetadata.A0O || !C14360o3.A0K(this.A09, audioPageMetadata.A09) || !C14360o3.A0K(this.A0B, audioPageMetadata.A0B) || !C14360o3.A0K(this.A02, audioPageMetadata.A02) || !C14360o3.A0K(this.A03, audioPageMetadata.A03) || !C14360o3.A0K(this.A0D, audioPageMetadata.A0D) || !C14360o3.A0K(this.A0M, audioPageMetadata.A0M) || !C14360o3.A0K(this.A0J, audioPageMetadata.A0J) || !C14360o3.A0K(this.A0K, audioPageMetadata.A0K) || !C14360o3.A0K(this.A0C, audioPageMetadata.A0C) || !C14360o3.A0K(this.A0N, audioPageMetadata.A0N) || this.A05 != audioPageMetadata.A05 || this.A0Q != audioPageMetadata.A0Q || !C14360o3.A0K(this.A0L, audioPageMetadata.A0L) || !C14360o3.A0K(this.A06, audioPageMetadata.A06) || this.A0P != audioPageMetadata.A0P || this.A0T != audioPageMetadata.A0T || this.A0R != audioPageMetadata.A0R || !C14360o3.A0K(this.A04, audioPageMetadata.A04) || !C14360o3.A0K(this.A0I, audioPageMetadata.A0I) || !C14360o3.A0K(this.A0E, audioPageMetadata.A0E) || !C14360o3.A0K(this.A0F, audioPageMetadata.A0F) || !C14360o3.A0K(this.A0A, audioPageMetadata.A0A) || !C14360o3.A0K(this.A0H, audioPageMetadata.A0H) || !C14360o3.A0K(this.A0G, audioPageMetadata.A0G) || this.A0S != audioPageMetadata.A0S || this.A01 != audioPageMetadata.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0B);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0N);
        parcel.writeParcelable(this.A05, i);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeString(this.A0L);
        parcel.writeParcelable(this.A06, i);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeInt(this.A0T ? 1 : 0);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0G);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeParcelable(this.A01, i);
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A0S, (((((((((((((AbstractC167007dF.A0D(this.A0R, AbstractC167007dF.A0D(this.A0T, AbstractC167007dF.A0D(this.A0P, (((AbstractC167007dF.A0D(this.A0Q, (((((((((((((((((((((AbstractC167007dF.A0D(this.A0O, ((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC167017dG.A0O(this.A0M)) * 31) + AbstractC167017dG.A0O(this.A0J)) * 31) + AbstractC167017dG.A0O(this.A0K)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC167017dG.A0O(this.A0N)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0O(this.A0L)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31))) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A0I)) * 31) + AbstractC167017dG.A0O(this.A0E)) * 31) + AbstractC167017dG.A0O(this.A0F)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A0H)) * 31) + AbstractC167017dG.A0O(this.A0G)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public AudioPageMetadata(AudioFilterType audioFilterType, ImageUrl imageUrl, ImageUrl imageUrl2, MusicAttributionConfig musicAttributionConfig, AudioType audioType, MusicDataSource musicDataSource, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A0O = z;
        this.A09 = str4;
        this.A0B = str5;
        this.A02 = imageUrl;
        this.A03 = imageUrl2;
        this.A0D = str6;
        this.A0M = str7;
        this.A0J = str8;
        this.A0K = str9;
        this.A0C = str10;
        this.A0N = str11;
        this.A05 = audioType;
        this.A0Q = z2;
        this.A0L = str12;
        this.A06 = musicDataSource;
        this.A0P = z3;
        this.A0T = z4;
        this.A0R = z5;
        this.A04 = musicAttributionConfig;
        this.A0I = str13;
        this.A0E = str14;
        this.A0F = str15;
        this.A0A = str16;
        this.A0H = str17;
        this.A0G = str18;
        this.A0S = z6;
        this.A01 = audioFilterType;
        if (str10 == null) {
            if (str3 != null) {
                if (imageUrl != null) {
                    if (str11 != null) {
                        if (audioType != null) {
                            if (musicDataSource == null) {
                                C0w9.A03("AudioPageMetadata", AnonymousClass001.A0R("MusicDataSource is null for audio asset id: ", str));
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            this.A00 = str10;
        }
        if (this.A00 != null) {
        } else {
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AudioPageMetadata(assetId=");
        A1C.append(this.A00);
        A1C.append(", artistId=");
        A1C.append(this.A07);
        A1C.append(", artistName=");
        A1C.append(this.A08);
        A1C.append(", isArtistVerified=");
        A1C.append(this.A0O);
        A1C.append(", audioAssetIdOrAssetId=");
        A1C.append(this.A09);
        A1C.append(AbstractC111324zv.A00(1402));
        A1C.append(this.A0B);
        A1C.append(", coverPhotoUrl=");
        A1C.append(this.A02);
        A1C.append(", coverThumbnailUrl=");
        A1C.append(this.A03);
        A1C.append(", mediaId=");
        A1C.append(this.A0D);
        A1C.append(", sourceMediaTapToken=");
        A1C.append(this.A0M);
        A1C.append(AbstractC111324zv.A00(3437));
        A1C.append(this.A0J);
        A1C.append(AbstractC111324zv.A00(3438));
        A1C.append(this.A0K);
        A1C.append(", deeplinkAssetId=");
        A1C.append(this.A0C);
        A1C.append(", trackTitle=");
        A1C.append(this.A0N);
        A1C.append(", type=");
        A1C.append(this.A05);
        A1C.append(AbstractC111324zv.A00(1424));
        A1C.append(this.A0Q);
        A1C.append(", shouldMuteAudioReason=");
        A1C.append(this.A0L);
        A1C.append(", musicDataSource=");
        A1C.append(this.A06);
        A1C.append(", isAudioBookmarked=");
        A1C.append(this.A0P);
        A1C.append(AbstractC111324zv.A00(566));
        A1C.append(this.A0T);
        A1C.append(", isEligibleForAudioEffects=");
        A1C.append(this.A0R);
        A1C.append(", musicAttributionConfig=");
        A1C.append(this.A04);
        A1C.append(AbstractC111324zv.A00(576));
        A1C.append(this.A0I);
        A1C.append(AbstractC111324zv.A00(3410));
        A1C.append(this.A0E);
        A1C.append(", musicProduct=");
        A1C.append(this.A0F);
        A1C.append(", bestAudioClusterId=");
        A1C.append(this.A0A);
        A1C.append(", preloadedGridKey=");
        A1C.append(this.A0H);
        A1C.append(", originalAudioMediaId=");
        A1C.append(this.A0G);
        A1C.append(", isEntryPointDefaultSoundOn=");
        A1C.append(this.A0S);
        A1C.append(", existingAudioFilterType=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
