package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsRadioButton;

/* loaded from: classes8.dex */
public final class L2W {
    public final View A00;
    public final TextView A01;
    public final IgdsRadioButton A02;
    public final ImageView A03;

    public L2W(View view, Context context) {
        Drawable drawable;
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC166987dD.A0c(view, R.id.row_add_to_exclusive_story_container);
        ImageView imageView = (ImageView) AbstractC166987dD.A0c(view, R.id.icon);
        this.A03 = imageView;
        View A0F = AbstractC43594JPz.A0F(view, R.id.show_fans_label_stub);
        C14360o3.A0C(A0F, "null cannot be cast to non-null type android.widget.TextView");
        this.A01 = (TextView) A0F;
        this.A02 = (IgdsRadioButton) AbstractC166987dD.A0c(view, R.id.recipient_picker_radio_button);
        Drawable drawable2 = context.getDrawable(R.drawable.exclusive_story_recipient_picker);
        if (drawable2 != null) {
            drawable = drawable2.mutate();
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
    }
}
