package X;

import java.lang.ref.WeakReference;

/* renamed from: X.Fzj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36289Fzj implements InterfaceC13000lm {
    public WeakReference A00;
    public WeakReference A01;
    public final InterfaceC41501vz A02;
    public final AbstractC12990ll A03;

    public static C34947FaX A00(AbstractC12990ll abstractC12990ll) {
        C34947FaX c34947FaX;
        C36289Fzj c36289Fzj = (C36289Fzj) C31651DvH.A00(abstractC12990ll, C36289Fzj.class, 26);
        WeakReference weakReference = c36289Fzj.A01;
        if (weakReference == null || (c34947FaX = (C34947FaX) weakReference.get()) == null) {
            C34947FaX c34947FaX2 = new C34947FaX();
            c36289Fzj.A01 = AbstractC25225BEi.A16(c34947FaX2);
            return c34947FaX2;
        }
        return c34947FaX;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.clear();
        WeakReference weakReference = this.A01;
        if (weakReference != null) {
            weakReference.clear();
        }
        AbstractC25651Mw.A00(this.A03).A02(this.A02, C42281xI.class);
    }

    public C36289Fzj(AbstractC12990ll abstractC12990ll, C34946FaW c34946FaW) {
        C36155FxU c36155FxU = new C36155FxU(this, 26);
        this.A02 = c36155FxU;
        this.A03 = abstractC12990ll;
        this.A00 = AbstractC25225BEi.A16(c34946FaW);
        AbstractC25651Mw.A00(abstractC12990ll).A01(c36155FxU, C42281xI.class);
    }
}
