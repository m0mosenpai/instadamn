package X;

import android.util.SparseArray;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.WuF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71453WuF implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C63627SqZ A01;

    public RunnableC71453WuF(View view, C63627SqZ c63627SqZ) {
        this.A01 = c63627SqZ;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BottomSheetBehavior bottomSheetBehavior;
        View view = this.A00;
        SparseArray sparseArray = Q83.A06;
        View view2 = (View) view.getParent();
        if (view2 != null && (view2.getLayoutParams() instanceof C56292iI) && (bottomSheetBehavior = (BottomSheetBehavior) ((C56292iI) view2.getLayoutParams()).A0A) != null) {
            bottomSheetBehavior.A0V(view.getMeasuredHeight());
        }
    }
}
