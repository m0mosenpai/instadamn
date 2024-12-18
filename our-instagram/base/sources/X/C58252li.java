package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2li, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C58252li extends C2GS {
    public C58336PtW A00 = new C58336PtW();

    @Override // X.C2GT
    public void A03() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C75O c75o = (C75O) ((Map.Entry) it.next()).getValue();
            c75o.A01.A09(c75o);
        }
    }

    @Override // X.C2GT
    public void A04() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C75O c75o = (C75O) ((Map.Entry) it.next()).getValue();
            c75o.A01.A08(c75o);
        }
    }

    public final void A0D(C2GT c2gt) {
        C75O c75o = (C75O) this.A00.A06(c2gt);
        if (c75o != null) {
            c75o.A01.A08(c75o);
        }
    }

    public final void A0E(C2GT c2gt, InterfaceC58362lv interfaceC58362lv) {
        if (c2gt != null) {
            C75O c75o = new C75O(c2gt, interfaceC58362lv);
            C75O c75o2 = (C75O) this.A00.A07(c2gt, c75o);
            if (c75o2 != null) {
                if (c75o2.A02 != interfaceC58362lv) {
                    throw new IllegalArgumentException("This source was already added with the different observer");
                }
                return;
            } else {
                if (super.A00 > 0) {
                    c75o.A01.A09(c75o);
                    return;
                }
                return;
            }
        }
        throw new NullPointerException(AbstractC58317Pt9.A00(986));
    }
}
