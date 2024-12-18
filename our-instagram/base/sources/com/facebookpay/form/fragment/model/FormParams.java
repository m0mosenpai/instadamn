package com.facebookpay.form.fragment.model;

import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC25229BEm;
import X.AbstractC37304Gc5;
import X.AbstractC65703TsZ;
import X.C14360o3;
import X.C70221WIe;
import X.EnumC61219RhJ;
import X.InterfaceC16660sJ;
import X.VET;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.CellParams;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class FormParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(97);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final CellParams A07;
    public final FeatureConfiguration A08;
    public final FormLoggingEvents A09;
    public final ListCellParams A0A;
    public final VET A0B;
    public final EnumC61219RhJ A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final String A0H;
    public final ArrayList A0I;
    public final List A0J;
    public final InterfaceC16660sJ A0K;
    public final boolean A0L;

    public FormParams(CellParams cellParams, FeatureConfiguration featureConfiguration, FormLoggingEvents formLoggingEvents, ListCellParams listCellParams, VET vet, EnumC61219RhJ enumC61219RhJ, Integer num, Integer num2, Integer num3, Integer num4, String str, ArrayList arrayList, List list, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        C14360o3.A0B(arrayList, 6);
        this.A04 = i;
        this.A0H = str;
        this.A06 = i2;
        this.A0F = num;
        this.A0E = num2;
        this.A0I = arrayList;
        this.A09 = formLoggingEvents;
        this.A0B = vet;
        this.A03 = i3;
        this.A00 = i4;
        this.A02 = i5;
        this.A01 = i6;
        this.A0A = listCellParams;
        this.A08 = featureConfiguration;
        this.A0G = num3;
        this.A0J = list;
        this.A07 = cellParams;
        this.A0D = num4;
        this.A05 = i7;
        this.A0C = enumC61219RhJ;
        this.A0L = z;
        this.A0K = interfaceC16660sJ;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A04);
        parcel.writeString(this.A0H);
        parcel.writeInt(this.A06);
        AbstractC167027dH.A0o(parcel, this.A0F, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A0E, 0, 1);
        ArrayList arrayList = this.A0I;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC25229BEm.A15(parcel, it, i);
        }
        FormLoggingEvents formLoggingEvents = this.A09;
        if (formLoggingEvents == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formLoggingEvents.writeToParcel(parcel, i);
        }
        AbstractC65703TsZ.A1H(parcel, this.A0B);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        ListCellParams listCellParams = this.A0A;
        if (listCellParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            listCellParams.writeToParcel(parcel, i);
        }
        FeatureConfiguration featureConfiguration = this.A08;
        if (featureConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            featureConfiguration.writeToParcel(parcel, i);
        }
        AbstractC167027dH.A0o(parcel, this.A0G, 0, 1);
        List list = this.A0J;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A0l = AbstractC37304Gc5.A0l(parcel, list);
            while (A0l.hasNext()) {
                parcel.writeInt(AbstractC167007dF.A0B(A0l));
            }
        }
        parcel.writeParcelable(this.A07, i);
        Integer num = this.A0D;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            if (1 - num.intValue() != 0) {
                str = "ECP_ADD_ADDRESS";
            } else {
                str = "ECP_EDIT_ADDRESS";
            }
            parcel.writeString(str);
        }
        parcel.writeInt(this.A05);
        AbstractC65703TsZ.A1H(parcel, this.A0C);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeSerializable((Serializable) this.A0K);
    }
}
