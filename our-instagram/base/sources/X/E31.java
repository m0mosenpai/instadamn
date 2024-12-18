package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes6.dex */
public final class E31 extends C3OO {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final CircularImageView A03;

    public E31(View view) {
        super(view);
        this.A03 = (CircularImageView) AbstractC166987dD.A0c(view, R.id.suggested_channel_row_image);
        this.A02 = AbstractC31175DnJ.A0L(view, R.id.suggested_channel_row_title);
        this.A01 = AbstractC31175DnJ.A0L(view, R.id.suggested_channel_row_subtitle);
        this.A00 = AbstractC31175DnJ.A0L(view, R.id.suggested_channel_row_member_count);
    }
}
