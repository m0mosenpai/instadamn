package X;

import android.content.Context;
import android.view.MenuItem;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class UDE extends VK7 implements InterfaceC52052a5 {
    public XDW A00;
    public WeakReference A01;
    public final Context A02;
    public final WQH A03;
    public final /* synthetic */ UD8 A04;

    public UDE(Context context, UD8 ud8, XDW xdw) {
        this.A04 = ud8;
        this.A02 = context;
        this.A00 = xdw;
        WQH wqh = new WQH(context);
        wqh.A00 = 1;
        this.A03 = wqh;
        wqh.A03 = this;
    }

    @Override // X.InterfaceC52052a5
    public final boolean DSo(MenuItem menuItem, WQH wqh) {
        XDW xdw = this.A00;
        if (xdw != null) {
            return xdw.Cuf(menuItem, this);
        }
        return false;
    }

    @Override // X.InterfaceC52052a5
    public final void DSq(WQH wqh) {
        if (this.A00 != null) {
            A01();
            WPV wpv = this.A04.A09.A02;
            if (wpv != null) {
                wpv.A04();
            }
        }
    }
}
