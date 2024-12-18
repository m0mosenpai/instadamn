package X;

import android.view.View;

/* loaded from: classes9.dex */
public final class PRG implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    public PRG(View view, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = view;
        this.A01 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC54888OPj.A01(this.A00, C57398Pdw.A00, false);
        this.A01.invoke();
    }
}
