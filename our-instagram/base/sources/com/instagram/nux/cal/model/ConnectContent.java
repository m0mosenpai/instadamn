package com.instagram.nux.cal.model;

import X.AbstractC25231BEo;
import X.C40781ul;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class ConnectContent extends C40781ul implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C41856IgA(89);
    public ImageUrl A00;
    public FXCalAgeRestrictionScreenContent A01;
    public FxAccountInfo A02;
    public FxAccountInfo A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public List A0I;
    public List A0J;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.instagram.nux.cal.model.SignupContent, java.lang.Object] */
    public final SignupContent A00() {
        String str = this.A0C;
        List list = this.A0I;
        String str2 = this.A0A;
        String str3 = this.A0B;
        String str4 = this.A0F;
        String str5 = this.A0G;
        String str6 = this.A0E;
        String str7 = this.A0H;
        ?? obj = new Object();
        obj.A07 = list;
        obj.A02 = str;
        obj.A00 = str2;
        obj.A01 = str3;
        obj.A04 = str4;
        obj.A05 = str5;
        obj.A03 = str6;
        obj.A06 = str7;
        return obj;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0C);
        parcel.writeInt(AbstractC25231BEo.A0I(this.A0I));
        List list = this.A0I;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((ContentText) it.next(), 0);
            }
        }
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A04);
        parcel.writeInt(AbstractC25231BEo.A0I(this.A0J));
        List list2 = this.A0J;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable((FxAccountInfo) it2.next(), 0);
            }
        }
        parcel.writeParcelable(this.A01, 0);
        parcel.writeParcelable(this.A03, 0);
        parcel.writeParcelable(this.A02, 0);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0H);
    }
}
