package com.instagram.leadgen.organic.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import X.EnumC53251Ngp;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class LeadGenFormData extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(29);
    public ImageUrl A00;
    public EnumC53251Ngp A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public ArrayList A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    public LeadGenFormData(ImageUrl imageUrl, EnumC53251Ngp enumC53251Ngp, String str, String str2, String str3, String str4, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC167027dH.A0a(1, enumC53251Ngp, str, str2, str3);
        this.A01 = enumC53251Ngp;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = str4;
        this.A00 = imageUrl;
        this.A08 = z;
        this.A09 = z2;
        this.A07 = z3;
        this.A0A = z4;
        this.A06 = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenFormData) {
                LeadGenFormData leadGenFormData = (LeadGenFormData) obj;
                if (this.A01 != leadGenFormData.A01 || !C14360o3.A0K(this.A03, leadGenFormData.A03) || !C14360o3.A0K(this.A04, leadGenFormData.A04) || !C14360o3.A0K(this.A05, leadGenFormData.A05) || !C14360o3.A0K(this.A02, leadGenFormData.A02) || !C14360o3.A0K(this.A00, leadGenFormData.A00) || this.A08 != leadGenFormData.A08 || this.A09 != leadGenFormData.A09 || this.A07 != leadGenFormData.A07 || this.A0A != leadGenFormData.A0A || !C14360o3.A0K(this.A06, leadGenFormData.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        ArrayList arrayList = this.A06;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((LeadFormCustomQuestion) it.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A06, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A08, (((AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0G(this.A01)))) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A00)) * 31)))));
    }
}
