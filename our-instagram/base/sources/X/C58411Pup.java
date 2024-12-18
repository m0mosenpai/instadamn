package X;

/* renamed from: X.Pup, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58411Pup {
    public final C5KS A00 = new C5KS();

    public C58411Pup() {
    }

    public final void A00(Exception exc) {
        this.A00.A0C(exc);
    }

    public final void A01(Object obj) {
        this.A00.A0D(obj);
    }

    public final boolean A02(Exception exc) {
        C5KS c5ks = this.A00;
        C3U5.A03(exc, AbstractC111324zv.A00(3596));
        synchronized (c5ks.A04) {
            if (c5ks.A02) {
                return false;
            }
            c5ks.A02 = true;
            c5ks.A00 = exc;
            c5ks.A03.A01(c5ks);
            return true;
        }
    }

    public C58411Pup(C62446SBz c62446SBz) {
        c62446SBz.A00.A04(new T7B(new T7E(this)), AbstractC58437PvG.A00);
    }
}
