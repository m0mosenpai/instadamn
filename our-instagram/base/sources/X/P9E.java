package X;

import android.view.MotionEvent;

/* loaded from: classes9.dex */
public final class P9E implements InterfaceC57982PnS {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ InterfaceC145436h2 A01;

    public P9E(C41181vS c41181vS, InterfaceC145436h2 interfaceC145436h2) {
        this.A01 = interfaceC145436h2;
        this.A00 = c41181vS;
    }

    @Override // X.InterfaceC57982PnS
    public final void D44(MotionEvent motionEvent) {
        this.A01.DMW(this.A00, C2Fb.A3f, motionEvent.getRawX(), motionEvent.getRawY());
    }
}
