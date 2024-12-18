package X;

/* renamed from: X.NvU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54070NvU {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.fragment.app.Fragment A00(com.instagram.api.schemas.IGRevShareProductType r3, com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo r4) {
        /*
            java.lang.String r1 = r4.A02
            if (r1 == 0) goto Lb
            int r0 = r1.hashCode()
            switch(r0) {
                case -1555696638: goto L24;
                case -1008182312: goto L27;
                case 686746125: goto L3c;
                case 1479758269: goto L4b;
                case 2035013598: goto L60;
                default: goto Lb;
            }
        Lb:
            X.1YJ r0 = X.OPZ.A01()
            r0.A00()
            X.NQ1 r2 = new X.NQ1
            r2.<init>()
        L17:
            android.os.Bundle r1 = X.AbstractC166987dD.A0b()
            java.lang.String r0 = "ARGUMENT_PRODUCT_TYPE"
            r1.putParcelable(r0, r3)
            r2.setArguments(r1)
            return r2
        L24:
            java.lang.String r0 = "account_review_pending"
            goto L4d
        L27:
            java.lang.String r0 = "terms_and_conditions"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            X.1YJ r0 = X.OPZ.A01()
            r0.A00()
            X.N69 r2 = new X.N69
            r2.<init>()
            return r2
        L3c:
            java.lang.String r0 = "payouts_onboarding"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "Cannot get fragment for payout onboarding. Must use PayoutOnboardingFlowActivity instead."
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        L4b:
            java.lang.String r0 = "welcome_to_program"
        L4d:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            X.1YJ r0 = X.OPZ.A01()
            r0.A00()
            X.N63 r2 = new X.N63
            r2.<init>()
            goto L17
        L60:
            java.lang.String r0 = "igtv_account_level_monetization_toggle"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            X.1YJ r0 = X.OPZ.A01()
            r0.A00()
            X.N61 r2 = new X.N61
            r2.<init>()
            java.lang.String r0 = "ARGUMENT_PRODUCT_TYPE"
            X.AbstractC25233BEq.A15(r2, r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC54070NvU.A00(com.instagram.api.schemas.IGRevShareProductType, com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo):androidx.fragment.app.Fragment");
    }
}
