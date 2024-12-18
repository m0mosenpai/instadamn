package X;

import com.instagram.api.schemas.IGPostClickEligibleExperienceTypes;

/* renamed from: X.5MG, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5MG {
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if (r1 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        if (r5 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.iabadscontext.IgPromoAdsExtension A01(X.InterfaceC39421sN r5, com.instagram.common.session.UserSession r6, X.C38321qM r7) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r5 == 0) goto L36
            X.536 r0 = r5.BiV()
            if (r0 == 0) goto L36
            java.util.List r0 = r0.BiX()
            if (r0 == 0) goto L36
            java.util.Iterator r3 = r0.iterator()
        L17:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r3.next()
            X.JKL r0 = (X.JKL) r0
            java.lang.String r2 = r0.BiW()
            if (r2 == 0) goto L17
            java.lang.String r1 = r0.BYY()
            com.facebook.iabadscontext.IgPromoAdsPromoCode r0 = new com.facebook.iabadscontext.IgPromoAdsPromoCode
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L17
        L36:
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ 1
            r3 = 0
            if (r0 == 0) goto L73
            com.instagram.user.model.User r0 = r7.A2E(r6)
            if (r0 == 0) goto L49
            java.lang.String r3 = r0.getFullName()
        L49:
            if (r5 == 0) goto L6f
            X.536 r0 = r5.BiV()
            if (r0 == 0) goto L6f
            java.lang.Boolean r0 = r0.CQI()
            if (r0 == 0) goto L6f
            boolean r2 = r0.booleanValue()
        L5b:
            X.536 r0 = r5.BiV()
            if (r0 == 0) goto L67
            java.lang.String r1 = r0.B7l()
            if (r1 != 0) goto L69
        L67:
            java.lang.String r1 = "none"
        L69:
            com.facebook.iabadscontext.IgPromoAdsExtension r0 = new com.facebook.iabadscontext.IgPromoAdsExtension
            r0.<init>(r4, r2, r3, r1)
            return r0
        L6f:
            r2 = 0
            if (r5 == 0) goto L67
            goto L5b
        L73:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5MG.A01(X.1sN, com.instagram.common.session.UserSession, X.1qM):com.facebook.iabadscontext.IgPromoAdsExtension");
    }

    public static final EnumC39621HeV A00(IGPostClickEligibleExperienceTypes iGPostClickEligibleExperienceTypes) {
        switch (iGPostClickEligibleExperienceTypes.ordinal()) {
            case 2:
                return EnumC39621HeV.A03;
            case 3:
            case 4:
            case 9:
            default:
                return EnumC39621HeV.A0E;
            case 5:
                return EnumC39621HeV.A05;
            case 6:
                return EnumC39621HeV.A06;
            case 7:
                return EnumC39621HeV.A07;
            case 8:
                return EnumC39621HeV.A08;
            case 10:
                return EnumC39621HeV.A0C;
        }
    }
}
