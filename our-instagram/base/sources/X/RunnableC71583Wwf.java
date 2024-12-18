package X;

import android.view.MenuItem;

/* renamed from: X.Wwf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71583Wwf implements Runnable {
    public final /* synthetic */ MenuItem A00;
    public final /* synthetic */ C70271WPb A01;
    public final /* synthetic */ VgZ A02;
    public final /* synthetic */ WQH A03;

    public RunnableC71583Wwf(MenuItem menuItem, C70271WPb c70271WPb, VgZ vgZ, WQH wqh) {
        this.A01 = c70271WPb;
        this.A02 = vgZ;
        this.A00 = menuItem;
        this.A03 = wqh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VgZ vgZ = this.A02;
        if (vgZ != null) {
            UDJ udj = this.A01.A00;
            udj.A0C = true;
            vgZ.A01.A0C(false);
            udj.A0C = false;
        }
        MenuItem menuItem = this.A00;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.A03.A0I(menuItem, null, 4);
        }
    }
}
