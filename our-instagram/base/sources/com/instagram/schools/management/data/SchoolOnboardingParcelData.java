package com.instagram.schools.management.data;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.AbstractC25233BEq;
import X.C0T6;
import X.C14360o3;
import X.C37324GcR;
import X.C75;
import X.EnumC27383C6m;
import X.EnumC27395C6y;
import X.EnumC27396C6z;
import X.EnumC39642HiX;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class SchoolOnboardingParcelData extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(55);
    public final EnumC39642HiX A00;
    public final EnumC27395C6y A01;
    public final EnumC27396C6z A02;
    public final EnumC27383C6m A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;
    public final List A0D;
    public final List A0E;
    public final boolean A0F;
    public final boolean A0G;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SchoolOnboardingParcelData) {
                SchoolOnboardingParcelData schoolOnboardingParcelData = (SchoolOnboardingParcelData) obj;
                if (!C14360o3.A0K(this.A06, schoolOnboardingParcelData.A06) || !C14360o3.A0K(this.A0A, schoolOnboardingParcelData.A0A) || this.A02 != schoolOnboardingParcelData.A02 || !C14360o3.A0K(this.A04, schoolOnboardingParcelData.A04) || !C14360o3.A0K(this.A05, schoolOnboardingParcelData.A05) || !C14360o3.A0K(this.A0D, schoolOnboardingParcelData.A0D) || !C14360o3.A0K(this.A0E, schoolOnboardingParcelData.A0E) || !C14360o3.A0K(this.A09, schoolOnboardingParcelData.A09) || !C14360o3.A0K(this.A08, schoolOnboardingParcelData.A08) || !C14360o3.A0K(this.A07, schoolOnboardingParcelData.A07) || this.A0F != schoolOnboardingParcelData.A0F || this.A01 != schoolOnboardingParcelData.A01 || this.A03 != schoolOnboardingParcelData.A03 || this.A0G != schoolOnboardingParcelData.A0G || !C14360o3.A0K(this.A0B, schoolOnboardingParcelData.A0B) || this.A00 != schoolOnboardingParcelData.A00 || !C14360o3.A0K(this.A0C, schoolOnboardingParcelData.A0C)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0A);
        EnumC27396C6z enumC27396C6z = this.A02;
        if (enumC27396C6z == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AbstractC166997dE.A1I(parcel, enumC27396C6z);
        }
        AbstractC167027dH.A0o(parcel, this.A04, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A05, 0, 1);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A0D);
        while (A0u.hasNext()) {
            ((SchoolInfo) A0u.next()).writeToParcel(parcel, i);
        }
        Iterator A0u2 = AbstractC25231BEo.A0u(parcel, this.A0E);
        while (A0u2.hasNext()) {
            ((SchoolInfo) A0u2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A0F ? 1 : 0);
        EnumC27395C6y enumC27395C6y = this.A01;
        if (enumC27395C6y == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AbstractC166997dE.A1I(parcel, enumC27395C6y);
        }
        AbstractC166997dE.A1I(parcel, this.A03);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeString(this.A0B);
        AbstractC166997dE.A1I(parcel, this.A00);
        Iterator A0u3 = AbstractC25231BEo.A0u(parcel, this.A0C);
        while (A0u3.hasNext()) {
            AbstractC166997dE.A1I(parcel, (C75) A0u3.next());
        }
    }

    public SchoolOnboardingParcelData(EnumC39642HiX enumC39642HiX, EnumC27395C6y enumC27395C6y, EnumC27396C6z enumC27396C6z, EnumC27383C6m enumC27383C6m, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, boolean z, boolean z2) {
        AbstractC167017dG.A1U(list, list2);
        AbstractC25229BEm.A1M(str4, 9, enumC27383C6m);
        AbstractC25233BEq.A0z(15, str6, enumC39642HiX, list3);
        this.A06 = str;
        this.A0A = str2;
        this.A02 = enumC27396C6z;
        this.A04 = num;
        this.A05 = num2;
        this.A0D = list;
        this.A0E = list2;
        this.A09 = str3;
        this.A08 = str4;
        this.A07 = str5;
        this.A0F = z;
        this.A01 = enumC27395C6y;
        this.A03 = enumC27383C6m;
        this.A0G = z2;
        this.A0B = str6;
        this.A00 = enumC39642HiX;
        this.A0C = list3;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A0C, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A0B, AbstractC167007dF.A0D(this.A0G, AbstractC166997dE.A0J(this.A03, (AbstractC167007dF.A0D(this.A0F, (AbstractC166997dE.A0K(this.A08, (AbstractC166997dE.A0J(this.A0E, AbstractC166997dE.A0J(this.A0D, ((((((((AbstractC167017dG.A0O(this.A06) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31)) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC166997dE.A0I(this.A01)) * 31)))));
    }
}
