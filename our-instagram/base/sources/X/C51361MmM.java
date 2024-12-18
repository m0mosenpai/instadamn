package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* renamed from: X.MmM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51361MmM extends C3OO {
    public C51703MsY A00;
    public C60221Qvv A01;
    public PJN A02;
    public C75363a3 A03;
    public final View A04;
    public final C19270xB A05;
    public final UserSession A06;
    public final IgTextView A07;
    public final CircularImageView A08;
    public final IgImageView A09;
    public final SimpleVideoLayout A0A;
    public final InterfaceC16660sJ A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51361MmM(View view, UserSession userSession, InterfaceC16660sJ interfaceC16660sJ) {
        super(view);
        C14360o3.A0B(userSession, 3);
        this.A04 = view;
        this.A0B = interfaceC16660sJ;
        this.A06 = userSession;
        this.A05 = AbstractC31171DnF.A0D("story_template_discovery_surface");
        this.A09 = AbstractC167007dF.A0T(view, R.id.story_template_discovery_item_image);
        this.A08 = AbstractC31176DnK.A0U(view, R.id.user_profile_picture);
        this.A07 = AbstractC25231BEo.A0d(view, R.id.user_profile_name);
        this.A0A = (SimpleVideoLayout) AbstractC166997dE.A0R(view, R.id.story_template_discovery_item_video_player);
    }

    public final void A00() {
        this.A02 = new PJN(AbstractC166997dE.A0L(this.A04), this.A06, new O4E(this), this.A0A);
    }
}
