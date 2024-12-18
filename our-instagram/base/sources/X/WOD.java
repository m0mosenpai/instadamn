package X;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes11.dex */
public final class WOD implements ViewTreeObserver.OnDrawListener {
    public boolean A00;
    public final View A01;
    public final InterfaceC16820sZ A02;
    public final Handler A03 = AbstractC167007dF.A0J();

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (!this.A00) {
            this.A00 = true;
            this.A03.postAtFrontOfQueue(new RunnableC71331Wrz(this));
        }
    }

    public WOD(View view, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = view;
        this.A02 = interfaceC16820sZ;
    }
}
