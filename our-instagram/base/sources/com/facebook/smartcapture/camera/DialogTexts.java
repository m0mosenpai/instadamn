package com.facebook.smartcapture.camera;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC25226BEj;
import X.AbstractC25236BEt;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes12.dex */
public final class DialogTexts implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63473SlE(57);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public DialogTexts(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AbstractC167027dH.A0a(1, str, str2, str3, str4);
        C14360o3.A0B(str5, 5);
        AbstractC167007dF.A1H(str6, 6, str7);
        C14360o3.A0B(str8, 8);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = str4;
        this.A07 = str5;
        this.A06 = str6;
        this.A05 = str7;
        this.A04 = str8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DialogTexts) {
                DialogTexts dialogTexts = (DialogTexts) obj;
                if (!C14360o3.A0K(this.A03, dialogTexts.A03) || !C14360o3.A0K(this.A02, dialogTexts.A02) || !C14360o3.A0K(this.A01, dialogTexts.A01) || !C14360o3.A0K(this.A00, dialogTexts.A00) || !C14360o3.A0K(this.A07, dialogTexts.A07) || !C14360o3.A0K(this.A06, dialogTexts.A06) || !C14360o3.A0K(this.A05, dialogTexts.A05) || !C14360o3.A0K(this.A04, dialogTexts.A04)) {
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
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A04, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0K(this.A00, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A03))))))));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DialogTexts(rationaleTitle=");
        A1C.append(this.A03);
        A1C.append(", rationaleText=");
        A1C.append(this.A02);
        A1C.append(", rationaleOk=");
        A1C.append(this.A01);
        A1C.append(", rationaleCancel=");
        A1C.append(this.A00);
        A1C.append(", toSettingsTitle=");
        A1C.append(this.A07);
        A1C.append(", toSettingsText=");
        A1C.append(this.A06);
        A1C.append(", toSettingsOk=");
        A1C.append(this.A05);
        A1C.append(", toSettingsCancel=");
        return AbstractC25236BEt.A0Y(this.A04, A1C);
    }

    public DialogTexts() {
        this("", "", "", "", "", "", "", "");
    }
}
