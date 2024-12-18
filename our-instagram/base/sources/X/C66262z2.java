package X;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.2z2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66262z2 {
    public final C66272z3 A00 = new Object();

    public final HashMap A01(InterfaceC94534Ng interfaceC94534Ng, C49I c49i, C94564Nj c94564Nj) {
        C14360o3.A0B(interfaceC94534Ng, 0);
        HashMap hashMap = new HashMap();
        if (c94564Nj != null) {
            for (C94574Nk c94574Nk : c94564Nj.A02) {
                hashMap.put(c94574Nk, Boolean.valueOf(this.A00.A00(interfaceC94534Ng, c49i, c94574Nk).A02));
            }
            Iterator it = c94564Nj.A01.iterator();
            while (it.hasNext()) {
                hashMap.putAll(A01(interfaceC94534Ng, c49i, (C94564Nj) it.next()));
            }
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r2 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r1 = X.C05F.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0050, code lost:
    
        if (r2 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0057, code lost:
    
        if (r2 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0089, code lost:
    
        if (r1 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ab, code lost:
    
        if (r1 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[LOOP:1: B:40:0x0068->B:59:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C5OX A00(X.C66262z2 r8, X.InterfaceC94534Ng r9, X.C49I r10, X.C94564Nj r11) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66262z2.A00(X.2z2, X.4Ng, X.49I, X.4Nj):X.5OX");
    }
}
