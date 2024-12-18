package X;

/* renamed from: X.Vpg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69508Vpg {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004b, code lost:
    
        if (r1 == com.instagram.business.promote.model.AdsManagerPaymentAnomalyType.A03) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        return com.instagram.business.promote.model.PromoteAdsManagerActionType.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0059, code lost:
    
        if (r1 == com.instagram.business.promote.model.AdsManagerPaymentAnomalyType.A03) goto L44;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0016. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.instagram.business.promote.model.PromoteAdsManagerActionType A00(X.InterfaceC72003XEr r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C70654Wea
            if (r0 == 0) goto L6e
            X.Wea r6 = (X.C70654Wea) r6
            X.VFn r0 = r6.A09
            if (r0 == 0) goto L64
            com.instagram.business.promote.model.AdsManagerBoostingStatusErrorCode r4 = r6.A03
            X.VEq r3 = r6.A0A
            com.instagram.business.promote.model.RejectionReason r2 = r6.A07
            com.instagram.business.promote.model.AdsManagerPaymentAnomalyType r1 = r6.A04
            int r0 = r0.ordinal()
            switch(r0) {
                case 1: goto L43;
                case 2: goto L19;
                case 3: goto L19;
                case 4: goto L19;
                case 5: goto L51;
                case 6: goto L19;
                case 7: goto L19;
                case 8: goto L34;
                case 9: goto L34;
                case 10: goto L19;
                case 11: goto L19;
                case 12: goto L3a;
                case 13: goto L19;
                case 14: goto L37;
                case 15: goto L51;
                case 16: goto L19;
                case 17: goto L1f;
                case 18: goto L19;
                case 19: goto L43;
                default: goto L19;
            }
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L1f:
            if (r3 == 0) goto L28
            X.VEq r0 = X.EnumC68172VEq.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            if (r3 == r0) goto L28
            com.instagram.business.promote.model.PromoteAdsManagerActionType r0 = com.instagram.business.promote.model.PromoteAdsManagerActionType.A0E
            return r0
        L28:
            if (r2 == 0) goto L31
            boolean r0 = r2.A02
            if (r0 == 0) goto L31
            com.instagram.business.promote.model.PromoteAdsManagerActionType r0 = com.instagram.business.promote.model.PromoteAdsManagerActionType.A0C
            return r0
        L31:
            com.instagram.business.promote.model.PromoteAdsManagerActionType r0 = com.instagram.business.promote.model.PromoteAdsManagerActionType.A03
            return r0
        L34:
            com.instagram.business.promote.model.PromoteAdsManagerActionType r0 = com.instagram.business.promote.model.PromoteAdsManagerActionType.A0A
            return r0
        L37:
            com.instagram.business.promote.model.PromoteAdsManagerActionType r0 = com.instagram.business.promote.model.PromoteAdsManagerActionType.A0B
            return r0
        L3a:
            if (r4 == 0) goto L43
            com.instagram.business.promote.model.AdsManagerBoostingStatusErrorCode r0 = com.instagram.business.promote.model.AdsManagerBoostingStatusErrorCode.A04
            if (r4 != r0) goto L43
            com.instagram.business.promote.model.PromoteAdsManagerActionType r0 = com.instagram.business.promote.model.PromoteAdsManagerActionType.A07
            return r0
        L43:
            if (r1 == 0) goto L4e
            com.instagram.business.promote.model.AdsManagerPaymentAnomalyType r0 = com.instagram.business.promote.model.AdsManagerPaymentAnomalyType.A04
            if (r1 == r0) goto L5e
            com.instagram.business.promote.model.AdsManagerPaymentAnomalyType r0 = com.instagram.business.promote.model.AdsManagerPaymentAnomalyType.A03
            if (r1 != r0) goto L4e
            goto L5b
        L4e:
            com.instagram.business.promote.model.PromoteAdsManagerActionType r0 = com.instagram.business.promote.model.PromoteAdsManagerActionType.A05
            return r0
        L51:
            if (r1 == 0) goto L61
            com.instagram.business.promote.model.AdsManagerPaymentAnomalyType r0 = com.instagram.business.promote.model.AdsManagerPaymentAnomalyType.A04
            if (r1 == r0) goto L5e
            com.instagram.business.promote.model.AdsManagerPaymentAnomalyType r0 = com.instagram.business.promote.model.AdsManagerPaymentAnomalyType.A03
            if (r1 != r0) goto L61
        L5b:
            com.instagram.business.promote.model.PromoteAdsManagerActionType r0 = com.instagram.business.promote.model.PromoteAdsManagerActionType.A0D
            return r0
        L5e:
            com.instagram.business.promote.model.PromoteAdsManagerActionType r0 = com.instagram.business.promote.model.PromoteAdsManagerActionType.A09
            return r0
        L61:
            com.instagram.business.promote.model.PromoteAdsManagerActionType r0 = com.instagram.business.promote.model.PromoteAdsManagerActionType.A06
            return r0
        L64:
            java.lang.String r0 = "boostingStatus"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L6e:
            boolean r0 = r6 instanceof X.C70653WeZ
            if (r0 == 0) goto L75
            com.instagram.business.promote.model.PromoteAdsManagerActionType r0 = com.instagram.business.promote.model.PromoteAdsManagerActionType.A04
            return r0
        L75:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69508Vpg.A00(X.XEr):com.instagram.business.promote.model.PromoteAdsManagerActionType");
    }
}
