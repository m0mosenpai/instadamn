package com.facebookpay.form.model;

import X.AbstractC167027dH;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.AbstractC69844VwU;
import X.C14360o3;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class FormField implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63470SlB(2);

    @SerializedName("valueType")
    public final Integer A00;

    @SerializedName("errorMessage")
    public final String A01;

    @SerializedName("fieldId")
    public final String A02;

    @SerializedName("label")
    public final String A03;

    @SerializedName("validationRules")
    public final List<TextValidatorParams> A04;

    @SerializedName("isOptional")
    public final boolean A05;

    @SerializedName("placeHolder")
    public final String A06;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A05 ? 1 : 0);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A04);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
        parcel.writeString(AbstractC69844VwU.A01(this.A00));
    }

    public FormField(Integer num, String str, String str2, String str3, String str4, List list, boolean z) {
        AbstractC167027dH.A13(str, str2, str3);
        C14360o3.A0B(num, 7);
        this.A02 = str;
        this.A03 = str2;
        this.A06 = str3;
        this.A01 = str4;
        this.A05 = z;
        this.A04 = list;
        this.A00 = num;
    }
}
