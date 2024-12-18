package X;

import android.content.Context;
import android.view.MenuItem;

/* renamed from: X.Vr1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69537Vr1 {
    public C005001p A00;
    public final Context A01;

    public final MenuItem A00(MenuItem menuItem) {
        if (menuItem instanceof C02K) {
            C02K c02k = (C02K) menuItem;
            C005001p c005001p = this.A00;
            if (c005001p == null) {
                c005001p = new C005001p(0);
                this.A00 = c005001p;
            }
            MenuItem menuItem2 = (MenuItem) c005001p.get(c02k);
            if (menuItem2 == null) {
                UDH udh = new UDH(this.A01, c02k);
                this.A00.put(c02k, udh);
                return udh;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public AbstractC69537Vr1(Context context) {
        this.A01 = context;
    }
}
