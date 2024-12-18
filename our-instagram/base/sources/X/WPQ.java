package X;

import android.view.Window;

/* loaded from: classes11.dex */
public final class WPQ implements InterfaceC71933XBi {
    public final /* synthetic */ LayoutInflaterFactory2C52042a4 A00;

    public WPQ(LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4) {
        this.A00 = layoutInflaterFactory2C52042a4;
    }

    @Override // X.InterfaceC71933XBi
    public final void D5e(WQH wqh, boolean z) {
        WQH A00 = wqh.A00();
        boolean A1a = AbstractC25229BEm.A1a(A00, wqh);
        LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = this.A00;
        if (A1a) {
            wqh = A00;
        }
        C53142bw[] c53142bwArr = layoutInflaterFactory2C52042a4.A0g;
        if (c53142bwArr != null) {
            for (C53142bw c53142bw : c53142bwArr) {
                if (c53142bw != null && c53142bw.A0A == wqh) {
                    if (A1a) {
                        layoutInflaterFactory2C52042a4.A0X(A00, c53142bw, c53142bw.A01);
                        layoutInflaterFactory2C52042a4.A0Y(c53142bw, true);
                        return;
                    } else {
                        layoutInflaterFactory2C52042a4.A0Y(c53142bw, z);
                        return;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC71933XBi
    public final boolean DWt(WQH wqh) {
        Window.Callback callback;
        if (wqh == wqh.A00()) {
            LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = this.A00;
            if (layoutInflaterFactory2C52042a4.A0Y && (callback = layoutInflaterFactory2C52042a4.A0A.getCallback()) != null && !layoutInflaterFactory2C52042a4.A0U) {
                callback.onMenuOpened(108, wqh);
                return true;
            }
            return true;
        }
        return true;
    }
}
