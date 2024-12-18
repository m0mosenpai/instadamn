package com.instagram.model.androidlink;

import X.AbstractC37396Gdc;
import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import X.C41177IKq;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes2.dex */
public final class AndroidLinkImpl extends C0T6 implements AndroidLink, Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(99);
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;

    @Override // com.instagram.model.androidlink.AndroidLink
    public final AndroidLinkImpl F53() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AndroidLinkImpl) {
                AndroidLinkImpl androidLinkImpl = (AndroidLinkImpl) obj;
                if (!C14360o3.A0K(this.A08, androidLinkImpl.A08) || !C14360o3.A0K(this.A09, androidLinkImpl.A09) || !C14360o3.A0K(this.A04, androidLinkImpl.A04) || !C14360o3.A0K(this.A0A, androidLinkImpl.A0A) || !C14360o3.A0K(this.A0B, androidLinkImpl.A0B) || !C14360o3.A0K(this.A0C, androidLinkImpl.A0C) || !C14360o3.A0K(this.A0D, androidLinkImpl.A0D) || !C14360o3.A0K(this.A0E, androidLinkImpl.A0E) || !C14360o3.A0K(this.A0F, androidLinkImpl.A0F) || !C14360o3.A0K(this.A0G, androidLinkImpl.A0G) || !C14360o3.A0K(this.A0H, androidLinkImpl.A0H) || !C14360o3.A0K(this.A05, androidLinkImpl.A05) || !C14360o3.A0K(this.A0I, androidLinkImpl.A0I) || !C14360o3.A0K(this.A00, androidLinkImpl.A00) || !C14360o3.A0K(this.A01, androidLinkImpl.A01) || !C14360o3.A0K(this.A02, androidLinkImpl.A02) || !C14360o3.A0K(this.A03, androidLinkImpl.A03) || !C14360o3.A0K(this.A0J, androidLinkImpl.A0J) || !C14360o3.A0K(this.A06, androidLinkImpl.A06) || !C14360o3.A0K(this.A07, androidLinkImpl.A07) || !C14360o3.A0K(this.A0K, androidLinkImpl.A0K) || !C14360o3.A0K(this.A0L, androidLinkImpl.A0L) || !C14360o3.A0K(this.A0M, androidLinkImpl.A0M) || !C14360o3.A0K(this.A0N, androidLinkImpl.A0N) || !C14360o3.A0K(this.A0O, androidLinkImpl.A0O) || !C14360o3.A0K(this.A0P, androidLinkImpl.A0P) || !C14360o3.A0K(this.A0Q, androidLinkImpl.A0Q)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A08;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A09;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.A04;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.A0A;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A0B;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0C;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A0D;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A0E;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.A0F;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.A0G;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.A0H;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num2 = this.A05;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str11 = this.A0I;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool = this.A00;
        int hashCode14 = (hashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A01;
        int hashCode15 = (hashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A02;
        int hashCode16 = (hashCode15 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.A03;
        int hashCode17 = (hashCode16 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str12 = this.A0J;
        int hashCode18 = (hashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num3 = this.A06;
        int hashCode19 = (hashCode18 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str13 = this.A07;
        int hashCode20 = (hashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.A0K;
        int hashCode21 = (hashCode20 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.A0L;
        int hashCode22 = (hashCode21 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.A0M;
        int hashCode23 = (hashCode22 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.A0N;
        int hashCode24 = (hashCode23 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.A0O;
        int hashCode25 = (hashCode24 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.A0P;
        int hashCode26 = (hashCode25 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.A0Q;
        return hashCode26 + (str20 != null ? str20.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        Integer num = this.A04;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0H);
        Integer num2 = this.A05;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.A0I);
        Boolean bool = this.A00;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.A01;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.A02;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.A03;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.A0J);
        Integer num3 = this.A06;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.A07);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0N);
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A0Q);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final /* bridge */ /* synthetic */ C41177IKq AKl() {
        return new C41177IKq(this);
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String Abj() {
        return this.A08;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String AcH() {
        return this.A09;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final Integer AcK() {
        return this.A04;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String Ajo() {
        return this.A0B;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String AlR() {
        return this.A0C;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String AlS() {
        return this.A0D;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String Ar1() {
        return this.A0E;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String Aw8() {
        return this.A0F;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String Ax1() {
        return this.A0G;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String B9G() {
        return this.A0H;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final Integer B9H() {
        return this.A05;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String BGG() {
        return this.A0I;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String BMm() {
        return this.A0J;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final Integer BNX() {
        return this.A06;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String Bdp() {
        return this.A0K;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String BhG() {
        return this.A0L;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String Bka() {
        return this.A0M;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String BlN() {
        return this.A0N;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String Bm5() {
        return this.A0O;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String C5F() {
        return this.A0P;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String CHN() {
        return this.A0Q;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String CIt() {
        return this.A07;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final Boolean CPt() {
        return this.A00;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final Boolean CcE() {
        return this.A01;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final Boolean Cf2() {
        return this.A02;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final Boolean Cg8() {
        return this.A03;
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAdLink", AbstractC37396Gdc.A00(this));
    }

    @Override // com.instagram.model.androidlink.AndroidLink
    public final String getAppName() {
        return this.A0A;
    }

    public AndroidLinkImpl(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20) {
        this.A08 = str;
        this.A09 = str2;
        this.A04 = num;
        this.A0A = str3;
        this.A0B = str4;
        this.A0C = str5;
        this.A0D = str6;
        this.A0E = str7;
        this.A0F = str8;
        this.A0G = str9;
        this.A0H = str10;
        this.A05 = num2;
        this.A0I = str11;
        this.A00 = bool;
        this.A01 = bool2;
        this.A02 = bool3;
        this.A03 = bool4;
        this.A0J = str12;
        this.A06 = num3;
        this.A07 = str13;
        this.A0K = str14;
        this.A0L = str15;
        this.A0M = str16;
        this.A0N = str17;
        this.A0O = str18;
        this.A0P = str19;
        this.A0Q = str20;
    }
}
