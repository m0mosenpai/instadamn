package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cc8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28210Cc8 {
    public C5C8 A00;
    public final InterfaceC74953Yl A01 = AbstractC25230BEn.A0U(null);
    public final C6MK A02;
    public final C5C8 A03;

    public C28210Cc8(C5C8 c5c8) {
        C5W3 c5w3;
        this.A03 = c5c8;
        C6C7 A0g = AbstractC25228BEl.A0g();
        A0g.A05(c5c8);
        List A02 = c5c8.A02(c5c8.length());
        int size = A02.size();
        for (int i = 0; i < size; i++) {
            C127015of c127015of = (C127015of) A02.get(i);
            C28222CcS A00 = ((AbstractC137436Ko) c127015of.A02).A00();
            if (A00 != null && (c5w3 = A00.A03) != null) {
                A0g.A06(c5w3, c127015of.A01, c127015of.A00);
            }
        }
        this.A00 = A0g.A02();
        this.A02 = new C6MK();
    }

    public static final void A00(C28210Cc8 c28210Cc8, C5Tl c5Tl, InterfaceC16660sJ interfaceC16660sJ, Object[] objArr, int i) {
        int i2;
        c5Tl.Enr(-2083052099);
        if ((i & 48) == 0) {
            i2 = AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, c28210Cc8);
        }
        c5Tl.EnY(-416702999, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            int i3 = 0;
            if (c5Tl.AH6(obj)) {
                i3 = 4;
            }
            i2 |= i3;
        }
        AbstractC25225BEi.A1T(c5Tl);
        if ((i2 & 14) == 0) {
            i2 |= 2;
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-2125521740, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:247)");
            }
            ArrayList A17 = AbstractC25225BEi.A17(2);
            A17.add(interfaceC16660sJ);
            AbstractC15480q3.A00(objArr, A17);
            Object[] array = A17.toArray(new Object[A17.size()]);
            boolean A1K = AbstractC25231BEo.A1K(i2) | c5Tl.AH6(c28210Cc8);
            Object EEc = c5Tl.EEc();
            if (A1K || EEc == C5UI.A00) {
                EEc = DRZ.A00(c5Tl, interfaceC16660sJ, c28210Cc8, 40);
            }
            C5UX.A06(c5Tl, (InterfaceC16660sJ) EEc, array);
            if (C0fH.A02()) {
                C0fH.A00(1112634649);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30509Dbs.A01(c28210Cc8, interfaceC16660sJ, objArr, i, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b6, code lost:
    
        if (r13 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C5Tl r25, int r26) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28210Cc8.A01(X.5Tl, int):void");
    }
}
