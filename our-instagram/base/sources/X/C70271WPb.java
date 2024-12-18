package X;

import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import java.util.List;

/* renamed from: X.WPb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70271WPb implements InterfaceC71937XBm {
    public final /* synthetic */ UDJ A00;

    public C70271WPb(UDJ udj) {
        this.A00 = udj;
    }

    @Override // X.InterfaceC71937XBm
    public final void DNU(MenuItem menuItem, WQH wqh) {
        UDJ udj = this.A00;
        Handler handler = udj.A0I;
        VgZ vgZ = null;
        handler.removeCallbacksAndMessages(null);
        List list = udj.A0M;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (wqh == ((VgZ) list.get(i)).A01) {
                if (i != -1) {
                    int i2 = i + 1;
                    if (i2 < list.size()) {
                        vgZ = (VgZ) list.get(i2);
                    }
                    handler.postAtTime(new RunnableC71583Wwf(menuItem, this, vgZ, wqh), wqh, SystemClock.uptimeMillis() + 200);
                    return;
                }
                return;
            }
        }
    }

    @Override // X.InterfaceC71937XBm
    public final void DNV(MenuItem menuItem, WQH wqh) {
        this.A00.A0I.removeCallbacksAndMessages(wqh);
    }
}
