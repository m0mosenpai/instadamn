package X;

import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.share.facebook.widget.FindPeopleButton;

/* loaded from: classes6.dex */
public final class FO6 {
    public final View A00;
    public final View A01;
    public final LinearLayout A02;
    public final FindPeopleButton A03;
    public final FindPeopleButton A04;
    public final FindPeopleButton A05;
    public final FindPeopleButton A06;
    public final FindPeopleButton A07;

    public FO6(View view) {
        C14360o3.A0B(view, 1);
        this.A01 = view;
        this.A05 = (FindPeopleButton) AbstractC166997dE.A0R(view, R.id.facebook_button);
        this.A03 = (FindPeopleButton) AbstractC166997dE.A0R(view, R.id.contacts_button);
        this.A02 = (LinearLayout) AbstractC166997dE.A0R(view, R.id.redesigned_contacts_button);
        this.A07 = (FindPeopleButton) AbstractC166997dE.A0R(view, R.id.sync_button);
        this.A06 = (FindPeopleButton) AbstractC166997dE.A0R(view, R.id.share_profile_button);
        this.A04 = (FindPeopleButton) AbstractC166997dE.A0R(view, R.id.discover_top_accounts_button);
        this.A00 = AbstractC166997dE.A0S(view, R.id.row_find_people_buttons_bottom_divider);
    }
}
