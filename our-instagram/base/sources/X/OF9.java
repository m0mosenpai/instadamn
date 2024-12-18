package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes9.dex */
public final class OF9 {
    public final View A00;
    public final ViewGroup A01;
    public final ViewGroup A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgImageView A05;
    public final IgdsButton A06;
    public final IgdsButton A07;
    public final ViewGroup A08;

    public OF9(View view) {
        this.A01 = AbstractC31176DnK.A0C(view, R.id.content_view);
        View A0S = AbstractC166997dE.A0S(view, R.id.share_options_container);
        this.A00 = A0S;
        this.A08 = AbstractC31176DnK.A0C(A0S, R.id.footer_content_view);
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.footer_button_container);
        this.A02 = A0C;
        this.A07 = (IgdsButton) AbstractC166997dE.A0R(A0C, R.id.share_button);
        this.A06 = (IgdsButton) AbstractC166997dE.A0R(A0C, R.id.save_draft_button);
        this.A04 = AbstractC25231BEo.A0d(A0C, R.id.learn_more_button);
        this.A05 = AbstractC167007dF.A0T(A0C, R.id.thread_facepile);
        this.A03 = AbstractC25231BEo.A0d(A0C, R.id.thread_disclaimer);
        A0C.setVisibility(0);
        A0S.setVisibility(0);
    }
}
