package X;

import java.util.List;

/* renamed from: X.2Z0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2Z0 implements C2Z1 {
    public final C2XE A00;
    public final List A01;

    public C2Z0(C2XE c2xe, List list) {
        C14360o3.A0B(c2xe, 1);
        this.A00 = c2xe;
        this.A01 = list;
    }

    public final void A00(AbstractC50812Vc abstractC50812Vc) {
        if (abstractC50812Vc != null) {
            this.A01.add(abstractC50812Vc);
        }
    }

    @Override // X.C2Z1
    public final C2XE ArD() {
        return this.A00;
    }

    @Override // X.C2YS
    public final C2XH BoZ() {
        C2XH c2xh = ArD().A0D;
        C14360o3.A07(c2xh);
        return c2xh;
    }
}
