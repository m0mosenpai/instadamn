package X;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: X.63c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1339463c {
    public final C63I A00;
    public final C63C A01;
    public final C63Z A02;
    public final C63K A05;
    public final java.util.Set A04 = new LinkedHashSet();
    public final Map A03 = new LinkedHashMap();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (r2.A00.A00.get(r23) == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        r0 = "in_app";
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r7 = new X.C58680Pzt(r0);
        r5 = new X.C58681Pzu(r20, r7, r21, r22, r23, r24, r25, r26, r14);
        r7.A00("request_start", r20.A01.currentMonotonicTimestamp());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r4 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (r14 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0097, code lost:
    
        r7.A01("query_src", "www");
        r0 = X.AbstractC06930Yk.A03(r21.A03);
        r14 = r20.A05;
        r1 = r21.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
    
        r14.AV7(r15, r5, r1, r0, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (X.C17280tP.A4E.A00().A0g() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (r4 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        r7.A01("query_src", "cdn");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        if (r2 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        r14 = r2.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        r1 = r21.A02;
        r0 = r21.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        r7.A01("query_src", "prebundled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        if (r2 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        r14 = r2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
    
        r14 = false;
        r0 = "network";
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0036, code lost:
    
        if (r2 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (r2.A00.A00(r23) == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.C58678Pzr r21, java.lang.String r22, java.lang.String r23, java.util.concurrent.Executor r24, X.InterfaceC16660sJ r25, boolean r26) {
        /*
            r20 = this;
            r6 = r20
            java.util.Map r2 = r6.A03
            r9 = r22
            java.lang.Object r1 = r2.get(r9)
            java.util.Set r1 = (java.util.Set) r1
            r8 = r21
            if (r1 == 0) goto L1a
            X.Pzw r0 = r8.A01
            java.util.LinkedHashSet r0 = X.AnonymousClass090.A01(r0, r1)
            r2.put(r9, r0)
        L19:
            return
        L1a:
            X.Pzw r15 = r8.A01
            java.util.Set r0 = java.util.Collections.singleton(r15)
            X.C14360o3.A07(r0)
            r2.put(r9, r0)
            X.63I r2 = r6.A00
            r10 = r23
            if (r2 == 0) goto L35
            X.63E r0 = r2.A00
            X.63F r0 = r0.A00(r10)
            r4 = 1
            if (r0 != 0) goto L38
        L35:
            r4 = 0
            if (r2 == 0) goto La9
        L38:
            X.63E r0 = r2.A00
            java.util.Map r0 = r0.A00
            java.lang.Object r0 = r0.get(r10)
            r14 = 1
            if (r0 == 0) goto La9
            java.lang.String r0 = "in_app"
        L45:
            X.Pzt r7 = new X.Pzt
            r7.<init>(r0)
            X.Pzu r5 = new X.Pzu
            r11 = r24
            r12 = r25
            r13 = r26
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.63C r0 = r6.A01
            long r0 = r0.currentMonotonicTimestamp()
            java.lang.String r3 = "request_start"
            r7.A00(r3, r0)
            if (r4 != 0) goto L64
            if (r14 == 0) goto L97
        L64:
            X.0xy r0 = X.C17280tP.A4E
            X.0tP r0 = r0.A00()
            boolean r0 = r0.A0g()
            if (r0 != 0) goto L97
            java.lang.String r1 = "query_src"
            if (r4 == 0) goto L8d
            java.lang.String r0 = "cdn"
            r7.A01(r1, r0)
            if (r2 == 0) goto L19
            X.63K r14 = r2.A02
        L7d:
            java.lang.String r1 = r8.A02
            java.util.Map r0 = r8.A03
        L81:
            r16 = r5
            r17 = r1
            r18 = r0
            r19 = r11
            r14.AV7(r15, r16, r17, r18, r19)
            return
        L8d:
            java.lang.String r0 = "prebundled"
            r7.A01(r1, r0)
            if (r2 == 0) goto L19
            X.63K r14 = r2.A01
            goto L7d
        L97:
            java.lang.String r1 = "query_src"
            java.lang.String r0 = "www"
            r7.A01(r1, r0)
            java.util.Map r0 = r8.A03
            java.util.LinkedHashMap r0 = X.AbstractC06930Yk.A03(r0)
            X.63K r14 = r6.A05
            java.lang.String r1 = r8.A02
            goto L81
        La9:
            r14 = 0
            java.lang.String r0 = "network"
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1339463c.A00(X.Pzr, java.lang.String, java.lang.String, java.util.concurrent.Executor, X.0sJ, boolean):void");
    }

    public C1339463c(C63I c63i, C63C c63c, C63K c63k, C63Z c63z) {
        this.A05 = c63k;
        this.A01 = c63c;
        this.A02 = c63z;
        this.A00 = c63i;
    }
}
