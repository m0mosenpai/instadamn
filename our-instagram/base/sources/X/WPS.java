package X;

import androidx.appcompat.widget.ActionMenuView;

/* loaded from: classes11.dex */
public final class WPS implements InterfaceC71933XBi {
    public boolean A00;
    public final /* synthetic */ UD7 A01;

    public WPS(UD7 ud7) {
        this.A01 = ud7;
    }

    @Override // X.InterfaceC71933XBi
    public final void D5e(WQH wqh, boolean z) {
        WPV wpv;
        if (!this.A00) {
            this.A00 = true;
            UD7 ud7 = this.A01;
            ActionMenuView actionMenuView = ((WPa) ud7.A06).A09.A0E;
            if (actionMenuView != null && (wpv = actionMenuView.A04) != null) {
                wpv.A01();
            }
            ud7.A04.onPanelClosed(108, wqh);
            this.A00 = false;
        }
    }

    @Override // X.InterfaceC71933XBi
    public final boolean DWt(WQH wqh) {
        this.A01.A04.onMenuOpened(108, wqh);
        return true;
    }
}
