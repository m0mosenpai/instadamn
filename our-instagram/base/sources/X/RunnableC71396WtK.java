package X;

import android.view.View;

/* renamed from: X.WtK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71396WtK implements Runnable {
    public UDM A00;
    public final /* synthetic */ WPV A01;

    public RunnableC71396WtK(UDM udm, WPV wpv) {
        this.A01 = wpv;
        this.A00 = udm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC52052a5 interfaceC52052a5;
        WPV wpv = this.A01;
        WQH wqh = wpv.A06;
        if (wqh != null && (interfaceC52052a5 = wqh.A03) != null) {
            interfaceC52052a5.DSq(wqh);
        }
        View view = (View) wpv.A08;
        if (view != null && view.getWindowToken() != null) {
            UDM udm = this.A00;
            WPX wpx = udm.A03;
            if (wpx == null || !wpx.CdI()) {
                if (udm.A01 != null) {
                    WPX A00 = udm.A00();
                    if (A00 instanceof UDK) {
                        ((UDK) A00).A07 = false;
                    } else {
                        ((UDJ) A00).A0D = false;
                    }
                    A00.show();
                }
            }
            wpv.A0D = udm;
        }
        wpv.A0B = null;
    }
}
