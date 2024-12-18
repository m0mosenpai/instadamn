package X;

import android.content.Context;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes11.dex */
public final class V47 extends AbstractC65806TuP {
    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(context);
        C131555wr c131555wr = new C131555wr(context);
        coordinatorLayout.addView(c131555wr);
        c131555wr.setLayoutParams(new C56292iI(-2, -2));
        View c131555wr2 = new C131555wr(context);
        c131555wr2.setTag(new Object());
        coordinatorLayout.addView(c131555wr2);
        BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
        C56292iI c56292iI = new C56292iI(-1, -1);
        c56292iI.A00(bottomSheetBehavior);
        c131555wr2.setLayoutParams(c56292iI);
        return coordinatorLayout;
    }
}
