package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.E3z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31997E3z extends C3OO {
    public final View A00;
    public final ViewStub A01;
    public final FrameLayout A02;
    public final ConstraintLayout A03;
    public final ConstraintLayout A04;
    public final IgTextView A05;
    public final IgImageView A06;
    public final IgImageView A07;
    public final IgImageView A08;
    public final IgImageView A09;
    public final NoteBubbleView A0A;
    public final RoundedCornerConstraintLayout A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31997E3z(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A05 = AbstractC25231BEo.A0d(view, R.id.label);
        this.A04 = (ConstraintLayout) AbstractC166997dE.A0R(view, R.id.button_container);
        this.A07 = AbstractC167007dF.A0T(view, R.id.button);
        this.A06 = AbstractC167007dF.A0T(view, R.id.avatar_image_view);
        this.A03 = (ConstraintLayout) AbstractC166997dE.A0R(view, R.id.content_note_avatar_image_view_container);
        this.A09 = AbstractC167007dF.A0T(view, R.id.story_avatar_image_view);
        this.A02 = (FrameLayout) AbstractC166997dE.A0R(view, R.id.story_button_container);
        this.A01 = AbstractC167007dF.A0M(view, R.id.own_reel_badge_stub);
        this.A0B = (RoundedCornerConstraintLayout) AbstractC166997dE.A0R(view, R.id.content_notes_rounded_image_container);
        this.A08 = AbstractC167007dF.A0T(view, R.id.content_notes_rounded_image_view);
        this.A0A = (NoteBubbleView) AbstractC166997dE.A0R(view, R.id.add_note_bubble_view);
    }
}
