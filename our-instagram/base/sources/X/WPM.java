package X;

import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes11.dex */
public final class WPM implements InterfaceC52052a5 {
    public final /* synthetic */ ActionMenuView A00;

    public WPM(ActionMenuView actionMenuView) {
        this.A00 = actionMenuView;
    }

    @Override // X.InterfaceC52052a5
    public final boolean DSo(MenuItem menuItem, WQH wqh) {
        X6o x6o = this.A00.A05;
        if (x6o != null) {
            Toolbar toolbar = ((WPY) x6o).A00;
            if (!toolbar.A0e.A03(menuItem)) {
                InterfaceC71833X6q interfaceC71833X6q = toolbar.A0H;
                if (interfaceC71833X6q != null && ((C70272WPc) interfaceC71833X6q).A00.A04.onMenuItemSelected(0, menuItem)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC52052a5
    public final void DSq(WQH wqh) {
        InterfaceC52052a5 interfaceC52052a5 = this.A00.A02;
        if (interfaceC52052a5 != null) {
            interfaceC52052a5.DSq(wqh);
        }
    }
}
