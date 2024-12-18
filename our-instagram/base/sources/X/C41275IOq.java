package X;

import com.instagram.api.schemas.BillingWizardName;
import com.instagram.api.schemas.NonDiscInfo;
import com.instagram.api.schemas.PaymentInfo;
import java.io.IOException;

/* renamed from: X.IOq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41275IOq {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.H9a, X.1um, X.1ul] */
    public static C38852H9a parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("display_footer_subtitle".equals(A0s)) {
                    c40791um.A09 = AbstractC167017dG.A0m(c16l);
                } else if ("error".equals(A0s)) {
                    c40791um.A07 = AbstractC40190HsA.parseFromJson(c16l);
                } else if ("estimated_taxes".equals(A0s)) {
                    c40791um.A02 = AbstractC39910Hmx.parseFromJson(c16l);
                } else if ("non_discrimination_policy_info".equals(A0s)) {
                    c40791um.A05 = HqY.parseFromJson(c16l);
                } else if ("payment".equals(A0s)) {
                    c40791um.A06 = AbstractC40136Hr4.parseFromJson(c16l);
                } else if ("payment_details".equals(A0s)) {
                    c40791um.A03 = AbstractC40135Hr3.parseFromJson(c16l);
                } else if ("required_action".equals(A0s)) {
                    c40791um.A01 = AbstractC40214Hsd.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(517).equals(A0s)) {
                    BillingWizardName billingWizardName = (BillingWizardName) BillingWizardName.A01.get(AbstractC167017dG.A0m(c16l));
                    if (billingWizardName == null) {
                        billingWizardName = BillingWizardName.A21;
                    }
                    c40791um.A04 = billingWizardName;
                } else if ("tax".equals(A0s)) {
                    c40791um.A00 = AbstractC40382HvV.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            String str = c40791um.A09;
            UPA upa = c40791um.A07;
            E71 e71 = c40791um.A02;
            NonDiscInfo nonDiscInfo = c40791um.A05;
            C14360o3.A0A(nonDiscInfo);
            PaymentInfo paymentInfo = c40791um.A06;
            UQ6 uq6 = c40791um.A03;
            c40791um.A08 = new UPP(c40791um.A00, c40791um.A01, e71, uq6, c40791um.A04, nonDiscInfo, paymentInfo, upa, str);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
