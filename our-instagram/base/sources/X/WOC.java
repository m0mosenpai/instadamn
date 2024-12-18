package X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes11.dex */
public final class WOC implements ViewTreeObserver.OnDrawListener {
    public final View A00;
    public final InterfaceC16820sZ A01;
    public final /* synthetic */ WXo A02;

    public WOC(View view, WXo wXo, InterfaceC16820sZ interfaceC16820sZ) {
        this.A02 = wXo;
        this.A00 = view;
        this.A01 = interfaceC16820sZ;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        WXo wXo = this.A02;
        if (!wXo.A00) {
            wXo.A00 = true;
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                new Handler(myLooper).postAtFrontOfQueue(new RunnableC71246Wqb(this));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        this.A00.post(new RunnableC71247Wqc(this));
    }
}
