package X;

import android.content.Context;
import android.view.ViewManager;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class WTU implements InterfaceC71886X8t {
    public final /* synthetic */ C66351UBk A00;
    public final /* synthetic */ C69456Vnf A01;

    public WTU(C66351UBk c66351UBk, C69456Vnf c69456Vnf) {
        this.A01 = c69456Vnf;
        this.A00 = c66351UBk;
    }

    @Override // X.InterfaceC71886X8t
    public final void DAk() {
        ViewManager viewManager;
        C69456Vnf c69456Vnf = this.A01;
        Context context = c69456Vnf.A07.A00;
        C66351UBk c66351UBk = this.A00;
        WeakReference weakReference = AbstractC70006VzQ.A00;
        c66351UBk.setVisibility(8);
        try {
            viewManager = (ViewManager) context.getSystemService("window");
        } catch (IllegalArgumentException unused) {
        }
        if (viewManager != null) {
            viewManager.removeView(c66351UBk);
            WeakReference weakReference2 = AbstractC70006VzQ.A00;
            if (weakReference2.get() == c66351UBk) {
                weakReference2.clear();
            }
            c69456Vnf.A05.DAk();
            return;
        }
        throw new IllegalStateException("Window manager required but not found.");
    }
}
