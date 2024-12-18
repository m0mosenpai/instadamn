package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes9.dex */
public final class P6K implements InterfaceC65982ya {
    public UserSession A00;
    public ClipsDraftRepository A01;
    public C47Z A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final ImageView A07;
    public final ImageView A08;
    public final ImageView A09;
    public final ImageView A0A;
    public final ProgressBar A0B;
    public final TextView A0C;
    public final IgImageView A0D;
    public final IgdsButton A0E;

    public P6K(View view) {
        C14360o3.A0B(view, 1);
        this.A03 = AbstractC166997dE.A0S(view, R.id.row_pending_container);
        this.A0D = AbstractC167007dF.A0T(view, R.id.row_pending_media_imageview);
        this.A09 = AbstractC31176DnK.A0D(view, R.id.row_pending_media_imageview_overlay);
        this.A0A = AbstractC31176DnK.A0D(view, R.id.row_pending_media_retry_button);
        this.A07 = AbstractC31176DnK.A0D(view, R.id.row_pending_media_discard_button);
        this.A08 = AbstractC31176DnK.A0D(view, R.id.row_pending_media_options_button);
        this.A0B = (ProgressBar) AbstractC166997dE.A0R(view, R.id.row_pending_media_progress_bar);
        this.A06 = AbstractC166997dE.A0S(view, R.id.row_pending_media_status_text_views);
        this.A0C = AbstractC167007dF.A0N(view, R.id.row_pending_media_status_textview);
        this.A04 = AbstractC166997dE.A0S(view, R.id.vertical_divider);
        this.A05 = AbstractC166997dE.A0S(view, R.id.row_pending_media_imageview_container);
        this.A0E = (IgdsButton) AbstractC166997dE.A0R(view, R.id.row_pending_media_reshare_button);
    }

    @Override // X.InterfaceC65982ya
    public final void Dbp(C47Z c47z) {
        C14360o3.A0B(c47z, 0);
        this.A0B.post(new RunnableC56989PQf(this, c47z));
    }

    public final C40121td A00() {
        C40131tg c40131tg = C40121td.A0G;
        Context A0L = AbstractC166997dE.A0L(this.A0C);
        UserSession userSession = this.A00;
        if (userSession != null) {
            return c40131tg.A01(A0L, userSession);
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A01() {
        C47Z c47z = this.A02;
        if (c47z != null) {
            C40121td A00 = A00();
            String str = c47z.A35;
            C150856qj.A02(AbstractC166997dE.A0L(this.A0C));
            A00.A0J(str);
        }
        UserSession userSession = this.A00;
        if (userSession != null) {
            C19280xC A002 = AbstractC31718DwN.A00(C05F.A15);
            A002.A0C("reason", AbstractC43591JPw.A00(1236));
            AbstractC31173DnH.A1S(A002, userSession);
        }
    }

    public final void A02(boolean z) {
        String str;
        Context A0L = AbstractC166997dE.A0L(this.A0C);
        if (z) {
            C47Z c47z = this.A02;
            if (c47z != null) {
                C115435Kd c115435Kd = c47z.A6I;
                if (c115435Kd != null && (str = c115435Kd.A02) != null && AbstractC001900j.A0a(str, "VIDEO_RENDER_ERROR", false)) {
                    C193328hC A0I = AbstractC31171DnF.A0I(A0L);
                    A0I.A0A(2131969484);
                    A0I.A09(2131969483);
                    A0I.A0I(DialogInterfaceOnClickListenerC55319Ogh.A00(this, 67), 2131969466);
                    AbstractC31175DnJ.A1O(A0I);
                    AbstractC31176DnK.A17(DialogInterfaceOnClickListenerC55319Ogh.A00(this, 68), A0I, 2131969480);
                    return;
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C40121td A00 = A00();
        C47Z c47z2 = this.A02;
        if (c47z2 != null) {
            C150856qj.A02(A0L);
            A00.A08(c47z2);
            C1CM c1cm = new C1CM(A0L);
            if (c1cm.A07(false) || !c1cm.A05()) {
                return;
            }
            C9GR.A07(A0L, 2131969462);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
