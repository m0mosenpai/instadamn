package X;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.VRp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68459VRp {
    public static final void A00(View view, String str, String str2, boolean z) {
        TextView A0N = AbstractC167007dF.A0N(view, R.id.primary_text);
        TextView A0N2 = AbstractC167007dF.A0N(view, R.id.secondary_text);
        if (str != null) {
            A0N.setText(str);
            A0N.setVisibility(0);
            if (z) {
                A0N.setTypeface(Typeface.defaultFromStyle(1));
            }
        } else {
            A0N.setVisibility(8);
        }
        if (str2 != null) {
            A0N2.setText(str2);
            A0N2.setVisibility(0);
        } else {
            A0N2.setVisibility(8);
        }
    }
}
