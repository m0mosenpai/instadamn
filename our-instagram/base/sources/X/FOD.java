package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes6.dex */
public final class FOD {
    public Drawable A00;
    public final Drawable A01;
    public final View A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final CircularImageView A07;
    public final IgdsButton A08;

    public FOD(Context context, View view, ImageView imageView, TextView textView, TextView textView2, TextView textView3, CircularImageView circularImageView, IgdsButton igdsButton) {
        C14360o3.A0B(context, 1);
        AbstractC25234BEr.A1R(circularImageView, textView, textView2, imageView, textView3);
        C14360o3.A0B(igdsButton, 8);
        this.A07 = circularImageView;
        this.A06 = textView;
        this.A05 = textView2;
        this.A03 = imageView;
        this.A04 = textView3;
        this.A02 = view;
        this.A08 = igdsButton;
        Drawable drawable = context.getDrawable(R.drawable.instagram_payments_icons_radio);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            C14360o3.A07(mutate);
            this.A00 = mutate;
            AbstractC25231BEo.A0x(context, mutate, R.color.badge_color);
            Drawable drawable2 = context.getDrawable(R.drawable.unchecked);
            if (drawable2 != null) {
                Drawable mutate2 = drawable2.mutate();
                this.A01 = mutate2;
                AbstractC25231BEo.A0x(context, mutate2, R.color.baseline_neutral_80);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
