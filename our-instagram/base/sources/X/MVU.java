package X;

import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
public final class MVU implements C1GL {
    public final WeakReference A00;

    @Override // X.C1GL
    public final void schedule(C11R c11r) {
        AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A00.get();
        if (abstractC59962oe != null) {
            abstractC59962oe.schedule(c11r);
        }
    }

    public MVU(C59952od c59952od) {
        this.A00 = AbstractC25225BEi.A16(c59952od);
    }

    @Override // X.C1GL
    public final void schedule(C11R c11r, int i, int i2, boolean z, boolean z2) {
        AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A00.get();
        if (abstractC59962oe != null) {
            abstractC59962oe.schedule(c11r, i, i2, z, z2);
        }
    }
}
