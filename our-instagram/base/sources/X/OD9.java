package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes9.dex */
public final class OD9 {
    public final View A00;
    public final View A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgdsButton A04;

    public OD9(View view) {
        C14360o3.A0B(view, 1);
        this.A01 = view;
        this.A00 = AbstractC166987dD.A0c(view, R.id.event_owner_avatar);
        this.A03 = AbstractC31175DnJ.A0L(view, R.id.event_title);
        this.A02 = AbstractC31175DnJ.A0L(view, R.id.event_date);
        this.A04 = (IgdsButton) AbstractC166987dD.A0c(view, R.id.reminder_button);
    }
}
