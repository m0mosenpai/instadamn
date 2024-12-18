package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.Idm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41716Idm {
    public static final C41716Idm A01 = new Object();
    public static final InterfaceC60442pS A00 = new C42568Ism();

    public static final ArrayList A00(UserSession userSession, C84543q2 c84543q2, List list, List list2, boolean z) {
        int i;
        ArrayList A12 = AbstractC166997dE.A12(userSession, 0);
        Integer num = C05F.A0C;
        if (!z) {
            ListIterator listIterator = list2.listIterator(list2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                if (C3YW.A01((C3XG) listIterator.previous())) {
                    int nextIndex = listIterator.nextIndex();
                    if (nextIndex >= 0) {
                        i = AbstractC25226BEj.A05(list2) - nextIndex;
                        if (C3YW.A00((C3XG) AbstractC001800i.A0O(list2, nextIndex))) {
                            num = C05F.A00;
                        } else {
                            num = C05F.A01;
                        }
                    }
                }
            }
        }
        i = 0;
        int i2 = (-i) - 1;
        Iterator it = list.iterator();
        int i3 = -1;
        int i4 = -1;
        while (it.hasNext()) {
            C3XG c3xg = (C3XG) it.next();
            InterfaceC38381qS interfaceC38381qS = c3xg.A05;
            C38321qM A02 = C3XH.A02(interfaceC38381qS);
            if (A02 != null) {
                A02.A01 = i4;
            }
            C38321qM A022 = C3XH.A02(interfaceC38381qS);
            if (A022 != null) {
                A022.A02 = i3;
            }
            if (C3YW.A00(c3xg)) {
                C41716Idm c41716Idm = A01;
                Integer num2 = C05F.A00;
                if (c41716Idm.A01(userSession, c3xg, c84543q2, num2, num, list2, A12, i, i2, z)) {
                    if (z) {
                        i2 = A12.size();
                    } else {
                        i2 = list2.size() + A12.size();
                    }
                    A12.add(c3xg);
                    num = num2;
                    i4 = i2;
                    i = 0;
                }
            } else if (C3YW.A03(c3xg)) {
                C41716Idm c41716Idm2 = A01;
                Integer num3 = C05F.A01;
                if (c41716Idm2.A01(userSession, c3xg, c84543q2, num3, num, list2, A12, i, i2, z)) {
                    if (z) {
                        i2 = A12.size();
                    } else {
                        i2 = list2.size() + A12.size();
                    }
                    A12.add(c3xg);
                    num = num3;
                    i3 = i2;
                    i = 0;
                }
            } else {
                A12.add(c3xg);
                i++;
            }
        }
        return A12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c9, code lost:
    
        if (r25 != r14) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01f2, code lost:
    
        r5 = r24.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01f0, code lost:
    
        if (r25 == r5) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018c, code lost:
    
        if (r25 == r5) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A01(com.instagram.common.session.UserSession r22, X.C3XG r23, X.C84543q2 r24, java.lang.Integer r25, java.lang.Integer r26, java.util.List r27, java.util.List r28, int r29, int r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41716Idm.A01(com.instagram.common.session.UserSession, X.3XG, X.3q2, java.lang.Integer, java.lang.Integer, java.util.List, java.util.List, int, int, boolean):boolean");
    }
}
