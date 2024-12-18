package com.facebook.smartcapture.capture;

import X.AbstractC167027dH;
import X.AbstractC25235BEs;
import X.AbstractC31179DnN;
import X.AbstractC37302Gc3;
import X.AbstractC37304Gc5;
import X.AbstractC58322PtE;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C1LC;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: classes10.dex */
public class SelfieEvidence implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(61);
    public final ImmutableList A00;
    public final Float A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Long A05;
    public final String A06;
    public final String A07;

    public SelfieEvidence(ImmutableList immutableList, Float f, Integer num, Integer num2, Integer num3, Long l, String str, String str2) {
        this.A06 = str;
        this.A00 = immutableList;
        this.A02 = num;
        this.A01 = f;
        this.A03 = num2;
        this.A07 = str2;
        this.A05 = l;
        this.A04 = num3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SelfieEvidence) {
                SelfieEvidence selfieEvidence = (SelfieEvidence) obj;
                if (!C14360o3.A0K(this.A06, selfieEvidence.A06) || !C14360o3.A0K(this.A00, selfieEvidence.A00) || !C14360o3.A0K(this.A02, selfieEvidence.A02) || !C14360o3.A0K(this.A01, selfieEvidence.A01) || !C14360o3.A0K(this.A03, selfieEvidence.A03) || !C14360o3.A0K(this.A07, selfieEvidence.A07) || !C14360o3.A0K(this.A05, selfieEvidence.A05) || !C14360o3.A0K(this.A04, selfieEvidence.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((AbstractC63311ShH.A02(this.A06) * 31) + AbstractC25235BEs.A06(this.A00)) * 31) + AbstractC25235BEs.A06(this.A02)) * 31) + AbstractC25235BEs.A06(this.A01)) * 31) + AbstractC25235BEs.A06(this.A03)) * 31) + AbstractC25235BEs.A06(this.A07)) * 31) + AbstractC25235BEs.A06(this.A05)) * 31) + AbstractC25235BEs.A06(this.A04);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58322PtE.A1E(parcel, this.A06, 0, 1);
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C1LC A0d = AbstractC58322PtE.A0d(parcel, immutableList);
            while (A0d.hasNext()) {
                AbstractC37302Gc3.A0p(parcel, A0d);
            }
        }
        AbstractC167027dH.A0o(parcel, this.A02, 0, 1);
        Float f = this.A01;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        AbstractC167027dH.A0o(parcel, this.A03, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A07, 0, 1);
        AbstractC31179DnN.A0q(parcel, this.A05);
        AbstractC167027dH.A0o(parcel, this.A04, 0, 1);
    }

    public SelfieEvidence(Parcel parcel) {
        if (AbstractC58322PtE.A07(parcel, this) == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            for (int i = 0; i < readInt; i++) {
                strArr[i] = parcel.readString();
            }
            this.A00 = ImmutableList.copyOf(strArr);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = AbstractC37304Gc5.A0U(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = Float.valueOf(parcel.readFloat());
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = AbstractC37304Gc5.A0U(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        this.A05 = parcel.readInt() != 0 ? AbstractC58322PtE.A0j(parcel) : null;
        this.A04 = AbstractC37304Gc5.A0W(parcel);
    }
}
