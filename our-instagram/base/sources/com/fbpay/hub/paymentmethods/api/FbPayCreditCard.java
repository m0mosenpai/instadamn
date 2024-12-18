package com.fbpay.hub.paymentmethods.api;

import X.AbstractC25235BEs;
import X.AbstractC31179DnN;
import X.AbstractC37302Gc3;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58322PtE;
import X.AbstractC58323PtF;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C1LC;
import X.C63470SlB;
import X.EnumC61219RhJ;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.fbpay.hub.contactinfo.address.api.FBPayAddress;
import com.google.common.collect.ImmutableList;

/* loaded from: classes10.dex */
public class FbPayCreditCard implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(34);
    public final FBPayAddress A00;
    public final EnumC61219RhJ A01;
    public final ImmutableList A02;
    public final Boolean A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;
    public final FbPayPaymentDefaultInfo A0G;
    public final String A0H;
    public final boolean A0I;
    public final boolean A0J;

    public FbPayCreditCard(FBPayAddress fBPayAddress, EnumC61219RhJ enumC61219RhJ, ImmutableList immutableList, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.A00 = fBPayAddress;
        this.A02 = immutableList;
        this.A0H = null;
        AbstractC63311ShH.A04(enumC61219RhJ, "cardType");
        this.A01 = enumC61219RhJ;
        this.A04 = str;
        this.A05 = str2;
        AbstractC63311ShH.A04(str3, "credentialId");
        this.A06 = str3;
        AbstractC63311ShH.A04(str4, "expireMonth");
        this.A07 = str4;
        AbstractC63311ShH.A04(str5, "expireYear");
        this.A08 = str5;
        AbstractC63311ShH.A04(str6, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        this.A09 = str6;
        this.A03 = bool;
        this.A0I = false;
        this.A0F = false;
        this.A0J = false;
        AbstractC63311ShH.A04(str7, "lastFourDigits");
        this.A0A = str7;
        this.A0B = str8;
        this.A0C = str9;
        this.A0D = str10;
        this.A0G = null;
        this.A0E = str11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayCreditCard) {
                FbPayCreditCard fbPayCreditCard = (FbPayCreditCard) obj;
                if (!C14360o3.A0K(this.A00, fbPayCreditCard.A00) || !C14360o3.A0K(this.A02, fbPayCreditCard.A02) || !C14360o3.A0K(this.A0H, fbPayCreditCard.A0H) || this.A01 != fbPayCreditCard.A01 || !C14360o3.A0K(this.A04, fbPayCreditCard.A04) || !C14360o3.A0K(this.A05, fbPayCreditCard.A05) || !C14360o3.A0K(this.A06, fbPayCreditCard.A06) || !C14360o3.A0K(this.A07, fbPayCreditCard.A07) || !C14360o3.A0K(this.A08, fbPayCreditCard.A08) || !C14360o3.A0K(this.A09, fbPayCreditCard.A09) || !C14360o3.A0K(this.A03, fbPayCreditCard.A03) || this.A0I != fbPayCreditCard.A0I || this.A0F != fbPayCreditCard.A0F || this.A0J != fbPayCreditCard.A0J || !C14360o3.A0K(this.A0A, fbPayCreditCard.A0A) || !C14360o3.A0K(this.A0B, fbPayCreditCard.A0B) || !C14360o3.A0K(this.A0C, fbPayCreditCard.A0C) || !C14360o3.A0K(this.A0D, fbPayCreditCard.A0D) || !C14360o3.A0K(this.A0G, fbPayCreditCard.A0G) || !C14360o3.A0K(this.A0E, fbPayCreditCard.A0E)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int ordinal;
        int A02 = (((AbstractC63311ShH.A02(this.A00) * 31) + AbstractC25235BEs.A06(this.A02)) * 31) + AbstractC25235BEs.A06(this.A0H);
        EnumC61219RhJ enumC61219RhJ = this.A01;
        if (enumC61219RhJ == null) {
            ordinal = -1;
        } else {
            ordinal = enumC61219RhJ.ordinal();
        }
        return (((((((((((((((((((((((((((((((((A02 * 31) + ordinal) * 31) + AbstractC25235BEs.A06(this.A04)) * 31) + AbstractC25235BEs.A06(this.A05)) * 31) + AbstractC25235BEs.A06(this.A06)) * 31) + AbstractC25235BEs.A06(this.A07)) * 31) + AbstractC25235BEs.A06(this.A08)) * 31) + AbstractC25235BEs.A06(this.A09)) * 31) + AbstractC25235BEs.A06(this.A03)) * 31) + AbstractC58322PtE.A02(this.A0I ? 1 : 0)) * 31) + AbstractC58322PtE.A02(this.A0F ? 1 : 0)) * 31) + AbstractC58322PtE.A02(this.A0J ? 1 : 0)) * 31) + AbstractC25235BEs.A06(this.A0A)) * 31) + AbstractC25235BEs.A06(this.A0B)) * 31) + AbstractC25235BEs.A06(this.A0C)) * 31) + AbstractC25235BEs.A06(this.A0D)) * 31) + AbstractC25235BEs.A06(this.A0G)) * 31) + AbstractC25235BEs.A06(this.A0E);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        FBPayAddress fBPayAddress = this.A00;
        if (fBPayAddress == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fBPayAddress.writeToParcel(parcel, i);
        }
        ImmutableList immutableList = this.A02;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C1LC A0d = AbstractC58322PtE.A0d(parcel, immutableList);
            while (A0d.hasNext()) {
                AbstractC37302Gc3.A0p(parcel, A0d);
            }
        }
        AbstractC58322PtE.A1E(parcel, this.A0H, 0, 1);
        parcel.writeInt(this.A01.ordinal());
        AbstractC58322PtE.A1E(parcel, this.A04, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A05, 0, 1);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        AbstractC31179DnN.A0p(parcel, this.A03);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeString(this.A0A);
        AbstractC58322PtE.A1E(parcel, this.A0B, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A0C, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A0D, 0, 1);
        AbstractC58323PtF.A1A(parcel, this.A0G, i);
        AbstractC58322PtE.A1E(parcel, this.A0E, 0, 1);
    }

    public FbPayCreditCard(Parcel parcel) {
        ClassLoader A0g = AbstractC58319PtB.A0g(this);
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (FBPayAddress) FBPayAddress.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            for (int i = 0; i < readInt; i++) {
                strArr[i] = parcel.readString();
            }
            this.A02 = ImmutableList.copyOf(strArr);
        }
        if (parcel.readInt() == 0) {
            this.A0H = null;
        } else {
            this.A0H = parcel.readString();
        }
        this.A01 = EnumC61219RhJ.values()[parcel.readInt()];
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = Boolean.valueOf(AbstractC58320PtC.A1U(parcel));
        }
        this.A0I = AbstractC58320PtC.A1U(parcel);
        this.A0F = AbstractC58320PtC.A1U(parcel);
        this.A0J = AbstractC58320PtC.A1V(parcel);
        this.A0A = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = parcel.readString();
        }
        this.A0G = parcel.readInt() != 0 ? (FbPayPaymentDefaultInfo) parcel.readParcelable(A0g) : null;
        this.A0E = AbstractC58322PtE.A0n(parcel);
    }
}
