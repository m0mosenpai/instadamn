package com.facebookpay.form.cell.creditcard;

import X.AbstractC001800i;
import X.AbstractC37304Gc5;
import X.AbstractC58320PtC;
import X.AbstractC65702TsY;
import X.C14360o3;
import X.C67658Uuq;
import X.C70221WIe;
import X.EnumC61219RhJ;
import X.EnumC68132VCq;
import X.VD0;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.cell.address.AddressCellParams;
import com.facebookpay.form.model.CardFormFieldConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class CreditCardCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = new C70221WIe(74);
    public boolean A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final VD0 A04;
    public final AddressCellParams A05;
    public final EnumC68132VCq A06;
    public final CardFormFieldConfig A07;
    public final EnumC61219RhJ A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final List A0G;
    public final List A0H;
    public final Map A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;

    public CreditCardCellParams(Parcel parcel) {
        super(parcel);
        Enum valueOf;
        Enum valueOf2;
        Enum valueOf3;
        this.A00 = true;
        this.A09 = parcel.readString();
        this.A0E = parcel.readString();
        this.A0D = parcel.readString();
        this.A0F = parcel.readString();
        this.A0A = parcel.readString();
        this.A0C = parcel.readString();
        this.A0B = parcel.readString();
        String readString = parcel.readString();
        if (readString == null) {
            valueOf = null;
        } else {
            valueOf = Enum.valueOf(EnumC61219RhJ.class, readString);
        }
        this.A08 = (EnumC61219RhJ) valueOf;
        ArrayList arrayList = new ArrayList();
        AbstractC65702TsY.A0z(parcel, EnumC61219RhJ.class, arrayList);
        this.A0G = AbstractC001800i.A0a(arrayList);
        ArrayList arrayList2 = new ArrayList();
        AbstractC65702TsY.A0z(parcel, Integer.TYPE, arrayList2);
        this.A0H = AbstractC001800i.A0a(arrayList2);
        this.A0N = AbstractC58320PtC.A1T(parcel);
        this.A0M = AbstractC58320PtC.A1T(parcel);
        this.A00 = AbstractC58320PtC.A1T(parcel);
        HashMap readHashMap = parcel.readHashMap(HashMap.class.getClassLoader());
        this.A0I = readHashMap instanceof Map ? readHashMap : null;
        this.A02 = parcel.readInt();
        String readString2 = parcel.readString();
        if (readString2 == null) {
            valueOf2 = null;
        } else {
            valueOf2 = Enum.valueOf(EnumC68132VCq.class, readString2);
        }
        EnumC68132VCq enumC68132VCq = (EnumC68132VCq) valueOf2;
        this.A06 = enumC68132VCq == null ? EnumC68132VCq.A03 : enumC68132VCq;
        this.A0K = AbstractC58320PtC.A1T(parcel);
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A05 = (AddressCellParams) AbstractC37304Gc5.A04(parcel, AddressCellParams.class);
        String readString3 = parcel.readString();
        if (readString3 == null) {
            valueOf3 = null;
        } else {
            valueOf3 = Enum.valueOf(VD0.class, readString3);
        }
        this.A04 = (VD0) valueOf3;
        this.A0L = AbstractC58320PtC.A1T(parcel);
        this.A07 = (CardFormFieldConfig) AbstractC37304Gc5.A04(parcel, CardFormFieldConfig.class);
        this.A0J = AbstractC58320PtC.A1T(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebookpay.form.cell.CellParams, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String name;
        String name2;
        String name3;
        C14360o3.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0B);
        EnumC61219RhJ enumC61219RhJ = this.A08;
        if (enumC61219RhJ == null) {
            name = null;
        } else {
            name = enumC61219RhJ.name();
        }
        parcel.writeString(name);
        parcel.writeList(this.A0G);
        parcel.writeList(this.A0H);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeMap(this.A0I);
        parcel.writeInt(this.A02);
        EnumC68132VCq enumC68132VCq = this.A06;
        if (enumC68132VCq == null) {
            name2 = null;
        } else {
            name2 = enumC68132VCq.name();
        }
        parcel.writeString(name2);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeParcelable(this.A05, i);
        VD0 vd0 = this.A04;
        if (vd0 == null) {
            name3 = null;
        } else {
            name3 = vd0.name();
        }
        parcel.writeString(name3);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeParcelable(this.A07, i);
        parcel.writeInt(this.A0J ? 1 : 0);
    }

    public CreditCardCellParams(C67658Uuq c67658Uuq) {
        super(c67658Uuq);
        this.A00 = true;
        this.A09 = c67658Uuq.A0A;
        this.A0E = c67658Uuq.A0F;
        this.A0D = c67658Uuq.A0E;
        this.A0F = c67658Uuq.A0G;
        this.A0A = c67658Uuq.A0B;
        this.A0C = c67658Uuq.A0D;
        this.A0B = c67658Uuq.A0C;
        this.A08 = c67658Uuq.A07;
        this.A0G = c67658Uuq.A08;
        this.A0H = c67658Uuq.A09;
        this.A0N = c67658Uuq.A0M;
        this.A0M = c67658Uuq.A0L;
        this.A00 = c67658Uuq.A0N;
        this.A0I = c67658Uuq.A0H;
        this.A02 = c67658Uuq.A00;
        this.A06 = c67658Uuq.A05;
        this.A0K = c67658Uuq.A0J;
        this.A01 = c67658Uuq.A02;
        this.A03 = c67658Uuq.A01;
        this.A05 = c67658Uuq.A04;
        this.A04 = c67658Uuq.A03;
        this.A0L = c67658Uuq.A0K;
        this.A07 = c67658Uuq.A06;
        this.A0J = c67658Uuq.A0I;
    }
}
