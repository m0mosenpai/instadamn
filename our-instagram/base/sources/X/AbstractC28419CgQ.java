package X;

import java.util.List;

/* renamed from: X.CgQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28419CgQ {
    public static final AbstractC119735bX A00 = new C119805be(C118195Wf.A05);
    public static final AbstractC119735bX A01 = new C119725bW(C118195Wf.A02);

    public static final long A00(CWV cwv, List list, InterfaceC16610sE interfaceC16610sE, InterfaceC16610sE interfaceC16610sE2, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        C01H c01h;
        if (!list.isEmpty()) {
            C01H c01h2 = null;
            CUF cuf = new CUF(cwv, i4, i5, i2, i3, C5AU.A04(0, i, 0, Integer.MAX_VALUE));
            Object A0O = AbstractC001800i.A0O(list, 0);
            if (A0O != null) {
                i6 = AbstractC25236BEt.A06(A0O, 0, interfaceC16610sE2, i);
                i7 = AbstractC25236BEt.A06(A0O, 0, interfaceC16610sE, i6);
            } else {
                i6 = 0;
                i7 = 0;
            }
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            boolean A1S = AbstractC25230BEn.A1S(list.size(), 1);
            long A002 = C01H.A00(i, Integer.MAX_VALUE);
            if (A0O != null) {
                c01h2 = new C01H(C01H.A00(i7, i6));
            }
            if (cuf.A00(c01h2, 0, 0, 0, 0, A002, A1S, false).A00) {
                cwv.A04.intValue();
            } else {
                int size = list.size();
                int i12 = i;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    i8 = i13;
                    if (i13 >= size) {
                        break;
                    }
                    i12 -= i7;
                    i8 = i13 + 1;
                    i9 = Math.max(i9, i6);
                    Object A0O2 = AbstractC001800i.A0O(list, i8);
                    if (A0O2 != null) {
                        Integer valueOf = Integer.valueOf(i8);
                        i6 = AbstractC25236BEt.A06(A0O2, valueOf, interfaceC16610sE2, i);
                        i7 = AbstractC25236BEt.A06(A0O2, valueOf, interfaceC16610sE, i6) + i2;
                    } else {
                        i6 = 0;
                        i7 = 0;
                    }
                    boolean A1Q = AbstractC167007dF.A1Q(i13 + 2, list.size());
                    int i15 = i8 - i14;
                    long A003 = C01H.A00(i12, Integer.MAX_VALUE);
                    if (A0O2 == null) {
                        c01h = null;
                    } else {
                        c01h = new C01H(C01H.A00(i7, i6));
                    }
                    C28167CbE A004 = cuf.A00(c01h, i15, i11, i10, i9, A003, A1Q, false);
                    if (A004.A01) {
                        i10 += i9 + i3;
                        i7 -= i2;
                        i11++;
                        if (A004.A00) {
                            break;
                        }
                        i12 = i;
                        i14 = i8;
                        i9 = 0;
                    }
                    i13 = i8;
                }
                return C01H.A00(i10 - i3, i8);
            }
        }
        return AbstractC25230BEn.A0G();
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01cb, code lost:
    
        if ((r5 & 384) == 256) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x012b, code lost:
    
        if ((r14 & 384) == 256) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0116, code lost:
    
        if ((r14 & 48) == 32) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0101, code lost:
    
        if ((r14 & 6) == 4) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x018f, code lost:
    
        if (r4 == X.C5UI.A00) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.InterfaceC118275Wp r25, X.InterfaceC118305Ws r26, X.C28164CbB r27, X.C5Tl r28, androidx.compose.ui.Modifier r29, X.InterfaceC16610sE r30, int r31, int r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28419CgQ.A02(X.5Wp, X.5Ws, X.CbB, X.5Tl, androidx.compose.ui.Modifier, X.0sE, int, int, int, int):void");
    }

    public static final long A01(InterfaceC1131559d interfaceC1131559d, InterfaceC16660sJ interfaceC16660sJ, long j) {
        int A0G;
        int A0F;
        C119135aV A002 = AbstractC119125aU.A00(interfaceC1131559d);
        if (A002 != null && A002.A00 != 0.0f) {
            A0G = interfaceC1131559d.Cph(Integer.MAX_VALUE);
            A0F = interfaceC1131559d.Cpe(A0G);
        } else {
            AbstractC119125aU.A00(interfaceC1131559d);
            C59W CpF = interfaceC1131559d.CpF(j);
            interfaceC16660sJ.invoke(CpF);
            A0G = CpF.A0G();
            A0F = CpF.A0F();
        }
        return C01H.A00(A0G, A0F);
    }
}
