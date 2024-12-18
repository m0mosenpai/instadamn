package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class FTT {
    public static final void A00(View view, String str) {
        View A0S = AbstractC166997dE.A0S(view, R.id.primary_text);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.secondary_text);
        A0S.setVisibility(8);
        if (str != null) {
            A0N.setText(str);
            A0N.setVisibility(0);
        } else {
            A0N.setVisibility(8);
        }
    }
}
