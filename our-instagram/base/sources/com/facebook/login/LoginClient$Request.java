package com.facebook.login;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC31171DnF;
import X.AbstractC58320PtC;
import X.C63473SlE;
import X.EnumC61140Rfu;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes10.dex */
public class LoginClient$Request implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(42);
    public EnumC61140Rfu A00;
    public String A01;
    public boolean A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Set A06;
    public final boolean A07;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(AbstractC166987dD.A1F(this.A06));
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
        AbstractC166997dE.A1I(parcel, this.A00);
    }

    public LoginClient$Request(Parcel parcel) {
        EnumC61140Rfu enumC61140Rfu;
        this.A01 = null;
        this.A02 = false;
        this.A00 = null;
        ArrayList A1E = AbstractC166987dD.A1E();
        parcel.readStringList(A1E);
        this.A06 = AbstractC31171DnF.A0k(A1E);
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A07 = AbstractC167007dF.A1M(parcel.readByte());
        this.A05 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = AbstractC58320PtC.A1V(parcel);
        String readString = parcel.readString();
        if (readString != null) {
            enumC61140Rfu = EnumC61140Rfu.valueOf(readString);
        } else {
            enumC61140Rfu = EnumC61140Rfu.A0A;
        }
        this.A00 = enumC61140Rfu;
    }

    public LoginClient$Request(String str, String str2, String str3, Set set) {
        this.A01 = null;
        this.A02 = false;
        this.A00 = null;
        this.A06 = set;
        this.A03 = str;
        this.A04 = str2;
        this.A07 = false;
        this.A05 = str3;
    }
}
