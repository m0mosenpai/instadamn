package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.api.schemas.REPETITION_UI_TYPE;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.IJx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41158IJx {
    public final View A00;
    public final ConstraintLayout A01;
    public final IgTextView A02;
    public final IgImageView A03;
    public final IgImageView A04;
    public final IgdsButton A05;
    public final IgdsButton A06;

    public C41158IJx(View view) {
        IgImageView igImageView;
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A02 = AbstractC25231BEo.A0d(view, R.id.afi_view_title);
        if (C41687IdG.A00 == REPETITION_UI_TYPE.A05) {
            igImageView = AbstractC31172DnG.A0Z(view, R.id.afi_view_dismiss_button);
        } else {
            igImageView = null;
        }
        this.A04 = igImageView;
        this.A05 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.afi_view_left_button);
        this.A06 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.afi_view_right_button);
        this.A03 = AbstractC167007dF.A0T(view, R.id.afi_view_indicator_arrow);
        this.A01 = (ConstraintLayout) AbstractC166997dE.A0R(view, R.id.afi_view_container);
    }
}
