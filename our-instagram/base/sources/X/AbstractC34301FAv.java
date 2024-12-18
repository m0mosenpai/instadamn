package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.FAv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34301FAv {
    public static final void A00(Context context, View view, String str, boolean z) {
        C14360o3.A0B(context, 2);
        if (z && view != null) {
            IgTextView A0d = AbstractC25231BEo.A0d(view, R.id.label);
            IgImageView A0T = AbstractC167007dF.A0T(view, R.id.button);
            A0d.setText(2131956830);
            A0T.setImageResource(R.drawable.instagram_check_pano_outline_24);
            AbstractC167007dF.A0J().postDelayed(new RunnableC36956GPz(A0d, A0T, str), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
            return;
        }
        if (str == null) {
            str = AbstractC167027dH.A0P(context, 2131965226);
            C14360o3.A07(str);
        }
        C9GR.A09(context, str);
    }
}
