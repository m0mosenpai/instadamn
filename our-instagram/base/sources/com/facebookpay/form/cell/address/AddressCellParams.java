package com.facebookpay.form.cell.address;

import X.AbstractC166997dE;
import X.AbstractC37304Gc5;
import X.AbstractC58320PtC;
import X.AbstractC65702TsY;
import X.C14360o3;
import X.C67662Uuu;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.locale.Country;
import com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.logging.LoggingContext;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class AddressCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = new C70221WIe(66);
    public boolean A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final Country A0D;
    public final AddressFormFieldsConfig A0E;
    public final LoggingContext A0F;
    public final ImmutableList A0G;
    public final ImmutableList A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final List A0R;
    public final Map A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final String A0b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebookpay.form.cell.CellParams, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0Q);
        parcel.writeString(this.A0L);
        parcel.writeParcelable(this.A0D, i);
        parcel.writeString(this.A0N);
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0P);
        parcel.writeParcelable(this.A0E, i);
        parcel.writeInt(this.A0Y ? 1 : 0);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A0B);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A0C);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A0a ? 1 : 0);
        parcel.writeInt(this.A0W ? 1 : 0);
        parcel.writeInt(this.A0X ? 1 : 0);
        parcel.writeInt(this.A0V ? 1 : 0);
        parcel.writeString(this.A0J);
        parcel.writeList(this.A0H);
        parcel.writeString(this.A0b);
        parcel.writeMap(this.A0S);
        parcel.writeInt(this.A0Z ? 1 : 0);
        parcel.writeParcelable(this.A0F, i);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeList(this.A0R);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A0T ? 1 : 0);
        parcel.writeList(this.A0G);
        parcel.writeInt(this.A0U ? 1 : 0);
    }

    public AddressCellParams(Parcel parcel) {
        super(parcel);
        this.A01 = true;
        this.A0I = parcel.readString();
        this.A0K = parcel.readString();
        this.A0M = parcel.readString();
        this.A0Q = parcel.readString();
        this.A0L = parcel.readString();
        this.A0D = (Country) AbstractC37304Gc5.A04(parcel, Country.class);
        this.A0N = parcel.readString();
        this.A0O = parcel.readString();
        this.A0P = parcel.readString();
        AddressFormFieldsConfig addressFormFieldsConfig = (AddressFormFieldsConfig) AbstractC37304Gc5.A04(parcel, AddressFormFieldsConfig.class);
        if (addressFormFieldsConfig != null) {
            this.A0E = addressFormFieldsConfig;
            this.A0Y = AbstractC58320PtC.A1T(parcel);
            this.A05 = parcel.readInt();
            this.A06 = parcel.readInt();
            this.A09 = parcel.readInt();
            this.A0A = parcel.readInt();
            this.A07 = parcel.readInt();
            this.A0B = parcel.readInt();
            this.A03 = parcel.readInt();
            this.A08 = parcel.readInt();
            this.A0C = parcel.readInt();
            this.A04 = parcel.readInt();
            this.A0a = AbstractC58320PtC.A1T(parcel);
            this.A0W = AbstractC58320PtC.A1T(parcel);
            this.A0X = AbstractC58320PtC.A1T(parcel);
            this.A0V = AbstractC58320PtC.A1T(parcel);
            this.A0J = parcel.readString();
            ArrayList arrayList = new ArrayList();
            AbstractC65702TsY.A0z(parcel, Integer.TYPE, arrayList);
            this.A0H = ImmutableList.copyOf((Collection) arrayList);
            this.A0b = parcel.readString();
            HashMap readHashMap = parcel.readHashMap(HashMap.class.getClassLoader());
            this.A0S = readHashMap instanceof Map ? readHashMap : null;
            this.A0Z = AbstractC58320PtC.A1T(parcel);
            this.A0F = (LoggingContext) AbstractC37304Gc5.A04(parcel, LoggingContext.class);
            this.A01 = AbstractC58320PtC.A1T(parcel);
            ArrayList arrayList2 = new ArrayList();
            this.A0R = arrayList2;
            AbstractC65702TsY.A0z(parcel, SelectionShippingAddressItem.class, arrayList2);
            this.A00 = AbstractC58320PtC.A1T(parcel);
            this.A02 = parcel.readInt();
            this.A0T = AbstractC58320PtC.A1T(parcel);
            ArrayList arrayList3 = new ArrayList();
            AbstractC65702TsY.A0z(parcel, Integer.TYPE, arrayList3);
            this.A0G = ImmutableList.copyOf((Collection) arrayList3);
            this.A0U = AbstractC58320PtC.A1T(parcel);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public AddressCellParams(C67662Uuu c67662Uuu) {
        super(c67662Uuu);
        this.A01 = true;
        this.A0I = c67662Uuu.A0G;
        this.A0K = c67662Uuu.A0I;
        this.A0M = c67662Uuu.A0K;
        this.A0Q = null;
        this.A0L = c67662Uuu.A0J;
        this.A0D = c67662Uuu.A0B;
        this.A0N = c67662Uuu.A0L;
        this.A0O = c67662Uuu.A0M;
        this.A0P = c67662Uuu.A0N;
        this.A0E = c67662Uuu.A0C;
        this.A0Y = c67662Uuu.A0X;
        this.A05 = c67662Uuu.A03;
        this.A06 = c67662Uuu.A04;
        this.A09 = c67662Uuu.A07;
        this.A0A = c67662Uuu.A08;
        this.A07 = c67662Uuu.A05;
        this.A0B = c67662Uuu.A09;
        this.A03 = c67662Uuu.A01;
        this.A08 = c67662Uuu.A06;
        this.A0C = c67662Uuu.A0A;
        this.A04 = c67662Uuu.A02;
        this.A0a = c67662Uuu.A0a;
        this.A0W = c67662Uuu.A0V;
        this.A0X = c67662Uuu.A0W;
        this.A0V = c67662Uuu.A0U;
        this.A0J = c67662Uuu.A0H;
        this.A0H = c67662Uuu.A0F;
        this.A0b = c67662Uuu.A0O;
        Map map = c67662Uuu.A0Q;
        this.A0S = map == null ? null : map;
        this.A0Z = c67662Uuu.A0Y;
        this.A0F = c67662Uuu.A0D;
        this.A01 = c67662Uuu.A0Z;
        this.A0R = c67662Uuu.A0P;
        this.A00 = c67662Uuu.A0S;
        this.A02 = c67662Uuu.A00;
        this.A0T = c67662Uuu.A0R;
        this.A0G = c67662Uuu.A0E;
        this.A0U = c67662Uuu.A0T;
    }
}
