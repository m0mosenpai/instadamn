package X;

/* loaded from: classes11.dex */
public abstract class VN0 {
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0023, code lost:
    
        if ((!r10.A06(r2).equals(r11.A06(r2))) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A00(com.facebook.videolite.transcoder.base.composition.MediaComposition r10, com.facebook.videolite.transcoder.base.composition.MediaComposition r11) {
        /*
            X.56h r2 = X.EnumC1125356h.VIDEO
            java.util.HashMap r1 = r10.A07(r2)
            java.util.HashMap r0 = r11.A07(r2)
            if (r1 == r0) goto L14
            if (r1 == 0) goto L25
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L25
        L14:
            java.util.HashMap r1 = r10.A06(r2)
            java.util.HashMap r0 = r11.A06(r2)
            boolean r0 = r1.equals(r0)
            r1 = r0 ^ 1
            r0 = 0
            if (r1 == 0) goto L26
        L25:
            r0 = 1
        L26:
            r9 = 0
            if (r0 != 0) goto La3
            X.56h r0 = X.EnumC1125356h.AUDIO
            java.util.HashMap r5 = r10.A07(r0)
            java.util.HashMap r6 = r11.A07(r0)
            if (r5 == 0) goto La3
            if (r6 == 0) goto La3
            int r1 = r5.size()
            int r0 = r6.size()
            if (r1 != r0) goto La3
            java.util.Iterator r8 = X.AbstractC167007dF.A0l(r5)
        L45:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto La4
            java.lang.Object r0 = r8.next()
            java.lang.Object r3 = r5.get(r0)
            X.56n r3 = (X.C1125956n) r3
            java.lang.Object r7 = r6.get(r0)
            X.56n r7 = (X.C1125956n) r7
            if (r3 == 0) goto La3
            if (r7 == 0) goto La3
            java.lang.String r1 = r3.A02
            java.lang.String r0 = r7.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto La3
            java.util.List r0 = r3.A04
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.List r1 = r7.A04
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La3
            java.util.List r0 = r3.A07
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.List r1 = r7.A07
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La3
            X.56h r1 = r3.A01
            X.56h r0 = r7.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto La3
            long r3 = r3.A00
            long r1 = r7.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L45
        La3:
            return r9
        La4:
            r9 = 1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VN0.A00(com.facebook.videolite.transcoder.base.composition.MediaComposition, com.facebook.videolite.transcoder.base.composition.MediaComposition):boolean");
    }
}
