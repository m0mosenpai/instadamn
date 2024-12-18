package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Me, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC25501Me {
    public abstract HashMap A02();

    public abstract void A04(String str);

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
    
        if (r0 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C23131As A00(X.C23131As r4, X.C1B0 r5) {
        /*
            boolean r0 = r5.A02
            if (r0 != 0) goto L7
            X.1As r0 = X.C23131As.A02
            return r0
        L7:
            boolean r2 = r5.A01
            java.lang.String r3 = "__out_of_scope__"
            r1 = 0
            boolean r0 = r5.A00
            if (r2 == 0) goto L21
            java.lang.String r2 = r4.A00
            if (r0 == 0) goto L25
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1b
            r3 = r2
        L1b:
            X.1As r0 = new X.1As
            r0.<init>(r3, r2)
            return r0
        L21:
            if (r0 != 0) goto L2b
            java.lang.String r2 = r4.A01
        L25:
            X.1As r0 = new X.1As
            r0.<init>(r1, r2)
            return r0
        L2b:
            java.lang.String r1 = r4.A01
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = r4.A00
            if (r0 == 0) goto L25
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC25501Me.A00(X.1As, X.1B0):X.1As");
    }

    public static boolean A01(C1UV c1uv, AbstractC25501Me abstractC25501Me, String str) {
        C23131As c23131As = c1uv.A01;
        String str2 = "__invalid__";
        String str3 = c23131As.A01;
        if (str3 != null) {
            str2 = str3;
        }
        String str4 = "__invalid__";
        String str5 = c23131As.A00;
        if (str5 != null) {
            str4 = str5;
        }
        if ("__scope__".equals(str2) || "__out_of_scope__".equals(str2) || "__scope__".equals(str4) || "__out_of_scope__".equals(str4) || ("__invalid__".equals(str2) && "__invalid__".equals(str4))) {
            abstractC25501Me.A04(str);
            return true;
        }
        return false;
    }

    public final void A03() {
        for (Map.Entry entry : A02().entrySet()) {
            String str = (String) entry.getKey();
            C1UV c1uv = (C1UV) entry.getValue();
            if (!A01(c1uv, this, str)) {
                C1B0 c1b0 = (C1B0) ((C1UW) c1uv).A00;
                if (!c1b0.A04 && !c1b0.A03) {
                    A04(str);
                }
            }
        }
    }
}
