package X;

import com.facebookpay.logging.FBPayLoggerData;

/* loaded from: classes10.dex */
public final class Q8a extends AbstractC52922bZ {
    public FBPayLoggerData A00;
    public REL A01;
    public Q8U A02;
    public REI A03;
    public final C2GC A07;
    public final InterfaceC58362lv A06 = new C63627SqZ(this, 35);
    public final C58252li A05 = AbstractC58318PtA.A0I();
    public boolean A04 = false;

    public static boolean A00(Q8a q8a) {
        if (((Q8X) q8a.A03).A03.A02() == null || !AbstractC166987dD.A1a(((Q8X) q8a.A03).A03.A02())) {
            if (((Q8X) q8a.A01).A03.A02() == null || !AbstractC166987dD.A1a(((Q8X) q8a.A01).A03.A02())) {
                Q8U q8u = q8a.A02;
                if (q8u != null && q8u.A01.A02() != null && AbstractC166987dD.A1a(q8a.A02.A01.A02())) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public Q8a(C2GC c2gc) {
        this.A07 = c2gc;
    }
}
