package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.JqX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44688JqX extends C3OO {
    public final UserSession A00;
    public final ConstrainedImageView A01;
    public final RoundedCornerFrameLayout A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44688JqX(View view, UserSession userSession) {
        super(view);
        AbstractC167017dG.A1P(view, userSession);
        this.A00 = userSession;
        this.A02 = (RoundedCornerFrameLayout) AbstractC166997dE.A0R(view, R.id.giphy_sticker_parent);
        this.A01 = (ConstrainedImageView) AbstractC166997dE.A0R(view, R.id.giphy_sticker_image);
    }
}
