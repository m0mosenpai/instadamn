package X;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;

/* renamed from: X.Tur, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65834Tur implements AnonymousClass054 {
    public final int A00;
    public final Object A01;

    public C65834Tur(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AnonymousClass054
    public final boolean E44(View view, AnonymousClass053 anonymousClass053) {
        C65838Tuz c65838Tuz;
        boolean z;
        int i;
        boolean z2;
        switch (this.A00) {
            case 0:
                c65838Tuz = (C65838Tuz) this.A01;
                z = true;
                i = ((ViewPager2) view).A00 + 1;
                break;
            case 1:
                c65838Tuz = (C65838Tuz) this.A01;
                z = true;
                i = ((ViewPager2) view).A00 - 1;
                break;
            default:
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.A01;
                if (swipeDismissBehavior instanceof BaseTransientBottomBar$Behavior) {
                    z2 = view instanceof UBZ;
                } else {
                    z2 = true;
                }
                boolean z3 = false;
                if (z2) {
                    boolean A1P = AbstractC167007dF.A1P(view.getLayoutDirection(), 1);
                    int i2 = swipeDismissBehavior.A02;
                    if (i2 != 0 ? !(i2 != 1 || A1P) : A1P) {
                        z3 = true;
                    }
                    int width = view.getWidth();
                    if (z3) {
                        width = -width;
                    }
                    view.offsetLeftAndRight(width);
                    view.setAlpha(0.0f);
                    InterfaceC71910X9u interfaceC71910X9u = swipeDismissBehavior.A04;
                    if (interfaceC71910X9u != null) {
                        interfaceC71910X9u.DAi(view);
                        return true;
                    }
                    return true;
                }
                return false;
        }
        ViewPager2 viewPager2 = c65838Tuz.A04;
        if (!viewPager2.A0B) {
            return true;
        }
        viewPager2.A04(i, z);
        return true;
    }
}
