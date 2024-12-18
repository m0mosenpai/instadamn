package com.facebookpay.expresscheckout.models;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC37302Gc3;
import X.C14360o3;
import X.C70221WIe;
import X.EnumC68119VCc;
import X.EnumC68131VCp;
import X.VDU;
import X.VEM;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
public final class ECPPaymentConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(46);

    @SerializedName("estimatedTotal")
    public final CurrencyAmount A00;

    @SerializedName("knownData")
    public final KnownData A01;

    @SerializedName("paymentEnv")
    public final VDU A02;

    @SerializedName("containerContext")
    public final String A03;

    @SerializedName("securityOrigin")
    public final String A04;

    @SerializedName("offers")
    public final ArrayList<String> A05;

    @SerializedName("paymentActionType")
    public final ArrayList<EnumC68131VCp> A06;

    @SerializedName("supportedContainerTypes")
    public final ArrayList<VEM> A07;

    @SerializedName("supportedContainerConfigurations")
    public final Map<VEM, Bundle> A08;

    @SerializedName("allowedCredentialTypes")
    public final Set<EnumC68119VCc> A09;

    public ECPPaymentConfiguration(CurrencyAmount currencyAmount, KnownData knownData, VDU vdu, String str, String str2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map, Set set) {
        C14360o3.A0B(vdu, 1);
        this.A02 = vdu;
        this.A03 = str;
        this.A04 = str2;
        this.A06 = arrayList;
        this.A00 = currencyAmount;
        this.A07 = arrayList2;
        this.A01 = knownData;
        this.A05 = arrayList3;
        this.A08 = map;
        this.A09 = set;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        ArrayList<EnumC68131VCp> arrayList = this.A06;
        parcel.writeInt(arrayList.size());
        Iterator<EnumC68131VCp> it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC166997dE.A1I(parcel, it.next());
        }
        parcel.writeParcelable(this.A00, i);
        ArrayList<VEM> arrayList2 = this.A07;
        parcel.writeInt(arrayList2.size());
        Iterator<VEM> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            AbstractC166997dE.A1I(parcel, it2.next());
        }
        KnownData knownData = this.A01;
        if (knownData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            knownData.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.A05);
        Map<VEM, Bundle> map = this.A08;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0s = AbstractC167017dG.A0s(parcel, map);
            while (A0s.hasNext()) {
                Map.Entry entry = (Map.Entry) A0s.next();
                AbstractC166997dE.A1I(parcel, (VEM) entry.getKey());
                parcel.writeBundle((Bundle) entry.getValue());
            }
        }
        Set<EnumC68119VCc> set = this.A09;
        if (set == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        Iterator A0h = AbstractC37302Gc3.A0h(parcel, set);
        while (A0h.hasNext()) {
            AbstractC166997dE.A1I(parcel, (EnumC68119VCc) A0h.next());
        }
    }
}
