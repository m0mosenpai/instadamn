package X;

import android.graphics.drawable.Drawable;

/* loaded from: classes11.dex */
public final class WV5 implements InterfaceC107934tc {
    public final /* synthetic */ InterfaceC59242nQ A00;

    public WV5(InterfaceC59242nQ interfaceC59242nQ) {
        this.A00 = interfaceC59242nQ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC107934tc
    public final void E1A(boolean z) {
        InterfaceC59242nQ interfaceC59242nQ = this.A00;
        C14360o3.A0C(interfaceC59242nQ, AbstractC111324zv.A00(477));
        if (((Drawable) interfaceC59242nQ).isVisible() != z) {
            if (!z) {
                C59232nO.A00().EE1(interfaceC59242nQ);
                return;
            }
            Runnable Bm6 = interfaceC59242nQ.Bm6();
            if (Bm6 == null) {
                return;
            }
            Bm6.run();
        }
    }
}
