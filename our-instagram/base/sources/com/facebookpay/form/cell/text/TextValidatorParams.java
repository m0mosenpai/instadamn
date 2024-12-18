package com.facebookpay.form.cell.text;

import X.AbstractC69845VwV;
import X.C05F;
import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class TextValidatorParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(84);
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(AbstractC69845VwV.A01(this.A02));
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public TextValidatorParams(String str, int i, Integer num) {
        this.A02 = num;
        this.A04 = "";
        this.A03 = str;
        this.A01 = 0;
        this.A00 = i;
    }

    public TextValidatorParams(Integer num, String str, int i, int i2) {
        C14360o3.A0B(str, 2);
        this.A02 = num;
        this.A04 = str;
        this.A03 = null;
        this.A01 = i;
        this.A00 = i2;
    }

    public TextValidatorParams(Parcel parcel) {
        Integer num;
        String readString = parcel.readString();
        if (readString != null) {
            if (readString.equals("MIN_LENGTH")) {
                num = C05F.A00;
            } else if (readString.equals("MAX_LENGTH")) {
                num = C05F.A01;
            } else if (readString.equals("EXACT_LENGTH")) {
                num = C05F.A0C;
            } else if (readString.equals("REGEX")) {
                num = C05F.A0N;
            } else if (readString.equals("EMPTY")) {
                num = C05F.A0Y;
            } else if (readString.equals("US_STATE")) {
                num = C05F.A0j;
            } else if (readString.equals("DATE")) {
                num = C05F.A0u;
            } else if (readString.equals("CARD")) {
                num = C05F.A15;
            } else if (readString.equals("CARD_TYPE")) {
                num = C05F.A1F;
            } else if (readString.equals("US_PHONE")) {
                num = C05F.A1I;
            } else {
                if (!readString.equals("PHONE")) {
                    throw new IllegalArgumentException(readString);
                }
                num = C05F.A02;
            }
            this.A02 = num;
            String readString2 = parcel.readString();
            if (readString2 != null) {
                this.A04 = readString2;
                this.A03 = parcel.readString();
                this.A01 = parcel.readInt();
                this.A00 = parcel.readInt();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public TextValidatorParams(String str, Integer num, String str2) {
        this.A02 = num;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = 0;
        this.A00 = 0;
    }
}
