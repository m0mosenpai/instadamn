package X;

import java.util.HashSet;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SN1 {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final HashSet A07;
    public final HashSet A08;
    public final HashSet A09;
    public final HashSet A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final String A0D;

    public final Map A00() {
        return AbstractC25233BEq.A0p("Accept-Language", "en-US", AbstractC166987dD.A1L("x-amz-customer-ip-address", this.A0D));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r6.getBooleanExtra("IS_BWP_3P_ENABLED", false) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SN1(android.content.Intent r6) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.String r0 = "IS_BWP_1P_ENABLED"
            r3 = 0
            boolean r0 = r6.getBooleanExtra(r0, r3)
            if (r0 != 0) goto L15
            java.lang.String r0 = "IS_BWP_3P_ENABLED"
            boolean r1 = r6.getBooleanExtra(r0, r3)
            r0 = 0
            if (r1 == 0) goto L16
        L15:
            r0 = 1
        L16:
            r5.A0B = r0
            java.lang.String r0 = "BWP_API_KEY_COOKIE_NAME"
            java.lang.String r0 = r6.getStringExtra(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = "x-aa-h-api-key"
        L23:
            r5.A02 = r0
            java.lang.String r2 = "BWP_API_KEY_TTL"
            r0 = 0
            long r0 = r6.getLongExtra(r2, r0)
            r5.A00 = r0
            java.lang.String r0 = "BWP_ACCESS_TOKEN_COOKIE_NAME"
            java.lang.String r0 = r6.getStringExtra(r0)
            if (r0 != 0) goto L3a
            java.lang.String r0 = "x-aa-h-bearer-token"
        L3a:
            r5.A01 = r0
            java.lang.String r0 = "BWP_1P_COOKIE_DOMAIN"
            java.lang.String r0 = r6.getStringExtra(r0)
            if (r0 != 0) goto L47
            java.lang.String r0 = "web.shop-external.amazon"
        L47:
            r5.A03 = r0
            java.lang.String r0 = "BWP_3P_COOKIE_DOMAIN"
            java.lang.String r0 = r6.getStringExtra(r0)
            if (r0 != 0) goto L53
            java.lang.String r0 = "order.buywithprime.amazon.com"
        L53:
            r5.A04 = r0
            java.lang.String r0 = "BWP_IS_MIGRATION_TO_BWI_ENABLED"
            boolean r0 = r6.getBooleanExtra(r0, r3)
            r5.A0C = r0
            java.lang.String r0 = "BWP_1P_ALLOWED_DOMAINS"
            java.lang.String r2 = r6.getStringExtra(r0)
            if (r2 != 0) goto L68
            java.lang.String r2 = "shop-external.amazon"
        L68:
            java.lang.String r4 = "\\s+"
            X.11L r0 = new X.11L
            r0.<init>(r4)
            java.lang.String r1 = ""
            java.lang.String r0 = r0.A00(r2, r1)
            java.lang.String r2 = ","
            java.util.List r0 = X.AbstractC167007dF.A0m(r0, r2, r3)
            java.util.HashSet r0 = X.AbstractC001800i.A0V(r0)
            r5.A07 = r0
            java.lang.String r0 = "BWP_3P_ALLOWED_DOMAINS"
            java.lang.String r0 = r6.getStringExtra(r0)
            if (r0 != 0) goto L8b
            java.lang.String r0 = "buywithprime.amazon.com"
        L8b:
            java.lang.String r0 = X.AbstractC58319PtB.A0s(r0, r4, r1)
            java.util.List r0 = X.AbstractC167007dF.A0m(r0, r2, r3)
            java.util.HashSet r0 = X.AbstractC001800i.A0V(r0)
            r5.A08 = r0
            java.lang.String r0 = "BWP_1P_EXTERNAL_LINK_OPEN_ALLOWED_DOMAINS"
            java.lang.String r0 = r6.getStringExtra(r0)
            if (r0 != 0) goto La3
            java.lang.String r0 = "amazon.com"
        La3:
            java.lang.String r0 = X.AbstractC58319PtB.A0s(r0, r4, r1)
            java.util.List r0 = X.AbstractC167007dF.A0m(r0, r2, r3)
            java.util.HashSet r0 = X.AbstractC001800i.A0V(r0)
            r5.A09 = r0
            java.lang.String r0 = "BWP_3P_EXTERNAL_LINK_OPEN_ALLOWED_DOMAINS"
            java.lang.String r0 = r6.getStringExtra(r0)
            if (r0 != 0) goto Lbb
            java.lang.String r0 = "amazon.com"
        Lbb:
            java.lang.String r0 = X.AbstractC58319PtB.A0s(r0, r4, r1)
            java.util.List r0 = X.AbstractC167007dF.A0m(r0, r2, r3)
            java.util.HashSet r0 = X.AbstractC001800i.A0V(r0)
            r5.A0A = r0
            java.lang.String r0 = "BWP_1P_SUBTITLE_URL"
            java.lang.String r0 = r6.getStringExtra(r0)
            if (r0 != 0) goto Ld4
            java.lang.String r0 = "web.shop-external.amazon.com"
        Ld4:
            r5.A05 = r0
            java.lang.String r0 = "BWP_3P_SUBTITLE_URL"
            java.lang.String r0 = r6.getStringExtra(r0)
            if (r0 != 0) goto Le0
            java.lang.String r0 = "order.buywithprime.amazon.com"
        Le0:
            r5.A06 = r0
            java.lang.String r0 = "BWP_REQUEST_HEADER_IP_ADDRESS"
            java.lang.String r0 = r6.getStringExtra(r0)
            if (r0 != 0) goto Leb
            r0 = r1
        Leb:
            r5.A0D = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SN1.<init>(android.content.Intent):void");
    }
}
