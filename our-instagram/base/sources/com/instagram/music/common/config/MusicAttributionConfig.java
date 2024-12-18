package com.instagram.music.common.config;

import X.C14360o3;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.music.common.model.MusicAssetModel;

/* loaded from: classes4.dex */
public final class MusicAttributionConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(45);
    public int A00;
    public AudioFilterType A01;
    public MusicAssetModel A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public String A06;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MusicAttributionConfig(com.instagram.music.common.model.MusicOverlayStickerModel r9) {
        /*
            r8 = this;
            r1 = 0
            com.instagram.music.common.model.MusicAssetModel r2 = com.instagram.music.common.model.MusicAssetModel.A03(r9)
            r7 = 1
            boolean r0 = r9.A0t
            r6 = 0
            if (r0 != r7) goto Lc
            r6 = 1
        Lc:
            java.lang.String r4 = r9.A0j
            java.lang.Integer r0 = r9.A0K
            if (r0 == 0) goto L1c
            int r5 = r0.intValue()
        L16:
            r0 = r8
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L1c:
            r5 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.common.config.MusicAttributionConfig.<init>(com.instagram.music.common.model.MusicOverlayStickerModel):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeParcelable(this.A01, i);
    }

    public MusicAttributionConfig(AudioFilterType audioFilterType, MusicAssetModel musicAssetModel, String str, String str2, int i, boolean z, boolean z2) {
        this.A02 = musicAssetModel;
        this.A06 = str;
        this.A05 = z;
        this.A03 = str2;
        this.A00 = i;
        this.A04 = z2;
        this.A01 = audioFilterType;
    }
}
