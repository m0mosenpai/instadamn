package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.genericsurvey.fragment.AdBakeOffFragment;
import java.util.List;

/* loaded from: classes7.dex */
public final class IMM {
    public TextView A00;
    public final int A01;
    public final int A02;
    public final Context A03;
    public final Drawable A04;
    public final Drawable A05;
    public final AdBakeOffFragment A06;
    public final List A07 = AbstractC166987dD.A1E();

    public final void A00(boolean z) {
        int i;
        Drawable drawable;
        List<TextView> list = this.A07;
        for (TextView textView : list) {
            textView.setTag(Boolean.valueOf(z));
            if (z) {
                i = this.A01;
            } else {
                i = this.A02;
            }
            textView.setTextColor(i);
            if (z) {
                drawable = this.A04;
            } else {
                drawable = this.A05;
            }
            textView.setBackground(drawable);
        }
        ((View) list.get(AbstractC25226BEj.A05(list))).setBackground(null);
    }

    public IMM(Context context, AdBakeOffFragment adBakeOffFragment) {
        this.A06 = adBakeOffFragment;
        Resources resources = context.getResources();
        this.A01 = resources.getColor(R.color.badge_color);
        this.A02 = resources.getColor(R.color.button_text_disabled_color);
        this.A05 = resources.getDrawable(R.drawable.bakeoff_disabled_button_background);
        this.A04 = resources.getDrawable(R.drawable.bakeoff_button_background);
        this.A03 = context;
    }
}
