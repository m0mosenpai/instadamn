package com.instagram.music.common.model;

import X.AbstractC09440dt;
import X.AnonymousClass001;
import X.C0w9;
import X.C14360o3;
import X.C9Ay;
import X.C9EA;
import X.InterfaceC09390do;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class MusicDataSource implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(49);
    public Uri A00;
    public AudioType A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public final InterfaceC09390do A06 = AbstractC09440dt.A01(new C9EA(this, 25));

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        AudioType audioType = this.A01;
        if (audioType != null) {
            str = audioType.toString();
        } else {
            str = null;
        }
        parcel.writeString(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r1.equals(((com.instagram.music.common.model.MusicDataSource) r6).A04) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r1.equals(((com.instagram.music.common.model.MusicDataSource) r6).A00) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r1.equals(((com.instagram.music.common.model.MusicDataSource) r6).A05) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.instagram.music.common.model.MusicDataSource
            r4 = 0
            if (r0 == 0) goto L3e
            java.lang.String r1 = r5.A05
            if (r1 == 0) goto L15
            r0 = r6
            com.instagram.music.common.model.MusicDataSource r0 = (com.instagram.music.common.model.MusicDataSource) r0
            java.lang.String r0 = r0.A05
            boolean r0 = r1.equals(r0)
            r3 = 1
            if (r0 != 0) goto L16
        L15:
            r3 = 0
        L16:
            java.lang.String r1 = r5.A04
            if (r1 == 0) goto L26
            r0 = r6
            com.instagram.music.common.model.MusicDataSource r0 = (com.instagram.music.common.model.MusicDataSource) r0
            java.lang.String r0 = r0.A04
            boolean r0 = r1.equals(r0)
            r2 = 1
            if (r0 != 0) goto L27
        L26:
            r2 = 0
        L27:
            android.net.Uri r1 = r5.A00
            if (r1 == 0) goto L36
            com.instagram.music.common.model.MusicDataSource r6 = (com.instagram.music.common.model.MusicDataSource) r6
            android.net.Uri r0 = r6.A00
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L37
        L36:
            r0 = 0
        L37:
            if (r3 != 0) goto L3d
            if (r2 != 0) goto L3d
            if (r0 == 0) goto L3e
        L3d:
            r4 = 1
        L3e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.common.model.MusicDataSource.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, this.A04, this.A00, this.A03, this.A02});
    }

    public MusicDataSource(Parcel parcel) {
        AudioType valueOf;
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        String readString = parcel.readString();
        if (readString == null) {
            valueOf = null;
        } else {
            valueOf = AudioType.valueOf(readString);
        }
        this.A01 = valueOf;
    }

    public MusicDataSource(Uri uri, AudioType audioType, String str, String str2, String str3, String str4) {
        if (str == null && str2 == null && uri == null) {
            C0w9.A01.EmW("MusicDataSource", AnonymousClass001.A0R("Valid url expected for music asset ", str3));
        }
        this.A05 = str;
        this.A04 = str2;
        this.A00 = uri;
        this.A03 = str3;
        this.A02 = str4;
        this.A01 = audioType;
    }

    public MusicDataSource() {
    }
}
