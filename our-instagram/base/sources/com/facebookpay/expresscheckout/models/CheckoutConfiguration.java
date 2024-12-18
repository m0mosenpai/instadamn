package com.facebookpay.expresscheckout.models;

import X.AbstractC111324zv;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25230BEn;
import X.AbstractC31179DnN;
import X.AbstractC37302Gc3;
import X.AbstractC65703TsZ;
import X.AbstractC69840VwQ;
import X.C14360o3;
import X.C70221WIe;
import X.EnumC68202VFu;
import X.VD7;
import X.VDD;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes11.dex */
public final class CheckoutConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(36);

    @SerializedName("orientation")
    public final int A00;

    @SerializedName("apmConfiguration")
    public final APMConfiguration A01;

    @SerializedName("nuxBannerType")
    public final EnumC68202VFu A02;

    @SerializedName("puxBannerType")
    public final EnumC68202VFu A03;

    @SerializedName("defaultEmailOptOut")
    public final Boolean A04;

    @SerializedName("enableAnonCheckoutRedesign")
    public final Boolean A05;

    @SerializedName("enableCheckoutOptionality")
    public final Boolean A06;

    @SerializedName("enableMissingBillingOptimization")
    public final Boolean A07;

    @SerializedName("enableRedesignOptimizations")
    public final Boolean A08;

    @SerializedName("enableRedesignPhase2")
    public final Boolean A09;

    @SerializedName("enableRedesignPhase4")
    public final Boolean A0A;

    @SerializedName("isBloksCheckoutAvailable")
    public final Boolean A0B;

    @SerializedName("pickupOptionSupport")
    public final Boolean A0C;

    @SerializedName("fulfillmentType")
    public final Integer A0D;

    @SerializedName("checkoutCTAButtonText")
    public final String A0E;

    @SerializedName("emailOptInUrl")
    public final String A0F;

    @SerializedName("languageLocal")
    public final String A0G;

    @SerializedName("optionalFields")
    public final Set<VDD> A0H;

    @SerializedName("returnFields")
    public final Set<VD7> A0I;

    @SerializedName("fullBillingAddressRequired")
    public final boolean A0J;

    @SerializedName("isCheckoutInFullScreen")
    public final boolean A0K;

    @SerializedName("shouldShowHeaderBranding")
    public final boolean A0L;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutConfiguration) {
                CheckoutConfiguration checkoutConfiguration = (CheckoutConfiguration) obj;
                if (!C14360o3.A0K(this.A0G, checkoutConfiguration.A0G) || !C14360o3.A0K(this.A0H, checkoutConfiguration.A0H) || !C14360o3.A0K(this.A0I, checkoutConfiguration.A0I) || !C14360o3.A0K(this.A0E, checkoutConfiguration.A0E) || this.A0J != checkoutConfiguration.A0J || this.A02 != checkoutConfiguration.A02 || this.A03 != checkoutConfiguration.A03 || !C14360o3.A0K(this.A09, checkoutConfiguration.A09) || !C14360o3.A0K(this.A0A, checkoutConfiguration.A0A) || !C14360o3.A0K(this.A05, checkoutConfiguration.A05) || !C14360o3.A0K(this.A0C, checkoutConfiguration.A0C) || !C14360o3.A0K(this.A01, checkoutConfiguration.A01) || !C14360o3.A0K(this.A0F, checkoutConfiguration.A0F) || !C14360o3.A0K(this.A04, checkoutConfiguration.A04) || !C14360o3.A0K(this.A06, checkoutConfiguration.A06) || this.A0D != checkoutConfiguration.A0D || !C14360o3.A0K(this.A08, checkoutConfiguration.A08) || this.A00 != checkoutConfiguration.A00 || this.A0K != checkoutConfiguration.A0K || !C14360o3.A0K(this.A07, checkoutConfiguration.A07) || this.A0L != checkoutConfiguration.A0L || !C14360o3.A0K(this.A0B, checkoutConfiguration.A0B)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A0G);
        Iterator A0h = AbstractC37302Gc3.A0h(parcel, this.A0H);
        while (A0h.hasNext()) {
            AbstractC166997dE.A1I(parcel, (VDD) A0h.next());
        }
        Iterator A0h2 = AbstractC37302Gc3.A0h(parcel, this.A0I);
        while (A0h2.hasNext()) {
            AbstractC166997dE.A1I(parcel, (VD7) A0h2.next());
        }
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A0J ? 1 : 0);
        AbstractC65703TsZ.A1H(parcel, this.A02);
        AbstractC65703TsZ.A1H(parcel, this.A03);
        AbstractC31179DnN.A0p(parcel, this.A09);
        AbstractC31179DnN.A0p(parcel, this.A0A);
        AbstractC31179DnN.A0p(parcel, this.A05);
        AbstractC31179DnN.A0p(parcel, this.A0C);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A0F);
        AbstractC31179DnN.A0p(parcel, this.A04);
        AbstractC31179DnN.A0p(parcel, this.A06);
        Integer num = this.A0D;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(AbstractC69840VwQ.A01(num));
        }
        AbstractC31179DnN.A0p(parcel, this.A08);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0K ? 1 : 0);
        AbstractC31179DnN.A0p(parcel, this.A07);
        parcel.writeInt(this.A0L ? 1 : 0);
        AbstractC31179DnN.A0p(parcel, this.A0B);
    }

    public CheckoutConfiguration(APMConfiguration aPMConfiguration, EnumC68202VFu enumC68202VFu, EnumC68202VFu enumC68202VFu2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Integer num, String str, String str2, String str3, Set set, Set set2, int i, boolean z, boolean z2, boolean z3) {
        AbstractC167017dG.A1R(set, set2);
        this.A0G = str;
        this.A0H = set;
        this.A0I = set2;
        this.A0E = str2;
        this.A0J = z;
        this.A02 = enumC68202VFu;
        this.A03 = enumC68202VFu2;
        this.A09 = bool;
        this.A0A = bool2;
        this.A05 = bool3;
        this.A0C = bool4;
        this.A01 = aPMConfiguration;
        this.A0F = str3;
        this.A04 = bool5;
        this.A06 = bool6;
        this.A0D = num;
        this.A08 = bool7;
        this.A00 = i;
        this.A0K = z2;
        this.A07 = bool8;
        this.A0L = z3;
        this.A0B = bool9;
    }

    public final int hashCode() {
        int A0C;
        int i = 0;
        int A0D = (((((((((((((((((((AbstractC167007dF.A0D(this.A0J, (AbstractC166997dE.A0J(this.A0I, AbstractC166997dE.A0J(this.A0H, AbstractC167017dG.A0O(this.A0G) * 31)) + AbstractC167017dG.A0O(this.A0E)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0M(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A0C)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A0F)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31;
        Integer num = this.A0D;
        if (num == null) {
            A0C = 0;
        } else {
            A0C = AbstractC25230BEn.A0C(num, AbstractC69840VwQ.A01(num));
        }
        int A0D2 = AbstractC167007dF.A0D(this.A0L, (AbstractC167007dF.A0D(this.A0K, (((((A0D + A0C) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + this.A00) * 31) + AbstractC167017dG.A0M(this.A07)) * 31);
        Boolean bool = this.A0B;
        if (bool != null) {
            i = bool.hashCode();
        }
        return A0D2 + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("CheckoutConfiguration(languageLocal=");
        sb.append(this.A0G);
        sb.append(", optionalFields=");
        sb.append(this.A0H);
        sb.append(", returnFields=");
        sb.append(this.A0I);
        sb.append(", checkoutCTAButtonText=");
        sb.append(this.A0E);
        sb.append(", fullBillingAddressRequired=");
        sb.append(this.A0J);
        sb.append(", nuxBannerType=");
        sb.append(this.A02);
        sb.append(", puxBannerType=");
        sb.append(this.A03);
        sb.append(", enableRedesignPhase2=");
        sb.append(this.A09);
        sb.append(", enableRedesignPhase4=");
        sb.append(this.A0A);
        sb.append(", enableAnonCheckoutRedesign=");
        sb.append(this.A05);
        sb.append(", pickupOptionSupport=");
        sb.append(this.A0C);
        sb.append(", apmConfiguration=");
        sb.append(this.A01);
        sb.append(", emailOptInUrl=");
        sb.append(this.A0F);
        sb.append(", defaultEmailOptOut=");
        sb.append(this.A04);
        sb.append(", enableCheckoutOptionality=");
        sb.append(this.A06);
        sb.append(", fulfillmentType=");
        Integer num = this.A0D;
        if (num != null) {
            str = AbstractC69840VwQ.A01(num);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", enableRedesignOptimizations=");
        sb.append(this.A08);
        sb.append(AbstractC111324zv.A00(281));
        sb.append(this.A00);
        sb.append(", isCheckoutInFullScreen=");
        sb.append(this.A0K);
        sb.append(", enableMissingBillingOptimization=");
        sb.append(this.A07);
        sb.append(", shouldShowHeaderBranding=");
        sb.append(this.A0L);
        sb.append(", isBloksCheckoutAvailable=");
        return AbstractC167017dG.A0o(this.A0B, sb);
    }
}
