package X;

import android.view.View;
import java.util.List;

/* renamed from: X.AmI, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24074AmI implements InterfaceC125355lh {
    public final /* synthetic */ C1820485o A00;

    public C24074AmI(C1820485o c1820485o) {
        this.A00 = c1820485o;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        C1820485o c1820485o = this.A00;
        List list = c1820485o.A0J;
        synchronized (list) {
            int i = c1820485o.A02 + 1;
            c1820485o.A02 = i;
            if (i == list.size()) {
                c1820485o.A02 = 0;
                View view = c1820485o.A0A;
                Runnable runnable = c1820485o.A0H;
                view.removeCallbacks(runnable);
                view.post(runnable);
                Runnable runnable2 = c1820485o.A0I;
                view.removeCallbacks(runnable2);
                view.post(runnable2);
                return;
            }
            c1820485o.A0A.postDelayed(new Runnable() { // from class: X.Ar1
                @Override // java.lang.Runnable
                public final void run() {
                    C1820485o.A00(C24074AmI.this.A00);
                }
            }, 1000L);
        }
    }
}
