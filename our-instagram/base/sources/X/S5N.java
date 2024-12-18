package X;

/* loaded from: classes10.dex */
public abstract class S5N {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        if (r1 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList A00(java.lang.String r11) {
        /*
            r9 = 1
            r8 = 0
            java.util.HashSet r7 = X.AbstractC166987dD.A1H()
            java.util.HashSet r6 = X.AbstractC166987dD.A1H()
            int r5 = android.media.MediaCodecList.getCodecCount()
            r4 = 0
        Lf:
            if (r4 >= r5) goto L78
            android.media.MediaCodecInfo r10 = android.media.MediaCodecList.getCodecInfoAt(r4)
            boolean r0 = r10.isEncoder()
            if (r0 != r9) goto L4d
            java.lang.String[] r1 = r10.getSupportedTypes()
            int r0 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            int r0 = r1.length
            java.util.HashSet r0 = X.AbstractC103614ld.A02(r0)
            java.util.Collections.addAll(r0, r1)
            boolean r0 = r0.contains(r11)
            if (r0 == 0) goto L4d
            java.lang.String r3 = r10.getName()
            X.C14360o3.A07(r3)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L50
            r10.isSoftwareOnly()
            boolean r1 = r10.isSoftwareOnly()
        L46:
            r0 = r6
            if (r1 == 0) goto L4a
        L49:
            r0 = r7
        L4a:
            r0.add(r3)
        L4d:
            int r4 = r4 + 1
            goto Lf
        L50:
            java.lang.String r1 = r10.getName()
            X.C14360o3.A07(r1)
            java.lang.String r2 = "google"
            boolean r0 = X.AbstractC001900j.A0a(r1, r2, r8)
            if (r0 != 0) goto L64
            java.lang.String r0 = "android"
            X.AbstractC001900j.A0a(r1, r0, r8)
        L64:
            java.lang.String r1 = r10.getName()
            X.C14360o3.A07(r1)
            boolean r0 = X.AbstractC001900j.A0a(r1, r2, r8)
            if (r0 != 0) goto L49
            java.lang.String r0 = "android"
            boolean r1 = X.AbstractC001900j.A0a(r1, r0, r8)
            goto L46
        L78:
            r3 = 2
            java.lang.Iterable[] r2 = new java.lang.Iterable[]{r6, r7}
            r1 = 0
        L7e:
            r0 = r2[r1]
            r0.getClass()
            int r1 = r1 + 1
            if (r1 < r3) goto L7e
            X.Py3 r0 = new X.Py3
            r0.<init>(r2)
            java.util.ArrayList r0 = X.AbstractC92144Au.A00(r0)
            X.C14360o3.A0A(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S5N.A00(java.lang.String):java.util.ArrayList");
    }
}
