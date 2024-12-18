package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;

/* loaded from: classes11.dex */
public abstract class VRV {
    public static final void A00(View view) {
        View A0S = AbstractC166997dE.A0S(view, R.id.reach_rating_bar);
        View A0S2 = AbstractC166997dE.A0S(view, R.id.reach_rating_text);
        Context context = view.getContext();
        AbstractC31172DnG.A1B(context, A0S, AbstractC53242c7.A0H(context, R.attr.igds_color_stroke));
        A0S2.setVisibility(8);
    }
}
