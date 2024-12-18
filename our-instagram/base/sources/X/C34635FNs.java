package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.FNs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34635FNs {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final InterfaceC56392iX A04;
    public final InterfaceC56392iX A05;
    public final C55096Ob7 A06;

    public C34635FNs(View view, UserSession userSession) {
        C14360o3.A0B(view, 1);
        View A0S = AbstractC166997dE.A0S(view, R.id.row_add_to_story_favorites_container);
        this.A00 = A0S;
        this.A02 = AbstractC31176DnK.A0D(view, R.id.icon);
        this.A03 = AbstractC167007dF.A0N(view, R.id.label);
        this.A05 = AbstractC31179DnN.A0M(view, R.id.edit_close_friends_label_stub);
        this.A04 = AbstractC31179DnN.A0M(view, R.id.edit_button);
        View A0U = AbstractC167017dG.A0U(view, R.id.one_tap_button_view_stub);
        C14360o3.A07(A0U);
        this.A01 = A0U;
        Integer num = C05F.A01;
        C14360o3.A0A(userSession);
        this.A06 = new C55096Ob7(A0S, userSession, num);
    }
}
