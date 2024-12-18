package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class T2Q implements C2GC {
    public final InterfaceC02550Ad A00;
    public final C2GC A01;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.QC3] */
    public static QC3 A00() {
        ?? c0Zx = new C0Zx();
        c0Zx.A01(RiX.PIN, "auth_factor_type");
        return c0Zx;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0Zx, X.QC3] */
    public static QC3 A01(Map map) {
        map.get("FBPAY_AUTH_CREDENTIAL_ID").getClass();
        return new C0Zx();
    }

    public static void A03(C0Zx c0Zx, Map map) {
        c0Zx.A06("dynamicauth_operation", (String) AbstractC58442PvL.A01("DYNAMIC_AUTH_OPERATION_NAME", map));
    }

    public T2Q(InterfaceC02550Ad interfaceC02550Ad, C2GC c2gc) {
        this.A00 = interfaceC02550Ad;
        this.A01 = c2gc;
    }

    public static Map A02(String str, Map map) {
        HashMap A10 = AbstractC58318PtA.A10(map);
        A10.put("flow_step", str);
        return Collections.unmodifiableMap(A10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0630, code lost:
    
        if (r1 != null) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0632, code lost:
    
        r3.A02(r1, "logging_policy");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x04a2, code lost:
    
        if (r1 != null) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x05bd, code lost:
    
        if (r1 != null) goto L245;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0029. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // X.C2GC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Chz(java.lang.String r13, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 1916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T2Q.Chz(java.lang.String, java.util.Map):void");
    }
}
