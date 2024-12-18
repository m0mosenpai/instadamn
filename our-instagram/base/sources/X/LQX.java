package X;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class LQX implements View.OnTouchListener {
    public final /* synthetic */ C7SG A00;
    public final /* synthetic */ KTB A01;

    public LQX(C7SG c7sg, KTB ktb) {
        this.A00 = c7sg;
        this.A01 = ktb;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            InterfaceC165507ad interfaceC165507ad = this.A00.A00;
            if (!interfaceC165507ad.CQu()) {
                KTB ktb = this.A01;
                long micros = TimeUnit.MILLISECONDS.toMicros(ktb.BT8());
                ((InterfaceC165307aJ) interfaceC165507ad).El9(new PointF(motionEvent.getRawX(), motionEvent.getRawY()), ktb, ktb.BPA(), micros, ktb.CYW(), true);
            }
        }
        view.performClick();
        return true;
    }
}
