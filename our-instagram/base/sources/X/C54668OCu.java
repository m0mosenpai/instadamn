package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsRadioButton;

/* renamed from: X.OCu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54668OCu {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final CircularImageView A03;
    public final IgdsRadioButton A04;

    public C54668OCu(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC166987dD.A0c(view, R.id.row_add_to_story_container);
        this.A03 = (CircularImageView) AbstractC166987dD.A0c(view, R.id.row_add_to_story_profile_picture);
        this.A01 = AbstractC31175DnJ.A0L(view, R.id.add_to_story_label);
        IgTextView A0L = AbstractC31175DnJ.A0L(view, R.id.sharing_preferences_label);
        this.A02 = A0L;
        this.A04 = (IgdsRadioButton) AbstractC166987dD.A0c(view, R.id.recipient_picker_radio_button);
        A0L.setCompoundDrawables(null, null, null, null);
    }
}
