package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.E3t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31991E3t extends C3OO {
    public final View A00;
    public final View A01;
    public final View A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final IgImageView A08;

    public C31991E3t(View view) {
        super(view);
        this.A00 = view;
        this.A08 = (IgImageView) AbstractC166987dD.A0c(view, R.id.comment_author_imageview);
        this.A07 = AbstractC31175DnJ.A0L(view, R.id.comment_title);
        this.A06 = AbstractC31175DnJ.A0L(view, R.id.comment_timestamp);
        this.A03 = AbstractC31175DnJ.A0L(view, R.id.comment_textview);
        this.A05 = AbstractC31175DnJ.A0L(view, R.id.comment_reply_button);
        this.A02 = AbstractC166987dD.A0c(view, R.id.comment_row_overflow_button);
        this.A01 = AbstractC166987dD.A0c(view, R.id.comment_like_button);
        this.A04 = AbstractC31175DnJ.A0L(view, R.id.comment_like_count);
    }
}
