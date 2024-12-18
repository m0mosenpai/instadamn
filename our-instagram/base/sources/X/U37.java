package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes11.dex */
public final class U37 {
    public final ImageView A00;
    public final ImageView A01;
    public final TextView A02;
    public final IgdsButton A03;
    public final IgdsButton A04;

    public U37(View view) {
        C14360o3.A0B(view, 1);
        this.A02 = AbstractC25230BEn.A0Q(view, R.id.title_text_view);
        this.A04 = (IgdsButton) AbstractC166987dD.A0c(view, R.id.see_all_action_view);
        this.A03 = (IgdsButton) AbstractC166987dD.A0c(view, R.id.clear_action_view);
        this.A00 = (ImageView) AbstractC166987dD.A0c(view, R.id.dismiss_button);
        this.A01 = (ImageView) AbstractC166987dD.A0c(view, R.id.history_icon_action_view);
    }

    public static final void A00(View view) {
        C14360o3.A0B(view, 0);
        view.setVisibility(8);
    }
}
