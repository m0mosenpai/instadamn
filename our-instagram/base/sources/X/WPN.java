package X;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes11.dex */
public final class WPN implements InterfaceC52052a5 {
    public final /* synthetic */ Toolbar A00;

    public WPN(Toolbar toolbar) {
        this.A00 = toolbar;
    }

    @Override // X.InterfaceC52052a5
    public final boolean DSo(MenuItem menuItem, WQH wqh) {
        InterfaceC52052a5 interfaceC52052a5 = this.A00.A0D;
        if (interfaceC52052a5 != null && interfaceC52052a5.DSo(menuItem, wqh)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC52052a5
    public final void DSq(WQH wqh) {
        Toolbar toolbar = this.A00;
        WPV wpv = toolbar.A0E.A04;
        if (wpv == null || !wpv.A03()) {
            toolbar.A0e.A00(wqh);
        }
        InterfaceC52052a5 interfaceC52052a5 = toolbar.A0D;
        if (interfaceC52052a5 != null) {
            interfaceC52052a5.DSq(wqh);
        }
    }
}
