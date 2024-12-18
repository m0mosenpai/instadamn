package X;

import com.instagram.business.promote.model.BillingWizardName;

/* renamed from: X.Wfa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70711Wfa implements InterfaceC41141vN {
    public final BillingWizardName A00;
    public final Integer A01;

    public C70711Wfa(String str, String str2) {
        BillingWizardName billingWizardName;
        String str3;
        AbstractC167017dG.A1P(str, str2);
        BillingWizardName[] values = BillingWizardName.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                billingWizardName = values[i];
                if (C14360o3.A0K(billingWizardName.toString(), str)) {
                    break;
                } else {
                    i++;
                }
            } else {
                billingWizardName = BillingWizardName.A0U;
                break;
            }
        }
        this.A00 = billingWizardName;
        for (Integer num : C05F.A00(3)) {
            switch (num.intValue()) {
                case 1:
                    str3 = "complete";
                    break;
                case 2:
                    str3 = "fallback";
                    break;
                default:
                    str3 = "closed";
                    break;
            }
            if (str3.equals(str2)) {
                this.A01 = num;
                return;
            }
        }
        throw new IllegalArgumentException("can not parse return code type string from React Native");
    }
}
