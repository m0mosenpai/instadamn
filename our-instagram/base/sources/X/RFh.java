package X;

import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class RFh extends C49802Qq {
    public static final Pattern A00 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern A01 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern A02 = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (r0 == null) goto L8;
     */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.RFh, X.2Qq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.RFh A00(X.C63017Sah r15, java.io.File r16, long r17) {
        /*
            r3 = r16
            r11 = r17
            java.lang.String r1 = r3.getName()
            java.lang.String r0 = ".v3.exo"
            boolean r0 = r1.endsWith(r0)
            r6 = 0
            r2 = r15
            if (r0 != 0) goto L6a
            java.lang.String r5 = r3.getName()
            java.util.regex.Pattern r0 = X.RFh.A01
            java.util.regex.Matcher r1 = r0.matcher(r5)
            boolean r0 = r1.matches()
            r4 = 1
            if (r0 == 0) goto L31
            java.lang.String r0 = r1.group(r4)
            r0.getClass()
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.A0D(r0)
            if (r0 != 0) goto L44
        L30:
            return r6
        L31:
            java.util.regex.Pattern r0 = X.RFh.A00
            java.util.regex.Matcher r1 = r0.matcher(r5)
            boolean r0 = r1.matches()
            if (r0 == 0) goto L30
            java.lang.String r0 = r1.group(r4)
            r0.getClass()
        L44:
            java.io.File r13 = r3.getParentFile()
            X.C4B8.A01(r13)
            X.SQ9 r0 = r15.A01(r0)
            int r14 = r0.A01
            r0 = 2
            long r15 = X.AbstractC58322PtE.A0E(r1, r0)
            r0 = 3
            long r17 = X.AbstractC58322PtE.A0E(r1, r0)
            java.io.File r7 = A01(r13, r14, r15, r17)
            boolean r0 = r3.renameTo(r7)
            if (r0 == 0) goto L30
            java.lang.String r1 = r7.getName()
            goto L6b
        L6a:
            r7 = r3
        L6b:
            java.util.regex.Pattern r0 = X.RFh.A02
            java.util.regex.Matcher r3 = r0.matcher(r1)
            boolean r0 = r3.matches()
            if (r0 == 0) goto L30
            r0 = 1
            java.lang.String r0 = r3.group(r0)
            r0.getClass()
            int r1 = java.lang.Integer.parseInt(r0)
            android.util.SparseArray r0 = r2.A01
            java.lang.Object r8 = r0.get(r1)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L30
            r1 = -1
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 != 0) goto L97
            long r11 = r7.length()
        L97:
            r1 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 == 0) goto L30
            r0 = 2
            long r9 = X.AbstractC58322PtE.A0E(r3, r0)
            r0 = 3
            long r13 = X.AbstractC58322PtE.A0E(r3, r0)
            X.RFh r6 = new X.RFh
            r6.<init>(r7, r8, r9, r11, r13)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RFh.A00(X.Sah, java.io.File, long):X.RFh");
    }

    public static File A01(File file, int i, long j, long j2) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(i);
        A1C.append(".");
        A1C.append(j);
        A1C.append(".");
        A1C.append(j2);
        return MSW.A0w(file, AbstractC166997dE.A0x(".v3.exo", A1C));
    }
}
