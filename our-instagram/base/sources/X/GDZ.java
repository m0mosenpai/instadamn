package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GDZ implements GYB {
    public final Activity A00;
    public final UserSession A01;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (java.util.regex.Pattern.compile(".*survey.instagram.com.*").matcher(r1).find() == false) goto L6;
     */
    @Override // X.GYB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CJ8(android.net.Uri r23, android.os.Bundle r24) {
        /*
            r22 = this;
            r8 = 0
            r1 = r23
            X.C14360o3.A0B(r1, r8)
            java.lang.String r0 = "url"
            java.lang.String r1 = r1.getQueryParameter(r0)
            if (r1 == 0) goto L1f
            java.lang.String r0 = ".*survey.instagram.com.*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.find()
            r4 = 1
            if (r0 != 0) goto L20
        L1f:
            r4 = 0
        L20:
            X.Fea r3 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            r0 = r22
            android.app.Activity r2 = r0.A00
            com.instagram.common.session.UserSession r0 = r0.A01
            r6 = 0
            r10 = 1
            com.instagram.simplewebview.SimpleWebViewConfig r5 = new com.instagram.simplewebview.SimpleWebViewConfig
            r7 = r6
            r9 = r8
            r11 = r8
            r12 = r8
            r13 = r10
            r14 = r8
            r15 = r8
            r16 = r10
            r17 = r8
            r18 = r8
            r19 = r10
            r20 = r6
            r21 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1 = 5652(0x1614, float:7.92E-42)
            if (r4 == 0) goto L4e
            android.content.Intent r0 = X.C35133Fea.A00(r2, r0, r5)
            X.C12260kU.A08(r2, r0, r1)
            return
        L4e:
            r3.A02(r2, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GDZ.CJ8(android.net.Uri, android.os.Bundle):void");
    }

    public GDZ(Activity activity, UserSession userSession) {
        this.A00 = activity;
        this.A01 = userSession;
    }
}
