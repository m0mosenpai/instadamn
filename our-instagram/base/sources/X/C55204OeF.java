package X;

import com.instagram.zero.zbd.ZeroBalanceDetectionIg4aHttpRequest;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.OeF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55204OeF {
    public InterfaceC58095PpK A00;
    public final ZeroBalanceDetectionIg4aHttpRequest A01;
    public final C19L A02;
    public final C55022OWw A03;
    public final O9P A04;
    public final AtomicBoolean A05;
    public final C0UO A06;

    public C55204OeF(ZeroBalanceDetectionIg4aHttpRequest zeroBalanceDetectionIg4aHttpRequest, C55022OWw c55022OWw, O9P o9p, C19L c19l, InterfaceC58095PpK interfaceC58095PpK) {
        C14360o3.A0B(o9p, 5);
        this.A00 = interfaceC58095PpK;
        this.A01 = zeroBalanceDetectionIg4aHttpRequest;
        this.A02 = c19l;
        this.A03 = c55022OWw;
        this.A04 = o9p;
        this.A05 = AbstractC166997dE.A17();
        this.A06 = o9p.A01;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        X.C2QZ.A01(r4.getContext());
        A04(r5, X.C05F.A01, "failed", X.AbstractC167017dG.A0n(r3, "paid_ping_canceled, exception thrown: ", X.AbstractC166987dD.A1C()));
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C55022OWw r5, X.InterfaceC23621Ds r6, X.InterfaceC50122Sb r7, X.C55204OeF r8, X.OLQ r9) {
        /*
            r3 = 39
            boolean r0 = X.MAP.A02(r6, r3)
            if (r0 == 0) goto L2e
            r4 = r6
            X.MAP r4 = (X.MAP) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2e
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r0 = r4.A05
            X.1JX r3 = X.C1JX.A02
            int r2 = r4.A00
            r1 = 1
            if (r2 == 0) goto L39
            if (r2 != r1) goto L34
            java.lang.Object r8 = r4.A04
            X.OeF r8 = (X.C55204OeF) r8
            java.lang.Object r5 = r4.A03
            X.OWw r5 = (X.C55022OWw) r5
            java.lang.Object r9 = r4.A02
            X.OLQ r9 = (X.OLQ) r9
            goto L48
        L2e:
            X.MAP r4 = new X.MAP
            r4.<init>(r8, r6, r3)
            goto L16
        L34:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L39:
            X.AbstractC09560e7.A00(r0)
            r4.A01 = r8     // Catch: java.util.concurrent.CancellationException -> L51
            X.MAP.A00(r9, r5, r8, r4, r1)     // Catch: java.util.concurrent.CancellationException -> L51
            java.lang.Object r0 = X.MSW.A11(r7, r4)     // Catch: java.util.concurrent.CancellationException -> L51
            if (r0 != r3) goto L4b
            return r3
        L48:
            X.AbstractC09560e7.A00(r0)     // Catch: java.util.concurrent.CancellationException -> L51
        L4b:
            X.OLQ r0 = (X.OLQ) r0     // Catch: java.util.concurrent.CancellationException -> L51
            r8.A05(r5, r0, r9)     // Catch: java.util.concurrent.CancellationException -> L51
            goto L6a
        L51:
            r3 = move-exception
            X.12W r0 = r4.getContext()
            X.C2QZ.A01(r0)
            java.lang.Integer r2 = X.C05F.A01
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "paid_ping_canceled, exception thrown: "
            java.lang.String r1 = X.AbstractC167017dG.A0n(r3, r0, r1)
            java.lang.String r0 = "failed"
            A04(r5, r2, r0, r1)
        L6a:
            X.0eB r3 = X.C0eB.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55204OeF.A00(X.OWw, X.1Ds, X.2Sb, X.OeF, X.OLQ):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(2:19|(3:21|13|14)(2:22|(2:24|25)))|12|13|14))|28|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        X.C2QZ.A01(r4.getContext());
        A04(r5, X.C05F.A01, "failed", X.AbstractC167017dG.A0n(r3, "free_ping_canceled, exception thrown: ", X.AbstractC166987dD.A1C()));
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.C55022OWw r5, X.InterfaceC23621Ds r6, X.InterfaceC50122Sb r7, X.C55204OeF r8, X.OLQ r9) {
        /*
            r3 = 40
            boolean r0 = X.MAP.A02(r6, r3)
            if (r0 == 0) goto L2e
            r4 = r6
            X.MAP r4 = (X.MAP) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2e
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r0 = r4.A05
            X.1JX r3 = X.C1JX.A02
            int r1 = r4.A00
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L34
            java.lang.Object r9 = r4.A04
            X.OLQ r9 = (X.OLQ) r9
            java.lang.Object r8 = r4.A03
            X.OeF r8 = (X.C55204OeF) r8
            java.lang.Object r5 = r4.A02
            X.OWw r5 = (X.C55022OWw) r5
            goto L58
        L2e:
            X.MAP r4 = new X.MAP
            r4.<init>(r8, r6, r3)
            goto L16
        L34:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L39:
            X.AbstractC09560e7.A00(r0)
            int r1 = r9.A00
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L4c
            r0 = 0
            r7.AGH(r0)
            r8.A05(r5, r9, r0)
        L49:
            X.0eB r3 = X.C0eB.A00
            return r3
        L4c:
            r4.A01 = r8     // Catch: java.util.concurrent.CancellationException -> L61
            X.MAP.A00(r5, r8, r9, r4, r2)     // Catch: java.util.concurrent.CancellationException -> L61
            java.lang.Object r0 = X.MSW.A11(r7, r4)     // Catch: java.util.concurrent.CancellationException -> L61
            if (r0 != r3) goto L5b
            goto L7b
        L58:
            X.AbstractC09560e7.A00(r0)     // Catch: java.util.concurrent.CancellationException -> L61
        L5b:
            X.OLQ r0 = (X.OLQ) r0     // Catch: java.util.concurrent.CancellationException -> L61
            r8.A05(r5, r9, r0)     // Catch: java.util.concurrent.CancellationException -> L61
            goto L49
        L61:
            r3 = move-exception
            X.12W r0 = r4.getContext()
            X.C2QZ.A01(r0)
            java.lang.Integer r2 = X.C05F.A01
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "free_ping_canceled, exception thrown: "
            java.lang.String r1 = X.AbstractC167017dG.A0n(r3, r0, r1)
            java.lang.String r0 = "failed"
            A04(r5, r2, r0, r1)
            goto L49
        L7b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55204OeF.A01(X.OWw, X.1Ds, X.2Sb, X.OeF, X.OLQ):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24))|12|(1:14)(1:18)|15|16))|27|6|7|(0)(0)|12|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        r8.A02("accuracy_test_result", X.AbstractC167017dG.A0n(r2, "error: ", X.AbstractC166987dD.A1C()));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060 A[Catch: Exception -> 0x006c, TryCatch #0 {Exception -> 0x006c, blocks: (B:11:0x0052, B:12:0x0055, B:14:0x0060, B:18:0x0066, B:22:0x0038), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[Catch: Exception -> 0x006c, TRY_LEAVE, TryCatch #0 {Exception -> 0x006c, blocks: (B:11:0x0052, B:12:0x0055, B:14:0x0060, B:18:0x0066, B:22:0x0038), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(X.C55022OWw r8, X.InterfaceC23621Ds r9, X.C55204OeF r10) {
        /*
            r3 = 32
            boolean r0 = X.C57147PWz.A02(r9, r3)
            if (r0 == 0) goto L2a
            r7 = r9
            X.PWz r7 = (X.C57147PWz) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r0 = r7.A03
            X.1JX r6 = X.C1JX.A02
            int r1 = r7.A00
            java.lang.String r5 = "accuracy_test"
            r4 = 1
            java.lang.String r3 = "accuracy_test_result"
            if (r1 == 0) goto L35
            if (r1 != r4) goto L30
            java.lang.Object r8 = r7.A02
            X.OWw r8 = (X.C55022OWw) r8
            goto L52
        L2a:
            X.PWz r7 = new X.PWz
            r7.<init>(r10, r9, r3)
            goto L16
        L30:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L35:
            X.AbstractC09560e7.A00(r0)
            r8.A01(r5)     // Catch: java.lang.Exception -> L6c
            com.instagram.zero.zbd.ZeroBalanceDetectionIg4aHttpRequest r2 = r10.A01     // Catch: java.lang.Exception -> L6c
            X.PpK r0 = r10.A00     // Catch: java.lang.Exception -> L6c
            java.lang.String r1 = r0.BbB()     // Catch: java.lang.Exception -> L6c
            X.OLP r0 = new X.OLP     // Catch: java.lang.Exception -> L6c
            r0.<init>(r1)     // Catch: java.lang.Exception -> L6c
            X.C57147PWz.A00(r10, r8, r7, r4)     // Catch: java.lang.Exception -> L6c
            java.lang.Object r0 = com.instagram.zero.zbd.ZeroBalanceDetectionIg4aHttpRequest.A00(r2, r7, r0)     // Catch: java.lang.Exception -> L6c
            if (r0 != r6) goto L55
            return r6
        L52:
            X.AbstractC09560e7.A00(r0)     // Catch: java.lang.Exception -> L6c
        L55:
            X.OLQ r0 = (X.OLQ) r0     // Catch: java.lang.Exception -> L6c
            r8.A00(r5)     // Catch: java.lang.Exception -> L6c
            int r1 = r0.A00     // Catch: java.lang.Exception -> L6c
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L66
            java.lang.String r0 = "false_positive"
            r8.A02(r3, r0)     // Catch: java.lang.Exception -> L6c
            goto L7a
        L66:
            java.lang.String r0 = "true_positive"
            r8.A02(r3, r0)     // Catch: java.lang.Exception -> L6c
            goto L7a
        L6c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "error: "
            java.lang.String r0 = X.AbstractC167017dG.A0n(r2, r0, r1)
            r8.A02(r3, r0)
        L7a:
            java.lang.Integer r2 = X.C05F.A00
            java.lang.String r1 = "zero_balance_detected"
            java.lang.String r0 = "free_ping_ok"
            A04(r8, r2, r1, r0)
            X.0eB r0 = X.C0eB.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55204OeF.A02(X.OWw, X.1Ds, X.OeF):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:(4:15|16|17|18)(2:12|13))(2:19|20))(3:29|30|(1:32))|21|(2:23|(1:25))(2:26|(1:28))|17|18))|34|6|7|(0)(0)|21|(0)(0)|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
    
        X.C2QZ.A01(r8.getContext());
        r14.A05(r12, null, null);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb A[Catch: CancellationException -> 0x00d7, TryCatch #0 {CancellationException -> 0x00d7, blocks: (B:16:0x003b, B:20:0x00aa, B:21:0x00ad, B:23:0x00bb, B:26:0x00c9, B:30:0x0077), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9 A[Catch: CancellationException -> 0x00d7, TryCatch #0 {CancellationException -> 0x00d7, blocks: (B:16:0x003b, B:20:0x00aa, B:21:0x00ad, B:23:0x00bb, B:26:0x00c9, B:30:0x0077), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.2Sb] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.2Sb] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(X.C55022OWw r12, X.InterfaceC23621Ds r13, X.C55204OeF r14) {
        /*
            r3 = 41
            boolean r0 = X.MAP.A02(r13, r3)
            if (r0 == 0) goto L2d
            r8 = r13
            X.MAP r8 = (X.MAP) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2d
            int r2 = r2 - r1
            r8.A00 = r2
        L16:
            java.lang.Object r2 = r8.A05
            X.1JX r7 = X.C1JX.A02
            int r0 = r8.A00
            r9 = 3
            r6 = 2
            r10 = 1
            r5 = 0
            if (r0 == 0) goto L51
            if (r0 == r10) goto L40
            if (r0 == r6) goto L33
            if (r0 == r9) goto L33
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L2d:
            X.MAP r8 = new X.MAP
            r8.<init>(r14, r13, r3)
            goto L16
        L33:
            java.lang.Object r12 = r8.A02
            X.OWw r12 = (X.C55022OWw) r12
            java.lang.Object r14 = r8.A01
            X.OeF r14 = (X.C55204OeF) r14
            X.AbstractC09560e7.A00(r2)     // Catch: java.util.concurrent.CancellationException -> Ld7
            goto Le1
        L40:
            java.lang.Object r4 = r8.A04
            X.2Sb r4 = (X.InterfaceC50122Sb) r4
            java.lang.Object r3 = r8.A03
            X.2Sb r3 = (X.InterfaceC50122Sb) r3
            java.lang.Object r12 = r8.A02
            X.OWw r12 = (X.C55022OWw) r12
            java.lang.Object r14 = r8.A01
            X.OeF r14 = (X.C55204OeF) r14
            goto Laa
        L51:
            X.AbstractC09560e7.A00(r2)
            X.19L r1 = r14.A02
            X.1Iw r0 = new X.1Iw
            r0.<init>(r5)
            X.19K r4 = X.AnonymousClass194.A03(r0, r1)
            r1 = 22
            X.PZ0 r0 = new X.PZ0
            r0.<init>(r12, r14, r5, r1)
            X.191 r2 = X.AnonymousClass191.A00
            X.2Sa r3 = X.AbstractC23641Du.A02(r2, r0, r4)
            r1 = 21
            X.PZ0 r0 = new X.PZ0
            r0.<init>(r12, r14, r5, r1)
            X.2Sa r4 = X.AbstractC23641Du.A02(r2, r0, r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C2QS.A05     // Catch: java.util.concurrent.CancellationException -> Ld7
            X.12W r0 = r8.getContext()     // Catch: java.util.concurrent.CancellationException -> Ld7
            X.2QS r11 = new X.2QS     // Catch: java.util.concurrent.CancellationException -> Ld7
            r11.<init>(r0)     // Catch: java.util.concurrent.CancellationException -> Ld7
            X.3EL r2 = r3.A0a()     // Catch: java.util.concurrent.CancellationException -> Ld7
            r1 = 26
            X.D4r r0 = new X.D4r     // Catch: java.util.concurrent.CancellationException -> Ld7
            r0.<init>(r1, r5)     // Catch: java.util.concurrent.CancellationException -> Ld7
            r11.A06(r0, r2)     // Catch: java.util.concurrent.CancellationException -> Ld7
            X.3EL r2 = r4.A0a()     // Catch: java.util.concurrent.CancellationException -> Ld7
            r1 = 27
            X.D4r r0 = new X.D4r     // Catch: java.util.concurrent.CancellationException -> Ld7
            r0.<init>(r1, r5)     // Catch: java.util.concurrent.CancellationException -> Ld7
            r11.A06(r0, r2)     // Catch: java.util.concurrent.CancellationException -> Ld7
            r8.A01 = r14     // Catch: java.util.concurrent.CancellationException -> Ld7
            X.MAP.A00(r12, r3, r4, r8, r10)     // Catch: java.util.concurrent.CancellationException -> Ld7
            java.lang.Object r2 = X.C2QS.A03(r8, r11)     // Catch: java.util.concurrent.CancellationException -> Ld7
            if (r2 != r7) goto Lad
            return r7
        Laa:
            X.AbstractC09560e7.A00(r2)     // Catch: java.util.concurrent.CancellationException -> Ld7
        Lad:
            X.0e4 r2 = (X.C09530e4) r2     // Catch: java.util.concurrent.CancellationException -> Ld7
            java.lang.Object r1 = r2.A00     // Catch: java.util.concurrent.CancellationException -> Ld7
            X.OLQ r1 = (X.OLQ) r1     // Catch: java.util.concurrent.CancellationException -> Ld7
            java.lang.Object r0 = r2.A01     // Catch: java.util.concurrent.CancellationException -> Ld7
            boolean r0 = X.AbstractC166987dD.A1a(r0)     // Catch: java.util.concurrent.CancellationException -> Ld7
            if (r0 == 0) goto Lc9
            X.MSW.A1Y(r14, r12, r5, r8)     // Catch: java.util.concurrent.CancellationException -> Ld7
            r8.A04 = r5     // Catch: java.util.concurrent.CancellationException -> Ld7
            r8.A00 = r6     // Catch: java.util.concurrent.CancellationException -> Ld7
            java.lang.Object r0 = A01(r12, r8, r4, r14, r1)     // Catch: java.util.concurrent.CancellationException -> Ld7
            if (r0 != r7) goto Le1
            return r7
        Lc9:
            X.MSW.A1Y(r14, r12, r5, r8)     // Catch: java.util.concurrent.CancellationException -> Ld7
            r8.A04 = r5     // Catch: java.util.concurrent.CancellationException -> Ld7
            r8.A00 = r9     // Catch: java.util.concurrent.CancellationException -> Ld7
            java.lang.Object r0 = A00(r12, r8, r3, r14, r1)     // Catch: java.util.concurrent.CancellationException -> Ld7
            if (r0 != r7) goto Le1
            return r7
        Ld7:
            X.12W r0 = r8.getContext()
            X.C2QZ.A01(r0)
            r14.A05(r12, r5, r5)
        Le1:
            X.0eB r7 = X.C0eB.A00
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55204OeF.A03(X.OWw, X.1Ds, X.OeF):java.lang.Object");
    }

    public static final void A04(C55022OWw c55022OWw, Integer num, String str, String str2) {
        c55022OWw.A02("result", str);
        c55022OWw.A02("result_reason", str2);
        C73773Sh c73773Sh = AbstractC73763Sg.A03;
        ArrayList arrayList = c55022OWw.A02;
        C73803Sk c73803Sk = c73773Sh.A02;
        Class cls = Integer.TYPE;
        C0YW A00 = AbstractC15410pw.A00(cls);
        Integer num2 = C05F.A00;
        c55022OWw.A02("free_response_codes", c73773Sh.A02(arrayList, AbstractC192158fG.A02(AbstractC15410pw.A01(ArrayList.class, new C18210v6(num2, A00)), c73803Sk)));
        c55022OWw.A02("paid_response_codes", c73773Sh.A02(c55022OWw.A03, AbstractC192158fG.A02(AbstractC15410pw.A01(ArrayList.class, new C18210v6(num2, AbstractC15410pw.A00(cls))), c73803Sk)));
        C006802i c006802i = c55022OWw.A00;
        Integer num3 = c55022OWw.A01;
        if (num3 != null) {
            int intValue = num3.intValue();
            int intValue2 = num.intValue();
            short s = 3;
            if (intValue2 != 1) {
                if (intValue2 != 0) {
                    if (intValue2 == 2) {
                        s = 4;
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    s = 2;
                }
            }
            c006802i.markerEnd(238951310, intValue, s);
            return;
        }
        throw AbstractC166987dD.A14("instanceKey is not set, which means [startLoggingFlow] wasn't properly called for this logger instance");
    }

    private final void A05(C55022OWw c55022OWw, OLQ olq, OLQ olq2) {
        if (olq != null && olq.A00 == 200) {
            A04(c55022OWw, C05F.A00, "data_balance_detected", "paid_ping_ok");
            C05A c05a = this.A04.A00;
            do {
            } while (!c05a.AIi(c05a.getValue(), EnumC53147Nf1.A02));
        } else {
            if (olq2 != null && olq2.A00 == 200) {
                C05A c05a2 = this.A04.A00;
                do {
                } while (!c05a2.AIi(c05a2.getValue(), EnumC53147Nf1.A04));
                AbstractC166987dD.A1Z(new PZ0(c55022OWw, this, null, 20), AnonymousClass194.A03(new AnonymousClass197(null), this.A02));
                return;
            }
            A04(c55022OWw, C05F.A01, "zero_balance_detected", "both_pings_failed");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A06(java.lang.String r9, X.InterfaceC23621Ds r10, X.OLO r11) {
        /*
            r8 = this;
            r4 = 33
            boolean r0 = X.C57147PWz.A02(r10, r4)
            if (r0 == 0) goto L2b
            r3 = r10
            X.PWz r3 = (X.C57147PWz) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r1 = r3.A03
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L3c
            if (r0 != r4) goto L37
            java.lang.Object r6 = r3.A02
            X.OWw r6 = (X.C55022OWw) r6
            java.lang.Object r7 = r3.A01
            X.OeF r7 = (X.C55204OeF) r7
            goto L31
        L2b:
            X.PWz r3 = new X.PWz
            r3.<init>(r8, r10, r4)
            goto L16
        L31:
            X.AbstractC09560e7.A00(r1)     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> La6
            goto La0
        L35:
            r4 = move-exception
            goto L8d
        L37:
            java.lang.IllegalStateException r1 = X.AbstractC166987dD.A13()
            throw r1
        L3c:
            X.AbstractC09560e7.A00(r1)
            X.OWw r0 = r8.A03
            int r6 = X.MSW.A01()
            X.02i r1 = r0.A00
            r0 = 238951310(0xe3e1b8e, float:2.3432575E-30)
            r1.markerStart(r0, r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            X.OWw r6 = new X.OWw
            r6.<init>(r0)
            java.lang.String r1 = "detection_method"
            java.lang.String r0 = "timeout"
            r6.A02(r1, r0)
            java.lang.String r0 = "detection_trigger"
            r6.A02(r0, r9)
            int r0 = r11.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "carrier_id"
            r6.A02(r0, r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.A05
            boolean r0 = r0.getAndSet(r4)
            if (r0 == 0) goto L81
            java.lang.Integer r2 = X.C05F.A0C
            java.lang.String r1 = "canceled"
            java.lang.String r0 = "detection is already running"
            A04(r6, r2, r1, r0)
        L7e:
            X.0eB r2 = X.C0eB.A00
        L80:
            return r2
        L81:
            X.C57147PWz.A00(r8, r6, r3, r4)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> La8
            java.lang.Object r0 = A03(r6, r3, r8)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> La8
            if (r0 == r2) goto L80
            goto L9f
        L8b:
            r4 = move-exception
            r7 = r8
        L8d:
            java.lang.Integer r3 = X.C05F.A01     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = "failed"
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = "exception thrown: "
            java.lang.String r0 = X.AbstractC167017dG.A0n(r4, r0, r1)     // Catch: java.lang.Throwable -> La6
            A04(r6, r3, r2, r0)     // Catch: java.lang.Throwable -> La6
            goto La0
        L9f:
            r7 = r8
        La0:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A05
            r0.set(r5)
            goto L7e
        La6:
            r1 = move-exception
            goto Laa
        La8:
            r1 = move-exception
            r7 = r8
        Laa:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A05
            r0.set(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55204OeF.A06(java.lang.String, X.1Ds, X.OLO):java.lang.Object");
    }
}
