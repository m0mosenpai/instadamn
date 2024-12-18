package com.instagram.rtc.analytics;

import X.AbstractC166987dD;
import X.AbstractC25236BEt;
import X.AbstractC37302Gc3;
import X.C12M;
import X.C12N;
import X.C14360o3;
import X.C18920wW;
import X.C19L;
import X.C1WL;
import X.InterfaceC11380iw;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;

/* loaded from: classes9.dex */
public final class RtcCallSurveyLogger implements InterfaceC11380iw {
    public RtcCallKey A00;
    public final C18920wW A01;
    public final UserSession A02;
    public final Context A03;
    public final C12N A04;
    public final C1WL A05;
    public final C19L A06;

    public RtcCallSurveyLogger(Context context, C12N c12n, UserSession userSession, RtcCallKey rtcCallKey) {
        C14360o3.A0B(c12n, 4);
        this.A02 = userSession;
        this.A03 = context;
        this.A00 = rtcCallKey;
        this.A04 = c12n;
        this.A01 = AbstractC37302Gc3.A0I(this, userSession);
        this.A05 = C1WL.A00;
        this.A06 = AbstractC25236BEt.A0e(((C12M) c12n).A04);
    }

    public final void A01(String str, String str2, String str3, String str4, boolean z) {
        AbstractC166987dD.A1Z(new RtcCallSurveyLogger$logSurveyRelatedDataToQPL$1(this, str2, str, str3, str4, null, z), this.A06);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "rtc_call_end_feedback";
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.rtc.analytics.RtcCallSurveyLogger r6, java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r3 = 33
            boolean r0 = X.PXD.A03(r8, r3)
            if (r0 == 0) goto L22
            r5 = r8
            X.PXD r5 = (X.PXD) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L27
            goto L48
        L22:
            X.PXD r5 = X.PXD.A00(r6, r8, r3)
            goto L16
        L27:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L2c:
            X.AbstractC09560e7.A00(r0)
            X.12N r1 = r6.A04     // Catch: java.lang.Exception -> L4f
            r0 = 1696731353(0x652210d9, float:4.7833385E22)
            X.0nZ r3 = X.MSX.A0J(r1, r0)     // Catch: java.lang.Exception -> L4f
            r5.A00 = r2     // Catch: java.lang.Exception -> L4f
            r2 = 0
            r1 = 2
            X.B5F r0 = new X.B5F     // Catch: java.lang.Exception -> L4f
            r0.<init>(r7, r2, r1)     // Catch: java.lang.Exception -> L4f
            java.lang.Object r0 = X.AbstractC23641Du.A00(r5, r3, r0)     // Catch: java.lang.Exception -> L4f
            if (r0 != r4) goto L4b
            return r4
        L48:
            X.AbstractC09560e7.A00(r0)     // Catch: java.lang.Exception -> L4f
        L4b:
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L4f
            return r4
        L4f:
            r0 = move-exception
            java.lang.String r4 = r0.getMessage()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.rtc.analytics.RtcCallSurveyLogger.A00(com.instagram.rtc.analytics.RtcCallSurveyLogger, java.lang.String, X.1Ds):java.lang.Object");
    }
}
