package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class WTQ implements InterfaceC71941XBq {
    public final /* synthetic */ C66206U4c A00;
    public final /* synthetic */ DialogC51582Yg A01;

    public WTQ(C66206U4c c66206U4c, DialogC51582Yg dialogC51582Yg) {
        this.A00 = c66206U4c;
        this.A01 = dialogC51582Yg;
    }

    @Override // X.InterfaceC71941XBq
    public final void DZj(View view, int i) {
        C66206U4c c66206U4c = this.A00;
        c66206U4c.requestLayout();
        c66206U4c.invalidate();
    }

    @Override // X.InterfaceC71941XBq
    public final void DZo(View view, InterfaceC51602Yi interfaceC51602Yi) {
        this.A01.A09.A0H.remove(this);
    }
}
