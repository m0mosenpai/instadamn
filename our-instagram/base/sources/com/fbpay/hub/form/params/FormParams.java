package com.fbpay.hub.form.params;

import X.AbstractC166987dD;
import X.AbstractC37304Gc5;
import X.C63184Sej;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.logging.FBPayLoggerData;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes10.dex */
public class FormParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(29);
    public FBPayLoggerData A00;
    public FormDialogParams A01;
    public FormLogEvents A02;
    public String A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final ImmutableList A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    public FormParams(FBPayLoggerData fBPayLoggerData, FormLogEvents formLogEvents, ImmutableList immutableList, String str) {
        this.A04 = 1;
        this.A07 = immutableList;
        this.A06 = 0;
        this.A0A = str;
        this.A08 = null;
        this.A05 = 0;
        this.A0B = false;
        this.A00 = fBPayLoggerData;
        this.A02 = formLogEvents;
        this.A01 = null;
        this.A09 = null;
        this.A03 = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A06);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A08);
        parcel.writeList(this.A07);
        parcel.writeInt(this.A05);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A09);
        parcel.writeString(this.A03);
    }

    public FormParams(Parcel parcel) {
        this.A04 = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A0A = parcel.readString();
        this.A08 = parcel.readString();
        ArrayList A1E = AbstractC166987dD.A1E();
        parcel.readList(A1E, CellParams.class.getClassLoader());
        this.A07 = ImmutableList.copyOf((Collection) A1E);
        this.A05 = parcel.readInt();
        this.A0B = AbstractC37304Gc5.A1X(parcel);
        this.A00 = (FBPayLoggerData) AbstractC37304Gc5.A04(parcel, FBPayLoggerData.class);
        this.A02 = (FormLogEvents) AbstractC37304Gc5.A04(parcel, FormLogEvents.class);
        this.A01 = (FormDialogParams) AbstractC37304Gc5.A04(parcel, FormDialogParams.class);
        this.A09 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public FormParams(C63184Sej c63184Sej) {
        this.A04 = c63184Sej.A06;
        this.A07 = c63184Sej.A03;
        this.A06 = c63184Sej.A08;
        this.A0A = c63184Sej.A0B;
        String str = c63184Sej.A0A;
        this.A08 = str;
        this.A05 = c63184Sej.A07;
        this.A0B = true;
        this.A00 = c63184Sej.A00;
        this.A02 = c63184Sej.A02;
        this.A01 = c63184Sej.A01;
        this.A09 = c63184Sej.A05;
        String str2 = c63184Sej.A04;
        this.A03 = str2 == null ? str : str2;
    }
}
