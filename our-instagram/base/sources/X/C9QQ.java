package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.9QQ, reason: invalid class name */
/* loaded from: classes4.dex */
public class C9QQ extends AbstractC192798gL {
    public final C1ON A00;

    @Override // X.C11R
    public final int getRunnableId() {
        return -8;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.8ge] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.8ge] */
    public final AbstractC193008gg A01(C9QR c9qr) {
        boolean z = this instanceof C9QV;
        C103434lJ A00 = c9qr.A00();
        if (z) {
            C102824kJ A01 = A00.A01();
            InterfaceC103384lE interfaceC103384lE = A01.A03;
            String str = null;
            if (interfaceC103384lE == null) {
                throw new Exception("Could not parse response into BloksActionParseResult");
            }
            List list = A01.A07;
            List list2 = A01.A09;
            Map A06 = C1338462s.A06(A01.A08);
            C1338862w c1338862w = A01.A02;
            List list3 = A01.A0A;
            Map map = A01.A0F;
            List list4 = A01.A0E;
            C103424lI c103424lI = A01.A01;
            if (c103424lI != null) {
                str = c103424lI.A00;
            }
            c9qr.A00();
            c9qr.A00();
            return new C209899Qb(new C66246U5q(new Object(), new C1338962x(c1338862w, list, list3, null, list2, list4, A06, map), interfaceC103384lE, str), 1, c9qr.A01, c9qr.A00);
        }
        if (A00.A01().A00 == null) {
            throw new Exception("Could not parse response into BloksParseResult");
        }
        c9qr.A00();
        c9qr.A00();
        return new C192998gf(C1338462s.A02(new Object(), c9qr.A00().A01()), c9qr.A01, c9qr.A00);
    }

    @Override // X.C11R
    public final String getName() {
        return this.A00.A05;
    }

    @Override // X.C11R
    public final void onCancel() {
        this.A00.onCancel();
    }

    @Override // X.C11R
    public final void onFinish() {
        this.A00.onFinish();
    }

    @Override // X.C11R
    public final void onStart() {
        this.A00.onStart();
    }

    @Override // X.C11R
    public final void run() {
        this.A00.run();
    }

    public C9QQ(C1ON c1on) {
        this.A00 = c1on;
        c1on.A00 = new C207879Ht(this, 2);
    }
}
