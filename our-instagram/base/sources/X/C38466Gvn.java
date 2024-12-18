package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.reels.dashboard.ui.quickreaction.ReactionCountBarView;

/* renamed from: X.Gvn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38466Gvn extends C3OO {
    public final TextView A00;
    public final ConstrainedImageView A01;
    public final ReactionCountBarView A02;

    public C38466Gvn(View view) {
        super(view);
        this.A01 = (ConstrainedImageView) view.findViewById(R.id.reaction_display);
        this.A00 = AbstractC166987dD.A0e(view, R.id.reaction_count);
        this.A02 = (ReactionCountBarView) view.findViewById(R.id.reaction_count_bar);
    }
}
