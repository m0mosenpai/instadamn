package X;

import android.os.CancellationSignal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.7Xj */
/* loaded from: classes3.dex */
public final class C164447Xj {
    public final C1YP A00;

    public static final C47632L1r A00(XVW xvw, String str, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C58913QIr c58913QIr = xvw != null ? new C58913QIr(xvw.A01, xvw.A00, 1) : null;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            XVX xvx = (XVX) it.next();
            String str2 = xvx.A03;
            long j = xvx.A01;
            long j2 = xvx.A00;
            C14360o3.A0B(str2, 0);
            linkedHashMap.put(str2, new C58913QIr(j, j2, 1));
        }
        C14360o3.A0B(str, 0);
        return new C47632L1r(c58913QIr, str, AbstractC06930Yk.A0B(linkedHashMap));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object A01(X.C164447Xj r7, java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r3 = 46
            boolean r0 = X.MAL.A01(r9, r3)
            if (r0 == 0) goto L80
            r6 = r9
            X.MAL r6 = (X.MAL) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L80
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r3 = r6.A04
            X.1JX r5 = X.C1JX.A02
            int r1 = r6.A00
            r0 = 2
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 == r2) goto L46
            if (r1 != r0) goto L86
            java.lang.Object r4 = r6.A03
            X.XVW r4 = (X.XVW) r4
            java.lang.Object r8 = r6.A02
            java.lang.String r8 = (java.lang.String) r8
            X.AbstractC09560e7.A00(r3)
        L2f:
            java.util.List r3 = (java.util.List) r3
            X.L1r r0 = A00(r4, r8, r3)
            return r0
        L36:
            X.AbstractC09560e7.A00(r3)
            r6.A01 = r7
            r6.A02 = r8
            r6.A00 = r2
            java.lang.Object r3 = r7.A03(r8, r6)
            if (r3 != r5) goto L51
            return r5
        L46:
            java.lang.Object r8 = r6.A02
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r6.A01
            X.7Xj r7 = (X.C164447Xj) r7
            X.AbstractC09560e7.A00(r3)
        L51:
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = X.AbstractC001800i.A0J(r3)
            X.XVW r4 = (X.XVW) r4
            r6.A01 = r7
            r6.A02 = r8
            r6.A03 = r4
            r6.A00 = r0
            java.lang.String r1 = "\n        SELECT *\n        FROM user_impression_tracker\n        WHERE intervention_type = ?\n      "
            java.util.TreeMap r0 = X.C37581ov.A08
            X.1ov r0 = X.AbstractC37591ow.A00(r1, r2)
            r0.ADp(r2, r8)
            android.os.CancellationSignal r3 = new android.os.CancellationSignal
            r3.<init>()
            X.1YP r2 = r7.A00
            X.YJ7 r1 = new X.YJ7
            r1.<init>(r0, r7)
            r0 = 0
            java.lang.Object r3 = X.C2Q9.A00(r3, r2, r1, r6, r0)
            if (r3 != r5) goto L2f
            return r5
        L80:
            X.MAL r6 = new X.MAL
            r6.<init>(r7, r9, r3)
            goto L16
        L86:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C164447Xj.A01(X.7Xj, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[LOOP:0: B:12:0x0040->B:14:0x0046, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object A02(final X.C164447Xj r9, X.InterfaceC23621Ds r10) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C164447Xj.A02(X.7Xj, X.1Ds):java.lang.Object");
    }

    public final Object A03(String str, InterfaceC23621Ds interfaceC23621Ds) {
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("\n        SELECT *\n        FROM global_impression_tracker\n        WHERE intervention_type = ?\n      ", 1);
        A00.ADp(1, str);
        return C2Q9.A00(new CancellationSignal(), this.A00, new YJ5(A00, this), interfaceC23621Ds, false);
    }

    public C164447Xj(C1YP c1yp) {
        this.A00 = c1yp;
    }

    public C164447Xj() {
    }
}
