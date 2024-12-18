package X;

import android.view.MenuItem;

/* loaded from: classes11.dex */
public final class WPL implements InterfaceC52052a5 {
    public final /* synthetic */ UD7 A00;

    @Override // X.InterfaceC52052a5
    public final boolean DSo(MenuItem menuItem, WQH wqh) {
        return false;
    }

    public WPL(UD7 ud7) {
        this.A00 = ud7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r1 == false) goto L8;
     */
    @Override // X.InterfaceC52052a5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DSq(X.WQH r5) {
        /*
            r4 = this;
            X.UD7 r2 = r4.A00
            X.XBl r0 = r2.A06
            X.WPa r0 = (X.WPa) r0
            androidx.appcompat.widget.Toolbar r0 = r0.A09
            androidx.appcompat.widget.ActionMenuView r0 = r0.A0E
            if (r0 == 0) goto L17
            X.WPV r0 = r0.A04
            if (r0 == 0) goto L17
            boolean r1 = r0.A03()
            r0 = 1
            if (r1 != 0) goto L18
        L17:
            r0 = 0
        L18:
            r3 = 108(0x6c, float:1.51E-43)
            android.view.Window$Callback r2 = r2.A04
            if (r0 == 0) goto L22
            r2.onPanelClosed(r3, r5)
        L21:
            return
        L22:
            r1 = 0
            r0 = 0
            boolean r0 = r2.onPreparePanel(r1, r0, r5)
            if (r0 == 0) goto L21
            r2.onMenuOpened(r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WPL.DSq(X.WQH):void");
    }
}
