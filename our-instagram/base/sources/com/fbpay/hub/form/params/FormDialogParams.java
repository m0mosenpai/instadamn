package com.fbpay.hub.form.params;

import X.AbstractC25235BEs;
import X.AbstractC58322PtE;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C62581SHg;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class FormDialogParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(27);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FormDialogParams) {
                FormDialogParams formDialogParams = (FormDialogParams) obj;
                if (!C14360o3.A0K(this.A04, formDialogParams.A04) || this.A00 != formDialogParams.A00 || this.A01 != formDialogParams.A01 || this.A02 != formDialogParams.A02 || !C14360o3.A0K(this.A05, formDialogParams.A05) || this.A03 != formDialogParams.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((AbstractC63311ShH.A02(this.A04) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + AbstractC25235BEs.A06(this.A05)) * 31) + this.A03;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58322PtE.A1E(parcel, this.A04, 0, 1);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        AbstractC58322PtE.A1E(parcel, this.A05, 0, 1);
        parcel.writeInt(this.A03);
    }

    public FormDialogParams(Parcel parcel) {
        this.A04 = AbstractC58322PtE.A07(parcel, this) != 0 ? parcel.readString() : null;
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A05 = AbstractC58322PtE.A0n(parcel);
        this.A03 = parcel.readInt();
    }

    public FormDialogParams(C62581SHg c62581SHg) {
        this.A04 = null;
        this.A00 = c62581SHg.A00;
        this.A01 = c62581SHg.A01;
        this.A02 = c62581SHg.A02;
        this.A05 = null;
        this.A03 = c62581SHg.A03;
    }
}
