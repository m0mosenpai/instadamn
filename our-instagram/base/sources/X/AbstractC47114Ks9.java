package X;

import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Ks9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47114Ks9 {
    public static final int A00(ViewGroup viewGroup) {
        int measuredWidth = viewGroup.getMeasuredWidth();
        float dimension = viewGroup.getResources().getDimension(R.dimen.abc_select_dialog_padding_start_material);
        return (int) AbstractC25227BEk.A00(measuredWidth, (2.0f * dimension) + (1.0f * dimension));
    }
}
