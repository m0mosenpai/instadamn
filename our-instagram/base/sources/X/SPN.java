package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes10.dex */
public final class SPN {

    @SerializedName("auth_factor_type")
    public final String A00;

    @SerializedName("connect_url")
    public final String A01;

    @SerializedName("cred_id")
    public final String A02;

    @SerializedName("hidden_email")
    public final String A03;

    @SerializedName("nonce")
    public final String A04;

    @SerializedName("three_ds_url")
    public final String A05;

    @SerializedName(DialogModule.KEY_TITLE)
    public final String A06;

    @SerializedName("auth_amount")
    public final C62992SaG A07;

    @SerializedName("billing_agreement_type")
    public final String A08;

    @SerializedName("email")
    public final String A09;

    public SPN(C62992SaG c62992SaG, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        C14360o3.A0B(str6, 6);
        this.A01 = str;
        this.A02 = str2;
        this.A09 = str3;
        this.A03 = str4;
        this.A06 = str5;
        this.A00 = str6;
        this.A08 = str7;
        this.A04 = str8;
        this.A05 = str9;
        this.A07 = c62992SaG;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SPN) {
                SPN spn = (SPN) obj;
                if (!C14360o3.A0K(this.A01, spn.A01) || !C14360o3.A0K(this.A02, spn.A02) || !C14360o3.A0K(this.A09, spn.A09) || !C14360o3.A0K(this.A03, spn.A03) || !C14360o3.A0K(this.A06, spn.A06) || !C14360o3.A0K(this.A00, spn.A00) || !C14360o3.A0K(this.A08, spn.A08) || !C14360o3.A0K(this.A04, spn.A04) || !C14360o3.A0K(this.A05, spn.A05) || !C14360o3.A0K(this.A07, spn.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC166997dE.A0K(this.A00, ((((((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC166997dE.A0I(this.A07);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AuthFactor(connectUrl=");
        A1C.append(this.A01);
        A1C.append(", credId=");
        A1C.append(this.A02);
        A1C.append(", email=");
        A1C.append(this.A09);
        A1C.append(", hiddenEmail=");
        A1C.append(this.A03);
        A1C.append(", title=");
        A1C.append(this.A06);
        A1C.append(", authFactorType=");
        A1C.append(this.A00);
        A1C.append(", billingAgreementType=");
        A1C.append(this.A08);
        A1C.append(", nonce=");
        A1C.append(this.A04);
        A1C.append(", three_ds_url=");
        A1C.append(this.A05);
        A1C.append(", authAmount=");
        return AbstractC167017dG.A0o(this.A07, A1C);
    }
}
