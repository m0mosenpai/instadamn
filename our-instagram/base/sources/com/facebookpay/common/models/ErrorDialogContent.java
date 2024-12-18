package com.facebookpay.common.models;

import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC62186S1h;
import X.AbstractC65703TsZ;
import X.C14360o3;
import X.C63473SlE;
import X.C69075VhQ;
import X.EnumC68186VFe;
import X.VEJ;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class ErrorDialogContent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63473SlE(90);
    public final C69075VhQ A00;
    public final C69075VhQ A01;
    public final Integer A02;
    public final Integer A03;
    public final VEJ A04;
    public final VEJ A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final String A09;

    public final String A02(Context context) {
        C14360o3.A0B(context, 0);
        String str = this.A08;
        if (str == null) {
            Integer num = this.A06;
            if (num != null) {
                return AbstractC166997dE.A0p(context, num.intValue());
            }
            throw AbstractC166997dE.A0g();
        }
        return str;
    }

    public final String A03(Context context) {
        C14360o3.A0B(context, 0);
        C69075VhQ c69075VhQ = this.A00;
        if (c69075VhQ != null) {
            return c69075VhQ.A01;
        }
        VEJ vej = this.A04;
        if (vej != null) {
            int i = vej.A00;
            if (Integer.valueOf(i) != null) {
                return AbstractC166997dE.A0p(context, i);
            }
        }
        throw AbstractC166997dE.A0g();
    }

    public final String A05(Context context) {
        C14360o3.A0B(context, 0);
        String str = this.A09;
        if (str == null) {
            Integer num = this.A07;
            if (num != null) {
                return AbstractC166997dE.A0p(context, num.intValue());
            }
            throw AbstractC166997dE.A0g();
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeValue(this.A00);
        parcel.writeValue(this.A01);
        AbstractC167027dH.A0o(parcel, this.A07, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A06, 0, 1);
        AbstractC65703TsZ.A1H(parcel, this.A04);
        AbstractC65703TsZ.A1H(parcel, this.A05);
        AbstractC167027dH.A0o(parcel, this.A02, 0, 1);
        Integer num = this.A03;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(AbstractC62186S1h.A00(num));
        }
    }

    public final EnumC68186VFe A00() {
        EnumC68186VFe enumC68186VFe;
        C69075VhQ c69075VhQ = this.A00;
        if (c69075VhQ != null) {
            return c69075VhQ.A00;
        }
        VEJ vej = this.A04;
        if (vej != null && (enumC68186VFe = vej.A01) != null) {
            return enumC68186VFe;
        }
        throw AbstractC166997dE.A0g();
    }

    public final EnumC68186VFe A01() {
        C69075VhQ c69075VhQ = this.A01;
        if (c69075VhQ != null) {
            return c69075VhQ.A00;
        }
        VEJ vej = this.A05;
        if (vej != null) {
            return vej.A01;
        }
        return null;
    }

    public final String A04(Context context) {
        C69075VhQ c69075VhQ = this.A01;
        if (c69075VhQ != null) {
            return c69075VhQ.A01;
        }
        VEJ vej = this.A05;
        if (vej == null) {
            return null;
        }
        int i = vej.A00;
        if (Integer.valueOf(i) == null) {
            return null;
        }
        return context.getString(i);
    }

    public final boolean A06() {
        EnumC68186VFe enumC68186VFe;
        C69075VhQ c69075VhQ = this.A00;
        if (c69075VhQ != null) {
            enumC68186VFe = c69075VhQ.A00;
        } else {
            enumC68186VFe = null;
        }
        if (enumC68186VFe != EnumC68186VFe.DISMISS_AND_CLOSE && this.A04 != VEJ.A05) {
            return false;
        }
        return true;
    }

    public ErrorDialogContent(VEJ vej, VEJ vej2, C69075VhQ c69075VhQ, C69075VhQ c69075VhQ2, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2) {
        this.A09 = str;
        this.A08 = str2;
        this.A00 = c69075VhQ;
        this.A01 = c69075VhQ2;
        this.A07 = num;
        this.A06 = num2;
        this.A04 = vej;
        this.A05 = vej2;
        this.A02 = num3;
        this.A03 = num4;
    }

    public ErrorDialogContent() {
        this(null, null, null, null, null, null, null, null, null, null);
    }
}
