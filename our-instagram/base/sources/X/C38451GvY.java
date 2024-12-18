package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.GvY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38451GvY extends C3OO {
    public final View A00;
    public final TextView A01;
    public final RoundedCornerImageView A02;

    public C38451GvY(View view) {
        super(view);
        this.A00 = AbstractC166997dE.A0S(view, R.id.story_highlight_image_preview_container);
        this.A02 = (RoundedCornerImageView) AbstractC166997dE.A0R(view, R.id.story_highlight_image_preview);
        this.A01 = AbstractC167007dF.A0N(view, R.id.story_highlight_title);
    }
}
