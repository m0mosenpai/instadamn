package com.facebook.rp.platform.metaai.rsys;

import X.AbstractC25233BEq;
import X.AbstractC31171DnF;
import X.AnonymousClass195;
import X.C12W;
import X.C14360o3;
import X.C51999Myp;
import X.C54776OIp;
import X.C57595Ph7;
import X.C57596Ph8;
import X.C57597Ph9;
import X.InterfaceC16660sJ;
import java.util.Set;

/* loaded from: classes9.dex */
public final class MetaAiRsysSdk {
    public C51999Myp A00;
    public AnonymousClass195 A01;
    public final C54776OIp A02;
    public final String A03;
    public final Set A04;
    public final C12W A05;
    public final InterfaceC16660sJ A06;
    public final InterfaceC16660sJ A07;
    public final InterfaceC16660sJ A08;

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:(2:11|12)(2:14|15))(2:16|17))(2:37|(2:39|(1:41)(1:42))(4:43|23|(1:29)|(2:31|32)(2:33|(1:35)(1:12))))|18|(3:20|21|22)|23|(2:25|29)|(0)(0)))|45|6|7|(0)(0)|18|(0)|23|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cc, code lost:
    
        X.C14360o3.A0B(r8, 0);
        com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnel.CProxy.fail(r8, "start_session_failure", "coroutine_job_cancelled_during_permission_request");
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.C51613Mr6 r12, X.InterfaceC23621Ds r13) {
        /*
            r11 = this;
            r7 = r12
            r4 = 17
            boolean r0 = X.MAL.A01(r13, r4)
            if (r0 == 0) goto Lc0
            r1 = r13
            X.MAL r1 = (X.MAL) r1
            int r3 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto Lc0
            int r3 = r3 - r2
            r1.A00 = r3
        L17:
            java.lang.Object r0 = r1.A04
            X.1JX r2 = X.C1JX.A02
            int r4 = r1.A00
            r10 = 2
            r3 = 1
            r9 = 0
            if (r4 == 0) goto L37
            if (r4 == r3) goto L2a
            if (r4 != r10) goto Lc7
            X.AbstractC09560e7.A00(r0)
        L29:
            return r0
        L2a:
            java.lang.Object r8 = r1.A03
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r1.A02
            X.Mr6 r7 = (X.C51613Mr6) r7
            java.lang.Object r6 = r1.A01
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk r6 = (com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk) r6
            goto L75
        L37:
            X.AbstractC09560e7.A00(r0)
            android.content.Context r4 = r12.A01
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            int r0 = r4.checkSelfPermission(r0)
            boolean r5 = X.AbstractC167007dF.A1N(r0)
            java.lang.String r8 = r12.A02
            r0 = 11
            java.lang.Integer r4 = X.AbstractC43592JPx.A0r(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            java.util.Map r4 = X.AbstractC167007dF.A0n(r4, r0)
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnel.CProxy.annotateMultipleTyped(r8, r9, r4, r9)
            if (r5 != 0) goto L7f
            X.12T r0 = X.C12P.A00     // Catch: java.util.concurrent.CancellationException -> Lcc
            X.137 r5 = X.AnonymousClass131.A00     // Catch: java.util.concurrent.CancellationException -> Lcc
            r4 = 32
            X.PZA r0 = new X.PZA     // Catch: java.util.concurrent.CancellationException -> Lcc
            r0.<init>(r12, r9, r4)     // Catch: java.util.concurrent.CancellationException -> Lcc
            X.AbstractC25235BEs.A1J(r11, r12, r8, r1, r3)     // Catch: java.util.concurrent.CancellationException -> Lcc
            java.lang.Object r0 = X.AbstractC23641Du.A00(r1, r5, r0)     // Catch: java.util.concurrent.CancellationException -> Lcc
            if (r0 == r2) goto La7
            r6 = r11
            goto L78
        L75:
            X.AbstractC09560e7.A00(r0)     // Catch: java.util.concurrent.CancellationException -> Lcc
        L78:
            boolean r0 = X.AbstractC166987dD.A1a(r0)     // Catch: java.util.concurrent.CancellationException -> Lcc
            if (r0 != 0) goto L80
            goto Ld7
        L7f:
            r6 = r11
        L80:
            android.content.Context r5 = r7.A01
            r4 = 1
            r0 = 81
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            int r0 = r5.checkSelfPermission(r0)
            if (r0 != 0) goto La3
            X.0sJ r0 = r6.A06
            java.lang.Object r0 = r0.invoke(r5)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 == 0) goto La8
            boolean r0 = r0.isConnected()
            if (r0 != r3) goto La8
        La3:
            if (r4 != 0) goto Laa
            X.MyW r2 = X.C51988MyW.A00
        La7:
            return r2
        La8:
            r4 = 0
            goto La3
        Laa:
            X.12W r0 = r6.A05
            X.PZf r5 = new X.PZf
            r5.<init>(r6, r7, r8, r9, r10)
            r1.A01 = r9
            r1.A02 = r9
            r1.A03 = r9
            r1.A00 = r10
            java.lang.Object r0 = X.AbstractC23641Du.A00(r1, r0, r5)
            if (r0 != r2) goto L29
            return r2
        Lc0:
            X.MAL r1 = new X.MAL
            r1.<init>(r11, r13, r4)
            goto L17
        Lc7:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Lcc:
            java.lang.String r2 = "start_session_failure"
            java.lang.String r1 = "coroutine_job_cancelled_during_permission_request"
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnel.CProxy.fail(r8, r2, r1)
        Ld7:
            X.MyV r2 = X.C51987MyV.A00
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk.A00(X.Mr6, X.1Ds):java.lang.Object");
    }

    public /* synthetic */ MetaAiRsysSdk(C54776OIp c54776OIp, String str, C12W c12w) {
        C57595Ph7 c57595Ph7 = C57595Ph7.A00;
        C57596Ph8 c57596Ph8 = C57596Ph8.A00;
        C57597Ph9 c57597Ph9 = C57597Ph9.A00;
        AbstractC25233BEq.A0x(3, c54776OIp, c57595Ph7, c57596Ph8);
        C14360o3.A0B(c57597Ph9, 6);
        this.A03 = str;
        this.A05 = c12w;
        this.A02 = c54776OIp;
        this.A06 = c57595Ph7;
        this.A08 = c57596Ph8;
        this.A07 = c57597Ph9;
        this.A04 = AbstractC31171DnF.A0l();
    }
}
