package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.ODk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54684ODk {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final InterfaceC56392iX A04;
    public final C55096Ob7 A05;

    public C54684ODk(View view, UserSession userSession) {
        C14360o3.A0B(view, 1);
        View A0S = AbstractC166997dE.A0S(view, R.id.row_add_to_story_container);
        this.A00 = A0S;
        this.A03 = AbstractC31176DnK.A0U(view, R.id.row_add_to_story_profile_picture);
        this.A02 = AbstractC167007dF.A0N(view, R.id.sharing_preferences_label);
        this.A04 = AbstractC31179DnN.A0M(view, R.id.edit_button);
        View A0U = AbstractC167017dG.A0U(view, R.id.one_tap_button_view_stub);
        C14360o3.A07(A0U);
        this.A01 = A0U;
        Integer num = C05F.A01;
        C14360o3.A0A(userSession);
        this.A05 = new C55096Ob7(A0S, userSession, num);
    }
}
