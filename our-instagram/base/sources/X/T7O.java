package X;

import android.util.Base64;

/* loaded from: classes10.dex */
public final class T7O implements InterfaceC57913PmJ {
    public final SGY A00;

    public T7O(SGY sgy) {
        this.A00 = sgy;
    }

    @Override // X.InterfaceC57913PmJ
    public final C5KS EJA(AbstractC53436NkP abstractC53436NkP) {
        C5KS c5ks;
        SGY sgy = this.A00;
        final C63186Sel c63186Sel = sgy.A01;
        if (c63186Sel == null) {
            N21 n21 = new N21(-2, null);
            C5KS c5ks2 = new C5KS();
            c5ks2.A0C(n21);
            return c5ks2;
        }
        try {
            byte[] decode = Base64.decode(((N26) abstractC53436NkP).A00, 10);
            sgy.A00.A01("requestIntegrityToken(%s)", abstractC53436NkP);
            final C58411Pup c58411Pup = new C58411Pup();
            RPH rph = new RPH(c58411Pup, c58411Pup, abstractC53436NkP, sgy, decode);
            Object obj = c63186Sel.A07;
            synchronized (obj) {
                c63186Sel.A0A.add(c58411Pup);
                c5ks = c58411Pup.A00;
                c5ks.A03(new YO0() { // from class: X.T6t
                    @Override // X.YO0
                    public final void D6a(C5KS c5ks3) {
                        C63186Sel c63186Sel2 = c63186Sel;
                        C58411Pup c58411Pup2 = c58411Pup;
                        synchronized (c63186Sel2.A07) {
                            c63186Sel2.A0A.remove(c58411Pup2);
                        }
                    }
                });
            }
            synchronized (obj) {
                if (c63186Sel.A0B.getAndIncrement() > 0) {
                    C62928SXk c62928SXk = c63186Sel.A06;
                    if (android.util.Log.isLoggable("PlayCore", 3)) {
                        AnonymousClass001.A0g(c62928SXk.A00, " : ", "Already connected to the service.");
                    }
                }
            }
            c63186Sel.A01().post(new RPF(((AbstractRunnableC64727TRj) rph).A00, rph, c63186Sel));
            return c5ks;
        } catch (IllegalArgumentException e) {
            N21 n212 = new N21(-13, e);
            C5KS c5ks3 = new C5KS();
            c5ks3.A0C(n212);
            return c5ks3;
        }
    }
}
