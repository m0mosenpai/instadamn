package com.fbpay.hub.form.params;

import X.AbstractC25235BEs;
import X.AbstractC58322PtE;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class FormLogEvents implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(28);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public FormLogEvents(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = null;
        this.A05 = str5;
        this.A06 = str6;
        this.A07 = str7;
        this.A08 = null;
        this.A09 = str8;
        this.A0A = str9;
        this.A0B = str10;
    }

    public FormLogEvents(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A06 = str7;
        this.A07 = str8;
        this.A08 = str9;
        this.A09 = str10;
        this.A0A = str11;
        this.A0B = str12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FormLogEvents) {
                FormLogEvents formLogEvents = (FormLogEvents) obj;
                if (!C14360o3.A0K(this.A00, formLogEvents.A00) || !C14360o3.A0K(this.A01, formLogEvents.A01) || !C14360o3.A0K(this.A02, formLogEvents.A02) || !C14360o3.A0K(this.A03, formLogEvents.A03) || !C14360o3.A0K(this.A04, formLogEvents.A04) || !C14360o3.A0K(this.A05, formLogEvents.A05) || !C14360o3.A0K(this.A06, formLogEvents.A06) || !C14360o3.A0K(this.A07, formLogEvents.A07) || !C14360o3.A0K(this.A08, formLogEvents.A08) || !C14360o3.A0K(this.A09, formLogEvents.A09) || !C14360o3.A0K(this.A0A, formLogEvents.A0A) || !C14360o3.A0K(this.A0B, formLogEvents.A0B)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((AbstractC63311ShH.A02(this.A00) * 31) + AbstractC25235BEs.A06(this.A01)) * 31) + AbstractC25235BEs.A06(this.A02)) * 31) + AbstractC25235BEs.A06(this.A03)) * 31) + AbstractC25235BEs.A06(this.A04)) * 31) + AbstractC25235BEs.A06(this.A05)) * 31) + AbstractC25235BEs.A06(this.A06)) * 31) + AbstractC25235BEs.A06(this.A07)) * 31) + AbstractC25235BEs.A06(this.A08)) * 31) + AbstractC25235BEs.A06(this.A09)) * 31) + AbstractC25235BEs.A06(this.A0A)) * 31) + AbstractC25235BEs.A06(this.A0B);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58322PtE.A1E(parcel, this.A00, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A01, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A02, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A03, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A04, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A05, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A06, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A07, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A08, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A09, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A0A, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A0B, 0, 1);
    }

    public FormLogEvents(Parcel parcel) {
        if (AbstractC58322PtE.A07(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        this.A0A = parcel.readInt() != 0 ? parcel.readString() : null;
        this.A0B = AbstractC58322PtE.A0n(parcel);
    }
}
