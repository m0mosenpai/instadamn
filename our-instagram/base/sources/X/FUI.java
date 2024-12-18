package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public abstract class FUI {
    public static final void A01(Context context, View view) {
        C14360o3.A0B(view, 1);
        float A00 = AbstractC31415DrK.A00(context);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = AbstractC31171DnF.A02(context.getResources(), R.dimen.featured_user_story_ring_size);
        layoutParams.height = (int) (context.getResources().getDimension(R.dimen.abc_star_medium) * A00);
        view.setLayoutParams(layoutParams);
    }

    public static final float A00(float f, float f2) {
        float max = Math.max(f2, 1.0f);
        if (max > 1.0f) {
            return Math.min(f * (((max - 1.0f) / 5.0f) + 1.0f), 0.9f);
        }
        return f;
    }
}
