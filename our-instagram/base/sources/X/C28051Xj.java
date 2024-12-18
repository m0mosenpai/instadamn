package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.1Xj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28051Xj implements C1WJ {
    public Context A00;

    @Override // X.C1WJ
    public final void AB1(C116155Nu c116155Nu, UserSession userSession, String str) {
    }

    @Override // X.C1WJ
    public final boolean ACT(C116155Nu c116155Nu, C116155Nu c116155Nu2) {
        return false;
    }

    @Override // X.C1WJ
    public final String Amb() {
        return "suspicious_login";
    }

    @Override // X.C1WJ
    public final void DW8(C116155Nu c116155Nu, UserSession userSession) {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4  */
    @Override // X.C1WJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C47690L3x AEk(com.instagram.common.session.UserSession r22, java.lang.String r23, java.lang.String r24, java.util.List r25, boolean r26) {
        /*
            r21 = this;
            java.lang.String r2 = "suspicious_login"
            r5 = r25
            int r0 = r5.size()
            int r0 = r0 + (-1)
            java.lang.Object r4 = r5.get(r0)
            X.5Nu r4 = (X.C116155Nu) r4
            r0 = r21
            android.content.Context r6 = r0.A00
            r20 = r22
            r3 = r24
            r0 = r20
            X.XN9 r7 = X.AbstractC55212OeW.A04(r6, r4, r0, r2, r3)
            java.lang.String r1 = r4.A0X
            java.lang.String r0 = "two_factor_trusted_notification"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le3
            java.lang.String r9 = r4.A0g
            java.lang.String r8 = "?"
            java.lang.String r0 = r4.A0l
            if (r0 == 0) goto L59
            double r18 = java.lang.Double.parseDouble(r0)
        L36:
            java.lang.String r0 = r4.A0n
            if (r0 == 0) goto L56
            double r16 = java.lang.Double.parseDouble(r0)
        L3e:
            java.lang.String r14 = r4.A0m
            java.lang.String r13 = r4.A0p
            java.lang.String r15 = r4.A0k
            java.lang.String r11 = r4.A0o
            java.lang.String r10 = r4.A0q
            java.lang.String r12 = "location name and/or device name is invalid"
            java.lang.String r1 = "LoginNotificationUtils"
            java.lang.String r0 = "UTF-8"
            java.lang.String r7 = ""
            if (r14 == 0) goto L6a
            if (r15 == 0) goto L6a
            goto L5c
        L56:
            r16 = 0
            goto L3e
        L59:
            r18 = 0
            goto L36
        L5c:
            java.lang.String r14 = java.net.URLEncoder.encode(r14, r0)     // Catch: java.lang.Throwable -> L65
            java.lang.String r12 = java.net.URLEncoder.encode(r15, r0)     // Catch: java.lang.Throwable -> L66
            goto L6c
        L65:
            r14 = r7
        L66:
            X.C0w9.A03(r1, r12)
            goto L6b
        L6a:
            r14 = r7
        L6b:
            r12 = r7
        L6c:
            android.net.Uri$Builder r15 = new android.net.Uri$Builder
            r15.<init>()
            java.lang.String r1 = java.lang.String.valueOf(r18)
            java.lang.String r0 = "lat"
            android.net.Uri$Builder r15 = r15.appendQueryParameter(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r16)
            java.lang.String r0 = "long"
            android.net.Uri$Builder r1 = r15.appendQueryParameter(r0, r1)
            java.lang.String r0 = "ln"
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r0, r14)
            java.lang.String r0 = "ts"
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r0, r13)
            java.lang.String r0 = "dn"
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r0, r12)
            java.lang.String r0 = "rdi"
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r0, r11)
            java.lang.String r0 = "tfi"
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r0, r10)
            android.net.Uri r0 = r0.build()
            java.lang.String r0 = r0.getQuery()
            if (r0 == 0) goto Lb5
            r7 = r0
        Lb5:
            java.lang.String r0 = X.AnonymousClass001.A0g(r9, r8, r7)
            r4.A0g = r0
            r0 = r20
            X.XN9 r7 = X.AbstractC55212OeW.A04(r6, r4, r0, r2, r3)
            r0 = 2131975764(0x7f135e54, float:1.958863E38)
            java.lang.String r1 = r6.getString(r0)
            java.lang.String r0 = "TRUSTED_NOTIFICATION_ACTION_KEY_APPROVE"
            r3 = 0
            android.app.PendingIntent r0 = X.AbstractC55212OeW.A01(r6, r3, r4, r3, r0)
            r2 = 0
            r7.A06(r0, r1, r2)
            r0 = 2131975765(0x7f135e55, float:1.9588632E38)
            java.lang.String r1 = r6.getString(r0)
            java.lang.String r0 = "TRUSTED_NOTIFICATION_ACTION_KEY_DENY"
            android.app.PendingIntent r0 = X.AbstractC55212OeW.A01(r6, r3, r4, r3, r0)
            r7.A06(r0, r1, r2)
        Le3:
            r0 = 0
            android.app.Notification r2 = X.AbstractC55212OeW.A00(r6, r7, r5, r0, r0)
            X.1Z6 r0 = X.C1Z6.A00(r20)
            r0.A03(r2, r6, r5)
            r0 = 10
            java.util.List r1 = X.AbstractC55212OeW.A06(r5, r0)
            X.L3x r0 = new X.L3x
            r0.<init>(r2, r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28051Xj.AEk(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.util.List, boolean):X.L3x");
    }
}
