package X;

import android.view.Window;

/* loaded from: classes11.dex */
public final class WPP implements InterfaceC71933XBi {
    public final /* synthetic */ LayoutInflaterFactory2C52042a4 A00;

    public WPP(LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4) {
        this.A00 = layoutInflaterFactory2C52042a4;
    }

    @Override // X.InterfaceC71933XBi
    public final void D5e(WQH wqh, boolean z) {
        this.A00.A0Z(wqh);
    }

    @Override // X.InterfaceC71933XBi
    public final boolean DWt(WQH wqh) {
        Window.Callback callback = this.A00.A0A.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, wqh);
            return true;
        }
        return true;
    }
}
