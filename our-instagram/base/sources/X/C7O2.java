package X;

import java.util.Comparator;
import java.util.regex.Pattern;

/* renamed from: X.7O2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7O2 implements Comparator {
    public static final Pattern A00 = Pattern.compile("(\\d*)(\\D*)");

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r7 = r7 + 1;
     */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(java.lang.String r15, java.lang.String r16) {
        /*
            r14 = this;
            java.lang.String r0 = r15.trim()
            java.lang.String r1 = "\\."
            java.lang.String[] r12 = r0.split(r1)
            java.lang.String r0 = r16.trim()
            java.lang.String[] r11 = r0.split(r1)
            int r10 = r12.length
            int r9 = r11.length
            int r8 = java.lang.Math.max(r10, r9)
            r4 = 0
            r7 = 0
        L1a:
            if (r7 >= r8) goto L7d
            java.lang.String r13 = ""
            if (r7 >= r10) goto L5d
            r2 = r12[r7]
        L22:
            if (r7 >= r9) goto L5b
            r1 = r11[r7]
        L26:
            java.util.regex.Pattern r0 = X.C7O2.A00
            java.util.regex.Matcher r6 = r0.matcher(r2)
            java.util.regex.Matcher r5 = r0.matcher(r1)
        L30:
            boolean r3 = r6.find()
            boolean r2 = r5.find()
            if (r3 != 0) goto L3f
            if (r2 != 0) goto L3f
            int r7 = r7 + 1
            goto L1a
        L3f:
            r4 = 1
            if (r3 == 0) goto L4b
            java.lang.String r0 = r6.group(r4)
            int r1 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L4d
            goto L4e
        L4b:
            r1 = 0
            goto L4e
        L4d:
            r1 = 0
        L4e:
            if (r2 == 0) goto L59
            java.lang.String r0 = r5.group(r4)
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L5f
            goto L60
        L59:
            r0 = 0
            goto L60
        L5b:
            r1 = r13
            goto L26
        L5d:
            r2 = r13
            goto L22
        L5f:
            r0 = 0
        L60:
            if (r1 < r0) goto L8a
            if (r1 > r0) goto L7d
            r0 = 2
            if (r3 == 0) goto L80
            java.lang.String r3 = r6.group(r0)
        L6b:
            if (r2 == 0) goto L7e
            java.lang.String r2 = r5.group(r0)
        L71:
            int r1 = r3.length()
            if (r1 != 0) goto L82
            int r0 = r2.length()
            if (r0 <= 0) goto L82
        L7d:
            return r4
        L7e:
            r2 = r13
            goto L71
        L80:
            r3 = r13
            goto L6b
        L82:
            int r0 = r2.length()
            if (r0 != 0) goto L8c
            if (r1 <= 0) goto L8c
        L8a:
            r4 = -1
            return r4
        L8c:
            int r4 = r3.compareTo(r2)
            if (r4 == 0) goto L30
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7O2.compare(java.lang.String, java.lang.String):int");
    }
}
