package X;

/* loaded from: classes10.dex */
public abstract class STA {
    public static final OTB A00 = OTB.A01.A00();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.00g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C6FQ r11, X.C6FW r12) {
        /*
            r1 = 0
            java.util.List r0 = r12.A00
            r0.get(r1)
            X.4lE r9 = X.AbstractC31175DnJ.A0G(r12)
            java.lang.Object r0 = r12.A00()
            X.65q r0 = (X.C1344465q) r0
            X.4lE r8 = r0.A00
            r0 = 3
            X.4lE r10 = X.AbstractC31175DnJ.A0I(r12, r0)
            X.6FG r1 = r11.A03
            r7 = 0
            if (r1 == 0) goto L3f
            android.content.Context r4 = r1.A00
        L1e:
            boolean r0 = r4 instanceof androidx.activity.ComponentActivity
            if (r0 != 0) goto L41
            if (r1 == 0) goto L44
            X.2tQ r0 = r1.A02
            android.util.SparseArray r3 = r0.AMf()
            r2 = 0
            int r1 = r3.size()
        L2f:
            if (r2 >= r1) goto L44
            r3.keyAt(r2)
            java.lang.Object r4 = r3.valueAt(r2)
            boolean r0 = r4 instanceof androidx.activity.ComponentActivity
            if (r0 != 0) goto L41
            int r2 = r2 + 1
            goto L2f
        L3f:
            r4 = r7
            goto L1e
        L41:
            r7 = r4
            androidx.activity.ComponentActivity r7 = (androidx.activity.ComponentActivity) r7
        L44:
            r6 = 0
            if (r7 == 0) goto L6d
            X.OTQ r5 = new X.OTQ
            r5.<init>(r7)
            X.SHD r4 = new X.SHD
            r4.<init>(r11, r9, r8, r10)
            androidx.activity.ComponentActivity r0 = r5.A01
            X.00b r3 = r0.activityResultRegistry
            X.0z2 r2 = new X.0z2
            r2.<init>()
            r0 = 1
            X.Sp7 r1 = new X.Sp7
            r1.<init>(r0, r4, r5)
            java.lang.String r0 = "docupicker_rq#101"
            X.0z7 r1 = r3.A02(r1, r2, r0)
            r5.A00 = r1
            java.lang.String[] r0 = X.OTQ.A02
            r1.A02(r0)
        L6d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STA.A00(X.6FQ, X.6FW):java.lang.Object");
    }
}
