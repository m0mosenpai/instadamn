package X;

import java.io.FileFilter;

/* renamed from: X.0p6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14920p6 implements FileFilter {
    public final int A00;

    public C14920p6(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    @Override // java.io.FileFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean accept(java.io.File r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L29;
                case 1: goto L6a;
                case 2: goto L4b;
                case 3: goto L6f;
                case 4: goto L61;
                default: goto L5;
            }
        L5:
            if (r5 == 0) goto L7a
            boolean r0 = r5.isDirectory()
            if (r0 == 0) goto L7a
            java.lang.String r1 = r5.getName()
            java.lang.String r0 = "session_"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L27
            java.lang.String r1 = r5.getName()
            java.lang.String r0 = "sess_"
        L21:
            boolean r0 = r1.startsWith(r0)
        L25:
            if (r0 == 0) goto L7a
        L27:
            r3 = 1
        L28:
            return r3
        L29:
            java.lang.String r2 = r5.getName()
            java.lang.String r0 = "cpu"
            boolean r0 = r2.startsWith(r0)
            r3 = 0
            if (r0 == 0) goto L28
            r1 = 3
        L38:
            int r0 = r2.length()
            if (r1 >= r0) goto L27
            char r0 = r2.charAt(r1)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L28
            int r1 = r1 + 1
            goto L38
        L4b:
            java.util.List r0 = X.C0MV.A05
            X.AbstractC05810Sj.A00(r5)
            boolean r0 = r5.isDirectory()
            if (r0 != 0) goto L27
            java.lang.String r1 = r5.getName()
            java.lang.String r0 = "_attach.txt"
            boolean r0 = r1.endsWith(r0)
            goto L25
        L61:
            if (r5 == 0) goto L7a
            java.lang.String r1 = r5.getName()
            java.lang.String r0 = "_attempt"
            goto L21
        L6a:
            java.util.List r0 = X.C0MV.A05
            X.AbstractC05810Sj.A00(r5)
        L6f:
            java.lang.String r1 = r5.getName()
            java.lang.String r0 = ".dmp"
            boolean r3 = r1.endsWith(r0)
            return r3
        L7a:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14920p6.accept(java.io.File):boolean");
    }
}
