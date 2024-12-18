package com.instagram.leadgen.core.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25233BEq;
import X.AbstractC31181DnP;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import X.VEF;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class LeadGenFormBaseQuestion extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(17);
    public String A00;
    public boolean A01;
    public final int A02;
    public final VEF A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;
    public final List A0D;
    public final List A0E;
    public final List A0F;
    public final Map A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final String A0K;

    public LeadGenFormBaseQuestion(VEF vef, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, List list2, List list3, List list4, Map map, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC25233BEq.A0w(2, str2, vef, list);
        AbstractC167007dF.A1I(str3, 7, str4);
        this.A06 = str;
        this.A0A = str2;
        this.A03 = vef;
        this.A0D = list;
        this.A04 = num;
        this.A0C = list2;
        this.A09 = str3;
        this.A00 = str4;
        this.A05 = str5;
        this.A08 = str6;
        this.A0J = z;
        this.A0H = z2;
        this.A0G = map;
        this.A01 = z3;
        this.A0F = list3;
        this.A07 = str7;
        this.A0K = str8;
        this.A02 = i;
        this.A0B = str9;
        this.A0E = list4;
        this.A0I = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenFormBaseQuestion) {
                LeadGenFormBaseQuestion leadGenFormBaseQuestion = (LeadGenFormBaseQuestion) obj;
                if (!C14360o3.A0K(this.A06, leadGenFormBaseQuestion.A06) || !C14360o3.A0K(this.A0A, leadGenFormBaseQuestion.A0A) || this.A03 != leadGenFormBaseQuestion.A03 || !C14360o3.A0K(this.A0D, leadGenFormBaseQuestion.A0D) || !C14360o3.A0K(this.A04, leadGenFormBaseQuestion.A04) || !C14360o3.A0K(this.A0C, leadGenFormBaseQuestion.A0C) || !C14360o3.A0K(this.A09, leadGenFormBaseQuestion.A09) || !C14360o3.A0K(this.A00, leadGenFormBaseQuestion.A00) || !C14360o3.A0K(this.A05, leadGenFormBaseQuestion.A05) || !C14360o3.A0K(this.A08, leadGenFormBaseQuestion.A08) || this.A0J != leadGenFormBaseQuestion.A0J || this.A0H != leadGenFormBaseQuestion.A0H || !C14360o3.A0K(this.A0G, leadGenFormBaseQuestion.A0G) || this.A01 != leadGenFormBaseQuestion.A01 || !C14360o3.A0K(this.A0F, leadGenFormBaseQuestion.A0F) || !C14360o3.A0K(this.A07, leadGenFormBaseQuestion.A07) || !C14360o3.A0K(this.A0K, leadGenFormBaseQuestion.A0K) || this.A02 != leadGenFormBaseQuestion.A02 || !C14360o3.A0K(this.A0B, leadGenFormBaseQuestion.A0B) || !C14360o3.A0K(this.A0E, leadGenFormBaseQuestion.A0E) || this.A0I != leadGenFormBaseQuestion.A0I) {
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
        AbstractC166997dE.A1I(parcel, this.A03);
        parcel.writeStringList(this.A0D);
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A04));
        parcel.writeStringList(this.A0C);
        parcel.writeString(this.A09);
        parcel.writeString(this.A00);
        parcel.writeString(this.A05);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        Iterator A0s = AbstractC167017dG.A0s(parcel, this.A0G);
        while (A0s.hasNext()) {
            ((LeadGenConditionalAnswerInfo) AbstractC167027dH.A0O(parcel, A0s)).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeStringList(this.A0F);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0K);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A0B);
        parcel.writeStringList(this.A0E);
        parcel.writeInt(this.A0I ? 1 : 0);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0I, (((((((((((AbstractC167007dF.A0D(this.A01, AbstractC166997dE.A0J(this.A0G, AbstractC167007dF.A0D(this.A0H, AbstractC167007dF.A0D(this.A0J, (((AbstractC166997dE.A0K(this.A00, AbstractC166997dE.A0K(this.A09, (((AbstractC166997dE.A0J(this.A0D, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0K(this.A0A, AbstractC167017dG.A0O(this.A06) * 31))) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A0C)) * 31)) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31)))) + AbstractC167017dG.A0M(this.A0F)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A0K)) * 31) + this.A02) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC166997dE.A0I(this.A0E)) * 31);
    }
}
