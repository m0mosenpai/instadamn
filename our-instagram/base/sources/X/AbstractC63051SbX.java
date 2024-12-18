package X;

import java.util.Map;

/* renamed from: X.SbX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63051SbX {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(java.lang.String r4, int r5, java.util.Map r6) {
        /*
            r0 = -2
            if (r5 == r0) goto L8c
            r0 = -1
            if (r5 == r0) goto L89
            r0 = 12
            if (r5 == r0) goto L89
            switch(r5) {
                case 1: goto L7a;
                case 2: goto L7d;
                case 3: goto L8c;
                case 4: goto L80;
                case 5: goto L7d;
                case 6: goto L7d;
                case 7: goto L83;
                case 8: goto L86;
                default: goto Ld;
            }
        Ld:
            r3 = 0
        Le:
            r2 = 0
            if (r3 == 0) goto L77
            int r0 = r3.intValue()
            switch(r0) {
                case 1: goto L65;
                case 2: goto L68;
                case 3: goto L6b;
                case 4: goto L6e;
                case 5: goto L71;
                case 6: goto L74;
                default: goto L18;
            }
        L18:
            java.lang.String r0 = "The user has canceled the purchase to abort the transaction. Payment is not received and no entitlement will be granted."
        L1a:
            java.lang.StringBuilder r1 = X.AbstractC166997dE.A11(r0)
            java.lang.String r0 = " Original Error Code: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " Debugging Message:"
            java.lang.String r1 = X.MSZ.A0u(r0, r4, r1)
            X.RhW r0 = X.RhW.A0S
            X.AbstractC58318PtA.A1M(r0, r1, r6)
            X.RhW r0 = X.RhW.A0R
            java.lang.String r1 = r0.A00
            if (r3 == 0) goto L49
            int r0 = r3.intValue()
            switch(r0) {
                case 1: goto L4d;
                case 2: goto L51;
                case 3: goto L55;
                case 4: goto L59;
                case 5: goto L5d;
                case 6: goto L61;
                default: goto L3e;
            }
        L3e:
            r0 = 4054001(0x3ddbf1, float:5.680865E-39)
        L41:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = r0.toString()
        L49:
            r6.put(r1, r2)
            return
        L4d:
            r0 = 4054005(0x3ddbf5, float:5.680871E-39)
            goto L41
        L51:
            r0 = 4054006(0x3ddbf6, float:5.680872E-39)
            goto L41
        L55:
            r0 = 4054004(0x3ddbf4, float:5.68087E-39)
            goto L41
        L59:
            r0 = 4054009(0x3ddbf9, float:5.680877E-39)
            goto L41
        L5d:
            r0 = 4054011(0x3ddbfb, float:5.68088E-39)
            goto L41
        L61:
            r0 = 4054008(0x3ddbf8, float:5.680875E-39)
            goto L41
        L65:
            java.lang.String r0 = "The product or subscription is not available for purchase."
            goto L1a
        L68:
            java.lang.String r0 = "This error occurs when Google Billing experiences an error in their service."
            goto L1a
        L6b:
            java.lang.String r0 = "This error occurs when a network issue prevents the purchase from being processed by Google."
            goto L1a
        L6e:
            java.lang.String r0 = "This error occurs when a recent purchase action is likely pending fulfillment such that the server and local client are not in sync. A user is attempting to re-purchase a product they should already be granted."
            goto L1a
        L71:
            java.lang.String r0 = "This error may occur when attempting to consume/update a purchase that is not owned by the user. "
            goto L1a
        L74:
            java.lang.String r0 = "This error occurs when a billing error has occurred. This usually means the user need to update their Play Store/Google Service"
            goto L1a
        L77:
            java.lang.String r0 = ""
            goto L1a
        L7a:
            java.lang.Integer r3 = X.C05F.A00
            goto Le
        L7d:
            java.lang.Integer r3 = X.C05F.A0C
            goto Le
        L80:
            java.lang.Integer r3 = X.C05F.A01
            goto Le
        L83:
            java.lang.Integer r3 = X.C05F.A0Y
            goto Le
        L86:
            java.lang.Integer r3 = X.C05F.A0j
            goto Le
        L89:
            java.lang.Integer r3 = X.C05F.A0N
            goto Le
        L8c:
            java.lang.Integer r3 = X.C05F.A0u
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63051SbX.A01(java.lang.String, int, java.util.Map):void");
    }

    public static final void A02(String str, Map map) {
        C14360o3.A0B(str, 1);
        AbstractC58318PtA.A1M(RhW.A0S, str, map);
    }

    public static final void A00(SYG syg, Map map) {
        int i = syg.A00;
        String str = syg.A01;
        C14360o3.A07(str);
        A01(str, i, map);
    }
}
