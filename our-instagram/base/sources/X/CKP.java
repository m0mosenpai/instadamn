package X;

import java.util.List;

/* loaded from: classes5.dex */
public abstract class CKP {
    public static final boolean A00(C75113Zb c75113Zb, BVO bvo) {
        C14360o3.A0B(c75113Zb, 1);
        if (!AbstractC001900j.A0T(bvo.A01)) {
            if (bvo.A0D && c75113Zb.A1p && bvo.A0E) {
                String str = bvo.A07;
                if (str != null && AbstractC25225BEi.A1Y(str)) {
                    bvo.A01 = str;
                } else {
                    ((BP3) BP3.A03.getValue()).A01(c75113Zb);
                    c75113Zb.A0j(!AbstractC166987dD.A1a(c75113Zb.A3V.A00));
                }
            }
            List list = bvo.A09;
            if (list != null && !list.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
