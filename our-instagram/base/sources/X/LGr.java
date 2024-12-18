package X;

import android.util.Size;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* loaded from: classes8.dex */
public final class LGr {
    public final View A00;
    public final UserSession A01;
    public final C57012jc A02;
    public final InterfaceC56392iX A03;
    public final InterfaceC56392iX A04;
    public final InterfaceC56392iX A05;
    public final InterfaceC56392iX A06;
    public final InterfaceC56392iX A07;
    public final InterfaceC56392iX A08;
    public final InterfaceC56392iX A09;
    public final InterfaceC56392iX A0A;
    public final InterfaceC56392iX A0B;
    public final InterfaceC56392iX A0C;
    public final InterfaceC56392iX A0D;
    public final InterfaceC56392iX A0E;
    public final InterfaceC56392iX A0F;
    public final InterfaceC56392iX A0G;
    public final InterfaceC56392iX A0H;
    public final InterfaceC56392iX A0I;
    public final InterfaceC56392iX A0J;
    public final InterfaceC56392iX A0K;
    public final InterfaceC56392iX A0L;
    public final InterfaceC56392iX A0M;
    public final RoundedCornerConstraintLayout A0N;
    public final InterfaceC09390do A0P = C37059GUt.A01(this, 45);
    public final InterfaceC09390do A0O = C37059GUt.A01(this, 44);
    public final InterfaceC09390do A0Q = C37059GUt.A01(this, 46);

    public static InterfaceC56392iX A00(View view, UserSession userSession, int i) {
        return AbstractC56372iV.A01(view.requireViewById(i), false, LC3.A00(userSession));
    }

    public final void A03(Size size, InterfaceC11380iw interfaceC11380iw, AnonymousClass791 anonymousClass791, KTK ktk, C19L c19l) {
        int i;
        CharSequence charSequence;
        AbstractC167007dF.A1E(ktk, 0, c19l);
        RoundedCornerConstraintLayout roundedCornerConstraintLayout = this.A0N;
        roundedCornerConstraintLayout.setOutlineProvider(null);
        roundedCornerConstraintLayout.setCornerRadius(0);
        IgImageView A0V = AbstractC43592JPx.A0V(this.A0O);
        UserSession userSession = this.A01;
        LKY.A01(size, interfaceC11380iw, userSession, A0V, anonymousClass791, ktk, c19l);
        C7QY c7qy = ktk.A02;
        C1583678w c1583678w = c7qy.A0E;
        InterfaceC56392iX interfaceC56392iX = this.A0D;
        if (interfaceC56392iX.CWW() || c1583678w != null || !LC3.A01(userSession)) {
            View view = interfaceC56392iX.getView();
            if (c1583678w != null) {
                i = 0;
                A01().setUrl((ImageUrl) c1583678w.A0A.get(0), interfaceC11380iw);
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
        C1579877i c1579877i = c7qy.A0D;
        if (c1579877i == null || (charSequence = c1579877i.A09) == null) {
            charSequence = "";
        }
        InterfaceC56392iX interfaceC56392iX2 = this.A0F;
        if (!interfaceC56392iX2.CWW() && charSequence.length() == 0 && LC3.A01(userSession)) {
            return;
        }
        ((TextView) interfaceC56392iX2.getView()).setText(charSequence);
        AbstractC34118F3u.A00((IgTextView) interfaceC56392iX2.getView());
    }

    public final CircularImageView A01() {
        return (CircularImageView) AbstractC166987dD.A17(this.A0Q);
    }

    public final void A02() {
        AbstractC43592JPx.A0V(this.A0O).A09();
        if (this.A0D.CWW()) {
            A01().A09();
        }
        TextView textView = (TextView) this.A0F.E3q();
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        TextView textView2 = (TextView) this.A0L.E3q();
        if (textView2 != null) {
            textView2.setText((CharSequence) null);
        }
    }

    public LGr(View view, UserSession userSession) {
        this.A00 = view;
        this.A01 = userSession;
        this.A0N = (RoundedCornerConstraintLayout) AbstractC166997dE.A0R(view, R.id.card);
        this.A0B = AbstractC56372iV.A01(view.requireViewById(R.id.privacy_overlay_image_container_legacy_view_stub), false, LC3.A00(userSession));
        this.A0A = A00(view, userSession, R.id.privacy_overlay_image_container_flat_view_stub);
        this.A08 = A00(view, userSession, R.id.play_icon_view_stub);
        this.A07 = A00(view, userSession, R.id.hd_icon_view_stub);
        this.A0C = A00(view, userSession, R.id.privacy_overlay_stub);
        this.A06 = A00(view, userSession, R.id.determinate_progress_overlay);
        this.A0D = A00(view, userSession, R.id.profile_picture_layout_view_stub);
        this.A0G = A00(view, userSession, R.id.reels_icon_view_stub);
        this.A09 = A00(view, userSession, R.id.center_playstack_icon_view_stub);
        this.A0F = A00(view, userSession, R.id.question_text_stub);
        this.A0L = A00(view, userSession, R.id.username_stub);
        this.A03 = A00(view, userSession, R.id.bottom_gradient_view_stub);
        this.A0M = A00(view, userSession, R.id.video_duration_view_stub);
        this.A0E = A00(view, userSession, R.id.indeterminate_progress_overlay_view_stub);
        this.A02 = AbstractC31177DnL.A0V(view, R.id.card_reactions_pill_stub);
        this.A05 = A00(view, userSession, R.id.xma_cta_button_view_stub);
        this.A0H = A00(view, userSession, R.id.stacks_subtitle_text_view_stub);
        this.A0I = A00(view, userSession, R.id.stacks_timestamp_view_stub);
        this.A0J = A00(view, userSession, R.id.top_gradient_view_stub);
        this.A0K = A00(view, userSession, R.id.upload_error_indicator_view_stub);
        this.A04 = A00(view, userSession, R.id.select_winner_checkbox_view_stub);
    }
}
