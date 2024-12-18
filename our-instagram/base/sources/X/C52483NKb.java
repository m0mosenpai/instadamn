package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerLinearLayout;

/* renamed from: X.NKb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52483NKb extends AbstractC54965OSv {
    public final View A00;
    public final ViewGroup A01;
    public final UserSession A02;
    public final IgImageView A03;
    public final RoundedCornerLinearLayout A04;
    public final String A05;

    public C52483NKb(View view, UserSession userSession, String str) {
        super(userSession);
        this.A02 = userSession;
        this.A05 = str;
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.cover_photo_preview);
        this.A01 = A0C;
        this.A03 = AbstractC167007dF.A0T(A0C, R.id.clip_thumbnail_image);
        this.A04 = (RoundedCornerLinearLayout) AbstractC166997dE.A0R(A0C, R.id.clip_thumbnail_layout);
        this.A00 = AbstractC166997dE.A0S(A0C, R.id.preview_button_pill);
        A0C.setVisibility(0);
    }
}
