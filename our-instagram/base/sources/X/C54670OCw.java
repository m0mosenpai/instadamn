package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsRadioButton;

/* renamed from: X.OCw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54670OCw {
    public Boolean A00;
    public final View A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final IgdsRadioButton A04;

    public C54670OCw(View view) {
        C14360o3.A0B(view, 1);
        this.A01 = AbstractC166987dD.A0c(view, R.id.row_add_to_story_container);
        this.A03 = (CircularImageView) AbstractC166987dD.A0c(view, R.id.row_add_to_story_profile_picture);
        this.A02 = AbstractC25230BEn.A0Q(view, R.id.sharing_preferences_label);
        this.A04 = (IgdsRadioButton) AbstractC166987dD.A0c(view, R.id.recipient_picker_radio_button);
    }
}
