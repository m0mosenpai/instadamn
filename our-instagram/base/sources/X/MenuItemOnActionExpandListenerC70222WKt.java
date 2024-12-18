package X;

import android.view.MenuItem;

/* renamed from: X.WKt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class MenuItemOnActionExpandListenerC70222WKt implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener A00;
    public final /* synthetic */ UDH A01;

    public MenuItemOnActionExpandListenerC70222WKt(MenuItem.OnActionExpandListener onActionExpandListener, UDH udh) {
        this.A01 = udh;
        this.A00 = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.A00.onMenuItemActionCollapse(this.A01.A00(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.A00.onMenuItemActionExpand(this.A01.A00(menuItem));
    }
}
