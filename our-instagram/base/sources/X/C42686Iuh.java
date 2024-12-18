package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment;

/* renamed from: X.Iuh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42686Iuh implements InterfaceC199918sv {
    public final int A00;
    public final Object A01;

    public C42686Iuh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC199918sv
    public final void onClick() {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                C65867TvU c65867TvU = (C65867TvU) obj;
                C8QJ c8qj = c65867TvU.A0C;
                if (c8qj == null) {
                    return;
                }
                AbstractC37304Gc5.A16(AbstractC166987dD.A0f(c65867TvU.A0T.A00, "discover_media_chaining_alt_topic_nudge"), "ig_explore_controls_not_interested_tap");
                c65867TvU.Dm1();
                c8qj.dismiss();
                return;
            case 1:
                C65867TvU c65867TvU2 = (C65867TvU) obj;
                C8QJ c8qj2 = c65867TvU2.A0C;
                if (c8qj2 == null) {
                    return;
                }
                AbstractC37304Gc5.A16(AbstractC166987dD.A0f(c65867TvU2.A0T.A00, "discover_media_chaining_alt_topic_nudge"), "ig_explore_controls_content_controls_tap");
                c8qj2.dismiss();
                FragmentActivity fragmentActivity = c65867TvU2.A0P;
                UserSession userSession = c65867TvU2.A0R;
                C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity, userSession);
                A0P.A0B(null, C34995FbS.A00.A00(fragmentActivity, c65867TvU2.A0Q, userSession, null, "explore_header", null, null));
                A0P.A04();
                return;
            default:
                HighlightsMigrationFragment highlightsMigrationFragment = (HighlightsMigrationFragment) obj;
                HighlightsMigrationFragment.A01(highlightsMigrationFragment, "h2g_management_overflow_remove_all_tap", null);
                C193328hC A0H = AbstractC31171DnF.A0H(highlightsMigrationFragment.getActivity());
                A0H.A04();
                A0H.A0A(2131963614);
                A0H.A09(2131963613);
                A0H.A0K(DialogInterfaceOnClickListenerC41836Ifq.A00(highlightsMigrationFragment, 20), 2131972171);
                A0H.A03();
                AbstractC166987dD.A1W(A0H);
                return;
        }
    }
}
