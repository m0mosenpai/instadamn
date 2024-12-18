package X;

/* renamed from: X.WqX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71242WqX implements Runnable {
    public final /* synthetic */ WVV A00;

    public RunnableC71242WqX(WVV wvv) {
        this.A00 = wvv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WVV wvv = this.A00;
        synchronized (wvv) {
            wvv.A03 = false;
            if (wvv.A06.now() - wvv.A00 > 2000) {
                WVW wvw = wvv.A02;
                if (wvw != null) {
                    if (wvw.A0B) {
                        InterfaceC71971XDd interfaceC71971XDd = wvw.A09;
                        if (interfaceC71971XDd != null) {
                            interfaceC71971XDd.onStop();
                        }
                    } else {
                        wvw.A08.clear();
                    }
                }
            } else {
                WVV.A00(wvv);
            }
        }
    }
}
