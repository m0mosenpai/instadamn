package X;

import android.view.Menu;
import android.view.MenuItem;

/* loaded from: classes11.dex */
public final class WPJ implements XDW {
    public XDW A00;
    public final /* synthetic */ LayoutInflaterFactory2C52042a4 A01;

    public WPJ(LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4, XDW xdw) {
        this.A01 = layoutInflaterFactory2C52042a4;
        this.A00 = xdw;
    }

    @Override // X.XDW
    public final boolean Cuf(MenuItem menuItem, VK7 vk7) {
        return this.A00.Cuf(menuItem, vk7);
    }

    @Override // X.XDW
    public final boolean D83(Menu menu, VK7 vk7) {
        return this.A00.D83(menu, vk7);
    }

    @Override // X.XDW
    public final void D9v(VK7 vk7) {
        this.A00.D9v(vk7);
        LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = this.A01;
        if (layoutInflaterFactory2C52042a4.A0B != null) {
            layoutInflaterFactory2C52042a4.A0A.getDecorView().removeCallbacks(layoutInflaterFactory2C52042a4.A0Q);
        }
        if (layoutInflaterFactory2C52042a4.A0M != null) {
            C04E c04e = layoutInflaterFactory2C52042a4.A0O;
            if (c04e != null) {
                c04e.A00();
            }
            C04E A03 = AbstractC010103p.A03(layoutInflaterFactory2C52042a4.A0M);
            A03.A02(0.0f);
            layoutInflaterFactory2C52042a4.A0O = A03;
            A03.A07(new UET(this, 1));
        }
        layoutInflaterFactory2C52042a4.A0L = null;
        layoutInflaterFactory2C52042a4.A09.requestApplyInsets();
        layoutInflaterFactory2C52042a4.A0V();
    }

    @Override // X.XDW
    public final boolean DaH(Menu menu, VK7 vk7) {
        this.A01.A09.requestApplyInsets();
        return this.A00.DaH(menu, vk7);
    }
}
