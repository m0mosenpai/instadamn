package X;

import android.view.MenuItem;

/* renamed from: X.WKu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class MenuItemOnMenuItemClickListenerC70223WKu implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener A00;
    public final /* synthetic */ UDH A01;

    public MenuItemOnMenuItemClickListenerC70223WKu(MenuItem.OnMenuItemClickListener onMenuItemClickListener, UDH udh) {
        this.A01 = udh;
        this.A00 = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.A00.onMenuItemClick(this.A01.A00(menuItem));
    }
}
