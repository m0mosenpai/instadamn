package com.facebook.common.payments.paymentmethods.model;

import X.AbstractC166987dD;
import X.AbstractC31171DnF;
import X.AbstractC37304Gc5;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes10.dex */
public class NewCreditCard implements PaymentCredential {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(78);
    public final AdditionalFields A00;
    public final String A01;
    public final List A02;
    public final Set A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList A1E;
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeList(this.A02);
        Set set = this.A03;
        if (set == null) {
            A1E = null;
        } else {
            A1E = AbstractC166987dD.A1E();
            A1E.addAll(set);
        }
        parcel.writeList(A1E);
    }

    public NewCreditCard(Parcel parcel) {
        Set A0k;
        this.A01 = parcel.readString();
        this.A00 = (AdditionalFields) AbstractC37304Gc5.A04(parcel, AdditionalFields.class);
        ArrayList A1E = AbstractC166987dD.A1E();
        parcel.readList(A1E, ArrayList.class.getClassLoader());
        this.A02 = A1E;
        ArrayList readArrayList = parcel.readArrayList(List.class.getClassLoader());
        if (readArrayList == null) {
            A0k = Collections.EMPTY_SET;
        } else {
            A0k = AbstractC31171DnF.A0k(readArrayList);
        }
        this.A03 = A0k;
    }
}
