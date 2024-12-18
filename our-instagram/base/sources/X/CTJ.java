package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes5.dex */
public final class CTJ {
    public final View A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final IgTextView A08;
    public final IgTextView A09;
    public final IgTextView A0A;
    public final IgTextView A0B;
    public final IgTextView A0C;
    public final GradientSpinnerAvatarView A0D;

    public CTJ(View view) {
        this.A02 = (LinearLayout) AbstractC166997dE.A0R(view, R.id.option_rows);
        this.A09 = (IgTextView) AbstractC166987dD.A0c(view, R.id.standalone_question_text);
        this.A00 = AbstractC166997dE.A0S(view, R.id.header_section);
        this.A0D = (GradientSpinnerAvatarView) AbstractC166987dD.A0c(view, R.id.row_comment_imageview);
        this.A0B = (IgTextView) AbstractC166987dD.A0c(view, R.id.username);
        this.A0A = (IgTextView) AbstractC166987dD.A0c(view, R.id.time_ago);
        this.A08 = (IgTextView) AbstractC166987dD.A0c(view, R.id.question_text);
        this.A0C = AbstractC25231BEo.A0d(view, R.id.vote_counts);
        this.A01 = (ImageView) AbstractC166997dE.A0R(view, R.id.vote_count_facepile);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.creator_view_footer_text_aligned_left);
        this.A05 = AbstractC25231BEo.A0d(view, R.id.delete_vote_aligned_left);
        this.A04 = AbstractC25231BEo.A0d(view, R.id.creator_view_footer_text_aligned_right);
        this.A06 = AbstractC25231BEo.A0d(view, R.id.delete_vote_aligned_right);
        this.A07 = AbstractC25231BEo.A0d(view, R.id.footer_nux);
    }
}
