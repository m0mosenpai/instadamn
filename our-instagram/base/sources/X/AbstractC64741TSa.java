package X;

import java.util.Iterator;

/* renamed from: X.TSa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64741TSa implements Iterator {
    public int A00 = 2;
    public Object A01;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (r3 >= r6) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        r5.charAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (r3 >= r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        r5.charAt(r6 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        if (r4.A04 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x002e, code lost:
    
        r7 = 0;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0030, code lost:
    
        r5 = r6.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0031, code lost:
    
        if (r2 >= r5) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0033, code lost:
    
        r1 = r6[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0035, code lost:
    
        if (r1 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0037, code lost:
    
        r0 = "null";
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x003e, code lost:
    
        r0 = r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0043, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0044, code lost:
    
        r0 = X.AbstractC58324PtG.A0N(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0093, code lost:
    
        r4 = r8.length();
        r3 = X.AbstractC58318PtA.A0r(r4, r5 * 16);
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x009e, code lost:
    
        r2 = r8.indexOf("%s", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00a4, code lost:
    
        if (r2 == (-1)) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00a6, code lost:
    
        r3.append((java.lang.CharSequence) r8, r0, r2);
        r1 = r7 + 1;
        r3.append(r6[r7]);
        r0 = r2 + 2;
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00b3, code lost:
    
        if (r1 >= r5) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00b6, code lost:
    
        r3.append((java.lang.CharSequence) r8, r0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00b9, code lost:
    
        if (r7 >= r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00bb, code lost:
    
        r0 = X.AbstractC58322PtE.A0B(" [", r3, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00c1, code lost:
    
        if (r0 >= r5) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00c3, code lost:
    
        r0 = X.AbstractC58322PtE.A0B(", ", r3, r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00ca, code lost:
    
        r3.append(']');
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00d7, code lost:
    
        throw X.AbstractC58318PtA.A0a(r3.toString());
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasNext() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC64741TSa.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.A00 = 2;
            Object obj = this.A01;
            this.A01 = null;
            return obj;
        }
        throw AbstractC58318PtA.A13();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw AbstractC43592JPx.A11();
    }
}
