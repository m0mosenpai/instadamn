package X;

import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Mm8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51347Mm8 extends C3OO {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final ComposeView A03;
    public final UserSession A04;
    public final IgImageView A05;
    public final IgdsButton A06;

    public C51347Mm8(View view, UserSession userSession) {
        super(view);
        this.A04 = userSession;
        this.A01 = view;
        this.A00 = AbstractC166997dE.A0S(view, R.id.recommendation_container);
        this.A05 = AbstractC167007dF.A0T(view, R.id.recommendation_icon);
        this.A02 = AbstractC167007dF.A0N(view, R.id.recommendation_title);
        this.A06 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.recommendation_btn);
        this.A03 = (ComposeView) AbstractC166997dE.A0R(view, R.id.recommendation_container_compose);
    }
}
