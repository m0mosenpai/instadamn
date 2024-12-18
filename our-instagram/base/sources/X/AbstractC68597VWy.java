package X;

/* renamed from: X.VWy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68597VWy {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        if (r3 <= r12) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        r12 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r1 <= r6) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        r2 = X.AbstractC65702TsY.A0X(r15, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if ((r3 - r10) <= 0.0f) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (android.text.TextUtils.isEmpty(X.AbstractC002300n.A0d(r2, "\n", "", false)) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        r3 = new X.C139136Ru();
        r7.add(r3);
        r2 = r13 - r14;
        r0 = r9 - r14;
        r3.A02(r2, r0);
        r1 = r12 + r14;
        r3.A01(r1, r0);
        r0 = (0.55f * r14) + r6;
        r3.A01(r1, r0);
        r3.A01(r2, r0);
        r3.A00();
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        r13 = 0.0f;
        r9 = 0.0f;
        r12 = 0.0f;
        r6 = 0.0f;
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        if (r11 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (r2 < r9) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
    
        r9 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList A00(android.text.Layout r15, float r16) {
        /*
            r8 = 0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r14 = 1053609165(0x3ecccccd, float:0.4)
            float r14 = r14 * r16
            float r13 = r15.getLineLeft(r8)
            int r0 = r15.getLineTop(r8)
            float r9 = (float) r0
            float r12 = r15.getLineRight(r8)
            int r0 = r15.getLineBottom(r8)
            float r6 = (float) r0
            int r5 = r15.getLineCount()
            r4 = 0
            r11 = 0
        L23:
            if (r4 >= r5) goto L93
            float r10 = r15.getLineLeft(r4)
            int r0 = r15.getLineTop(r4)
            float r2 = (float) r0
            float r3 = r15.getLineRight(r4)
            int r0 = r15.getLineBottom(r4)
            float r1 = (float) r0
            if (r11 != 0) goto L3d
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 >= 0) goto L40
        L3d:
            r13 = r10
            if (r11 != 0) goto L44
        L40:
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 >= 0) goto L45
        L44:
            r9 = r2
        L45:
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 <= 0) goto L4a
            r12 = r3
        L4a:
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L4f
            r6 = r1
        L4f:
            java.lang.String r2 = X.AbstractC65702TsY.A0X(r15, r4)
            float r3 = r3 - r10
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8d
            java.lang.String r1 = "\n"
            java.lang.String r0 = ""
            java.lang.String r0 = X.AbstractC002300n.A0d(r2, r1, r0, r8)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L8d
            X.6Ru r3 = new X.6Ru
            r3.<init>()
            r7.add(r3)
            float r2 = r13 - r14
            float r0 = r9 - r14
            r3.A02(r2, r0)
            float r1 = r12 + r14
            r3.A01(r1, r0)
            r0 = 1057803469(0x3f0ccccd, float:0.55)
            float r0 = r0 * r14
            float r0 = r0 + r6
            r3.A01(r1, r0)
            r3.A01(r2, r0)
            r3.A00()
            r11 = 0
        L8a:
            int r4 = r4 + 1
            goto L23
        L8d:
            r13 = 0
            r9 = 0
            r12 = 0
            r6 = 0
            r11 = 1
            goto L8a
        L93:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC68597VWy.A00(android.text.Layout, float):java.util.ArrayList");
    }
}
