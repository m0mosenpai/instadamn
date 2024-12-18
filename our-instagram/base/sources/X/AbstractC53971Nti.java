package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.instagram.discovery.mediamap.fragment.bottomsheetbehavior.MapBottomSheetBehavior;

/* renamed from: X.Nti, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53971Nti {
    public static final MapBottomSheetBehavior A00(View view) {
        C14360o3.A0B(view, 0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C56292iI) {
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            CoordinatorLayout.Behavior behavior = ((C56292iI) layoutParams).A0A;
            if (behavior instanceof MapBottomSheetBehavior) {
                return (MapBottomSheetBehavior) behavior;
            }
            throw AbstractC166987dD.A12("The view is not associated with BottomSheetBehavior");
        }
        throw AbstractC166987dD.A12("The view is not a child of CoordinatorLayout");
    }
}
