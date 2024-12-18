package X;

import android.app.Activity;

/* loaded from: classes10.dex */
public final /* synthetic */ class TQI implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ InterfaceC65457TkT A01;
    public final /* synthetic */ Object A02;

    public /* synthetic */ TQI(Activity activity, InterfaceC65457TkT interfaceC65457TkT, Object obj) {
        this.A00 = activity;
        this.A01 = interfaceC65457TkT;
        this.A02 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = this.A00;
        InterfaceC65457TkT interfaceC65457TkT = this.A01;
        Object obj = this.A02;
        if (!activity.isFinishing()) {
            interfaceC65457TkT.D6e(obj);
        }
    }
}
