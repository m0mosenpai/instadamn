package X;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.Tv7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65846Tv7 implements InterfaceC71882X8p {
    public final int A00;

    public C65846Tv7(int i) {
        C02R.A02(i, "Margin must be non-negative");
        this.A00 = i;
    }

    @Override // X.InterfaceC71882X8p
    public final void F8Q(View view, float f) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            ViewPager2 viewPager2 = (ViewPager2) parent2;
            float f2 = this.A00 * f;
            if (viewPager2.getOrientation() == 0) {
                if (((AbstractC70663Fe) viewPager2.A02).A07.getLayoutDirection() == 1) {
                    f2 = -f2;
                }
                view.setTranslationX(f2);
                return;
            }
            view.setTranslationY(f2);
            return;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }
}
