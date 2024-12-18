package X;

import android.util.SparseArray;
import org.json.JSONObject;

/* renamed from: X.15R, reason: invalid class name */
/* loaded from: classes.dex */
public final class C15R extends C15E {
    public int A00;
    public boolean A01;
    public int A02;
    public static final InterfaceC219914z A04 = C219714x.A00;
    public static final SparseArray A03 = new SparseArray();

    @Override // X.C15E
    public final int A00() {
        return 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    @Override // X.C15E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC219914z A01(X.C15P r8, int r9) {
        /*
            r7 = this;
            boolean r0 = r7.A01
            if (r0 == 0) goto L45
            if (r8 == 0) goto L45
            r6 = -1
            java.lang.String r1 = "threadId"
            java.util.Map r0 = r8.A04     // Catch: java.lang.NumberFormatException -> L1b
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.NumberFormatException -> L1b
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L1b
            if (r0 == 0) goto L1b
            int r5 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L1b
            goto L1c
        L1b:
            r5 = -1
        L1c:
            int r4 = r8.A02
            r3 = 0
            if (r4 == r6) goto L43
            r1 = r4 & 1
            r0 = 1
            r2 = 0
            if (r1 != r0) goto L28
            r2 = 1
        L28:
            r1 = 2
            r0 = r4 & 2
            if (r0 != r1) goto L2e
            r3 = 1
        L2e:
            r1 = r3
            r3 = r2
        L30:
            int r0 = r7.A02
            X.15S r2 = new X.15S
            if (r5 != r6) goto L3f
            r2.<init>(r0, r3, r1)
        L39:
            android.util.SparseArray r0 = X.C15R.A03
            r0.put(r9, r2)
            return r2
        L3f:
            r2.<init>(r0, r5)
            goto L39
        L43:
            r1 = 0
            goto L30
        L45:
            X.14z r2 = X.C15R.A04
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15R.A01(X.15P, int):X.14z");
    }

    @Override // X.C15E
    public final C15P A02(JSONObject jSONObject, int i) {
        int optInt = jSONObject.optJSONArray("boostedThreads").optInt(0);
        jSONObject.optJSONArray("enabledCoreConfigs").optInt(0);
        C15P c15p = new C15P();
        c15p.A02 = optInt;
        return c15p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r5.A07 == false) goto L6;
     */
    @Override // X.C15E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(android.content.Context r7) {
        /*
            r6 = this;
            X.15G r0 = X.C15G.A00()
            X.15I r5 = r0.A08
            boolean r0 = r5.A01()
            if (r0 == 0) goto L11
            boolean r0 = r5.A07
            r1 = 1
            if (r0 != 0) goto L12
        L11:
            r1 = 0
        L12:
            r6.A01 = r1
            int r0 = r5.A02
            r6.A00 = r0
            if (r1 == 0) goto L29
            int r4 = r5.A00
            r3 = 0
            r2 = 0
        L1e:
            r1 = 1
            if (r3 >= r4) goto L2a
            int r0 = r5.A01
            int r0 = r0 + r3
            int r1 = r1 << r0
            r2 = r2 | r1
            int r3 = r3 + 1
            goto L1e
        L29:
            r2 = -1
        L2a:
            r6.A02 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15R.A04(android.content.Context):void");
    }
}
