package X;

import java.io.FileFilter;

/* renamed from: X.0oD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14410oD implements FileFilter {
    public final int A00;
    public final Object A01;

    public C14410oD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    @Override // java.io.FileFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean accept(java.io.File r4) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L61;
                case 1: goto L4a;
                case 2: goto L20;
                default: goto L5;
            }
        L5:
            java.lang.Object r2 = r3.A01
            X.0M6 r2 = (X.C0M6) r2
            if (r4 == 0) goto L1e
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L1e
            java.lang.String r1 = r4.getName()
            java.lang.String r0 = r2.A00
            boolean r1 = r1.startsWith(r0)
        L1b:
            r0 = 1
            if (r1 != 0) goto L1f
        L1e:
            r0 = 0
        L1f:
            return r0
        L20:
            java.lang.Object r2 = r3.A01
            X.0M6 r2 = (X.C0M6) r2
            if (r4 == 0) goto L1e
            java.lang.String r1 = r4.getName()
            java.lang.String r0 = r2.A00
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L36
            X.0M6 r0 = X.C0M6.LARGE_REPORT
            if (r2 != r0) goto L1e
        L36:
            java.lang.String r1 = r4.getName()
            java.lang.String r0 = "suppl_"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L1e
            java.lang.String r1 = r4.getName()
            java.lang.String r0 = "_prop.txt"
            goto L5c
        L4a:
            java.lang.String r1 = r4.getName()
            java.lang.String r0 = "anr_report_"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L1e
            java.lang.String r1 = r4.getName()
            java.lang.String r0 = ".dmp"
        L5c:
            boolean r1 = r1.endsWith(r0)
            goto L1b
        L61:
            java.lang.String r1 = r4.getName()
            java.lang.String r0 = "MultiDex.lock"
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14410oD.accept(java.io.File):boolean");
    }
}
