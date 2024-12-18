package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsRadioButton;

/* loaded from: classes8.dex */
public final class L3G {
    public final View A00;
    public final TextView A01;
    public final IgdsRadioButton A02;
    public final ImageView A03;
    public final TextView A04;

    public L3G(View view, Context context) {
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC166987dD.A0c(view, R.id.row_add_to_story_favorites_container);
        ImageView imageView = (ImageView) AbstractC166987dD.A0c(view, R.id.icon);
        this.A03 = imageView;
        TextView A0Q = AbstractC25230BEn.A0Q(view, R.id.label);
        this.A04 = A0Q;
        View A0F = AbstractC43594JPz.A0F(view, R.id.edit_close_friends_label_stub);
        C14360o3.A0C(A0F, "null cannot be cast to non-null type android.widget.TextView");
        this.A01 = (TextView) A0F;
        this.A02 = (IgdsRadioButton) AbstractC166987dD.A0c(view, R.id.recipient_picker_radio_button);
        imageView.setImageDrawable(AbstractC172497mJ.A00(context));
        A0Q.setText(2131956264);
    }
}
