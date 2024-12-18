package X;

import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: X.Pcp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57329Pcp extends C0YY implements InterfaceC16820sZ {
    public static final C57329Pcp A00 = new C57329Pcp();

    public C57329Pcp() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        SNN snn;
        synchronized (this) {
            long currentTimeMillis = System.currentTimeMillis();
            Enumeration<String> aliases = C2ID.A00().aliases();
            C14360o3.A07(aliases);
            C225317p c225317p = new C225317p(AbstractC224517h.A04(C57606PhI.A00, AbstractC224517h.A05(AbstractC224517h.A09(C57605PhH.A00, AbstractC224517h.A04(C57604PhG.A00, AbstractC224717j.A0A(new C16950sn(aliases)))))));
            while (c225317p.hasNext()) {
                C2ID.A00().deleteEntry(AnonymousClass001.A0Q("W3C_PAYMENT_ENCRYPTION_KEY_", AbstractC166987dD.A0N(c225317p.next())));
            }
            Enumeration<String> aliases2 = C2ID.A00().aliases();
            C14360o3.A07(aliases2);
            Iterator it = AbstractC224717j.A0A(new C16950sn(aliases2)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (C14360o3.A0K(next, AnonymousClass001.A0Q("W3C_PAYMENT_ENCRYPTION_KEY_", currentTimeMillis))) {
                    if (next != null) {
                        throw new SecurityException(AnonymousClass001.A0Q("Please throttle your call, not more than one key per millisecond. Timestamp:", currentTimeMillis));
                    }
                }
            }
            snn = new SNN(currentTimeMillis);
        }
        return snn;
    }
}
