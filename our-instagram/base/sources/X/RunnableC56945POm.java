package X;

import android.os.Handler;

/* renamed from: X.POm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56945POm implements Runnable {
    public final /* synthetic */ OJW A00;

    public RunnableC56945POm(OJW ojw) {
        this.A00 = ojw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        OJW ojw = this.A00;
        InterfaceC08830cm interfaceC08830cm = ojw.A05;
        InterfaceC58192Pqy interfaceC58192Pqy = (InterfaceC58192Pqy) interfaceC08830cm.get();
        if (interfaceC58192Pqy != null && !ojw.A00 && ojw.A01 > interfaceC58192Pqy.C9p()) {
            ojw.A03.Dob();
        }
        Handler handler = ojw.A02;
        InterfaceC58192Pqy interfaceC58192Pqy2 = (InterfaceC58192Pqy) interfaceC08830cm.get();
        if (interfaceC58192Pqy2 != null && interfaceC58192Pqy2.C9p() >= ojw.A01) {
            j = 10000;
        } else {
            j = 1000;
        }
        handler.postDelayed(this, j);
    }
}
