package X;

import android.view.View;

/* renamed from: X.367, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass367 extends AbstractC682735p {
    public float A00;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        View view = (View) ((AbstractC682735p) this).A00.get(c59062n7.A03);
        if (view instanceof AbstractC115835Lx) {
            AbstractC115835Lx abstractC115835Lx = (AbstractC115835Lx) view;
            float CGk = interfaceC57162jr.CGk(c59062n7);
            float f = this.A00;
            boolean z = false;
            if (f == 0.0f) {
                z = true;
            }
            if ((z || f == 1.0f) && 0.0f < CGk && CGk < 1.0f) {
                abstractC115835Lx.E0o();
            } else if (f < 1.0f && CGk == 1.0f) {
                abstractC115835Lx.E0c();
            } else if (f > 0.0f && CGk == 0.0f) {
                abstractC115835Lx.E0l();
            }
            this.A00 = CGk;
        }
    }
}
