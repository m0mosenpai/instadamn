package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CIc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27657CIc {
    public static final void A00(C5Tl c5Tl, Modifier modifier, C162717Qi c162717Qi, int i) {
        int i2;
        boolean A1R = AbstractC167007dF.A1R(0, modifier, c162717Qi);
        c5Tl.Enr(-286670338);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, c162717Qi);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-2039112636, "com.instagram.direct.messagethread.compose.SenderAvatar (SenderAvatar.kt:27)");
            }
            AbstractC162707Qh abstractC162707Qh = c162717Qi.A01;
            if (abstractC162707Qh instanceof C7SW) {
                Object AJX = c5Tl.AJX(COE.A00);
                C2DB A00 = AbstractC43541zP.A00(c5Tl, c162717Qi.A00);
                Modifier A0C = AbstractC118185Wd.A0C(AbstractC118175Wb.A0E(modifier, 18.0f, 0.0f, 10.0f, 0.0f), 28.0f);
                long A0E = AbstractC25226BEj.A0E(c5Tl);
                C5WI c5wi = C5WF.A00;
                Modifier A01 = C6L2.A01(C6L7.A03(A0C, c5wi, 0.5f, A0E), c5wi);
                boolean A1U = AbstractC25228BEl.A1U(c5Tl, AJX, AbstractC25227BEk.A1Z(c5Tl, abstractC162707Qh, -1623847145), AbstractC25231BEo.A1K(i2));
                Object EEc = c5Tl.EEc();
                if (A1U || EEc == C5UI.A00) {
                    EEc = new ME4(13, AJX, abstractC162707Qh, c162717Qi);
                    c5Tl.FBy(EEc);
                }
                AbstractC25225BEi.A1V(c5Tl, false);
                C6LQ.A08(c5Tl, C5XR.A05(A01, null, null, (InterfaceC16820sZ) EEc, A1R), A00, C5YJ.A00);
            }
            if (C0fH.A02()) {
                C0fH.A00(-1047791153);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30510Dbt.A01(ASZ, modifier, c162717Qi, i, 16);
        }
    }
}
