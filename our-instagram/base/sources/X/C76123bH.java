package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3bH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76123bH {
    public static final C76123bH A04;
    public boolean A00;
    public final C005101q A01;
    public final C76123bH A02;
    public final Map A03;

    static {
        C76123bH c76123bH = new C76123bH(null);
        c76123bH.A00 = true;
        A04 = c76123bH;
    }

    public final C2W3 A00(int i) {
        C2W1 c2w1 = (C2W1) AbstractC005201r.A00(this.A01, i);
        if (c2w1 == null) {
            C76123bH c76123bH = this.A02;
            if (c76123bH != null) {
                return c76123bH.A00(i);
            }
            return null;
        }
        return A01(c2w1);
    }

    public final C2W3 A01(C2W1 c2w1) {
        C2W3 c2w3 = (C2W3) this.A03.get(c2w1);
        if (c2w3 == null) {
            C76123bH c76123bH = this.A02;
            if (c76123bH != null) {
                return c76123bH.A01(c2w1);
            }
            return null;
        }
        return c2w3;
    }

    public final C2W1 A02(int i) {
        C2W1 c2w1 = (C2W1) AbstractC005201r.A00(this.A01, i);
        if (c2w1 == null) {
            C76123bH c76123bH = this.A02;
            if (c76123bH != null) {
                return c76123bH.A02(i);
            }
            return null;
        }
        return c2w1;
    }

    public final void A03(AbstractC50812Vc abstractC50812Vc) {
        C76123bH c76123bH;
        int i = abstractC50812Vc.A00;
        if (!this.A00) {
            C005101q c005101q = this.A01;
            C2W1 c2w1 = (C2W1) AbstractC005201r.A00(c005101q, i);
            if (c2w1 != null) {
                this.A03.remove(c2w1);
                c005101q.A06(i);
                if (C2V3.enablePrimitiveMeasurementFix && (c76123bH = this.A02) != null) {
                    c76123bH.A04(c2w1);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Cannot delete from a frozen cache");
    }

    public final void A04(C2W1 c2w1) {
        this.A03.remove(c2w1);
        C76123bH c76123bH = this.A02;
        if (c76123bH != null) {
            c76123bH.A04(c2w1);
        }
    }

    public final boolean A05(int i) {
        C76123bH c76123bH;
        C005101q c005101q = this.A01;
        if (c005101q.A01) {
            AbstractC005201r.A01(c005101q);
        }
        if (AbstractC005301s.A00(c005101q.A02, c005101q.A00, i) < 0 && ((c76123bH = this.A02) == null || !c76123bH.A05(i))) {
            return false;
        }
        return true;
    }

    public C76123bH(C76123bH c76123bH) {
        this.A02 = c76123bH;
        this.A01 = new C005101q(10);
        this.A03 = new HashMap();
    }

    public C76123bH() {
        this(null);
    }
}
