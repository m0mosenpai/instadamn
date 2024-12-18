package X;

import android.view.Menu;
import android.view.Window;

/* renamed from: X.Wpw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71205Wpw implements Runnable {
    public final /* synthetic */ UD7 A00;

    public RunnableC71205Wpw(UD7 ud7) {
        this.A00 = ud7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WQH wqh;
        UD7 ud7 = this.A00;
        Menu A00 = UD7.A00(ud7);
        if (A00 instanceof WQH) {
            wqh = (WQH) A00;
            if (wqh != null) {
                wqh.A06();
            }
        } else {
            wqh = null;
        }
        try {
            A00.clear();
            Window.Callback callback = ud7.A04;
            if (!callback.onCreatePanelMenu(0, A00) || !callback.onPreparePanel(0, null, A00)) {
                A00.clear();
            }
        } finally {
            if (wqh != null) {
                wqh.A05();
            }
        }
    }
}
