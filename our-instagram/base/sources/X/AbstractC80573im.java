package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.3im, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC80573im {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r4 = r0.getId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (X.C14360o3.A0K(r6.A02(r4), true) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (r0 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A01(X.C3XG r5, X.C17570ts r6, X.C28091Xn r7, boolean r8) {
        /*
            r4 = 0
            r3 = 0
            r0 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            if (r8 == 0) goto L35
            X.1qS r1 = r5.A05
            X.1qM r0 = X.C3XH.A02(r1)
            if (r0 == 0) goto L33
            java.lang.String r0 = r0.getId()
        L15:
            boolean r0 = r7.A03(r0)
            if (r0 != 0) goto L31
            if (r6 == 0) goto L32
            X.1qM r0 = X.C3XH.A02(r1)
            if (r0 == 0) goto L27
        L23:
            java.lang.String r4 = r0.getId()
        L27:
            java.lang.Boolean r0 = r6.A02(r4)
            boolean r0 = X.C14360o3.A0K(r0, r2)
            if (r0 == 0) goto L32
        L31:
            r3 = 1
        L32:
            return r3
        L33:
            r0 = r4
            goto L15
        L35:
            java.lang.String r0 = r5.A09
            boolean r0 = r7.A03(r0)
            if (r0 != 0) goto L31
            if (r6 == 0) goto L32
            X.1qS r0 = r5.A05
            X.1qM r0 = X.C3XH.A02(r0)
            if (r0 == 0) goto L27
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC80573im.A01(X.3XG, X.0ts, X.1Xn, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0620 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v7, types: [X.3XG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.lang.Object, X.3Vj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(com.instagram.common.session.UserSession r24, X.C17570ts r25, X.C74283Vj r26, X.C28091Xn r27, java.util.List r28, int r29) {
        /*
            Method dump skipped, instructions count: 1980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC80573im.A00(com.instagram.common.session.UserSession, X.0ts, X.3Vj, X.1Xn, java.util.List, int):void");
    }

    public static final boolean A02(C3XG c3xg, C28091Xn c28091Xn) {
        String BPW;
        InterfaceC38381qS interfaceC38381qS = c3xg.A05;
        C38321qM A02 = C3XH.A02(interfaceC38381qS);
        if (A02 != null && A02.A5M()) {
            C38321qM A022 = C3XH.A02(interfaceC38381qS);
            String str = null;
            if (A022 != null && (BPW = A022.A0C.BPW()) != null && BPW.length() != 0) {
                C38321qM A023 = C3XH.A02(interfaceC38381qS);
                if (A023 != null && A023.A66()) {
                    return true;
                }
                C38321qM A024 = C3XH.A02(interfaceC38381qS);
                if (A024 != null) {
                    str = A024.A0C.BPW();
                }
                if (c28091Xn.A03(str)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean A03(List list, int i, int i2) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1XV c1xv = ((C3XG) it.next()).A06;
                if (c1xv == C1XV.A0F || c1xv == C1XV.A0O) {
                    break;
                }
            }
        }
        if (list.size() >= i2) {
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (C3YW.A02((C3XG) listIterator.previous())) {
                    int nextIndex = listIterator.nextIndex();
                    if (nextIndex == -1 || (list.size() - nextIndex) - 1 >= i) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
