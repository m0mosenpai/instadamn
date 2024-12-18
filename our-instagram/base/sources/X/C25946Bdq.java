package X;

import androidx.viewpager.widget.ViewPager;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import java.lang.ref.WeakReference;

/* renamed from: X.Bdq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25946Bdq extends AbstractC08380c0 {
    public final WeakReference A00;
    public final WeakReference A01;

    @Override // X.AbstractC08380c0, X.InterfaceC021908q
    public final void onPageScrolled(int i, float f, int i2) {
        LithoView lithoView;
        ComponentTree componentTree = (ComponentTree) this.A00.get();
        if (componentTree != null && (lithoView = componentTree.A07) != null) {
            lithoView.Ctb();
        }
    }

    public C25946Bdq(ViewPager viewPager, ComponentTree componentTree) {
        AbstractC167017dG.A1P(componentTree, viewPager);
        this.A00 = AbstractC25225BEi.A16(componentTree);
        this.A01 = AbstractC25225BEi.A16(viewPager);
    }
}
