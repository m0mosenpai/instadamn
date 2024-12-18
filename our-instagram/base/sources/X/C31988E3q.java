package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.E3q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31988E3q extends C3OO {
    public final ViewGroup A00;
    public final LinearLayout A01;
    public final LinearLayout A02;
    public final IgTextView A03;
    public final CircularImageView A04;
    public final IgImageView A05;
    public final IgImageView A06;
    public final NoteBubbleView A07;
    public final RoundedCornerConstraintLayout A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31988E3q(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC31176DnK.A0C(view, R.id.direct_share_sheet_grid_view_pog);
        this.A01 = (LinearLayout) AbstractC166997dE.A0R(view, R.id.grid_view_action_pog_avatar_container);
        this.A04 = AbstractC31176DnK.A0U(view, R.id.grid_view_action_pog_avatar_view);
        this.A02 = (LinearLayout) AbstractC166997dE.A0R(view, R.id.grid_view_action_label_container);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.grid_view_action_pog_text_view);
        this.A06 = AbstractC167007dF.A0T(view, R.id.grid_view_action_pog_chevron);
        this.A07 = (NoteBubbleView) AbstractC166997dE.A0R(view, R.id.grid_view_add_note_bubble_view);
        this.A08 = (RoundedCornerConstraintLayout) AbstractC166997dE.A0R(view, R.id.content_notes_rounded_image_container);
        this.A05 = AbstractC167007dF.A0T(view, R.id.content_notes_rounded_image_view);
    }
}
