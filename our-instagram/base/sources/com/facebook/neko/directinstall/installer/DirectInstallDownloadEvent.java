package com.facebook.neko.directinstall.installer;

import X.AbstractC58321PtD;
import X.C2I7;
import X.C63473SlE;
import X.EnumC68128VCm;
import X.JSR;
import X.JSS;
import X.VDE;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class DirectInstallDownloadEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63473SlE(46);
    public EnumC68128VCm A00;
    public Double A01;
    public final VDE A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DirectInstallDownloadEvent directInstallDownloadEvent = (DirectInstallDownloadEvent) obj;
            if (this.A02 != directInstallDownloadEvent.A02 || this.A00 != directInstallDownloadEvent.A00 || !C2I7.A00(this.A01, directInstallDownloadEvent.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A00, this.A01});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02.toString());
        parcel.writeValue(this.A01);
    }

    public DirectInstallDownloadEvent(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.A02 = VDE.valueOf(readString);
        this.A01 = (Double) AbstractC58321PtD.A0n(parcel, Double.class);
    }

    public final String toString() {
        JSR A00 = JSS.A00(this);
        A00.A01(this.A02, "statusEvent");
        A00.A01(this.A01, "downloadProgress");
        A00.A01(this.A00, "oemErrorType");
        return A00.toString();
    }

    public DirectInstallDownloadEvent(EnumC68128VCm enumC68128VCm, VDE vde) {
        this.A02 = vde;
        this.A00 = enumC68128VCm;
    }

    public DirectInstallDownloadEvent(VDE vde, Double d) {
        this.A02 = vde;
        this.A01 = d;
    }

    public DirectInstallDownloadEvent(VDE vde) {
        this.A02 = vde;
    }
}
