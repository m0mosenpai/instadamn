package X;

import android.view.MotionEvent;

/* renamed from: X.D1o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC29587D1o implements Runnable {
    public final /* synthetic */ MotionEvent A00;
    public final /* synthetic */ ViewOnTouchListenerC138696Pz A01;

    public RunnableC29587D1o(MotionEvent motionEvent, ViewOnTouchListenerC138696Pz viewOnTouchListenerC138696Pz) {
        this.A01 = viewOnTouchListenerC138696Pz;
        this.A00 = motionEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = System.currentTimeMillis();
        ViewOnTouchListenerC138696Pz viewOnTouchListenerC138696Pz = this.A01;
        if (currentTimeMillis - viewOnTouchListenerC138696Pz.A02 > 650 && viewOnTouchListenerC138696Pz.A03) {
            InterfaceC145426h1 interfaceC145426h1 = viewOnTouchListenerC138696Pz.A0C;
            if (!interfaceC145426h1.CWp()) {
                if (AbstractC28067CYv.A01(viewOnTouchListenerC138696Pz.A09)) {
                    interfaceC145426h1.DJz(ViewOnTouchListenerC138696Pz.A00(this.A00, viewOnTouchListenerC138696Pz, AbstractC111324zv.A00(4712)), false);
                } else {
                    viewOnTouchListenerC138696Pz.A03 = false;
                    interfaceC145426h1.Dwo(false);
                }
            }
        }
    }
}
