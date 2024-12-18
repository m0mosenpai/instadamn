package X;

import android.view.MenuItem;

/* renamed from: X.03B, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C03B {
    public static void A00(MenuItem menuItem, C02Y c02y) {
        if (menuItem instanceof C02K) {
            ((C02K) menuItem).EfC(c02y);
        } else {
            android.util.Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        }
    }
}
