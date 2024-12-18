package X;

import android.content.Context;
import android.view.MenuItem;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class UDD extends VK7 implements InterfaceC52052a5 {
    public Context A00;
    public XDW A01;
    public WQH A02;
    public ActionBarContextView A03;
    public WeakReference A04;
    public boolean A05;

    @Override // X.InterfaceC52052a5
    public final boolean DSo(MenuItem menuItem, WQH wqh) {
        return this.A01.Cuf(menuItem, this);
    }

    @Override // X.InterfaceC52052a5
    public final void DSq(WQH wqh) {
        A01();
        WPV wpv = this.A03.A02;
        if (wpv != null) {
            wpv.A04();
        }
    }
}
