package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1F9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1F9 {
    public int A00;
    public C23131As A01;
    public final String A02;
    public final Map A03;

    public C1F9(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = 3;
        if (!AbstractC001900j.A0T(str)) {
            this.A02 = str;
            this.A03 = new HashMap();
            return;
        }
        throw new IllegalArgumentException("feature should not be blank");
    }

    public final void A00(C1B1 c1b1) {
        if (c1b1 != null) {
            this.A03.put(c1b1.A00(), c1b1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        if (r7.A05 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0091, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0092, code lost:
    
        if (r3 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
    
        if (r3.A01 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
    
        r2 = new X.C1MF(r8, r1, "file", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
    
        if (r7 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a6, code lost:
    
        if (r7.A05 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a8, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a9, code lost:
    
        if (r3 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
    
        if (r3.A01 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00af, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0099, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x008a, code lost:
    
        if (r7 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x004c, code lost:
    
        if (r6.A02 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1F9(X.C1MG r11, int r12) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1F9.<init>(X.1MG, int):void");
    }
}
