package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.33d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C676433d {
    public int A00;
    public long A01;
    public final Context A02;
    public final UserSession A03;
    public final C676333c A04;
    public final String A05;
    public final LinkedList A06;
    public final InterfaceC16820sZ A07;
    public final C676233b A08;

    public C676433d(Context context, UserSession userSession, C676233b c676233b, C676333c c676333c, String str, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(str, 1);
        this.A05 = str;
        this.A02 = context;
        this.A03 = userSession;
        this.A08 = c676233b;
        this.A04 = c676333c;
        this.A07 = interfaceC16820sZ;
        this.A06 = new LinkedList();
    }

    private final boolean A01(Integer num, Object obj, int i, int i2) {
        Object obj2;
        int[] modelIndex;
        LinkedList linkedList = this.A06;
        if (linkedList.size() >= 1) {
            C33P c33p = this.A04.A00;
            int i3 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            InterfaceC65282xQ interfaceC65282xQ = c33p.A0D;
            if (C3Q5.A04(c33p.A0A, interfaceC65282xQ, obj)) {
                Iterator it = linkedList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((C123365iB) obj2).A01 == num) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                C123365iB c123365iB = (C123365iB) obj2;
                if (c123365iB != null) {
                    Object obj3 = c123365iB.A02;
                    if (!C14360o3.A0K(obj3, obj) && (modelIndex = interfaceC65282xQ.getModelIndex(obj)) != null) {
                        int i4 = modelIndex[0];
                        int i5 = (modelIndex[1] + i4) - 1;
                        if (i4 > i2 || i5 < i) {
                            int[] modelIndex2 = interfaceC65282xQ.getModelIndex(obj3);
                            if (modelIndex2 != null) {
                                int i6 = modelIndex2[0];
                                int intValue = num.intValue();
                                if (intValue == 1) {
                                }
                            }
                        }
                        A00(linkedList, new C9E2(num, 15));
                        if (linkedList.size() >= 1) {
                            linkedList.remove(c123365iB);
                        }
                        this.A00 = 0;
                    }
                } else {
                    while (linkedList.size() >= 1) {
                        linkedList.pollLast();
                    }
                }
            }
        }
        if (linkedList.size() < 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
    
        if (r0 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0188, code lost:
    
        if (r14 == X.C05F.A0u) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c8, code lost:
    
        if (r2 == X.C05F.A0u) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(int r23, int r24) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C676433d.A02(int, int):void");
    }

    public static final void A00(LinkedList linkedList, InterfaceC16660sJ interfaceC16660sJ) {
        Iterator it = linkedList.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            C14360o3.A07(next);
            if (((Boolean) interfaceC16660sJ.invoke(next)).booleanValue()) {
                it.remove();
            }
        }
    }
}
