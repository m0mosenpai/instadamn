package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* loaded from: classes6.dex */
public final class E3D extends C3OO {
    public final IgLinearLayout A00;
    public final CircularImageView A01;
    public final IgImageView A02;
    public final NoteBubbleView A03;
    public final RoundedCornerConstraintLayout A04;

    public E3D(View view) {
        super(view);
        this.A00 = (IgLinearLayout) AbstractC166987dD.A0c(view, R.id.row_container);
        this.A01 = (CircularImageView) AbstractC166987dD.A0c(view, R.id.avatar_image_view);
        this.A04 = (RoundedCornerConstraintLayout) AbstractC166987dD.A0c(view, R.id.content_notes_rounded_image_container);
        this.A02 = (IgImageView) AbstractC166987dD.A0c(view, R.id.content_notes_rounded_image_view);
        this.A03 = (NoteBubbleView) AbstractC166987dD.A0c(view, R.id.add_note_bubble_view);
    }
}
