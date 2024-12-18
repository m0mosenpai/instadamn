package X;

import com.facebookpay.expresscheckout.models.AuthScreenStyle;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class Q8g extends AbstractC52922bZ {
    public AuthScreenStyle A00;
    public C62738SOe A01;
    public final C2GT A02;
    public final C58252li A03;
    public final C58252li A04;
    public final InterfaceC58362lv A07;
    public final InterfaceC58362lv A08;
    public final InterfaceC58362lv A09;
    public final UFS A0A;
    public final List A0B;
    public final UFP A0C;
    public final C2GS A06 = AbstractC58318PtA.A0J();
    public final C58252li A05 = AbstractC58318PtA.A0I();

    public static final void A00(SJJ sjj, Q8g q8g) {
        if (!A02(sjj, q8g)) {
            ArrayList A1E = AbstractC166987dD.A1E();
            C62738SOe c62738SOe = q8g.A01;
            if (c62738SOe != null) {
                A1E.addAll(c62738SOe.A01);
                PaymentMethod paymentMethod = sjj.A03;
                A1E.add(new SP0(1, false, AbstractC166987dD.A1J(new SPN(null, null, paymentMethod.AtA(), null, null, paymentMethod.getTitle(), "CSC", null, null, null))));
                C62738SOe c62738SOe2 = q8g.A01;
                if (c62738SOe2 != null) {
                    q8g.A01 = new C62738SOe(A1E, c62738SOe2.A00 + 1);
                    return;
                }
            }
            C14360o3.A0F("authFactorRequirement");
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x005a, code lost:
    
        if (r2 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.Q8g r6) {
        /*
            java.util.List r0 = r6.A0B
            java.util.Iterator r2 = r0.iterator()
            r5 = 1
            r4 = 1
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r2.next()
            X.2GT r0 = (X.C2GT) r0
            X.Sjd r1 = X.AbstractC58318PtA.A0S(r0)
            if (r1 == 0) goto L2a
            boolean r0 = X.C63406Sjd.A0H(r1)
            if (r0 == 0) goto L22
            r5 = 0
            goto L8
        L22:
            boolean r0 = X.C63406Sjd.A0G(r1)
            if (r0 == 0) goto L8
            r4 = 0
            goto L8
        L2a:
            java.lang.String r0 = "Empty components value found"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        L31:
            X.2GS r0 = r6.A06
            java.lang.Object r0 = r0.A02()
            com.facebookpay.common.models.CurrencyAmount r0 = (com.facebookpay.common.models.CurrencyAmount) r0
            r3 = 0
            if (r0 == 0) goto L68
            java.lang.String r1 = r0.A00
            java.lang.String r0 = r0.A01
            X.W1r r2 = new X.W1r
            r2.<init>(r1, r0)
        L45:
            X.2li r1 = r6.A05
            if (r5 == 0) goto L5a
            if (r2 == 0) goto L5c
            if (r4 != 0) goto L55
            X.Sjd r0 = X.C63406Sjd.A05(r2, r3)
        L51:
            r1.A0B(r0)
            return
        L55:
            X.Sjd r0 = X.C63406Sjd.A04(r2)
            goto L51
        L5a:
            if (r2 != 0) goto L63
        L5c:
            java.lang.String r0 = ""
            X.W1r r2 = new X.W1r
            r2.<init>(r0, r0)
        L63:
            X.Sjd r0 = X.C63406Sjd.A03(r2)
            goto L51
        L68:
            r2 = r3
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q8g.A01(X.Q8g):void");
    }

    public static final boolean A02(SJJ sjj, Q8g q8g) {
        C62738SOe c62738SOe = q8g.A01;
        if (c62738SOe != null) {
            Iterator<SP0> it = c62738SOe.A01.iterator();
            while (it.hasNext()) {
                List<SPN> list = it.next().A00;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (SPN spn : list) {
                        if (C14360o3.A0K(spn.A00, "CSC")) {
                            String str = spn.A02;
                            PaymentMethod paymentMethod = sjj.A03;
                            if (C14360o3.A0K(str, paymentMethod.AtA()) && C14360o3.A0K(spn.A06, paymentMethod.getTitle())) {
                                return true;
                            }
                        }
                    }
                }
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            C62738SOe c62738SOe2 = q8g.A01;
            if (c62738SOe2 != null) {
                int i = c62738SOe2.A00;
                for (SP0 sp0 : c62738SOe2.A01) {
                    List<SPN> list2 = sp0.A00;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<SPN> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (C14360o3.A0K(it2.next().A00, "CSC")) {
                                i--;
                                break;
                            }
                        }
                    }
                    A1E.add(sp0);
                }
                q8g.A01 = new C62738SOe(A1E, i);
                return false;
            }
        }
        C14360o3.A0F("authFactorRequirement");
        throw C00O.createAndThrow();
    }

    public Q8g(UFP ufp, UFS ufs) {
        this.A0A = ufs;
        this.A0C = ufp;
        C58252li A0I = AbstractC58318PtA.A0I();
        MSX.A1B(A0I, false);
        this.A04 = A0I;
        C58252li A0I2 = AbstractC58318PtA.A0I();
        this.A03 = A0I2;
        this.A02 = A0I2;
        this.A0B = AbstractC166987dD.A1E();
        this.A08 = C63628Sqa.A00(this, 25);
        this.A07 = C63628Sqa.A00(this, 24);
        this.A09 = C63628Sqa.A00(this, 26);
    }
}
