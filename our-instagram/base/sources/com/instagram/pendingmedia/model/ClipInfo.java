package com.instagram.pendingmedia.model;

import X.AbstractC09440dt;
import X.AbstractC111324zv;
import X.AbstractC13530mf;
import X.AbstractC43591JPw;
import X.AbstractC58317Pt9;
import X.C09530e4;
import X.C0T6;
import X.C14360o3;
import X.C915847p;
import X.C9Ay;
import X.InterfaceC09390do;
import X.InterfaceC915747o;
import X.MSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;

/* loaded from: classes2.dex */
public final class ClipInfo extends C0T6 implements Parcelable, InterfaceC915747o {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public long A0A;
    public MediaUploadMetadata A0B;
    public Integer A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public C09530e4 A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public transient String A0P;
    public static final C9Ay CREATOR = new C9Ay(51);
    public static final InterfaceC09390do A0Q = AbstractC09440dt.A01(C915847p.A00);

    public ClipInfo() {
        this(null, 16777215);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipInfo) {
                ClipInfo clipInfo = (ClipInfo) obj;
                if (!C14360o3.A0K(this.A0F, clipInfo.A0F) || !C14360o3.A0K(this.A0D, clipInfo.A0D) || this.A03 != clipInfo.A03 || Float.compare(this.A02, clipInfo.A02) != 0 || !C14360o3.A0K(this.A0C, clipInfo.A0C) || this.A04 != clipInfo.A04 || Float.compare(this.A00, clipInfo.A00) != 0 || this.A07 != clipInfo.A07 || this.A05 != clipInfo.A05 || this.A0H != clipInfo.A0H || this.A08 != clipInfo.A08 || this.A09 != clipInfo.A09 || this.A06 != clipInfo.A06 || !C14360o3.A0K(this.A0E, clipInfo.A0E) || this.A0L != clipInfo.A0L || this.A0J != clipInfo.A0J || this.A0K != clipInfo.A0K || this.A0N != clipInfo.A0N || this.A0A != clipInfo.A0A || this.A0M != clipInfo.A0M || !C14360o3.A0K(this.A0B, clipInfo.A0B) || this.A0O != clipInfo.A0O || this.A0I != clipInfo.A0I || Float.compare(this.A01, clipInfo.A01) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClipInfo(videoFilePath=");
        sb.append(this.A0F);
        sb.append(", photoFilePath=");
        sb.append(this.A0D);
        sb.append(", cameraId=");
        sb.append(this.A03);
        sb.append(", pan=");
        sb.append(this.A02);
        sb.append(MSV.A00(38));
        sb.append(this.A0C);
        sb.append(AbstractC111324zv.A00(1403));
        sb.append(this.A04);
        sb.append(", aspectPostCrop=");
        sb.append(this.A00);
        sb.append(AbstractC43591JPw.A00(233));
        sb.append(this.A07);
        sb.append(AbstractC58317Pt9.A00(152));
        sb.append(this.A05);
        sb.append(", hasTrimEdits=");
        sb.append(this.A0H);
        sb.append(", trimScroll=");
        sb.append(this.A08);
        sb.append(", width=");
        sb.append(this.A09);
        sb.append(", height=");
        sb.append(this.A06);
        sb.append(", software=");
        sb.append(this.A0E);
        sb.append(", isHFlip=");
        sb.append(this.A0L);
        sb.append(", isBoomerang=");
        sb.append(this.A0J);
        sb.append(", isClipsHorizontalRemix=");
        sb.append(this.A0K);
        sb.append(", isSquareCrop=");
        sb.append(this.A0N);
        sb.append(", originalDurationMs=");
        sb.append(this.A0A);
        sb.append(", isPhotoToVideo=");
        sb.append(this.A0M);
        sb.append(AbstractC111324zv.A00(572));
        sb.append(this.A0B);
        sb.append(", isVirtual=");
        sb.append(this.A0O);
        sb.append(AbstractC111324zv.A00(1424));
        sb.append(this.A0I);
        sb.append(MSV.A00(289));
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0D);
        parcel.writeInt(this.A03);
        parcel.writeFloat(this.A02);
        parcel.writeValue(this.A0C);
        parcel.writeInt(this.A04);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A06);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeLong(this.A0A);
        parcel.writeString(this.A0P);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeFloat(this.A01);
    }

    public /* synthetic */ ClipInfo(String str, int i) {
        long j;
        MediaUploadMetadata mediaUploadMetadata;
        String str2 = (i & 1) != 0 ? null : str;
        float f = (i & 8) != 0 ? 0.5f : 0.0f;
        int i2 = (i & 32) != 0 ? 3 : 0;
        float f2 = (i & 64) != 0 ? 1.0f : 0.0f;
        if ((i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
            j = -1;
        } else {
            j = 0;
        }
        if ((i & 1048576) != 0) {
            mediaUploadMetadata = new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false);
        } else {
            mediaUploadMetadata = null;
        }
        float f3 = (i & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0 ? -1.0f : 0.0f;
        C14360o3.A0B(mediaUploadMetadata, 21);
        this.A0F = str2;
        this.A0D = null;
        this.A03 = 0;
        this.A02 = f;
        this.A0C = null;
        this.A04 = i2;
        this.A00 = f2;
        this.A07 = 0;
        this.A05 = 0;
        this.A0H = false;
        this.A08 = 0;
        this.A09 = 0;
        this.A06 = 0;
        this.A0E = null;
        this.A0L = false;
        this.A0J = false;
        this.A0K = false;
        this.A0N = false;
        this.A0A = j;
        this.A0M = false;
        this.A0B = mediaUploadMetadata;
        this.A0O = false;
        this.A0I = false;
        this.A01 = f3;
        this.A0G = new C09530e4(null, 0L);
    }

    public final long A00() {
        if (!C14360o3.A0K(this.A0G.A00, this.A0F)) {
            String str = this.A0F;
            this.A0G = new C09530e4(str, Long.valueOf(AbstractC13530mf.A03(str)));
        }
        return ((Number) this.A0G.A01).longValue();
    }

    public final void A01(int i, int i2) {
        int intValue;
        Integer num = this.A0C;
        if (num == null || ((intValue = num.intValue()) != 1 && intValue != 3)) {
            this.A09 = i;
            this.A06 = i2;
        } else {
            this.A09 = i2;
            this.A06 = i;
        }
    }

    @Override // X.InterfaceC915747o
    public final int Azm() {
        return this.A05 - this.A07;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.A0F;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.A0D;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int floatToIntBits = (((((i2 + hashCode2) * 31) + this.A03) * 31) + Float.floatToIntBits(this.A02)) * 31;
        Integer num = this.A0C;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int floatToIntBits2 = (((((((((floatToIntBits + hashCode3) * 31) + this.A04) * 31) + Float.floatToIntBits(this.A00)) * 31) + this.A07) * 31) + this.A05) * 31;
        int i3 = 1237;
        if (this.A0H) {
            i3 = 1231;
        }
        int i4 = (((((((floatToIntBits2 + i3) * 31) + this.A08) * 31) + this.A09) * 31) + this.A06) * 31;
        String str3 = this.A0E;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i5 = (i4 + i) * 31;
        int i6 = 1237;
        if (this.A0L) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A0J) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        int i10 = 1237;
        if (this.A0K) {
            i10 = 1231;
        }
        int i11 = (i9 + i10) * 31;
        int i12 = 1237;
        if (this.A0N) {
            i12 = 1231;
        }
        int i13 = (i11 + i12) * 31;
        long j = this.A0A;
        int i14 = (i13 + ((int) (j ^ (j >>> 32)))) * 31;
        int i15 = 1237;
        if (this.A0M) {
            i15 = 1231;
        }
        int hashCode4 = (((i14 + i15) * 31) + this.A0B.hashCode()) * 31;
        int i16 = 1237;
        if (this.A0O) {
            i16 = 1231;
        }
        int i17 = (hashCode4 + i16) * 31;
        int i18 = 1237;
        if (this.A0I) {
            i18 = 1231;
        }
        return ((i17 + i18) * 31) + Float.floatToIntBits(this.A01);
    }
}
