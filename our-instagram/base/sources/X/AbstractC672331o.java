package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.31o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC672331o extends AbstractC672431p {
    public int A00;
    public double A01;
    public final Map A02;
    public final InterfaceC671231d A03;
    public final C1PY A04;

    public C1PZ A0M(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        if (interfaceC57162jr.CGk(c59062n7) >= 0.5f) {
            C1PY c1py = this.A04;
            C40861ut A09 = A09(c1py.A00().BUM());
            A09.getClass();
            double A00 = A09.A00();
            double A0L = A0L(interfaceC57162jr) / 1000.0d;
            this.A05.BuQ().A00(A0L);
            if (Double.compare(A0L, A00) >= 0) {
                C1PZ c1pz = new C1PZ(C05F.A0C);
                c1pz.A01("time_rule_did_meet");
                c1pz.A00 = A0L;
                A0F(interfaceC57162jr, c1pz, c1py.A00().BUM(), this.A03.BZU(), A04(c59062n7.A04));
                return c1pz;
            }
        }
        return C1PZ.A0K;
    }

    public abstract boolean A0O(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr);

    public abstract boolean A0Q(String str);

    public final double A0L(InterfaceC57162jr interfaceC57162jr) {
        Iterator it = this.A02.entrySet().iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((C82383m1) ((Map.Entry) it.next()).getValue()).A01(interfaceC57162jr);
        }
        return j + this.A01;
    }

    public final C82383m1 A0N(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        super.A04.getClass();
        Map map = this.A02;
        String str = c59062n7.A05;
        C82383m1 c82383m1 = (C82383m1) map.get(str);
        if (c82383m1 == null) {
            c82383m1 = new C82383m1();
            if (A0O(c59062n7, interfaceC57162jr)) {
                map.put(str, c82383m1);
            }
        }
        if (A0Q(super.A04.BK4(c59062n7.A03))) {
            this.A01 = A0L(interfaceC57162jr);
            map.clear();
            c82383m1.A02();
        }
        return c82383m1;
    }

    public boolean A0P(Object obj) {
        super.A04.getClass();
        if (!super.A04.CdX(obj) && !super.A04.CZK(obj)) {
            return false;
        }
        return true;
    }

    public AbstractC672331o(InterfaceC670931a interfaceC670931a, InterfaceC671231d interfaceC671231d, C1PY c1py, InterfaceC672031l interfaceC672031l, boolean z) {
        super(interfaceC670931a, interfaceC672031l, z);
        this.A02 = new HashMap();
        this.A00 = 0;
        this.A04 = c1py;
        this.A03 = interfaceC671231d;
    }

    @Override // X.AbstractC672431p
    public void A0E(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr, Object obj, int i) {
        boolean A0P = A0P(obj);
        super.A0E(c59062n7, interfaceC57162jr, obj, i);
        if (A0P) {
            this.A02.clear();
            this.A01 = 0.0d;
        }
    }
}
