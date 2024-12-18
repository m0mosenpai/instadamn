package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import java.util.List;

/* renamed from: X.JeJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44094JeJ extends AbstractC44098JeN implements MPJ {
    public List A00;
    public final InterfaceC50521MRz A01;

    public final View A01(int i) {
        if (this instanceof C46080Kac) {
            return (View) ((C46080Kac) this).A01.A07.get(i);
        }
        C154306wf A07 = ((C46079Kab) this).A01.A07(i);
        if (A07 != null) {
            return A07.A03;
        }
        return null;
    }

    public final Fragment A03(Object obj) {
        Fragment item = getItem(this.A00.indexOf(obj));
        C14360o3.A07(item);
        return item;
    }

    public final ViewPager A04() {
        if (this instanceof C46080Kac) {
            return ((C46080Kac) this).A00;
        }
        return ((C46079Kab) this).A00;
    }

    public final void A06(Object obj) {
        setMode(this.A00.indexOf(obj));
    }

    @Override // X.AbstractC44098JeN
    public final Fragment createItem(int i) {
        return this.A01.ALl(this.A00.get(i));
    }

    @Override // X.AbstractC021208i
    public final int getCount() {
        return this.A00.size();
    }

    public AbstractC44094JeJ(AbstractC10360h2 abstractC10360h2, InterfaceC50521MRz interfaceC50521MRz, List list) {
        super(abstractC10360h2);
        this.A01 = interfaceC50521MRz;
        this.A00 = list;
    }

    public final Fragment A02() {
        Fragment item = getItem(A04().getCurrentItem());
        C14360o3.A07(item);
        return item;
    }

    public final Object A05() {
        return this.A00.get(A04().getCurrentItem());
    }

    @Override // X.MPJ
    public void setMode(int i) {
        A04().setCurrentItem(i);
    }
}
