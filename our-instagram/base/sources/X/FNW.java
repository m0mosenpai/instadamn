package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class FNW {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final InterfaceC56392iX A04;
    public final C55096Ob7 A05;

    public FNW(View view, UserSession userSession) {
        C14360o3.A0B(view, 1);
        View A0c = AbstractC166987dD.A0c(view, R.id.row_add_to_exclusive_story_container);
        this.A00 = A0c;
        this.A02 = (ImageView) AbstractC166987dD.A0c(view, R.id.icon);
        this.A03 = AbstractC25230BEn.A0Q(view, R.id.label);
        this.A04 = AbstractC31179DnN.A0M(view, R.id.show_fans_label_stub);
        View A0U = AbstractC167017dG.A0U(view, R.id.one_tap_button_view_stub);
        C14360o3.A07(A0U);
        this.A01 = A0U;
        this.A05 = new C55096Ob7(A0c, userSession, C05F.A01);
    }
}
