package X;

import android.view.View;
import com.facebook.R;

/* loaded from: classes7.dex */
public abstract class IQZ {
    public static final void A00(C38525Gwl c38525Gwl) {
        View view = c38525Gwl.A07;
        view.setPadding(0, view.getPaddingTop(), 0, view.getPaddingBottom());
        int A09 = AbstractC167007dF.A09(view.getContext(), R.attr.igdsHighlightBackground);
        view.setBackgroundColor(A09);
        View view2 = c38525Gwl.A00;
        if (view2 != null) {
            view2.setBackgroundColor(A09);
        }
        c38525Gwl.A0B.setBackgroundColor(A09);
    }

    public static final void A01(C38525Gwl c38525Gwl, int i) {
        c38525Gwl.A09.setVisibility(i);
        c38525Gwl.A0G.setVisibility(i);
    }
}
