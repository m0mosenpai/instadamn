package com.instagram.archive.intf;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class ArchivePendingUpload extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(8);
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArchivePendingUpload) {
                ArchivePendingUpload archivePendingUpload = (ArchivePendingUpload) obj;
                if (!C14360o3.A0K(this.A03, archivePendingUpload.A03) || this.A05 != archivePendingUpload.A05 || this.A02 != archivePendingUpload.A02 || this.A00 != archivePendingUpload.A00 || this.A01 != archivePendingUpload.A01 || this.A04 != archivePendingUpload.A04) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, (((((AbstractC167007dF.A0D(this.A05, AbstractC167017dG.A0O(this.A03) * 31) + this.A02) * 31) + this.A00) * 31) + this.A01) * 31);
    }

    public ArchivePendingUpload(String str, int i, int i2, int i3, boolean z, boolean z2) {
        this.A03 = str;
        this.A05 = z;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = z2;
    }
}
