package com.instagram.common.gallery;

import X.AbstractC111324zv;
import X.AbstractC189358aC;
import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import X.C8IT;
import X.MSV;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* loaded from: classes4.dex */
public final class Draft extends C0T6 implements Parcelable, C8IT {
    public static final Parcelable.Creator CREATOR = new C206139Av(53);
    public final int A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public Draft(Long l, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(str, 1);
        this.A04 = str;
        this.A06 = z;
        this.A05 = z2;
        this.A00 = i;
        this.A03 = str2;
        this.A07 = z3;
        this.A08 = z4;
        this.A01 = l;
        this.A02 = str3;
    }

    @Override // X.C8IT
    public final int BpZ() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Draft) {
                Draft draft = (Draft) obj;
                if (!C14360o3.A0K(this.A04, draft.A04) || this.A06 != draft.A06 || this.A05 != draft.A05 || this.A00 != draft.A00 || !C14360o3.A0K(this.A03, draft.A03) || this.A07 != draft.A07 || this.A08 != draft.A08 || !C14360o3.A0K(this.A01, draft.A01) || !C14360o3.A0K(this.A02, draft.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Draft(itemId=");
        sb.append(this.A04);
        sb.append(AbstractC111324zv.A00(568));
        sb.append(this.A06);
        sb.append(", isAlbum=");
        sb.append(this.A05);
        sb.append(MSV.A00(37));
        sb.append(this.A00);
        sb.append(", imageFilePath=");
        sb.append(this.A03);
        sb.append(", showShoppingIndicator=");
        sb.append(this.A07);
        sb.append(", supportsMultiSelect=");
        sb.append(this.A08);
        sb.append(", createdTimeMillis=");
        sb.append(this.A01);
        sb.append(", draftName=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        Long l = this.A01;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.A02);
    }

    @Override // X.C8IT
    public final String B8m() {
        return AbstractC189358aC.A01(this.A00);
    }

    @Override // X.C8IT
    public final String BK3() {
        return this.A04;
    }

    @Override // X.C8IT
    public final boolean CPp() {
        return this.A05;
    }

    @Override // X.C8IT
    public final boolean Cff() {
        return this.A06;
    }

    @Override // X.C8IT
    public final int getDuration() {
        return this.A00;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.A04.hashCode() * 31;
        int i = 1237;
        if (this.A06) {
            i = 1231;
        }
        int i2 = (hashCode3 + i) * 31;
        int i3 = 1237;
        if (this.A05) {
            i3 = 1231;
        }
        int i4 = (((i2 + i3) * 31) + this.A00) * 31;
        String str = this.A03;
        int i5 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i6 = (i4 + hashCode) * 31;
        int i7 = 1237;
        if (this.A07) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A08) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        Long l = this.A01;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str2 = this.A02;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        return i11 + i5;
    }

    @Override // X.C8IT
    public final boolean isValid() {
        String str = this.A03;
        if (str == null || str.length() == 0 || !new File(str).exists()) {
            return false;
        }
        return true;
    }
}
