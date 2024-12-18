package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes8.dex */
public final class L5T {
    public MRJ A00;
    public String A01;
    public final Context A02;
    public final View A03;
    public final C41761wQ A04;
    public final InterfaceC56392iX A05;
    public final InterfaceC56392iX A06;
    public final InterfaceC56392iX A07;
    public final InterfaceC56392iX A08;
    public final InterfaceC56392iX A09;
    public final C46094Kas A0A;
    public final C32871EdD A0B;
    public final C7S0 A0C;
    public final IgdsMediaButton A0D;
    public final RoundedCornerFrameLayout A0E;
    public final SpinnerImageView A0F;
    public final InterfaceC09390do A0G;

    public L5T(View view, InterfaceC165337aM interfaceC165337aM, InterfaceC08830cm interfaceC08830cm) {
        C14360o3.A0B(view, 1);
        Context A0L = AbstractC166997dE.A0L(view);
        this.A02 = A0L;
        View A0S = AbstractC166997dE.A0S(view, R.id.media_viewer_container);
        this.A03 = A0S;
        this.A0E = (RoundedCornerFrameLayout) AbstractC166997dE.A0R(A0S, R.id.media_container);
        SpinnerImageView spinnerImageView = (SpinnerImageView) AbstractC166997dE.A0S(A0S, R.id.loading_progress_bar);
        this.A0F = spinnerImageView;
        this.A06 = AbstractC31179DnN.A0M(A0S, R.id.media_image_stub);
        this.A05 = AbstractC31179DnN.A0M(A0S, R.id.hd_icon_stub);
        InterfaceC56392iX A0M = AbstractC31179DnN.A0M(A0S, R.id.media_video_stub);
        this.A07 = A0M;
        this.A09 = AbstractC31179DnN.A0M(view, R.id.zero_rating_data_banner);
        this.A0D = (IgdsMediaButton) AbstractC166997dE.A0R(A0S, R.id.edit_with_ai_button);
        this.A0A = new C46094Kas(A0L, A0S, A0M, spinnerImageView, interfaceC08830cm);
        this.A0C = new C7S0(AbstractC31177DnL.A0V(A0S, R.id.direct_reactions_pill_stub), interfaceC165337aM);
        this.A0B = new C32871EdD(AbstractC31177DnL.A0V(A0S, R.id.card_reactions_pill_stub), (C7E7) interfaceC165337aM);
        this.A08 = AbstractC166997dE.A0X(A0S, R.id.privacy_overlay_stub);
        this.A04 = AbstractC31173DnH.A0S();
        this.A0G = C1XM.A00(new C37014GSt(this, 38));
    }
}
