package X;

import android.view.View;

/* loaded from: classes9.dex */
public final class PRH implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    public PRH(View view, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = view;
        this.A01 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A00;
        view.postDelayed(new PRG(view, this.A01), 900L);
    }
}
