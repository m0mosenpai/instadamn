package X;

import com.instagram.api.schemas.BillingWizardName;
import com.instagram.api.schemas.NonDiscInfo;
import com.instagram.api.schemas.PaymentInfo;

/* loaded from: classes11.dex */
public final class UPP extends C0T6 {
    public final C26031BfK A00;
    public final C50627MWo A01;
    public final E71 A02;
    public final UQ6 A03;
    public final BillingWizardName A04;
    public final NonDiscInfo A05;
    public final PaymentInfo A06;
    public final UPA A07;
    public final String A08;

    public UPP(C26031BfK c26031BfK, C50627MWo c50627MWo, E71 e71, UQ6 uq6, BillingWizardName billingWizardName, NonDiscInfo nonDiscInfo, PaymentInfo paymentInfo, UPA upa, String str) {
        C14360o3.A0B(nonDiscInfo, 4);
        this.A08 = str;
        this.A07 = upa;
        this.A02 = e71;
        this.A05 = nonDiscInfo;
        this.A06 = paymentInfo;
        this.A03 = uq6;
        this.A01 = c50627MWo;
        this.A04 = billingWizardName;
        this.A00 = c26031BfK;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UPP) {
                UPP upp = (UPP) obj;
                if (!C14360o3.A0K(this.A08, upp.A08) || !C14360o3.A0K(this.A07, upp.A07) || !C14360o3.A0K(this.A02, upp.A02) || !C14360o3.A0K(this.A05, upp.A05) || !C14360o3.A0K(this.A06, upp.A06) || !C14360o3.A0K(this.A03, upp.A03) || !C14360o3.A0K(this.A01, upp.A01) || this.A04 != upp.A04 || !C14360o3.A0K(this.A00, upp.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0J = (((((((AbstractC166997dE.A0J(this.A05, ((((AbstractC167017dG.A0O(this.A08) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31;
        C26031BfK c26031BfK = this.A00;
        if (c26031BfK != null) {
            i = c26031BfK.hashCode();
        }
        return A0J + i;
    }
}
