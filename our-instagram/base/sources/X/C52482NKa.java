package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerLinearLayout;

/* renamed from: X.NKa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52482NKa extends AbstractC54965OSv {
    public ViewGroup A00;
    public final View A01;
    public final ViewGroup A02;
    public final IgImageView A03;
    public final ConstrainedTextureView A04;
    public final RoundedCornerLinearLayout A05;

    public C52482NKa(View view, UserSession userSession) {
        super(userSession);
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.auto_play_clips_preview);
        this.A02 = A0C;
        this.A00 = AbstractC31176DnK.A0C(A0C, R.id.video_view_container);
        this.A04 = (ConstrainedTextureView) AbstractC166997dE.A0R(A0C, R.id.video_texture_view);
        this.A03 = AbstractC167007dF.A0T(A0C, R.id.video_view_static_fallback);
        this.A05 = (RoundedCornerLinearLayout) AbstractC166997dE.A0R(A0C, R.id.clip_thumbnail_layout);
        this.A01 = AbstractC166997dE.A0S(A0C, R.id.preview_button_pill);
        A0C.setVisibility(0);
    }
}
