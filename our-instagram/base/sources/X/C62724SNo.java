package X;

/* renamed from: X.SNo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62724SNo {
    public Object A00;
    public boolean A01 = false;
    public final TI2 A02;

    public final void A00(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, SIM sim) {
        String valueOf;
        this.A01 = true;
        if (anonymousClass182.A0V()) {
            Object obj = this.A00;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = String.valueOf(obj);
            }
            anonymousClass182.A0H(valueOf);
            return;
        }
        AnonymousClass165 anonymousClass165 = sim.A01;
        if (anonymousClass165 == null) {
            return;
        }
        anonymousClass182.A0l(anonymousClass165);
        sim.A03.A0A(anonymousClass182, abstractC913345m, this.A00);
    }

    public final boolean A01(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, SIM sim) {
        Object obj = this.A00;
        if (obj != null) {
            if (this.A01 || sim.A04) {
                if (anonymousClass182.A0V()) {
                    String.valueOf(obj);
                    throw new C60567R8h(anonymousClass182, "No native support for writing Object Ids");
                }
                sim.A03.A0A(anonymousClass182, abstractC913345m, obj);
                return true;
            }
            return false;
        }
        return false;
    }

    public C62724SNo(TI2 ti2) {
        this.A02 = ti2;
    }
}
