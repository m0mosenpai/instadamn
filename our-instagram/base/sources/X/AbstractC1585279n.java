package X;

import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.79n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1585279n {
    public static final C7QD A00(LayoutInflater layoutInflater, ConstraintLayout constraintLayout, C7QC c7qc) {
        if (c7qc == null) {
            return null;
        }
        C7QD ANU = c7qc.ANU(layoutInflater, constraintLayout);
        View BKF = ANU.BKF();
        constraintLayout.addView(BKF, BKF.getLayoutParams());
        return ANU;
    }
}
